package java_core;
/**
 @author Shafikov Almir
 */
import java.util.Random;

public class Team {
    private String name;
    private int swim;
    private int run;
    private float jump;

    Random r = new Random();

    protected String[] aray = {"Jon", "Smit", "Arnold", "Bob"};

    public String getName() {
        return name;
    }

    public int getSwim() {
        return swim;
    }

    public int getRun() {
        return run;
    }

    public float getJump() {
        return jump;
    }



    Team(){System.out.println("Команда ARAY");}

    Team(int i) {



          name = aray[i];
          run = r.nextInt(200);
          swim = r.nextInt(40);
          jump = r.nextInt(20);
          jump=jump/10;

    }
}
