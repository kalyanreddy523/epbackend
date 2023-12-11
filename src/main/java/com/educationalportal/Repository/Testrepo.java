package com.educationalportal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educationalportal.Entity.TestEntity;

public interface Testrepo extends JpaRepository<TestEntity,Long> {

}
