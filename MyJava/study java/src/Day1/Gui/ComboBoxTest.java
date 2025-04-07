package Day1.Gui;

import javax.swing.*;
import java.awt.*;

//学习 Swing 中的下拉列表框：JComboBox
public class ComboBoxTest extends JFrame {
    public ComboBoxTest() {

        this.setTitle("下拉列表框测试");
        this.setSize(400, 300);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox comboBox = new JComboBox();

        this.add(comboBox);
        comboBox.addItem("选项1");
        comboBox.addItem("选项2");

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxTest();
    }
}
