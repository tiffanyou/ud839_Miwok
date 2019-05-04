package com.example.android.miwok;

import android.graphics.Color;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int color;

    public WordAdapter(Activity context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        this.color = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        //LinearLayout textLinLayout = (LinearLayout) listItemView.findViewById(R.id.textbox);
        //ImageView playIconView = (ImageView) listItemView.findViewById(R.id.play);
        LinearLayout itemRootLayout = (LinearLayout) listItemView.findViewById(R.id.root_layout);
        int bgColor = ContextCompat.getColor(getContext(), color);
        itemRootLayout.setBackgroundColor(bgColor);
        //textLinLayout.setBackgroundColor(bgColor);
        //playIconView.setBackgroundColor(bgColor);

        ImageView iconImgView = (ImageView) listItemView.findViewById(R.id.icon);
        if (currentWord.hasImage()) {
            iconImgView.setImageResource(currentWord.getImageResourceId());
            iconImgView.setVisibility(View.VISIBLE);
        } else {
            iconImgView.setVisibility(View.GONE);
        }

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok);
        miwokTextView.setText(currentWord.getMiwokTrans());

        TextView engTextView = (TextView) listItemView.findViewById(R.id.english);
        engTextView.setText(currentWord.getDefaultTrans());

        return listItemView;
    }
}
