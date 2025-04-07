/*package com.ljw.calculator;

import javax.swing.*;
import java.awt.event.ActionListener;

public class AnswerBtn implements ActionListener {
    private JTextField textField;
    public AnswerBtn(JTextField textField)
    {
        this.textField = textField;
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e)
    {
        // 获取文本框中的内容
        String answer=textField.getText();
        // 将文本框中的内容转换为字符数组



    }

}*/


//暂时不会写此代码，由ai生成的
package com.ljw.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class AnswerBtn implements ActionListener {
    private JTextField textField;

    public AnswerBtn(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取文本框中的内容
        String expression = textField.getText();
        try {
            double result = evaluateExpression(expression);
            textField.setText(String.valueOf(result));
        } catch (Exception ex) {
            textField.setText("Error");
        }
    }

    private double evaluateExpression(String expression) {
        expression = expression.replaceAll("\\s+", ""); // 移除空格
        char[] tokens = expression.toCharArray();

        Stack<Double> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == ' ') {
                continue;
            }

            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuilder sbuf = new StringBuilder();
                while (i < tokens.length && (tokens[i] >= '0' && tokens[i] <= '9' || tokens[i] == '.')) {
                    sbuf.append(tokens[i++]);
                }
                values.push(Double.parseDouble(sbuf.toString()));
                i--;
            } else if (tokens[i] == '(') {
                ops.push(tokens[i]);
            } else if (tokens[i] == ')') {
                while (ops.peek() != '(') {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.pop();
            } else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.push(tokens[i]);
            }
        }

        while (!ops.empty()) {
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    private boolean hasPrecedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        } else {
            return true;
        }
    }

    private double applyOp(char op, double b, double a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }
}

