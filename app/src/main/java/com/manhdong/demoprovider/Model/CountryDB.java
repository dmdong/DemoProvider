package com.manhdong.demoprovider.Model;

/**
 * Created by Saphiro on 5/25/2016.
 */
public class CountryDB {

    public static final String TABLE_NAME = "country";
    public static final String COL_ID = "_id";
    public static final String COL_ENAME = "enName";
    public static final String COL_VNAME = "viName";
    public static final String COL_FLAG = "flag";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS "+ TABLE_NAME + "("
            + COL_ID + "INTEGER PRIMARY KEY AUTOINCREMENT"
            + COL_ENAME + " TEXT,"
            + COL_VNAME + " TEXT,"
            + COL_FLAG + " TEXT)";
    public final static String DROP_TABLE = "drop table if exists " + TABLE_NAME;

    public static final String COL_POPULATION = "population";


    int id;
    String enName, viName, flag;
    long population;


    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getViName() {
        return viName;
    }

    public void setViName(String viName) {
        this.viName = viName;
    }

    public CountryDB() {
    }

    public CountryDB(String flag, String enName, String viName) {
        this.flag = flag;
        this.viName = viName;
        this.enName = enName;
    }


}
