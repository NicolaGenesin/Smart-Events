package com.z1911.dunno.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.z1911.dunno.Interfaces.FragmentListener;
import com.z1911.dunno.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by nicola on 03/08/2015.
 */
public class MainPageFragment extends BaseFragment {
    @Bind(R.id.button_searchEvent)
    Button mButtonSearch;
    @Bind(R.id.button_collection)
    Button mButtonCollection;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_page, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.button_searchEvent)
    public void searchPressEvent() {
        ((FragmentListener) getActivity()).onChange(new SearchEventFragment());
    }

    @OnClick(R.id.button_collection)
    public void collectPressEvent() {
        ((FragmentListener) getActivity()).onChange(new CollectionFragment());
    }

}
