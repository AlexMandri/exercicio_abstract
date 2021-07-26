package entities;

public class Company extends TaxPayer {
	private int numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, double anualIncome, int nemberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = nemberOfEmployees;
	}

	public int getNemberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNemberOfEmployees(int nemberOfEmployees) {
		this.numberOfEmployees = nemberOfEmployees;
	}

	@Override
	public double tax() {
		if (numberOfEmployees < 10) {
			return getAnualIncome() * 0.16;
		} else {
			return getAnualIncome() * 0.14;
		}
	}
}
