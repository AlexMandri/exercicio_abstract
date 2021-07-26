package entities;

public class Individual extends TaxPayer{
	private double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	
	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}


	public double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double tax=0;
		if(getAnualIncome()<20000) {
			tax = (getAnualIncome()*0.15)-(getHealthExpenditures()*0.5);
		}else {
			tax = (getAnualIncome()*0.25)-(getHealthExpenditures()*0.5);
		}
			
		return tax;
	}
	
}
