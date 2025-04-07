package com.ljw.calculator;

import javax.swing.*;
import java.awt.event.ActionListener;

public class OperatorBtn implements ActionListener {
    private JTextField textField;

    public OperatorBtn(JTextField textField) {
        this.textField = textField;
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        String option = e.getActionCommand();
        textField.setText(textField.getText() + option); // 将点击的操作符追加到文本框中
    }
}
