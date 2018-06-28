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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());

        if ((obj == null) || (this.getClass() != obj.getClass())) {
            return false;
        }

        String objName = ((HevenlyBody) obj).getName();

        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode called" + (this.name.hashCode() + 57));
        return this.name.hashCode() + 57;
    }
}
