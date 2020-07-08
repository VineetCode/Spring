package com.tour.california.repository;

import org.springframework.data.repository.CrudRepository;

import com.tour.california.Model.Tour;

public interface TourRepository extends CrudRepository<Tour,Integer> {

}
