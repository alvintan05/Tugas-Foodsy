package com.spnj.tugasfoodsy;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Restaurant_list extends Fragment {


    public Restaurant_list() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //pendefinisian image view
        View rootView = inflater.inflate(R.layout.fragment_restaurant_list,container,false);
        ImageView image = (ImageView) rootView.findViewById(R.id.gam1);
        image.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                updateDetail();
            }
        });
        return rootView;
    }

    //prosedur intent image view
    public void updateDetail(){
        Intent a = new Intent(getActivity(), Layout_15.class);
        startActivity(a);
    }
}
