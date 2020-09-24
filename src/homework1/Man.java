package homework1;

public class Man implements Competitor {

    private int maxJump;
    private int maxTrack;
    private boolean onDistance;

    public Man(int maxJump, int maxTrack) {
        this.maxJump = maxJump;
        this.maxTrack = maxTrack;
        this.onDistance = true;
    }

    @Override
    public void jump(int height) {
        if (height <= maxJump) {
            System.out.println("Man is jumping " + height + " meter");
        } else {
            System.out.println("Man is not jumping " + height + " meter");
            onDistance = false;
        }

    }

    @Override
    public void run(int dist) {
        if (dist <= maxTrack) {
            System.out.println("Man is running " + dist + " meter");
        } else {
            System.out.println("Man is not running " + dist + " meter");
            onDistance = false;
        }

    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

}
