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
}
