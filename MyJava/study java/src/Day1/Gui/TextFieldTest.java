package Day1.Gui;

import javax.swing.*;
import java.awt.*;
//GUI Swing中的JTextField和JPasswordField组件
//学习和使用两个组件的基础用法
public class TextFieldTest extends JFrame {

    public TextFieldTest() {

        this.setTitle("文本框测试");
        this.setSize(400, 300);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());


        JLabel jl = new JLabel("用户名：");
        JLabel jl2= new JLabel("密码：");

        JTextField jtf = new JTextField(20);
        JPasswordField jpf = new JPasswordField(20);
        jpf.setEchoChar('*');

        panel1.add(jl);
        panel1.add(jtf);

        panel2.add(jl2);
        panel2.add(jpf);

        this.add(panel1);
        this.add(panel2);

        this.setVisible(true);
    }
    public static void main(String[] args) {
        new TextFieldTest();
    }
}
