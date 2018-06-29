public class MainDog {

    public static void main(String[] args) {

        Dog nikoDog = new Dog("Niko");
        Labrador nikoLabrador = new Labrador("Niko");
        Pitbull nikiPitbull = new Pitbull("Niko");

        System.out.println(nikoDog.equals(nikoLabrador));
        System.out.println(nikoLabrador.equals(nikoDog));

        System.out.println(nikiPitbull.equals(nikoLabrador));
        System.out.println(nikoLabrador.equals(nikiPitbull));
    }
}
