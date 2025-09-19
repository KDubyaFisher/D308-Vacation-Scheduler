package com.kwfisher.vacationscheduler.database;

import androidx.room.Database;

import com.kwfisher.vacationscheduler.entities.Excursion;
import com.kwfisher.vacationscheduler.entities.Vacation;

@Database(entities = {Vacation.class, Excursion.class}, version = 1, exportSchema = false)
public class VacationDatabaseBuilder {
}
