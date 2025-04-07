package com.ljw.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField usernameField;// 用户名输入框
    private JPasswordField passwordField;// 密码输入框
    private JButton loginButton;// 登录按钮
    private JButton registerButton; // 注册按钮

    public LoginFrame() {

        init();// 初始化组件

        // 设置窗口属性
        this.setTitle("登录界面");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // 居中显示
        this.setVisible(true);

    }

    private void init() {
        //创建主面板（桌布）并设置布局方式
        JPanel mainPanel = new JPanel(new GridLayout(4, 1,10,10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));


        //设置标题
        JLabel titleLabel = new JLabel("学生管理系统", SwingConstants.CENTER);
        titleLabel.setFont(new Font("楷体", Font.BOLD, 24));
        mainPanel.add(titleLabel);
        titleLabel.setHorizontalAlignment(JLabel.CENTER); // 居中显示标题


        //设置用户面板
        JPanel usernamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        usernamePanel.add(new JLabel("用户名:"));//设置用户名标签
        usernameField =new JTextField(20);//设置用户名输入框
        usernamePanel.add(usernameField);
        mainPanel.add(usernamePanel);


        //设置密码面板
        JPanel passwordPanel =new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPanel.add(new JLabel("密码:"));//设置密码标签
        passwordField = new JPasswordField(20);//设置密码输入框
        passwordPanel.add(passwordField);
        mainPanel.add(passwordPanel);


        //设置按钮面板
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        loginButton = new JButton("登录");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(LoginFrame.this, "登录成功");
            }
        });//设置登录按钮事件
        registerButton= new JButton("注册");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(LoginFrame.this, "注册成功");
            }
        });
        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);
        mainPanel.add(buttonPanel);




        //添加主面板到窗体内
        this.add(mainPanel);


    }

}
