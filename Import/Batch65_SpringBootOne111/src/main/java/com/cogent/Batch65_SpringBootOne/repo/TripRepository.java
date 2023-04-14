package com.cogent.Batch65_SpringBootOne.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.Batch65_SpringBootOne.entity.Trip;

public interface TripRepository extends JpaRepository <Trip, Integer>{

}
