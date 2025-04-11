package Day2.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        //创建对象调用
       //jb.addActionListener(new BtnActionListener());

        //匿名内部类调用
       /* jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/

        //lambda调用：ActionListener中的actionPerformed()方法中的形参列表->{};
        jb.addActionListener((ActionEvent e )->{
            JOptionPane.showMessageDialog(jf,"按钮被点击");
        });



        jf.setVisible(true);//设置窗体可见
    }
}
 class BtnActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("按钮被点击了");
    }
}
/*class MyActiionListener implements ActionListener {
    private JFrame jf;
    public MyActiionListener(JFrame jf) {
        this.jf = jf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(jf, "按钮被点击了");
        System.out.println("按钮被点击了");
    }*/
    //直接用匿名内部类实现
   /* public static void main(String[] args) {
        JFrame jf = new JFrame();//创建窗体

        JPanel panel = new JPanel();//创建面板

        jf.setSize(400, 300);//设置窗体大小

        jf.setTitle("GuiDemo");

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭方式

        jf.setLocationRelativeTo(null);//设置窗体居中

        jf.setLayout(new FlowLayout());//设置流式布局
        JButton jb = new JButton("按钮");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jf, "按钮被点击了");
                System.out.println("按钮被点击了");
            }
        });
    }*/

