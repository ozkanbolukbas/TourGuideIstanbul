package com.example.android.tourguideistanbul;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class HistoricalPlacesFragment extends Fragment {

    public HistoricalPlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(getString(R.string.hagia_sophia), getString(R.string.hagia_sophia_info),
                getString(R.string.hagia_sophia_address), R.drawable.ayasofya));
        places.add(new Places(getString(R.string.blue_mosque), getString(R.string.blue_mosque_info),
                getString(R.string.blue_mosque_address), R.drawable.sultanahmet));
        places.add(new Places(getString(R.string.rumeli_fortress), getString(R.string.rumeli_fortress_info),
                getString(R.string.rumeli_fortress_address), R.drawable.rumeli_hisari));
        places.add(new Places(getString(R.string.basilica_cistern), getString(R.string.basilica_cistern_info),
                getString(R.string.basilica_cistern_address), R.drawable.yerebatan_sarnici));
        places.add(new Places(getString(R.string.dolmabahce_palace), getString(R.string.dolmabahce_palace_info),
                getString(R.string.dolmabahce_palace_address), R.drawable.dolmabahce_sarayi));
        places.add(new Places(getString(R.string.archaeology_museum), getString(R.string.archaeology_museum_info),
                getString(R.string.archaeology_museum_address), R.drawable.istanbul_arkeoloji_muzesi));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
