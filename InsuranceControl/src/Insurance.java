import java.util.Date;

public abstract class Insurance {
    private String ─▒nsuranceName;
    private double insurancePrice;
    private Date insuranceStartDt;
    private Date insuranceFinishDt;

    public Insurance(String ─▒nsuranceName, double insurancePrice, Date insuranceStartDt, Date insuranceFinishDt) {
        this.─▒nsuranceName = ─▒nsuranceName;
        this.insurancePrice = insurancePrice;
        this.insuranceStartDt = insuranceStartDt;
        this.insuranceFinishDt = insuranceFinishDt;
    }

    public abstract void calculate();
}
