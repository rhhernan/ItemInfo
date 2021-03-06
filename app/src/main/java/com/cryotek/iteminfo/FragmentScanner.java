package com.cryotek.iteminfo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cryotek.iteminfo.R;
/**
 * Created by Raul on 1/19/2016.
 */
public class FragmentScanner extends Fragment {


    private static final String ARG_SECTION_NUMBER = "section_number";

    public FragmentScanner() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static FragmentHomePage newInstance(int sectionNumber) {
        FragmentHomePage fragment = new FragmentHomePage();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER), 9));
        return rootView;
    }
}
