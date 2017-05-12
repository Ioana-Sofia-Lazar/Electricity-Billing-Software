package proiect;

import java.sql.Date;

public class Invoice {
    private final int id;
    private final int id_client;
    private final String clientName;
    private final String clientAddr;
    private final Date date;
    private final double value;
    private final Date for_month;
    private final double dayCons;
    private final double nightCons;
    private final double morningCons;
    
    public Invoice(int id, int id_client, String clientName, String clientAddr, Date date, Date for_month, double value, double dayCons, double nightCons, double morningCons) {
        this.id = id;
        this.id_client = id_client;
        this.clientName = clientName;
        this.clientAddr = clientAddr;
        this.date = date;
        this.value = value;
        this.for_month = for_month;
        this.dayCons = dayCons;
        this.nightCons = nightCons;
        this.morningCons = morningCons;
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
    
    public double getValue() {
        return this.value;
    }
    
    public Date getFor_month() {
        return this.for_month;
    }
    
    public double getDayCons() {
        return this.dayCons;
    }
    
    public double getNightCons() {
        return this.nightCons;
    }
    
    public double getMorningCons() {
        return this.morningCons;
    }
    
    public String getClientName() {
        return this.clientName;
    }
    
    public String getClientAddr() {
        return this.clientAddr;
    }
    
    
}
