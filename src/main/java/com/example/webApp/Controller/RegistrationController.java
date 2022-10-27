package com.example.webApp.Controller;


import com.example.webApp.Entity.RegistrationRequest;
import com.example.webApp.Repository.UserRepository;
import com.example.webApp.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/registration")
public class RegistrationController {

    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final RegistrationService registrationService;

    public RegistrationController(UserRepository userRepository, RegistrationService registrationService) {
        this.userRepository = userRepository;
        this.registrationService = registrationService;
    }

    private String Register(@RequestBody RegistrationRequest request){
        return RegistrationService.
    }



}
