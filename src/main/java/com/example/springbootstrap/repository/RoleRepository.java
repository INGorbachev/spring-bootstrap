package com.example.springbootstrap.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.springbootstrap.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}


