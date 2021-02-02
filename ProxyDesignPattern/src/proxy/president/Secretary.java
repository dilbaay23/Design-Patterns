package proxy.president;

/**
 * Created by Moon on 2/1/2021
 */
public class Secretary {

    private President president;

    public Secretary(President president) {
        this.president = new ProxyPresident(president);
    }

    public President getPresident(){
        return president;
    }

}
