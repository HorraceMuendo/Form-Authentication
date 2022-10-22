package com.example.webApp.Repository;

import com.example.webApp.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Repo extends JpaRepository<Login,Long> {
}
