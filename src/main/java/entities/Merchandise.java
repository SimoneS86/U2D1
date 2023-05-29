package entities;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@Component
public class Merchandise extends Product {

	public Merchandise(String name, Double price) {
		this.name = name;
		this.price = price;

	}

	@Override
	public void print() {
		System.out.println("Merchandise: " + name + " - Price: $" + price);
	}
}