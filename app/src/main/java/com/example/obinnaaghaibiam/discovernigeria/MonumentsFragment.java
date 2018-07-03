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

public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Osun Oshogbo Sacred Groove", "This Unesco world heritage site is located in Oshogbo the capital of Osun State and the whole groove is a shrine dedicated to the river goddess Osun.", R.drawable.number_one));
        locations.add(new Location("Oranmiyan Staff", "This very tall mystical staff located in Osun state belonging to one of the progenitors of the yoruba race.", R.drawable.number_one));
        locations.add(new Location("Cocoa House", "This building is Nigeria's first skyscraper standing at 105m built off the proceeds of cocoa and completed in 1965 at Ibadan Oyo State.", R.drawable.number_one));
        locations.add(new Location("Igbo Olodumare", "This monument is located in Ondo state and is a spiritual shrine.", R.drawable.number_one));
        locations.add(new Location("The Nigerian National Museum", " This museum contain some of the National artifacts that were not confiscated by Britain during the colonial period.", R.drawable.number_one));
        locations.add(new Location("The National Theatre", "This a is picturesque centre of arts and culture with a unique design in the shape of a miltary cap located Lagos.", R.drawable.number_one));
        locations.add(new Location("Sukur Cultural Landscape", "This is another UNESCO world heritage site located in Adamawa State that has beautiful natural preserved landscape.", R.drawable.number_one));
        locations.add(new Location("Abuja National Mosque", "This is one of the biggest mosque and quite imposing located in the capital city of Nigeria Abuja.", R.drawable.number_one));
        locations.add(new Location("National Christian Centre", "This is another big church built as the centre of worship for all christian denominations in Nigeria located in Abuja FCT.", R.drawable.number_one));
        locations.add(new Location("Church of Jesus Christ of Latter-Day Saints", "This is one of the less known religious sects in Nigeria and they built one of their most amazing temple of worship in Aba Abia State.", R.drawable.number_one));
        locations.add(new Location("National War Museum", "This is a museum established in order to preserve the legacies of the Nigerian civil war for the future generations who did not witness it located in Umuahia Abia State.", R.drawable.number_one));
        locations.add(new Location("Agia Tree", "This monument was built at the site of a tree where christianity was first preached in Lagos State.", R.drawable.number_one));
        locations.add(new Location("Cathederal Church of Christ", "This is a magnificent church located right at the heart of Lagos State.", R.drawable.number_one));
        locations.add(new Location("Kano City Wall", "This wall was built by the early hausa settlers in Kano city Kano State design to kep out marauding invaders from getting access into the community.", R.drawable.number_one));
        locations.add(new Location("Bashir Uthman Tofa Mosque", "This is one of the mosques in Kano, Kano State and this one has a beautiful intricate design both inside and outside.", R.drawable.number_one));
        locations.add(new Location("Great Mosque of Kano", "This mosque is also known as Kano Central Mosque and it is one of the largest mosques in Nigeria covering a large area of land located in Kano, Kano State.", R.drawable.number_one));
        locations.add(new Location("Nok Village", "This is one of the less known but very relevant centre of Nigerian art call NOK arts located in Kaduna State.", R.drawable.number_one));
        locations.add(new Location("Emotan Statue", "This is a statue is located in Edo State.", R.drawable.number_one));

// Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_monuments);

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
