package proxy.president;

/**
 * Created by Moon on 2/1/2021
 */
public class RealPresident implements President{

    @Override
    public void listenTheProblem(String problem) {

        System.out.println("President : I listen your  problem which is about economy... ");
        System.out.println("*************************************************************");
    }

    @Override
    public void findAJob(String relationship) {

        System.out.println("President: Don't come to me with such requests ");
    }
}
