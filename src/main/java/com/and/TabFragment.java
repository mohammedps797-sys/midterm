package com.and;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TabFragment extends Fragment {

    private static final String ARG_TITLE = "arg_title";

    public TabFragment() {
        super(R.layout.fragment_tab);
    }

    public static TabFragment newInstance(String title) {
        TabFragment fragment = new TabFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String title = "";
        if (getArguments() != null) {
            title = getArguments().getString(ARG_TITLE, "");
        }
        TextView tvTabTitle = view.findViewById(R.id.tvTabTitle);
        tvTabTitle.setText(title);
    }
}