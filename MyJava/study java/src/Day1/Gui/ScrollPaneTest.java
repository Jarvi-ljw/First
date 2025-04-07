package Day1.Gui;

import javax.swing.*;
import java.awt.*;
//学习swing中的JScrollPane（滚动面板）

public class ScrollPaneTest extends JFrame {
    public ScrollPaneTest() {

        this.setTitle("滚动面板测试");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(30, 50);


        JScrollPane jsp = new JScrollPane(textArea);
        this.add(jsp);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ScrollPaneTest();
    }
}
