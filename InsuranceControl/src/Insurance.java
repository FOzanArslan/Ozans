import java.util.Date;

public abstract class Insurance {
    private String ınsuranceName;
    private double insurancePrice;
    private Date insuranceStartDt;
    private Date insuranceFinishDt;

    public Insurance(String ınsuranceName, double insurancePrice, Date insuranceStartDt, Date insuranceFinishDt) {
        this.ınsuranceName = ınsuranceName;
        this.insurancePrice = insurancePrice;
        this.insuranceStartDt = insuranceStartDt;
        this.insuranceFinishDt = insuranceFinishDt;
    }

    public abstract void calculate();
}
