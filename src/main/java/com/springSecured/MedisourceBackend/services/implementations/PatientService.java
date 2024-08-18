package com.springSecured.MedisourceBackend.services.implementations;

import com.springSecured.MedisourceBackend.dto.PatientDTO;
import com.springSecured.MedisourceBackend.entities.ApplicationUser;
import com.springSecured.MedisourceBackend.entities.Patient;
import com.springSecured.MedisourceBackend.entities.Role;
import com.springSecured.MedisourceBackend.repository.PatientRepository;
import com.springSecured.MedisourceBackend.repository.RoleRepository;
import com.springSecured.MedisourceBackend.repository.UserRepository;
import com.springSecured.MedisourceBackend.response.RegisterResponse;
import com.springSecured.MedisourceBackend.services.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class PatientService implements PatientServices {



    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public RegisterResponse registerPatient(PatientDTO body) {
        RegisterResponse registerResponse =new RegisterResponse();

        try{
            if(userRepository.existsByEmail(body.getPatientNationalId())){
//          //  throw new UserAlreadyExistsException(email + " already exists");
                registerResponse.setMessage("exist");

            }
            else{

                Patient patient=new Patient();

                patient.setPatientAddress(body.getPatientAddress());
                patient.setPatientBirthdate(body.getPatientBirthdate());
                patient.setPatientName(body.getPatientName());
                patient.setPatientNationalId(body.getPatientNationalId());
                patient.setPatinetPhone(body.getPatientPhone());
                patient.setPatientPassword(body.getPatientPassword());

                Patient temp_patient= patientRepository.save(patient);


                String email_add = body.getPatientNationalId();
                String userName = body.getPatientPhone();



                String encodedPassword = passwordEncoder.encode(body.getPatientPassword());
                Role userRole = roleRepository.findByAuthority("PATIENT").get();

                Set<Role> authorities = new HashSet<>();
                authorities.add(userRole);
                ApplicationUser user=new ApplicationUser();
                user.setUsername(userName);
                user.setEmail(body.getPatientNationalId());
                user.setPassword(encodedPassword);
                user.setAuthorities(authorities);
                ApplicationUser temp_user=userRepository.save(user);

                registerResponse.setMessage("ok");
            }
        }catch(Exception e){
            registerResponse.setMessage("internal error");
        }

        return registerResponse;
    }
    }

