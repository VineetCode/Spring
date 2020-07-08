package com.tour.california.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tour.california.Model.Difficulty;
import com.tour.california.Model.Region;
import com.tour.california.Model.Tour;
import com.tour.california.Model.TourPackage;
import com.tour.california.repository.TourPackageRepository;
import com.tour.california.repository.TourRepository;

@Service
public class TourService {

	@Autowired
	private TourPackageRepository tourPackageRepository;
	private TourRepository tourRepository;

	public TourService(TourPackageRepository tourPackageRepository, TourRepository tourRepository) {
		this.tourPackageRepository = tourPackageRepository;
		this.tourRepository = tourRepository;
	}

	public Tour createTour(String title, String description, String blurb, Integer price, 
			String bullets, String keywords, String tourPackageName, Difficulty difficulty, Region region) {
		TourPackage tourPackage = tourPackageRepository.findByName(tourPackageName);
		if (tourPackage == null) {
			throw new RuntimeException("Tour package does not exist: " + tourPackageName);
		}
		return tourRepository.save(new Tour(price, tourPackageName, tourPackageName, tourPackageName, price,
				tourPackageName, tourPackageName, tourPackageName, tourPackage, region, difficulty));

	}// end of createTour() method

	public Iterable<Tour> loopUp() {
		return tourRepository.findAll();
	}// end of loopUp() method

	public long total() {
		return tourRepository.count();
	}// end of total() method

}// end of TourService.class
