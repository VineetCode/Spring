package com.tour.california;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tour.california.Model.Difficulty;
import com.tour.california.Model.Region;
import com.tour.california.services.TourPackageService;
import com.tour.california.services.TourService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

import static com.tour.california.ExploreCaliApplication.TourFromFile.importTours;


@SpringBootApplication
public class ExploreCaliApplication implements CommandLineRunner {

	@Autowired
	private TourPackageService tourPackageService;
	@Autowired
	private TourService tourService;

	public static void main(String[] args) {
		SpringApplication.run(ExploreCaliApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// create default tour packages;
		tourPackageService.createTourPackage("BC", "Backpack Cal");
		tourPackageService.createTourPackage("CC", "California Calm");
		tourPackageService.createTourPackage("CH", "California Hot Springs");
		tourPackageService.createTourPackage("CY", "Cycle California");
		tourPackageService.createTourPackage("DS", "From Desert to Sea");
		tourPackageService.createTourPackage("KC", "Kids California");
		tourPackageService.createTourPackage("NW", "Nature Watch");
		tourPackageService.createTourPackage("SC", "SnowBoard cali");
		tourPackageService.createTourPackage("TC", "Taste of California");

		tourPackageService.lookup().forEach(tourPackage -> System.out.println(tourPackage));
		System.out.println("============================");
		
	    importTours().forEach(t->tourService.createTour(t.title, t.description, t.blurb, Integer.parseInt(t.price), t.bullets, t.keywords, t.packageType, Difficulty.valueOf(t.difficulty),Region.findByLabel(t.region)));
		
		System.out.println("Numbers of tours ::"+tourService.total());
		System.out.println("******************************");
	}// end of run() method

	static class TourFromFile {
		private String packageType, title, description, blurb, price, length, bullets, keywords, difficulty, region;

		static List<TourFromFile> importTours() throws IOException {
			return new ObjectMapper().setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY).
					readValue(TourFromFile.class.getResourceAsStream("/ExploreCalifornia.json"),new TypeReference<List<TourFromFile>>(){});
		
		}

	}// end of TourFromFile class

}
