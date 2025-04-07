package com.ljw.calculator;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ClearBtn implements ActionListener {
    private JTextField textField;

    public ClearBtn(JTextField textField) {
        this.textField = textField;
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        //清除对话框的内容
        textField.setText("");
    }
}
