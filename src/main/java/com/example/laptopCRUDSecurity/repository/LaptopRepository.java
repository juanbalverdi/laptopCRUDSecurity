package com.example.laptopCRUDSecurity.repository;

import com.example.laptopCRUDSecurity.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Long> {
}
