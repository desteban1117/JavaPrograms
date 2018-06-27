import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HevenlyBody> solarSystem = new HashMap<>();
    private static Set<HevenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HevenlyBody temp = new HevenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HevenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HevenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HevenlyBody tempMoon = new HevenlyBody("Moon", 27);
        solarSystem.put(temp.getName(), temp);
        temp.addMoon(tempMoon);

        temp = new HevenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HevenlyBody("IO", 1.8);
        solarSystem.put(temp.getName(), temp);
        temp.addMoon(tempMoon);

        tempMoon = new HevenlyBody("Europa", 3.5);
        solarSystem.put(temp.getName(), temp);
        temp.addMoon(tempMoon);

        tempMoon = new HevenlyBody("Ganymede", 7.1);
        solarSystem.put(temp.getName(), temp);
        temp.addMoon(tempMoon);

        tempMoon = new HevenlyBody("Callisto", 16.7);
        solarSystem.put(temp.getName(), temp);
        temp.addMoon(tempMoon);

        temp = new HevenlyBody("Saturn", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HevenlyBody("Mars", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HevenlyBody("Deimos", 1.3);
        solarSystem.put(temp.getName(), temp);
        temp.addMoon(tempMoon);

        tempMoon = new HevenlyBody("Deimos", 0.3);
        solarSystem.put(temp.getName(), temp);
        temp.addMoon(tempMoon);

        temp = new HevenlyBody("Neptune", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HevenlyBody("Uranus", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets:");

        for (HevenlyBody planet: planets) {
            System.out.println(planet.getName());
        }

        System.out.println("Moons of Jupiter");

        for (HevenlyBody moon: solarSystem.get("Jupiter").getSatellites()) {
            System.out.println(moon.getName());
        }

        System.out.println("All Moons");

        HashSet<HevenlyBody> moons = new HashSet<>();

        for (HevenlyBody planet: planets) {
            moons.addAll(planet.getSatellites());
        }

        for (HevenlyBody moon: moons) {
            System.out.println(moon.getName());
        }
    }
}
