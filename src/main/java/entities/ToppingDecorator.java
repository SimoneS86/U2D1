package entities;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@Component
public class ToppingDecorator extends PizzaDecorator {
	private String topping;
	private double toppingPrice;

	public ToppingDecorator(Pizza pizza) {
		super(pizza);
	}

	public ToppingDecorator(Pizza pizza, String topping, double toppingPrice) {
		super(pizza);
		this.topping = topping;
		this.toppingPrice = toppingPrice;
	}

	@Override
	public double getPrice() {
		return super.getPrice() + toppingPrice;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(" + " + topping + " - Price: $" + toppingPrice);
	}
}
