package com.example.burhan.tictactoe.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.burhan.tictactoe.MainActivity;
import com.example.burhan.tictactoe.R;

public class GameFragment extends Fragment {
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    private boolean isXTurn = true;
    private int isFinished = 0;
    int[][] stateMatrix = new int[3][3];

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_game, container, false);
        button1 = view.findViewById(R.id.game_fragment_button_1);
        button2 = view.findViewById(R.id.game_fragment_button_2);
        button3 = view.findViewById(R.id.game_fragment_button_3);
        button4 = view.findViewById(R.id.game_fragment_button_4);
        button5 = view.findViewById(R.id.game_fragment_button_5);
        button6 = view.findViewById(R.id.game_fragment_button_6);
        button7 = view.findViewById(R.id.game_fragment_button_7);
        button8 = view.findViewById(R.id.game_fragment_button_8);
        button9 = view.findViewById(R.id.game_fragment_button_9);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                stateMatrix[i][j] = 0;
            }
        }

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(button1);
              isFinished =  checkGameEnd(button1,0,0);
              if(isFinished == 1){
                  Toast.makeText(getContext(),R.string.x_won,Toast.LENGTH_SHORT).show();
                  changeFragment();
              }else if(isFinished == -1){
                  Toast.makeText(getContext(), R.string.o_won, Toast.LENGTH_SHORT).show();
                  changeFragment();
              }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(button2);
              isFinished =  checkGameEnd(button2,0,1);
                if(isFinished == 1){
                    Toast.makeText(getContext(),R.string.x_won,Toast.LENGTH_SHORT).show();
                    changeFragment();
                }else if(isFinished == -1){
                    Toast.makeText(getContext(), R.string.o_won, Toast.LENGTH_SHORT).show();
                    changeFragment();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(button3);
                isFinished = checkGameEnd(button3,0,2);
                if(isFinished == 1){
                    Toast.makeText(getContext(),R.string.x_won,Toast.LENGTH_SHORT).show();
                    changeFragment();
                }else if(isFinished == -1){
                    Toast.makeText(getContext(), R.string.o_won, Toast.LENGTH_SHORT).show();
                    changeFragment();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(button4);
                isFinished = checkGameEnd(button4,1,0);
                if(isFinished == 1){
                    Toast.makeText(getContext(),R.string.x_won,Toast.LENGTH_SHORT).show();
                    changeFragment();
                }else if(isFinished == -1){
                    Toast.makeText(getContext(), R.string.o_won, Toast.LENGTH_SHORT).show();
                    changeFragment();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(button5);
               isFinished = checkGameEnd(button5,1,1);
                if(isFinished == 1){
                    Toast.makeText(getContext(),R.string.x_won,Toast.LENGTH_SHORT).show();
                    changeFragment();
                }else if(isFinished == -1){
                    Toast.makeText(getContext(), R.string.o_won, Toast.LENGTH_SHORT).show();
                    changeFragment();
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(button6);
                isFinished = checkGameEnd(button6,1,2);
                if(isFinished == 1){
                    Toast.makeText(getContext(),R.string.x_won,Toast.LENGTH_SHORT).show();
                    changeFragment();
                }else if(isFinished == -1){
                    Toast.makeText(getContext(), R.string.o_won, Toast.LENGTH_SHORT).show();
                    changeFragment();
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(button7);
                isFinished = checkGameEnd(button7,2,0);
                if(isFinished == 1){
                    Toast.makeText(getContext(),R.string.x_won,Toast.LENGTH_SHORT).show();
                    changeFragment();
                }else if(isFinished == -1){
                    Toast.makeText(getContext(), R.string.o_won, Toast.LENGTH_SHORT).show();
                    changeFragment();
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(button8);
                isFinished = checkGameEnd(button8,2,1);
                if(isFinished == 1){
                    Toast.makeText(getContext(),R.string.x_won,Toast.LENGTH_SHORT).show();
                    changeFragment();
                }else if(isFinished == -1){
                    Toast.makeText(getContext(), R.string.o_won, Toast.LENGTH_SHORT).show();
                    changeFragment();
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(button9);
                isFinished = checkGameEnd(button9,2,2);
                if(isFinished == 1){
                    Toast.makeText(getContext(),R.string.x_won,Toast.LENGTH_SHORT).show();
                    changeFragment();
                }else if(isFinished == -1){
                    Toast.makeText(getContext(), R.string.o_won, Toast.LENGTH_SHORT).show();
                    changeFragment();
                }
            }
        });
        return view;
    }
    private void onButtonClick(View view){

        if("".equals(((Button)view).getText())){
            if(isXTurn){
                ((Button)view).setText("X");
            }else{
                ((Button)view).setText("O");
            }
            isXTurn = !isXTurn;
        }else{
            Toast.makeText(getContext(), "Degistiremezsiniz",Toast.LENGTH_LONG).show();
        }

    }

    private int checkGameEnd(View view, int buttonX, int buttonY){
        int sum = 0;
        char inputChar;
        if(stateMatrix[buttonX][buttonY] == 0){
            inputChar =   ((Button)view).getText().charAt(0);
            if(inputChar == 'X'){
                stateMatrix[buttonX][buttonY] = 1;
            }else{
                stateMatrix[buttonX][buttonY] = -1;
            }

        }

        for(int i=0;i<3;i++){
            sum = stateMatrix[i][0] + stateMatrix[i][1] + stateMatrix[i][2];
            if(sum == 3) {
                // X kazandi
                return 1;
            }else if(sum == -3){
                // O kazandi
                return -1;
            }else{
                sum = 0;
            }
        }

        for(int i=0;i<3;i++){
            sum = stateMatrix[0][i] + stateMatrix[1][i] + stateMatrix[2][i];
            if(sum == 3) {
                // X kazandi
                return 1;
            }else if(sum == -3){
                // O kazandi
                return -1;
            }else{
                sum = 0;
            }
        }
        sum = stateMatrix[0][0] + stateMatrix[1][1] + stateMatrix[2][2];
        if(sum == 3){
            return 1;
        }else if(sum == -3){
            return -1;
        }else{
            sum = 0;
        }
        sum = stateMatrix[0][2] + stateMatrix[1][1] + stateMatrix[2][0];
        if(sum == 3){
            return 1;
        }else if(sum == -3){
            return -1;
        }else{
            sum = 0;
        }

        return 0;
    }
    private void changeFragment(){
        if(getActivity() != null){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    MainActivity mainActivity = (MainActivity)getActivity();
                    mainActivity.setFragment(new FinishFragment());
                }
            },1500);

        }
    }
}
