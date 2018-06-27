import java.util.ArrayList;

public class Gearbox {

    private ArrayList<Gear> gears;
    private int maxGeaars;
    private int currentGear = 0;

    public Gearbox(int maxGeaars) {
        this.maxGeaars = maxGeaars;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public class Gear {

        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driverSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}
