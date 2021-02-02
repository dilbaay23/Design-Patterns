package proxy.president;

/**
 * Created by Moon on 2/1/2021
 */
public class Public {


    private President president;

    public Public(Secretary secretary) {
        this.president = secretary.getPresident();
    }

    public String wantAJob(String relationship) {
        System.out.println("Person: Find me a job please...");
        System.out.println("-------------------");
        president.findAJob(relationship);
        System.out.println("-------------------");
        return "Person: OK,Thanks...";
    }

    public String tellTheProblem(String problem) {
        System.out.println("Person: I have a big problem...");
        System.out.println("-------------------");
        president.listenTheProblem(problem);
        System.out.println("-------------------");
        return "Person: OK,Thanks...";
    }

}
