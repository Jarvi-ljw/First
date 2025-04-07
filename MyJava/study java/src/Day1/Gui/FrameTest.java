package Day1.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//GUI  Swing中的JFrame组件
//学习JFrame窗体的使用和相关的功能
public class FrameTest extends JFrame {
    public FrameTest() {

        //设置窗体标题
        this.setTitle("窗口1");
        //设置窗体大小
        this.setSize(400, 300);
        //设置窗体位置
        this.setLocation(200, 200);
        //设置窗体关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗体布局
        this.setLayout(null);
        //添加按钮
        JButton jb2 = new JButton("按钮");
        jb2.setBounds(100, 100, 100, 50);
        jb2.addActionListener(new MyActionListener());
        this.add(jb2);
        //设置窗体可见
        this.setVisible(true);
    }
public class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "点击了按钮即将弹出窗体2");
        new  FrameTest2();
    }
}
    public static void main(String[] args) {
        new FrameTest();
    }
}
