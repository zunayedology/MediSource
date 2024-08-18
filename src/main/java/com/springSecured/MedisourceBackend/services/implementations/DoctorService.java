package com.springSecured.MedisourceBackend.services.implementations;


import com.springSecured.MedisourceBackend.dto.DoctorDTO;
import com.springSecured.MedisourceBackend.entities.ApplicationUser;
import com.springSecured.MedisourceBackend.entities.Doctor;
import com.springSecured.MedisourceBackend.entities.Patient;
import com.springSecured.MedisourceBackend.entities.Role;
import com.springSecured.MedisourceBackend.repository.DoctorRepository;
import com.springSecured.MedisourceBackend.repository.PatientRepository;
import com.springSecured.MedisourceBackend.repository.RoleRepository;
import com.springSecured.MedisourceBackend.repository.UserRepository;
import com.springSecured.MedisourceBackend.response.RegisterResponse;
import com.springSecured.MedisourceBackend.services.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class DoctorService implements DoctorServices {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public RegisterResponse registerDoctor(DoctorDTO body) {

        RegisterResponse registerResponse =new RegisterResponse();

        try{
            if(userRepository.existsByEmail(body.getDoctorEmail())){
//          //  throw new UserAlreadyExistsException(email + " already exists");
                registerResponse.setMessage("exist");

            }
             else{

                Doctor doctor=new Doctor();

                doctor.setDoctorEmail(body.getDoctorEmail());
                doctor.setDoctorLicense(body.getDoctorLicense());
                doctor.setDoctorName(body.getDoctorName());
                doctor.setDoctorPassword(body.getDoctorPassword());
                doctor.setDoctorPhone(body.getDoctorPhone());
                doctor.setDoctorSpecialty(body.getDoctorSpecialty());

                Doctor temp_patient= doctorRepository.save(doctor);


                String email_add = body.getDoctorEmail();
                String userName = body.getDoctorLicense();



                String encodedPassword = passwordEncoder.encode(body.getDoctorPassword());
                Role userRole = roleRepository.findByAuthority("DOCTOR").get();

                Set<Role> authorities = new HashSet<>();
                authorities.add(userRole);
                ApplicationUser user=new ApplicationUser();
                user.setUsername(userName);
                user.setEmail(body.getDoctorEmail());
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
