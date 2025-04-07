package Day1.Gui;
//学习swing中的SplitPaneTest（分割面板）

import javax.swing.*;

public class SplitPaneTest extends JFrame {
    public SplitPaneTest() {
        this.setTitle("分割面板测试");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSplitPane splitPane = new JSplitPane();
        splitPane.setDividerLocation(150);

        JButton jb1 = new JButton("按钮1");
        JButton jb2 = new JButton("按钮2");

        splitPane.setLeftComponent(jb1);
        splitPane.setRightComponent(jb2);

        this.add(splitPane);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new SplitPaneTest();
    }
}
