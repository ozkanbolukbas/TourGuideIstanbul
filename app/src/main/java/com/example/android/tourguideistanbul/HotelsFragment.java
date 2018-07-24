package com.example.android.tourguideistanbul;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(getString(R.string.hilton_istanbul_bosphorus), getString(R.string.hilton_istanbul_bosphorus_info),
                getString(R.string.hilton_istanbul_bosphorus_address), R.drawable.hilton_istanbul_bosphorus));
        places.add(new Places(getString(R.string.swissotel_the_bosphorus), getString(R.string.swissotel_the_bosphorus_info),
                getString(R.string.swissotel_the_bosphorus_address), R.drawable.swissotel_the_bosphorus));
        places.add(new Places(getString(R.string.istanbul_marriot_hotel), getString(R.string.istanbul_marriot_hotel_info),
                getString(R.string.istanbul_marriot_hotel_address), R.drawable.istanbul_marriott_hotel));
        places.add(new Places(getString(R.string.doubletree_by_hilton), getString(R.string.doubletree_by_hilton_info),
                getString(R.string.doubletree_by_hilton_address), R.drawable.double_tree_by_hilton));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
