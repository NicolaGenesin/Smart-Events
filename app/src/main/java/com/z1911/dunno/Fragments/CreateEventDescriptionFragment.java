package com.z1911.dunno.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.z1911.dunno.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by nicola on 03/08/2015.
 */
public class CreateEventDescriptionFragment extends BaseFragment {
    @Bind(R.id.text_eventName)
    TextView mTextEventName;
    @Bind(R.id.text_eventDate)
    TextView mTextEventDate;
    @Bind(R.id.text_eventType)
    TextView mTextEventType;
    @Bind(R.id.button_createEventMedal)
    TextView mButtonEventMedal;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_event, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.button_createEventMedal)
    public void createMedalPressEvent() {
        String name = mTextEventName.getText().toString();
        String type = mTextEventType.getText().toString();
        String date = mTextEventDate.getText().toString();

        //if (!name.isEmpty() && !type.isEmpty() && !date.isEmpty()) {
        if (true) {
            mCommunicationDelegate.changeTo(new PreviewMedalFragment());
        }

        mCommunicationDelegate.hideKeyboard();
    }
}