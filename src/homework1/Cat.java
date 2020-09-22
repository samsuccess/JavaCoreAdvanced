package homework1;

public class Cat implements Competitor{

    private int maxJump;
    private int maxTrack;

    public Cat(int maxJump, int maxTrack) {
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
        System.out.println("Cat is jumping");
    }

    @Override
    public void run() {
        System.out.println("Cat is running...");
    }

}
