public class DeskPhone implements ITelephone{

    private int myNumber;
    private boolean isRining;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, this phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now rining " + phoneNumber + "on deskphone");
    }

    @Override
    public void answer() {
        if (isRining) {
            System.out.println("Answering the desk phone");
            this.isRining = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            this.isRining = true;
            System.out.println("Ring Ring");
        } else {
            this.isRining = false;
        }

        return this.isRining;
    }

    @Override
    public boolean isRining() {
        return this.isRining;
    }
}
