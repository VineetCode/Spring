package com.tour.california.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tour.california.Model.TourPackage;

public interface TourPackageRepository extends CrudRepository<TourPackage,String>{
  TourPackage findByName(String name);
}
