package com.example.obinnaaghaibiam.discovernigeria;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class GameReservesFragment extends Fragment {

    public GameReservesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Drill Ranch", "This is a game reserve for the Drill monkeys located in Obudu Cross River State.", R.drawable.number_one));
        locations.add(new Location("Afi Mountain Wildlife Sanctuary", "This wildLife sanctuary is located at Afi Mountain Cross River State.", R.drawable.number_one));
        locations.add(new Location("Mambila Plateau", "Mambila plataeu is a beautiful destination with lots of natural wildlife located in Taraba State", R.drawable.number_one));
        locations.add(new Location("Gashaka Gumti National Park", "This National Park is located in Taraba State.", R.drawable.number_one));
        locations.add(new Location("Kambari Game Reserve", "This game reserve is located in Taraba.", R.drawable.number_one));
        locations.add(new Location("Kashimbila Game Reserve", "This is another game reserve located in Taraba.", R.drawable.number_one));
        locations.add(new Location("Kainji Lake National Park", "This is a national park located right at the shores of the artificial lake made by Kainji Dam on the river Niger, in Niger State.", R.drawable.number_one));
        locations.add(new Location("Yankari National Park", "This is well known national park in Bauchi State.", R.drawable.number_one));
        locations.add(new Location("Sambisa Game Reserve", "This game reserve forms part of the now notorious Sambisa forest in Borno State", R.drawable.number_one));
        locations.add(new Location("Obudu Mountain Resort", "This mountain resort located in Obudu Cross River State contains many wonderful scenery and a unique climate due to its high elevation", R.drawable.number_one));

// Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_game_reserves);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }

}
