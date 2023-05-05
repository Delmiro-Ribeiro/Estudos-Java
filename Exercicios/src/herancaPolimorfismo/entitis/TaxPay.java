package herancaPolimorfismo.entitis;

public abstract class TaxPay {
    private String name;
    private Double anualIncome;

    

    public TaxPay(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getAnualIncome() {
        return anualIncome;
    }
    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    

}
