package com.museumguild.view.fragment;

/**
 * Created by hasee on 2017/8/17.
 */
import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;

import com.museumguild.R;

/**
 * Created by hasee on 2017/8/17.
 */

public class HomeFragment extends Fragment implements View.OnClickListener{
    private ImageView testbwg;
    private SearchView search;
//    private LinearLayout bwg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment,container,false);
        search = (SearchView)view.findViewById(R.id.search);
        search.setIconifiedByDefault(false);
//        testbwg = (ImageView)view.findViewById(R.id.bwgtestid);
//        testbwg.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            case R.id.bwgtestid:
//                Intent in = new Intent();
//                in.setClass(HomeFragment.this.getActivity(), TestActivity.class);
//                startActivity(in);
//                break;
        }
    }
}