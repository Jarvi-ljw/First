package Day1.Gui;

import javax.swing.*;
import java.awt.*;

//学习java swing中的panel组件
//
public class PanelTest extends JFrame {
    JPanel p1,p2,p3,p4;

    public PanelTest(){
        JFrame jf = new JFrame();
        jf.setLayout(new GridLayout(2,2,2,2));//设置窗体为网格布局

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();

        JButton j1= new JButton("按钮1");
        JButton j2= new JButton("按钮2");
        JButton j3= new JButton("按钮3");
        JButton j4= new JButton("按钮4");
        JButton j5= new JButton("按钮5");

        p1.setLayout(new FlowLayout());
        p1.add(j1);
        p1.add(j5);
        p2.add(j2);
        p3.add(j3);
        p4.add(j4);


        jf.add(p1);
        jf.add(p2);
        jf.add(p3);
        jf.add(p4);


        jf.setSize(400,400);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        new PanelTest();
    }
}
