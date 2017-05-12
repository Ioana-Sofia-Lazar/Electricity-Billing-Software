package proiect;

import java.sql.Date;

// a client will have only one type of index 
public class Index {
    private final int id;
    private final int id_client;
    private final Date date;
    private final Date for_month;
    private final int index_type; // 1 for simple index, 2 for composite index
    private final double day_index; // if index is simple only day_index is not null
    private final double night_index;
    private final double morning_index;
      
    public Index(int id, int id_client, Date date, Date for_month, int index_type, double day_index, double night_index, double morning_index) {
        this.id = id;
        this.id_client = id_client;
        this.date = date;
        this.for_month = for_month;
        this.index_type = index_type;
        this.day_index = day_index;
        this.night_index = night_index;
        this.morning_index = morning_index;
    }
    
    public int getId() {
        return this.id;
    }
    
    public int getId_client() {
        return this.id_client;
    }
    
    public Date getDate() {
        return this.date;
    }
    
    public Date getFor_month() {
        return this.for_month;
    }
    
    public int getIndex_type() {
        return this.index_type;
    }
    
    public double getDay_index() {
        return this.day_index;
    }
    
    public double getNight_index() {
        return this.night_index;
    }
    
    public double getMorning_index() {
        return this.morning_index;
    }
    
}
