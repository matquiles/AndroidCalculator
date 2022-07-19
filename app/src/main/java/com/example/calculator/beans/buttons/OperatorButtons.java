package com.example.calculator.beans.buttons;

import android.view.View;
import android.widget.Button;

import com.example.calculator.R;
import com.example.calculator.actions.ExpressionActions;
import com.example.calculator.beans.view.DisplayViews;

public class OperatorButtons extends DefaultButton {

    private DisplayViews displayView;
    private Button btEqual;
    private Button btPlus;
    private Button btMinus;
    private Button btTimes;
    private Button btDivided;
    private Button btPercent;
    private Button btDel;
    private Button btClear;
    private Button btClearAll;
    private Button btParentesis;
    private Button btPlusMinus;
    private Button btSquareroot;
    private Button btSquare;
    private Button btCube;

    public OperatorButtons(DisplayViews displayView){

    }

    public Button getBtEqual() {
        return btEqual;
    }

    public Button getBtPlus() {
        return btPlus;
    }

    public Button getBtMinus() {
        return btMinus;
    }

    public Button getBtTimes() {
        return btTimes;
    }

    public Button getBtDivided() {
        return btDivided;
    }

    public Button getBtPercent() {
        return btPercent;
    }

    public Button getBtDel() {
        return btDel;
    }

    public Button getBtClear() {
        return btClear;
    }

    public Button getBtClearAll() {
        return btClearAll;
    }

    public Button getBtParentesis() {
        return btParentesis;
    }

    public Button getBtPlusMinus() {
        return btPlusMinus;
    }

    public Button getBtSquareroot() {
        return btSquareroot;
    }

    public Button getBtSquare() {
        return btSquare;
    }

    public Button getBtCube() {
        return btCube;
    }

    @Override
    public void onClick(View view) {
        ExpressionActions expression = new ExpressionActions();
        switch (view.getId()){
            case R.id.bt_adicao:
                expression.addExpression(displayView,"+", false);
                break;
            case R.id.bt_subtracao:
                expression.addExpression(displayView,"-", false);
                break;
            case R.id.bt_multiplicacao:
                expression.addExpression(displayView,"*", false);
                break;
            case R.id.bt_divisao:
                expression.addExpression(displayView,"/", false);
                break;
        }

    }
}

