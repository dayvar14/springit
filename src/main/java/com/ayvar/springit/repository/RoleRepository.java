package com.ayvar.springit.repository;

import com.ayvar.springit.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
