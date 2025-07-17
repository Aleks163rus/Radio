package ru.netology.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.FeatureDescriptor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;


}