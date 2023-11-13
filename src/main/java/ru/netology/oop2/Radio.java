package ru.netology.oop2;

public class Radio {
    private int currentRadioStationNum;
    private int currentVolLevel;

    public int getCurrentRadioStationNum() {
        return currentRadioStationNum;
    }

    public int getCurrentVolLevel() {
        return currentVolLevel;
    }

    public void setCurrentRadioStationNum(int newCurrentStationNum) {
        if (newCurrentStationNum < 0) {
            return;
        }
        if (newCurrentStationNum > 9) {
            return;
        }
        currentRadioStationNum = newCurrentStationNum;
    }

    public void setNextStation() {
        if (currentRadioStationNum == 9) {
            currentRadioStationNum = 0;
        } else {
            currentRadioStationNum++;
        }
    }

    public void setPrevStation() {
        if (currentRadioStationNum == 0) {
            currentRadioStationNum = 9;
        } else {
            currentRadioStationNum--;
        }
    }

    public void increaseVolume() {
        if (currentVolLevel < 100) {
            currentVolLevel = currentVolLevel + 1;
        }

    }

    public void lowerVolume() {
        if (currentVolLevel > 0) {
            currentVolLevel = currentVolLevel - 1;
        }
    }

    public void setCurrentRadioVol(int newCurrentRadioVol) {
        if (newCurrentRadioVol > 100) {
            return;
        }
        if (newCurrentRadioVol < 0) {
            return;
        }
        currentVolLevel = newCurrentRadioVol;
    }
}