package com.educationalportal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educationalportal.Entity.RegistrationEntity;

public interface Registrationrepo extends JpaRepository<RegistrationEntity,Long>{

}
