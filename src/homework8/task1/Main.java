package homework8.task1;

public class Main {
    public static void main(String[] args) {

        Model phoneModel = new Model("IPhone",
                new String[]{"Husband", "Mom", "Dad"},
                new String[]{"Earth, Wind & Fire - `September`", "Beyonce - `Cozy`", "Tyler the Creator - `Earthquake`"});

        phoneModel.playMusic();
        phoneModel.takePhoto();
        phoneModel.makeCall();
        phoneModel.sendSMS();
    }
}
