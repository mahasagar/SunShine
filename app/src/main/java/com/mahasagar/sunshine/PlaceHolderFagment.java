package com.mahasagar.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceHolderFagment extends Fragment {

    public PlaceHolderFagment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootView =   inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecast_list ={
                "Today - sunny - 88/63",
                "Tomorrow - sunny - 88/61",
                "weds - sunny - 74/59",
                "Thurs - sunny - 70/50",
                "Friday - sunny - 82/63",
                "Sat - Help Trapped in weatherStation - 82/60",
                "Sunday - sunny - 80/63",
        };
        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecast_list)
        );
        ListView list = (ListView)rootView.findViewById(R.id.listview_forecast);


        ArrayAdapter<String> one = new ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,weekForecast);
        list.setAdapter(one);

        return rootView;
    }
}
