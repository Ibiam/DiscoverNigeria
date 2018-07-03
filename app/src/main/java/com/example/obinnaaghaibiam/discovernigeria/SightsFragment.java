package com.example.obinnaaghaibiam.discovernigeria;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsFragment extends android.support.v4.app.Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Zuma Rock", "Located at the boundary between Niger State and Abuja Federal Capital Territory.", R.drawable.zuma_rock));
        locations.add(new Location("Aso Rock", "Located behind the Presidential villa in Abuja.", R.drawable.number_one));
        locations.add(new Location("Erin Ijesha Waterfalls", "This waterfall is located at Erin Ijesha, Osun State.", R.drawable.number_one));
        locations.add(new Location("Matsirga Waterfalls", "This waterfall is located at Jigawa State.", R.drawable.number_one));
        locations.add(new Location("The Bar Beach", "This a beautiful sandy beach located at the shores of Lagos State.", R.drawable.number_one));
        locations.add(new Location("The Olumo Rock", "This is a landmark at Ogun and a famous destinations in Nigeria with an elevator and foot path leading up to a breathtaking view of the town from the top.", R.drawable.number_one));
        locations.add(new Location("Kwa Falls", "This waterfalls is found at Cross River State.", R.drawable.number_one));
        locations.add(new Location("Agbokim Waterfalls", "This is another waterfalls located at Cross River State.", R.drawable.agbokim));
        locations.add(new Location("Birin Kudu Rock", "This rock is located at Jigawa State", R.drawable.number_one));
        locations.add(new Location("Ngwo Cave and water fall", "This sight at located in Enugu state.", R.drawable.number_one));
        locations.add(new Location("Eleko Beach", "This a beautiful sandy beach located at the shores of Lagos State.", R.drawable.number_one));
        locations.add(new Location("Arinta Waterfalls", "This waterfall is located off the Ibadan Ilesha Expressway Nigeria.", R.drawable.number_one));
        locations.add(new Location("Wase Rock", "This rock is located at Jos Plateau State.", R.drawable.number_one));
        locations.add(new Location("Owu Waterfalls", "This waterfalls is located at Kwara State.", R.drawable.number_one));
        locations.add(new Location("Riyom Rock", "This rock is another beautiful rock located at Jos Plateau State.", R.drawable.number_one));
        locations.add(new Location("Elegushi Beach", "This a beautiful sandy beach located at the shores of Lagos State.", R.drawable.number_one));
        locations.add(new Location("Gurara Waterfalls", "This waterfalls is located at Kwara State.", R.drawable.number_one));
        locations.add(new Location("Kura falls", "This waterfall that is located at Jos Plateau State.", R.drawable.number_one));
        locations.add(new Location("Shere Hills", "This is special hill with a beautiful rock formation located at Jos Plateau State.", R.drawable.number_one));
        locations.add(new Location("Oron Beach", "This a beautiful sandy beach located at the shores of Eket in AkwaIbom State.", R.drawable.number_one));
        locations.add(new Location("Owu Waterfalls", "Nigeria is blessed with beautifull waterfalls, some are even obscure like this one located in Kwara State.", R.drawable.number_one));
        locations.add(new Location("Ogbunike Caves", "This is a beautiful cave labyrinth located in Anambra State.", R.drawable.number_one));
        locations.add(new Location("Ndibe Sand Beach", "This a seasonal beautiful sandy beach visible during the dry season that is located near the sandbars of the Cross river in Ebonyi State.", R.drawable.number_one));
        locations.add(new Location("Jebba", "This a beautiful sandbar with a hill located at the boundary between Kwara and Kogi State on the River Niger.", R.drawable.number_one));

// Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_sights);

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
