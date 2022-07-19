package com.example.calculator.actions;

import com.example.calculator.MainActivity;
import com.example.calculator.beans.view.DisplayViews;

public class ExpressionActions  {

    private DisplayViews displayView;

    public ExpressionActions(){

    }

    public void addExpression(DisplayViews displayView, String str, Boolean clear){

        if(displayView.getTxResult().getText().equals("")){
            displayView.getTxExpression().setText("");
        }

        if(clear){
            displayView.getTxResult().setText("");
            displayView.getTxExpression().append(str);
        } else {
            displayView.getTxExpression().append(displayView.getTxResult().getText());
            displayView.getTxExpression().append(str);
            displayView.getTxResult().setText("");
        }

    }
}
