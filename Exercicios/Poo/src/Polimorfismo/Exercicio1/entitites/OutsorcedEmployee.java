package Polimorfismo.Exercicio1.entitites;

public class OutsorcedEmployee extends Employee {
    private Double additionalCharge;

    public OutsorcedEmployee() {
        super();
    }

    public OutsorcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        return super.payment() + additionalCharge * 1.1;
    }

    @Override
    public String toString() {
       return super.toString();
    }
}


