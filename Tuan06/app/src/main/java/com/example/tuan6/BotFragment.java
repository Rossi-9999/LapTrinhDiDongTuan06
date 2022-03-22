package com.example.tuan6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class BotFragment extends Fragment {

    private TextView tvOutput;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Read xml file and return View object.
        // inflate(@LayoutRes int resource, @Nullable ViewGroup root, boolean attachToRoot)
        View view = inflater.inflate(R.layout.botfragment, container, false);

        tvOutput = (TextView) view.findViewById(R.id.TextViewName);

        return view;
    }
    public void showText(String name) {
        tvOutput.setText(name);
    }



}