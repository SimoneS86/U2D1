package entities;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@Component
public class FamilySizeDecorator extends PizzaDecorator {
	private double familySizePrice;

	public FamilySizeDecorator(Pizza pizza) {
		super(pizza);
		this.familySizePrice = 5.0;
	}

	@Override
	public double getPrice() {
		return super.getPrice() + familySizePrice;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(" - Family Size (+$" + familySizePrice + ")");
	}
}