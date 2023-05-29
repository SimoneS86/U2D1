package entities;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@Component
public abstract class Pizza extends Product {
	protected String base;
	protected Long calories;

	public String getBase() {
		return base;
	}

	public Long getCalories() {
		return calories;
	}
}
