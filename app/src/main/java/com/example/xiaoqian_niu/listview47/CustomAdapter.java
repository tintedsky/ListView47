package com.example.xiaoqian_niu.listview47;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter{
    public CustomAdapter(Context context, String[] foods) {
        super(context, R.layout.custom_row, foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context= getContext();
        LayoutInflater hongsInflater = LayoutInflater.from(context);
        View customView = hongsInflater.inflate(R.layout.custom_row, parent, false);

        String singleFoodItem = (String)getItem(position);
        TextView hongsText = (TextView)customView.findViewById(R.id.hongsText);
        ImageView hongsImage = (ImageView)customView.findViewById(R.id.hongsImage);

        hongsText.setText(singleFoodItem);
        int imageId = context.getResources().getIdentifier(singleFoodItem,
                "mipmap", context.getPackageName());
        hongsImage.setImageResource(imageId);

        return customView;
    }

}
