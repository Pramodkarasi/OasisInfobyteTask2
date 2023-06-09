package com.example.oasisinfobytetask2;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MainDao {
    //insert query

    @Insert(onConflict = REPLACE)
    void insert(MainData mainData);

    //delete
    @Delete
    void delete(MainData mainData);

    //delete all
    @Delete
    void reset(List<MainData> mainData);

    //update
    @Query("UPDATE Table_name SET text =:sText WHERE ID = :sID")
    void update(int sID, String sText);

    //get all data
    @Query("SELECT * FROM table_name")
    List<MainData> getAll();
}
