package Day1.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//GUI Swing 中的 JDialog窗体
//学习 JDialog 窗体的功能和使用
public class DialogTest extends JFrame{
    JDialog dialog = new JDialog();

    public DialogTest() {
        //创建 JDialog 对象
        dialog.setSize(200, 200);
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //添加一个按钮并为按钮添加点击事件，点击按钮就会弹出JDialog窗体
        JButton jb = new JButton("点击弹出新窗体");
        this.add(jb);
        jb.addActionListener(new MyActionListener());

        //为JDialog窗体添加关闭按钮，点击按钮就会关闭JDialog窗体
       JButton jb2 =new JButton("点我关闭窗体");
       dialog.add(jb2);
       jb2.addActionListener(new MyActionListener2());

       //为主窗体添加一个界面关闭按钮
        JButton jb3 = new JButton("关闭总窗体");
        this.add(jb3);
        jb3.addActionListener(new ExitActionListener());

        this.setVisible(true);
    }


//点击实现新窗体的事件
class MyActionListener implements ActionListener{
    public void MyActionListener(){
        }
        @Override
        public void actionPerformed(ActionEvent e) {
           dialog.setVisible(true);
        }
}

//关闭窗体按钮的关闭显示事件
class MyActionListener2 implements ActionListener{
    public void MyActionListener2(){
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        dialog.setVisible(false);
    }
}
//关闭总窗体按钮的关闭显示事件
class ExitActionListener implements ActionListener{
    public void ExitActionListener(){
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}

    public static void main(String[] args) {
        new DialogTest();
    }
}



