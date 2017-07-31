package tasks.chapter3;

/**
 * Created by HCAV on 25.07.2017.
 */
public class CarSpeed {
    int speed;
    int distance;
    int time;

    public static int speed(int distance, int time) {
        int speed = distance / time;
        return speed;
    }

    public static int distance(int time, int speed) {
        int distance = time * speed;
        return distance;
    }

    public static int time(int speed, int distance) {
        int time = distance / speed;
        return time;
    }
}

class CarSpeedTest {
    public static void main(String[] args) {
        CarSpeed carSpeed = new CarSpeed();

        System.out.println("Car speed is: " + carSpeed.speed(120, 1) + " km/h");
        System.out.println("The distance: " + carSpeed.distance(2, 60));
        System.out.println("The time: " + carSpeed.time(50,100));
    }
}
