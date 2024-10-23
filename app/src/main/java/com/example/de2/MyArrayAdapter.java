package com.example.de2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyArrayAdapter extends ArrayAdapter<HoaDon_NgaySinh> {
    Activity context;
    int IdLayout;
    ArrayList<HoaDon_NgaySinh> mylist;

    public MyArrayAdapter(Activity context, int idLayout, ArrayList<HoaDon_NgaySinh> mylist) {
        super(context, idLayout, mylist);
        this.context = context;
        IdLayout = idLayout;
        this.mylist = mylist;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater myflacter = context.getLayoutInflater();
        convertView = myflacter.inflate(IdLayout, null);
        HoaDon_NgaySinh myhoadon = mylist.get(position);
        TextView txt_Ten = convertView.findViewById(R.id.txt_Ten);
        txt_Ten.setText(myhoadon.getHoTenKhachHang());
        return convertView;
    }
}
