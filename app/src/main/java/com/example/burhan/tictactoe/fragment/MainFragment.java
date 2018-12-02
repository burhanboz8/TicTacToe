package com.example.burhan.tictactoe.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.burhan.tictactoe.MainActivity;
import com.example.burhan.tictactoe.R;

public class MainFragment extends Fragment {
    private Button startButton;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        startButton = view.findViewById(R.id.fragment_main_start_button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getActivity() != null){
                    MainActivity mainActivity = (MainActivity)getActivity();
                    mainActivity.setFragment(new GameFragment());
                }
            }
        });

        return view;
    }
}
