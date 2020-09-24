package homework1;

public class Cat implements Competitor{

    private int maxJump;
    private int maxTrack;
    private boolean onDistance;

    public Cat(int maxJump, int maxTrack) {
        this.maxJump = maxJump;
        this.maxTrack = maxTrack;
        this.onDistance = true;
    }

//    public Cat{                 создали кота по умолчанию
//        this(4,1000);
//    }

//    public int getMaxJump() {
//        return maxJump;
//    }
//    public int getMaxTrack() {
//        return maxTrack;
//    }

    @Override
    public void jump(int height) {
        if (height <= maxJump) {
            System.out.println("Cat is jumping " + height + " meter");
        } else {
            System.out.println("Cat is not jumping " + height + " meter");
            onDistance = false;
        }

    }

    @Override
    public void run(int dist) {
        if (dist <= maxTrack) {
            System.out.println("Cat is running " + dist + " meter");
        } else {
            System.out.println("Cat is not running " + dist + " meter");
            onDistance = false;
        }

    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }
}
