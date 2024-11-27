package com.tecsup.Service_Spring_Boot_React.repository;


import com.tecsup.Service_Spring_Boot_React.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
