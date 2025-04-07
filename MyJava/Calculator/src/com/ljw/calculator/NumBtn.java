package com.ljw.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

// 数字按钮的监听事件
public class NumBtn implements ActionListener {
    private JTextField textField;

    public NumBtn(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String num = e.getActionCommand();
        textField.setText(textField.getText() + num); // 将点击的数字追加到文本框中
    }
}
