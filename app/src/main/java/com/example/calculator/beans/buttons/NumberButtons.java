package com.example.calculator.beans.buttons;

import android.view.View;
import android.widget.Button;

import com.example.calculator.R;
import com.example.calculator.actions.ExpressionActions;
import com.example.calculator.beans.view.DisplayViews;

public class NumberButtons extends DefaultButton{

    private DisplayViews displayView;

    private Button btZero;
    private Button btOne;
    private Button btTwo;
    private Button btThree;
    private Button btFour;
    private Button btFive;
    private Button btSix;
    private Button btSeven;
    private Button btEight;
    private Button btNine;
    private Button btDecimal;

    public NumberButtons(DisplayViews displayView) {
        this.displayView = displayView;

    }

    public Button getBtZero() {
        return btZero;
    }

    public Button getBtOne() {
        return btOne;
    }

    public Button getBtTwo() {
        return btTwo;
    }

    public Button getBtThree() {
        return btThree;
    }

    public Button getBtFour() {
        return btFour;
    }

    public Button getBtFive() {
        return btFive;
    }

    public Button getBtSix() {
        return btSix;
    }

    public Button getBtSeven() {
        return btSeven;
    }

    public Button getBtEight() {
        return btEight;
    }

    public Button getBtNine() {
        return btNine;
    }

    public Button getBtDecimal() { return btDecimal;
    }


    @Override
    public void onClick(View view) {
        ExpressionActions expression = new ExpressionActions();
        switch (view.getId()){
            case R.id.numero_zero:
                expression.addExpression(displayView,"0", true);
                break;
            case R.id.numero_um:
                expression.addExpression(displayView,"1", true);
                break;
            case R.id.numero_dois:
                expression.addExpression(displayView,"2", true);
                break;
            case R.id.numero_tres:
                expression.addExpression(displayView,"3", true);
                break;
            case R.id.numero_quatro:
                expression.addExpression(displayView,"4", true);
                break;
            case R.id.numero_cinco:
                expression.addExpression(displayView,"5", true);
                break;
            case R.id.numero_seis:
                expression.addExpression(displayView,"6", true);
                break;
            case R.id.numero_sete:
                expression.addExpression(displayView,"7", true);
                break;
            case R.id.numero_oito:
                expression.addExpression(displayView,"8", true);
                break;
            case R.id.numero_nove:
                expression.addExpression(displayView,"9", true);
                break;
            case R.id.numero_decimal:
                expression.addExpression(displayView,".", true);
                break;
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
