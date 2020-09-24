package homework1;

public class Track implements Obstacles {

    private int dist;

    public Track(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor c) {
        c.run(dist);
    }
}
