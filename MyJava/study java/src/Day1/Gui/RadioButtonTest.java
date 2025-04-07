package Day1.Gui;

import javax.swing.*;

public class RadioButtonTest extends JFrame {
    public RadioButtonTest() {
        JRadioButton radioButton1 = new JRadioButton("男");
        //radioButton1.setIcon(new ImageIcon("F:\\Github\\First\\My Java\\study java\\src\\Day1\\Gui\\img\\e324683e3c2ee5d33147eedd4666c114.png"));
        radioButton1.setBounds(100, 100, 100, 30);


        this.add(radioButton1);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new RadioButtonTest();
    }
}
