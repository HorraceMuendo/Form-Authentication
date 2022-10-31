package com.example.webApp.Service;

import com.example.webApp.Entity.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public String register (RegistrationRequest request){
        return "registered";
    }
}
