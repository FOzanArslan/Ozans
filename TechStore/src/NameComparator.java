import java.util.Comparator;

public class NameComparator implements Comparator<Device> {
    public int compare(Device dv1, Device dv2){
        return dv1.getProductBrand().compareTo(dv2.getProductBrand());
    }
}
