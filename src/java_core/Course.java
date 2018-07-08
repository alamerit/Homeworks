package java_core;

/**
 @author Shafikov Almir
 */

public class Course {

    final private int swim_drow = 20;
    final private int run_drow = 100;
    final private float jump_drow = 1;
    boolean loss;

    public int getSwim_drow() {
        return swim_drow;
    }

    public int getRun_drow() {
        return run_drow;
    }

    public float getJump_drow() {
        return jump_drow;
    }

    Course() {
        for (int i = 0; i < 4; i++) {
            Team team = new Team(i);
            loss = true;
            if (this.getSwim_drow() > team.getSwim()) loss = false;
            if (this.getRun_drow() > team.getRun()) loss = false;
            if (this.getJump_drow() > team.getJump()) loss = false;
            System.out.println(team.aray[i] + " Бег " + team.getRun() + " Плаванье " + team.getSwim() + " Прыжки " + team.getJump());
            System.out.println(loss);

        }

    }


}



