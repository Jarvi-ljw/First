package Day1.Gui;

import javax.swing.*;
import java.awt.*;
// 列表框list的使用
public class ListTest extends JFrame {
    public ListTest() {

        this.setTitle("列表框测试");
        this.setSize(400, 300);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JList list = new JList();
        list.setListData(new String[]{"java", "c++", "python", "c", "c#"});

        this.add(list);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ListTest();
    }

}
