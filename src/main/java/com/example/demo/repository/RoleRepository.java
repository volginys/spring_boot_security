package com.example.demo.repository;

import com.example.demo.model.Role;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
