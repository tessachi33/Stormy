package io.github.tessachi33.stormy;

/**
 * Created by Tessa on 11/3/15.
 */
public class CurrentWeather {

    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPercipChance;

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public double getPercipChance() {
        return mPercipChance;
    }

    public void setPercipChance(double percipChance) {
        mPercipChance = percipChance;
    }

    public String getMsummary() {
        return msummary;
    }

    public void setMsummary(String msummary) {
        this.msummary = msummary;
    }

    private String msummary;

}
