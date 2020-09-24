package homework1;

public class Main {

    public static void main(String[] args) {
//        Man man = new Man(2, 5000);
//        man.jump();
//        man.run();
//
//        Cat cat = new Cat(2, 500);
//        cat.jump();
//        cat.run();
//
//        Robot robot = new Robot(5, 20000);
//        robot.jump();
//        robot.run();
//
//        Track track = new Track();
//        track.runInTrack(man);
//        track.runInTrack(cat);
//        track.runInTrack(robot);
//
//
//        Wall wall = new Wall();
//        wall.jumpInWall(man);
//        wall.jumpInWall(cat);
//        wall.jumpInWall(robot);

        Competitor[] competitors = {
                new Man(5, 15000),
                new Cat(2, 500),
                new Robot(5, 20000)
        };

        Obstacles[] obstacles = {
                new Track(5000),
                new Wall(5)
        };


        for (int i = 0; i < competitors.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                obstacles[j].doIt(competitors[i]);
                if (!competitors[i].isOnDistance()){
                    break;
                }
            }
        }
    }
}
