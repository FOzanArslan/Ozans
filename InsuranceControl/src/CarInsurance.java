import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance(String ınsuranceName, double insurancePrice, Date insuranceStartDt, Date insuranceFinishDt) {
        super(ınsuranceName, insurancePrice, insuranceStartDt, insuranceFinishDt);
    }

    @Override
    public void calculate() {
    }

}
