package com.kwfisher.vacationscheduler.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "vacations")
public class Vacation {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String vacationTitle;
    private String vacationLodging;
    private String vacationStartDate;
    private String vacationEndDate;

    public Vacation(int id, String vacationTitle, String vacationLodging, String vacationStartDate, String vacationEndDate) {
        this.id = id;
        this.vacationTitle = vacationTitle;
        this.vacationLodging = vacationLodging;
        this.vacationStartDate = vacationStartDate;
        this.vacationEndDate = vacationEndDate;
    }
}
