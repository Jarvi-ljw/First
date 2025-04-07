package Day1.Gui;

import javax.swing.*;
//配合FrameTest类的调用，点击FrameTest类中的的按钮，弹出此窗口
public class FrameTest2 {
    public FrameTest2(){
        //添加一个新的窗体
        JFrame jf = new JFrame();
        jf.setTitle("窗口2");
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        //设置关闭窗口2，并不会关闭窗口1
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.setLayout(null);
        JButton jb = new JButton("按钮");
        jb.setBounds(100, 100, 100, 50);
        jf.add(jb);
        jf.setVisible(true);
    }

}
