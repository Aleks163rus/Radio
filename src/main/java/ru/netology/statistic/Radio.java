package ru.netology.statistic;

import java.beans.FeatureDescriptor;

public class Radio {


    private int currentVolume;
    private int currentStation;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;


    public Radio() {
        this.maxStation = 9;
        this.minStation = 0;
        this.maxVolume = 100;
        this.minVolume = 0;


    }

    public Radio(int totalStations) {
        this.maxStation = totalStations - 1;


    }
// переключение каналов 0-9

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    // переключение звука 0-100

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increase() {
        if (currentVolume < maxVolume) {
            currentVolume++;

        }
    }

    public void decrease() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

}
