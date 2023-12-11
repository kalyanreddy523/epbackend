package com.educationalportal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educationalportal.Entity.ContactEntity;

public interface Contactrepo extends JpaRepository<ContactEntity,Long> {

}
