package com.example.healthcare.database;

import android.provider.BaseColumns;

public class MedicineMaster implements BaseColumns {
    private MedicineMaster(){

    }
    protected static class Medicine{
        public static final String TABLE_NAME = "medicine";
        public static final String COLUMN_MNAME = "name";
        public static final String COULMN_COMPANY = "company";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_DOSAGE = "dosage";
        public static final String COLUMN_TIME = "time";
        public static final String COLUMN_MEAL = "meal";
        public static final String COLUMN_EXPIRE = "expire";
        public static final String COLUMN_PRICE = "price";
    }
}
