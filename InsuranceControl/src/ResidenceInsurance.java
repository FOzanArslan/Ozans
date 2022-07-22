import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String ınsuranceName, double insurancePrice, Date insuranceStartDt, Date insuranceFinishDt) {
        super(ınsuranceName, insurancePrice, insuranceStartDt, insuranceFinishDt);
    }

    @Override
    public void calculate() {

    }
}
