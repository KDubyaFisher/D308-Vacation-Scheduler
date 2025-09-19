package com.kwfisher.vacationscheduler.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "excursions")
public class Excursion {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String excursionTitle;
    private String excursionDate;
    private int vacationID;


    public Excursion(int id, String excursionTitle, String excursionDate, int vacationID) {
        this.id = id;
        this.excursionTitle = excursionTitle;
        this.excursionDate = excursionDate;
        this.vacationID = vacationID;
    }
}
