package com.example.demo.repository;

import com.example.demo.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface OwnerRepo extends JpaRepository<Owner, String> {
    Optional<Owner> findByUsername(String username);
}
