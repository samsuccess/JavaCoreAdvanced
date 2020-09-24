package homework1;

public class Robot implements Competitor{

    private int maxJump;
    private int maxTrack;
    private boolean onDistance;

    public Robot(int maxJump, int maxTrack) {
        this.maxJump = maxJump;
        this.maxTrack = maxTrack;
        this.onDistance = true;
    }

    @Override
    public void jump(int height) {
        if (height <= maxJump) {
            System.out.println("Robot is jumping " + height + " meter");
        } else {
            System.out.println("Robot is not jumping " + height + " meter");
            onDistance = false;
        }

    }

    @Override
    public void run(int dist) {
        if (dist <= maxTrack) {
            System.out.println("Robot is running " + dist + " meter");
        } else {
            System.out.println("Robot is not running " + dist + " meter");
            onDistance = false;
        }

    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

}
