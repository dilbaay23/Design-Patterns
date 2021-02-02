package proxy.president;

import java.util.Locale;

/**
 * Created by Moon on 2/1/2021
 */
public class ProxyPresident implements President {

    private President realPresident;

    public ProxyPresident(President president) {
        this.realPresident = president;
    }

    public President getPresident() {
        return realPresident;
    }

    public void setPresident(President president) {
        this.realPresident = president;
    }

    @Override
    public void listenTheProblem(String problem) {

        boolean isImportant = filterProblem(problem);
        if (isImportant) {
            reportProblem(problem);
        } else {
            System.out.println("Proxy: I listen your problem.... ");
            System.out.println("Allah may help you...");
            System.out.println("*************************************************************");
        }


    }

    private void reportProblem(String problem) {
        realPresident.listenTheProblem(problem);
    }


    private boolean filterProblem(String problem) {
        boolean b;
        if (problem.substring(0, 7).equalsIgnoreCase("economy")) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }

    @Override
    public void findAJob(String relationship) {
        boolean isClose = askRelationship(relationship);
        System.out.println("Proxy :  I listen...You want a job from me....  ");
        System.out.println("Lets look...  ");
        if (isClose) {
            System.out.println("There is a good/ideal position for you..");
            System.out.println("*************************************************************");
        } else {
            System.out.println("I dont know any ideal job for you yet, but if I learn, My secretary will call you back..");
            System.out.println("*************************************************************");
        }

    }

    private boolean askRelationship(String relationship) {
        if (relationship.equals("family")) {
            return true;
        }
        return false;
    }
}
