package homework1;

public class Robot implements Competitor{

    private int maxJump;
    private int maxTrack;

    public Robot(int maxJump, int maxTrack) {
        this.maxJump = maxJump;
        this.maxTrack = maxTrack;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public int getMaxTrack() {
        return maxTrack;
    }

    @Override
    public void jump() {
        System.out.println("Robot is jumping");
    }

    @Override
    public void run() {
        System.out.println("Robot is running...");
    }

}
