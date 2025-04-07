package Day1.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FocusEventDemo extends JFrame {
    JPanel panel;
    JTextField t1,t2;

    public static void main(String[] args) {
        new FocusEventDemo("FocusEvent");
    }

    public FocusEventDemo(String title){
        super(title);

        //定义面板对象
        panel = new JPanel();
        setContentPane(panel);

        t1 = new JTextField(15);
        t2 = new JTextField(15);

        t1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                //设置组件背景色为CYAN
                t1.setBackground(Color.CYAN);
            }

            @Override
            public void focusLost(FocusEvent e) {
                t1.setBackground(Color.GREEN);
            }
        });

        panel.add(t1);
        panel.add(t2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,300,260,260);
        setVisible(true);       //设置窗口可见
    }
}

