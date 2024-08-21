package com.userbackend.UserManagementBackend.repository;
import com.userbackend.UserManagementBackend.entity.OurUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<OurUsers, Integer> {


    Optional<OurUsers> findByEmail(String email);

}
