package com.example.obinnaaghaibiam.discovernigeria;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     */
    public class LocationAdapter extends ArrayAdapter<Location> {

        /**
         * Resource ID for the background color for this list of words
         */
        private int mColorResourceId;

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        LocationAdapter(Context context, ArrayList<Location> locations, int colorResourceId) {
            super(context, 0, locations);
            mColorResourceId = colorResourceId;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);

            /*
              Provides a view for an AdapterView (ListView, GridView, etc.)

              @param position The position in the list of data that should be displayed in the
             *                 list item view.
             * @param convertView The recycled view to populate.
             * @param parent The parent ViewGroup that is used for inflation.
             * @return The View for the position in the AdapterView.
             */
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }

            // Get the {@link Word} object located at this position in the list
            Location currentLocation = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID version_name
            TextView lSDTextView = listItemView.findViewById(R.id.location_summary_detail_textView);
            // Get the Miwok translation of number from the current Word object and
            // set this text on the miwok TextView
            if (currentLocation != null) {
                lSDTextView.setText(currentLocation.getmLocationDetailsSummary());
            }

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView dNTextView = listItemView.findViewById(R.id.default_name_textView);
            // Get the English translation of number from the current Word object and
            // set this text on the number TextView
            if (currentLocation != null) {
                dNTextView.setText(currentLocation.getmDefaultName());
            }

            // Find the ImageView in the list_item.xml layout with the ID list_item_image
            ImageView imageView = listItemView.findViewById(R.id.avatar);
            // Get the image resource ID from the current Word object and
            // Check if an image is provided for this word or not
            if (Location.getImageResourceId() != 0) {
                imageView.setImageResource(Location.getImageResourceId());
                imageView.setVisibility(View.VISIBLE);
            } else {
                imageView.setVisibility(View.GONE);
            }

            // Set the theme color for the list item
            View textContainer = listItemView.findViewById(R.id.text_container);
            // Find the color that the resource ID maps to
            int color = ContextCompat.getColor(getContext(), mColorResourceId);

            // Set the background color of the text container View
            textContainer.setBackgroundColor(color);


            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView
            return listItemView;

        }

    }
