package com.example.android.tourguideistanbul;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Places> {

    public PlacesAdapter(Context context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.content_main, parent, false);
        }

        Places currentPlace = getItem(position);

        ImageView placeImage = listItemView.findViewById(R.id.place_image);
        placeImage.setImageResource(currentPlace.getmImageResourceId());

        TextView placeName = listItemView.findViewById(R.id.place_name);
        placeName.setText(currentPlace.getmPlaceName());

        TextView placeDescription = listItemView.findViewById(R.id.place_description);
        placeDescription.setText(currentPlace.getmPlaceInformaation());

        TextView placeAddress = listItemView.findViewById(R.id.place_location);
        placeAddress.setText(currentPlace.getmAddress());

        return listItemView;
    }
}
