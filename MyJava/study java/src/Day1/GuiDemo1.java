package Day1;

import javax.swing.*;
import java.awt.*;

public class GuiDemo1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();//创建窗体

        JPanel panel = new JPanel();//创建面板

        jf.setSize(400, 300);//设置窗体大小

        jf.setTitle("GuiDemo");

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭方式

        jf.setLocationRelativeTo(null);//设置窗体居中

        jf.setLayout(new FlowLayout());//设置流式布局

        JButton jb = new JButton("按钮");

        panel.add(jb);//将按钮添加到面板中
        jf.add(panel);

        jf.setVisible(true);//设置窗体可见
    }
}
