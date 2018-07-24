package com.example.android.tourguideistanbul;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class EntertainmentFragment extends Fragment {

    public EntertainmentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(getString(R.string.sortie_night_club), getString(R.string.sortie_night_club_info),
                getString(R.string.sortie_night_club_address), R.drawable.sortie_night_club));
        places.add(new Places(getString(R.string.ulus_29), getString(R.string.ulus_29_info),
                getString(R.string.ulus_29_address), R.drawable.ulus_29));
        places.add(new Places(getString(R.string.jolly_joker_istanbul), getString(R.string.jolly_joker_istanbul_info),
                getString(R.string.jolly_joker_istanbul_address), R.drawable.joly_joker));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
