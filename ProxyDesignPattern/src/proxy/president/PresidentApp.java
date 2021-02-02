package proxy.president;

/**
 * Created By Moon
 * 2/2/2021, Tue
 **/
public class PresidentApp {
    public static void main(String[] args) {
        System.out.println("A person comes to Secretary of President to meet with President... ");

        President president = new RealPresident();

        President proxyPresident = new ProxyPresident(president);

        Secretary secretary = new Secretary(proxyPresident);

        Public person = new Public(secretary);

        person.tellTheProblem("Economy");

        person.wantAJob("not family");
    }
}
