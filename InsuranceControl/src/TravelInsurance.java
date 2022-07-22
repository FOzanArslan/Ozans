import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String ınsuranceName, double insurancePrice, Date insuranceStartDt, Date insuranceFinishDt) {
        super(ınsuranceName, insurancePrice, insuranceStartDt, insuranceFinishDt);
    }

    @Override
    public void calculate() {

    }
}
