package Classi;

public interface RegolabileVolume {

    static int MAXVOLUME = 30;

    void alzaVolume(int qt);
    void abbassaVolume(int qt);
    int getVolume();

}
