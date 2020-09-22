package homework1;

public class Man implements Competitor {

    private int maxJump;
    private int maxTrack;

    public Man(int maxJump, int maxTrack) {
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
        System.out.println("Man is jumping");
    }

    @Override
    public void run() {

        System.out.println("Man is running...");
    }

}
