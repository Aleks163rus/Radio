package ru.netology.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.FeatureDescriptor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentVolume ;
    private int currentStation ;
    private int maxStation = 9;
    private int minStation ;
    private int maxVolume = 100;
    private int minVolume ;

    public Radio(int totalStations) {
        this.maxStation = totalStations - 1;


    }
// переключение каналов 0-9


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