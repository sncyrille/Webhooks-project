package com.example.DataApplication.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DataApplication.data.model.SchoolData;

public interface SchoolDataRepository extends JpaRepository<SchoolData, Integer>{

}