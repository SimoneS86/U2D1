package entities;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@Component
public class PizzaHawaian extends ToppingDecorator {
	private String topping1;
	private String topping2;
	private double toppingPrice;

	public PizzaHawaian(Pizza pizza) {
		super(pizza);
		this.topping1 = "Prosciutto";
		this.topping2 = "Ananas";
		this.toppingPrice = 2.0;
		this.setName("Hawaiana");

	}

	@Override
	public double getPrice() {
		return super.getPrice() + toppingPrice;
	}

	@Override
	public void print() {
		System.out.println(" + " + topping1 + " + " + topping2 + " - Price: $" + toppingPrice);
	}
}
