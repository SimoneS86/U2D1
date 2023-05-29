package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import entities.Drink;
import entities.FamilySizeDecorator;
import entities.Merchandise;
import entities.Pizza;
import entities.PizzaHawaian;
import entities.PizzaMargherita;
import entities.ToppingDecorator;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
public class U2D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U2D1Application.class, args);
	}

	@Bean
	public void printMenu() {
		Pizza margherita = new PizzaMargherita();
		Pizza hawaian = new PizzaHawaian(new PizzaMargherita());
		Pizza salami = new ToppingDecorator(new PizzaMargherita(), "salame", 1.0);
		Pizza familyPizza = new FamilySizeDecorator(new PizzaMargherita());

		Drink limonata = new Drink("Limonata", 1.0, 100L);
		Drink acqua = new Drink("Acqua", 0.5, 0L);
		Drink vino = new Drink("Vino", 5.0, 150L);

		Merchandise shirt = new Merchandise("Shirt", 10.0);
		Merchandise mug = new Merchandise("Mug", 8.0);

		margherita.print();
		hawaian.print();
		salami.print();
		familyPizza.print();

		limonata.print();
		acqua.print();
		vino.print();

		shirt.print();
		mug.print();
	}

}
