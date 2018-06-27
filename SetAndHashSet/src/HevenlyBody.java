import java.util.HashSet;
import java.util.Set;

public class HevenlyBody {

    private final String name;
    private final double  orbitalPeriod;
    private final Set<HevenlyBody> satellites;

    public HevenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HevenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HevenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }
}
