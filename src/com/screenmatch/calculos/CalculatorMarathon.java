package com.screenmatch.calculos;

import com.screenmatch.models.Title;

public class CalculatorMarathon {
    private int duration;

    public String getDuration() {
        int MINUTES_IN_A_HOUR = 60;
        int marathonHours = this.duration / MINUTES_IN_A_HOUR;
        int marathonMinutes = this.duration % MINUTES_IN_A_HOUR;
        return "%dh e %dm".formatted(marathonHours, marathonMinutes);
    }

    public void include(Title T){
        this.duration += T.getRunTime();
    }
}
