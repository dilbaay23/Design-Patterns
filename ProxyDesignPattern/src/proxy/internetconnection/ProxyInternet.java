package proxy.internetconnection;

/**
 * Created By Moon
 * 2/2/2021, Tue
 **/
public class ProxyInternet implements Internet{
    private String departmentName;
    private RealInternet  realInternet;

    public ProxyInternet(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public void connect() {
        if(!getDepartmentName().equalsIgnoreCase("computer")){
            realInternet = new RealInternet(departmentName);
            realInternet.connect();
        }else{
            System.out.println("No Internet access provided. Your Department is Computer");
        }
    }
}
