public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRining;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;

    }

    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now rining " + phoneNumber + "on deskphone");
        } else {
            System.out.println("Phone is  switched off");
        }
    }

    @Override
    public void answer() {
        if (isRining) {
            System.out.println("Answering the mobile  phone");
            this.isRining = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && this.isOn) {
            this.isRining = true;
            System.out.println("Medoly Ring");
        } else {
            this.isRining = false;
            System.out.println("Mobile phone not on or number different");
        }

        return this.isRining;
    }

    @Override
    public boolean isRining() {
        return this.isRining;
    }
}
