package com.edubridge.app2.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.edubridge.app2.model.Flower;
import com.edubridge.app2.repo.FlowerRepository;

@Component
public class FlowerServiceRunner implements ApplicationRunner {

	@Autowired
	private FlowerRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Flower(1, "Lotus", "White or Pink", "India", "Spiritual Purity and Rebirth"));
		repo.save(new Flower(2, "Rose", "Red", "USA", "Love"));
		repo.save(new Flower(3, "Peony", "Baby Pink", "China", "romance and prosperity"));
		repo.save(new Flower(4, "Rose", "Red", "UK", "Love"));
		repo.save(new Flower(5, "Orchid Cattleya Trianae ", "Purple", "Colombia", "No Symbolism"));
		repo.save(new Flower(6, " Lily of the Valley", "White", "Finland", "No Symbolism"));
		repo.save(new Flower(7, " Lily of the Valley", "White", "Yugoslavia", "No Symbolism"));
		repo.save(new Flower(8, "Cherry Blossom", "Lite Pink", "Japan", "Festival of Happiness"));
		repo.save(new Flower(9, "SunFlower", "Yellow", "Ukraine", "Cheerfulness"));

		System.out.println("Display Flowers");
		repo.findAll().forEach(System.out::println);

		Optional<Flower> op = repo.findById(1);
		if (op.isPresent()) {
			System.out.println(op);
		} else {
			System.out.println("Not Found");
		}

		repo.findAll().forEach(System.out::println);

		List<Flower> flowers = Arrays.asList(new Flower(10, "Jasmine", "White", "Pakistan", " purity and peace"));
		repo.saveAll(flowers);
		repo.findAll().forEach(System.out::println);

	}

}
