package entities;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@Component
public class Drink extends Product {
	protected Long calories;

	public Drink(String name, Double price, Long calories) {
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

	public Long getCalories() {
		return calories;
	}

	@Override
	public void print() {
		System.out.println("Drink: " + name + " - Calories: " + calories + " - Price: $" + price);
	}
}