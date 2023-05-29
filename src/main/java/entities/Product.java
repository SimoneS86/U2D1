package entities;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@Component
public abstract class Product {
	protected String name;
	protected double price;

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public abstract void print();
}
