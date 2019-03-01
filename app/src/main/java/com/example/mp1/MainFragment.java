package com.example.mp1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */

public class MainFragment extends Fragment {

    private static final String[] WORDS ={"Trumpet", "French Horn", "Snare Drum", "Trombone", "Tuba", "Clarinet", "Flute", "Oboe", "Saxophone", "Bassoon", "Slide Whistle", "Timpani"};
    String word ="";
    ListView list;

    public MainFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        list = (ListView) view.findViewById(R.id.mylist);

        ArrayAdapter<String> myadapter= new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,WORDS);

        list.setAdapter(myadapter);

        return view;
    }

    public void onActivityCreated(Bundle savedState) {
        super.onActivityCreated(savedState);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word = parent.getItemAtPosition(position).toString();

                DispFragment fragment = (DispFragment) getFragmentManager().findFragmentById(R.id.frag_main2);
                if(fragment!=null) {
                    fragment.setImage(word);
                }
            }
        });

    }

}