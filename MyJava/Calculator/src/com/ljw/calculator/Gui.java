package com.ljw.calculator;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    public Gui() {
        // 初始化面板
        initPanel();


        // 创建窗口
        this.setTitle("计算器");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);

    }

    public void initPanel() {

        //添加上下两个面板
        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        //设置上面板的组件和样式
        topPanel.setLayout(null);
        JLabel label = new JLabel("计算器");
        label.setBounds(350, 10, 100, 30);
        label.setFont(new Font("微软雅黑", Font.BOLD, 24));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        topPanel.add(label);
        //添加文本框来显示计算过程和结果
        JTextField textField = new JTextField(20);
        textField.setBounds(150, 50, 500, 30);
        textField.setFont(new Font("微软雅黑", Font.PLAIN, 18));
        textField.setAlignmentX(Component.CENTER_ALIGNMENT); // 居中对齐
        topPanel.add(textField);

        //设置下面板的组件和样式
        bottomPanel.setLayout(new GridLayout(4, 4, 10, 10));
        //添加0-9 10个按钮并设置好大小
        JButton[] buttons = new JButton[10];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            buttons[i].setFont(new Font("微软雅黑", Font.PLAIN, 18));
            buttons[i].setPreferredSize(new Dimension(80, 60)); // 设置按钮大小
            buttons[i].addActionListener(new NumBtn(textField)); // 添加数字按钮的监听器
            bottomPanel.add(buttons[i]);
        }
        //添加四个运算符按钮和等于按钮
        JButton[] operatorButtons = new JButton[5];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");
        operatorButtons[4] = new JButton("=");
        for (int i = 0; i < operatorButtons.length-1; i++) {
            operatorButtons[i].setFont(new Font("微软雅黑", Font.PLAIN, 18));
            operatorButtons[i].setPreferredSize(new Dimension(80, 60)); // 设置按钮大小
            operatorButtons[i].addActionListener(new OperatorBtn(textField));//添加操作符按钮的监听器
            bottomPanel.add(operatorButtons[i]);
        }

        //为等于按钮添加监听器
        operatorButtons[4].setFont(new Font("微软雅黑", Font.PLAIN, 18));
        operatorButtons[4].setPreferredSize(new Dimension(900, 60));
        operatorButtons[4].addActionListener(new AnswerBtn(textField));
        bottomPanel.add(operatorButtons[4]);


        //添加清除按钮
        JButton clearButton = new JButton("C");
        clearButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
        clearButton.setPreferredSize(new Dimension(100, 60));
        clearButton.addActionListener(new ClearBtn(textField));//添加清除按钮的监听器
        bottomPanel.add(clearButton);


        //设置上下面面板的坐标
        topPanel.setBounds(0, 0, 800, 100);
        bottomPanel.setBounds(150, 100, 420, 400);


        //添加上下面板到窗体
        this.add(topPanel);
        this.add(bottomPanel);

    }
}
