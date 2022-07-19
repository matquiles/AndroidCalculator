package com.example.calculator.beans.view;

import android.widget.TextView;

import com.example.calculator.R;

public class DisplayViews extends DefaultViews{

    private TextView txExpression;
    private TextView txResult;

  //  public DisplayViews() {
  //      txExpression = findViewById(R.id.txt_expressao);
  //      txResult = findViewById(R.id.txt_resultado);
  //  }

    public TextView getTxExpression() {
        return txExpression;
    }

    public TextView getTxResult() {
        return txResult;
    }
}
