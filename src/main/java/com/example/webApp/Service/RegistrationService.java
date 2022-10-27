package com.example.webApp.Service;

import com.example.webApp.Entity.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private String register (RegistrationRequest request){
        return "registered";
    }
}
