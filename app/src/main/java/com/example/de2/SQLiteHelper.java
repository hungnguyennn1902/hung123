package com.example.de2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Sqlite_MaDe.db";
    private static final int DATABASE_VERSION = 1;

    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE HoaDon_NgaySinh (" +
                "ma INTEGER PRIMARY KEY , " +
                "hoTenKhachHang TEXT, " +
                "soPhong TEXT, " +
                "donGia INTEGER, " +
                "soNgayLuuTru INTEGER)";
        db.execSQL(createTable);

        // Insert sample data
        String insertData = "INSERT INTO HoaDon_NgaySinh (hoTenKhachHang, soPhong, donGia, soNgayLuuTru) VALUES " +
                "('Vũ Trường An', '405', 2500000, 5), " +
                "('Lê Hải Hà', '501', 2300000, 5), " +
                "('Lê Đình Đức', '754', 2100000, 5), " +
                "('Mai Văn Đức', '405', 1250000, 5), " +
                "('Hà Thị Thu', '417', 1250000, 5), " +
                "('Mạc Văn Minh', '802', 1050000, 5)";
        db.execSQL(insertData);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS HoaDon_NgaySinh");
        onCreate(db);
    }
}

