package proxy.internetconnection;

/**
 * Created By Moon
 * 2/2/2021, Tue
 **/
public class InternetApp {
    public static void main(String[] args) {

        Internet internet = new ProxyInternet("computer");
        internet.connect();

        Internet internet2 = new ProxyInternet("HR");
        internet2.connect();

    }
}
