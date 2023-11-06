package homework8.task1;

import java.util.Random;

public class Model extends MobilePhone implements Mobile {
    private String phoneModel;
    private String[] contactBook;
    private String[] playlist;

    public Model(String phoneModel, String[] contactBook, String[] playlist) {
        this.phoneModel = phoneModel;
        this.contactBook = contactBook;
        this.playlist = playlist;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String[] getContactBook() {
        return contactBook;
    }

    public void setContactBook(String[] contactBook) {
        this.contactBook = contactBook;
    }

    public String[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }

    @Override
    public void playMusic() {
        Random random = new Random();
        int randomIndex = random.nextInt(playlist.length);
        System.out.println("Now playing: " + playlist[randomIndex]);
    }

    @Override
    public void takePhoto() {
        System.out.println("*taking a picture*");
    }

    @Override
    public void makeCall() {
        Random random = new Random();
        int randomIndex = random.nextInt(contactBook.length);
        System.out.println("Outgoing call: " + contactBook[randomIndex]);
    }

    @Override
    public void sendSMS() {
        System.out.println("Outgoing message: Hi :)");
    }
}
