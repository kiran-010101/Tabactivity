package com.example.kiran.tabactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by kiran on 2/10/18.
 */

public class fragment2 extends Fragment {

    private static final String TAG="tab2 fragment";

    private Button btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2fragment,container,false);

//we cant directly use R,id, ..here as the layput is pointed by view so we used it
        btn = (Button)view.findViewById(R.id.btn2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(),"Testing 2",Toast.LENGTH_LONG).show();
                //we pass getactivity() as context in fragment

            }
        });

        return view;
    }
}
