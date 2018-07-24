package com.example.android.tourguideistanbul;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(getString(R.string.lacivert_restaurant), getString(R.string.lacivert_restaurant_info),
                getString(R.string.lacivert_restaurant_address), R.drawable.lacivert));
        places.add(new Places(getString(R.string.leb_i_derya), getString(R.string.leb_i_derya_info),
                getString(R.string.leb_i_derya_address), R.drawable.lebiderya));
        places.add(new Places(getString(R.string.kasibeyaz_bosphorus), getString(R.string.kasibeyaz_bosphorus_info),
                getString(R.string.kasibeyaz_bosphorus_address), R.drawable.kasibeyaz));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
