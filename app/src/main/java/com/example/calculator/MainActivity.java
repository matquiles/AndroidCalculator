package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculator.actions.ExpressionActions;
import com.example.calculator.beans.buttons.NumberButtons;
import com.example.calculator.beans.buttons.OperatorButtons;
import com.example.calculator.beans.view.DisplayViews;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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
    private TextView txExpression;
    private TextView txResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        getSupportActionBar().hide();

        //passar para dentro da classe dos botões
        btZero.setOnClickListener(this);
        btOne.setOnClickListener(this);
        btTwo.setOnClickListener(this);
        btThree.setOnClickListener(this);
        btFour.setOnClickListener(this);
        btFive.setOnClickListener(this);
        btSix.setOnClickListener(this);
        btSeven.setOnClickListener(this);
        btEight.setOnClickListener(this);
        btNine.setOnClickListener(this);
        btDecimal.setOnClickListener(this);
        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btTimes.setOnClickListener(this);
        btDivided.setOnClickListener(this);

        btClearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txExpression.setText("");
                txResult.setText("");
            }
        });

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView expression = findViewById(R.id.txt_expressao);
                String str = expression.getText().toString();

                if(!str.isEmpty()){
                    byte var0 = 0;
                    int var1 = str.length()-1;
                    String txtExpressao = str.substring(var0, var1);
                    expression.setText(txtExpressao);
                }

                txResult.setText("");
            }
        });

        btEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Expression expression = new ExpressionBuilder(txExpression.getText().toString()).build();
                    double result= expression.evaluate();
                    long longResult = (long) result;

                    if(result == (double)longResult){
                        txResult.setText((CharSequence) String.valueOf(longResult));
                    } else {
                        txResult.setText((CharSequence) String.valueOf(result));
                    }
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    public void initComponents(){
        btZero = findViewById(R.id.numero_zero);
        btOne = findViewById(R.id.numero_um);
        btTwo = findViewById(R.id.numero_dois);
        btThree = findViewById(R.id.numero_tres);
        btFour = findViewById(R.id.numero_quatro);
        btFive = findViewById(R.id.numero_cinco);
        btSix = findViewById(R.id.numero_seis);
        btSeven = findViewById(R.id.numero_sete);
        btEight = findViewById(R.id.numero_oito);
        btNine = findViewById(R.id.numero_nove);
        btDecimal = findViewById(R.id.numero_decimal);
        btEqual = findViewById(R.id.bt_igual);
        btPlus = findViewById(R.id.bt_adicao);
        btMinus = findViewById(R.id.bt_subtracao);
        btTimes = findViewById(R.id.bt_multiplicacao);
        btDivided = findViewById(R.id.bt_divisao);
        btPercent = findViewById(R.id.bt_percentual);
        btDel = findViewById(R.id.bt_backspace);
        btClear = findViewById(R.id.bt_clear);
        btClearAll = findViewById(R.id.bt_clear_all);
        btParentesis = findViewById(R.id.bt_parenteses);
        btPlusMinus = findViewById(R.id.bt_sinal);
        btSquareroot = findViewById(R.id.bt_sqr);
        btSquare = findViewById(R.id.bt_quadrado);
        btCube = findViewById(R.id.bt_cubo);
        txExpression = findViewById(R.id.txt_expressao);
        txResult = findViewById(R.id.txt_resultado);

    }

    public void addExpression (String str, boolean clear){
        if(txResult.getText().equals("")){
            txExpression.setText(" ");
        }

        if(clear){
            txResult.setText(" ");
            txExpression.append(str);
        } else {
            txExpression.append(txResult.getText());
            txExpression.append(str);
            txResult.setText(" ");
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.numero_zero:
                addExpression("0", true);
                break;
            case R.id.numero_um:
                addExpression("1", true);
                break;
            case R.id.numero_dois:
                addExpression("2", true);
                break;
            case R.id.numero_tres:
                addExpression("3", true);
                break;
            case R.id.numero_quatro:
                addExpression("4", true);
                break;
            case R.id.numero_cinco:
                addExpression("5", true);
                break;
            case R.id.numero_seis:
                addExpression("6", true);
                break;
            case R.id.numero_sete:
                addExpression("7", true);
                break;
            case R.id.numero_oito:
                addExpression("8", true);
                break;
            case R.id.numero_nove:
                addExpression("9", true);
                break;
            case R.id.numero_decimal:
                addExpression(".", true);
                break;
            case R.id.bt_adicao:
                addExpression("+", false);
                break;
            case R.id.bt_subtracao:
                addExpression("-", false);
                break;
            case R.id.bt_multiplicacao:
                addExpression("*", false);
                break;
            case R.id.bt_divisao:
                addExpression("/", false);
                break;
        }
    }
}