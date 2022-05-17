package ar.com.grupo.esfera.password.complexity;

public enum PasswordComplexityValues {
	
	WEAK("weak"),
	GOOD("good"),
	EXCELLENT("excellent");

	private String complexityDescription;
	
	PasswordComplexityValues(String value) {
		this.complexityDescription = value;
	}

	public String getComplexityDescription() {
		return complexityDescription;
	}

}
