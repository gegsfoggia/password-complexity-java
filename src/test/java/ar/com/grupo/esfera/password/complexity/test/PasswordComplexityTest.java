package ar.com.grupo.esfera.password.complexity.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ar.com.grupo.esfera.password.complexity.PasswordComplexityHelper;
import ar.com.grupo.esfera.password.complexity.PasswordComplexityValues;

public class PasswordComplexityTest {

	private String password;
	private PasswordComplexityHelper passwordComplexityHelper;
	private PasswordComplexityValues passwordComplexityResult;
	
	@Before
	public void initialize() {
		this.passwordComplexityHelper = new PasswordComplexityHelper();
	}
	
	@Test
	public void shouldBeExcellent() {
		giveAnExcellentPassword("password123");
		whenPasswordComplexityIsCalculated();
		thenComplexityShouldBe(PasswordComplexityValues.EXCELLENT);
	}
	
	@Test
	public void shouldBeGood() {
		giveAnExcellentPassword("password");
		whenPasswordComplexityIsCalculated();
		thenComplexityShouldBe(PasswordComplexityValues.GOOD);
	}
	
	@Test
	public void shouldBeWeak() {
		giveAnExcellentPassword("pass");
		whenPasswordComplexityIsCalculated();
		thenComplexityShouldBe(PasswordComplexityValues.WEAK);
	}

	private void giveAnExcellentPassword(String password) {
		this.password = password;
	}
	
	private void whenPasswordComplexityIsCalculated() {
		this.passwordComplexityResult = this.passwordComplexityHelper.calculate(this.password);
	}
	
	private void thenComplexityShouldBe(PasswordComplexityValues expected) {
		assertEquals(expected, passwordComplexityResult);
	}

}
