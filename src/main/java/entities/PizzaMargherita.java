package entities;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@Component
public class PizzaMargherita extends Pizza {
	public PizzaMargherita() {
		this.name = "Margherita";
		this.price = 10.0;
		this.base = "Pomodoro e mozzarella";
		this.calories = 1000L;
	}

	@Override
	public void print() {
		System.out.println("Pizza: " + name + " - Base: " + base + " - Price: $" + price + " - Calories:" + calories);
	}

}
