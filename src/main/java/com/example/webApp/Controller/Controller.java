package com.example.webApp.Controller;


import com.example.webApp.Entity.Login;
import com.example.webApp.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Autowired
    private final Repo repo;

    public Controller(Repo repo) {
        this.repo = repo;
    }

    @GetMapping()
    public ResponseEntity getlogins(){
        return ResponseEntity.ok(this.repo.findAll());
    }

    @PostMapping("/login")
    public Login save(@RequestBody final Login login){
        return this.repo.save(login);
    }

}
