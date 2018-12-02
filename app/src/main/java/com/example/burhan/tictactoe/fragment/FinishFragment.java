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

import java.util.zip.Inflater;

public class FinishFragment extends Fragment {
    private Button back2MainButton;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_finish,container,false);
            back2MainButton = view.findViewById(R.id.back_to_main_button);
            back2MainButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(getActivity() != null) {
                        MainActivity mainActivity = (MainActivity) getActivity();
                        mainActivity.setFragment(new MainFragment());
                    }
                }
            });
            return view ;
    }
}
