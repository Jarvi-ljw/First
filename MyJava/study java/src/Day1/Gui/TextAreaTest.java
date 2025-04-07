package Day1.Gui;

import javax.swing.*;
import java.awt.*;
//GUI Swing中的 JTextArea组件
//学习 JTextArea组件的基本功能
public class TextAreaTest extends JFrame {

    public TextAreaTest(){

        this.setTitle("文本域测试");
        this.setSize(400, 300);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea jta = new JTextArea("这是一个文本域", 5, 20);
        this.add(jta);

        this.setVisible(true);

    }

    public static void main(String[] args) {
        new TextAreaTest();
    }

}
