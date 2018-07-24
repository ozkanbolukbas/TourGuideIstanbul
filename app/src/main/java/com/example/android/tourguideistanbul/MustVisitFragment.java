package com.example.android.tourguideistanbul;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class MustVisitFragment extends Fragment {

    public MustVisitFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(getString(R.string.haydarpasa), getString(R.string.haydarpasa_info),
                getString(R.string.haydarpasa_address), R.drawable.haydarpasa));
        places.add(new Places(getString(R.string.istiklal_street), getString(R.string.istiklal_street_info),
                getString(R.string.istiklal_street_address), R.drawable.istiklal_caddesi));
        places.add(new Places(getString(R.string.maidens_tower), getString(R.string.maidens_tower_info),
                getString(R.string.maidens_tower_address), R.drawable.kiz_kulesi));
        places.add(new Places(getString(R.string.ortakoy), getString(R.string.ortakoy_info),
                getString(R.string.ortakoy_address), R.drawable.ortakoy));
        places.add(new Places(getString(R.string.miniaturk), getString(R.string.miniaturk_info),
                getString(R.string.miniaturk_address), R.drawable.miniaturk));
        places.add(new Places(getString(R.string.moda_tea_garden), getString(R.string.moda_tea_garden_info),
                getString(R.string.moda_tea_garden_address), R.drawable.moda_cay_bahcesi));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
