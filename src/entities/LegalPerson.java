package entities;

public class LegalPerson extends Contributor {
    
    private Integer employeesNumber;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, Double annualIncome, Integer employeesNumber) {
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }
    
    @Override
    public Double taxCalculation() {
        if (getEmployeesNumber() < 10) {
            return getAnnualIncome() * 0.16;
        } else {
            return getAnnualIncome() * 0.14;
        }
    }
}
