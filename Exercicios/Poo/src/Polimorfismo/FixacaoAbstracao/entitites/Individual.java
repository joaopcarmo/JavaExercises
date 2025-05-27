package Polimorfismo.FixacaoAbstracao.entitites;

public class Individual extends TaxPayer{

    private double healthExpenditures;

    public Individual(){
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
        double tax;
        if (getAnualIncome() < 20000.00) {
            tax = getAnualIncome() * 0.15;
        } else {
            tax = getAnualIncome() * 0.25;
        }
        if (healthExpenditures > 0) {
            tax -= healthExpenditures * 0.5;
        }
        return tax;
    }
}

