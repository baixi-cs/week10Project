package com.example.trip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trip.entity.Trip;


public interface TripRepository extends JpaRepository <Trip, Integer>{

}
