package com.kwfisher.vacationscheduler.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.kwfisher.vacationscheduler.entities.Excursion;
import com.kwfisher.vacationscheduler.entities.Vacation;

@Database(entities = {Vacation.class, Excursion.class}, version = 1, exportSchema = false)
public abstract class VacationDatabaseBuilder extends RoomDatabase {
}
