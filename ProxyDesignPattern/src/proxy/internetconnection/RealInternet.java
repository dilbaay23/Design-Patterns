package proxy.internetconnection;

/**
 * Created By Moon
 * 2/2/2021, Tue
 **/
public class RealInternet implements  Internet{
    private String departmentName;

    public RealInternet(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void connect() {
        System.out.println("Internet Access provided for Department: "+ departmentName);
    }
}
