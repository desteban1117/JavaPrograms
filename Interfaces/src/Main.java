public class Main {

    public static void main(String[] argas) {

        ITelephone iTelephone;
        iTelephone = new DeskPhone(1234);
        iTelephone.powerOn();
        iTelephone.callPhone(1234);
        iTelephone.answer();

        iTelephone = new MobilePhone(1234);
        iTelephone.powerOn();
        iTelephone.callPhone(1234);
        iTelephone.answer();

    }
}


