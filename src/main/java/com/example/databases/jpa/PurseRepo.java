package com.example.databases.jpa;

import com.example.databases.models.Purse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurseRepo extends JpaRepository<Purse, Integer> {

}
