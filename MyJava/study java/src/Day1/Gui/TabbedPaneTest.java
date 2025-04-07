package Day1.Gui;

import javax.swing.*;
//swing中的JTabbedPaneTest面板(选项卡面板)
public class TabbedPaneTest extends JFrame {
    JTabbedPane tabbedPane;
    JButton button;
    Icon icon1, icon2, icon3, icon4;
    JCheckBox checkBox;
    JTextArea textArea;

    public TabbedPaneTest(String title) {
        super(title);

        //创建一个在上面显示标签，布局方式为自动换行的空选项卡
        tabbedPane = new JTabbedPane();

        //创建按钮
        button = new JButton("我是一个按钮");

        /*//实例化图标对象
        icon1 = new ImageIcon("C:\\Users\\15269\\Desktop\\1.ico");
        icon2 = new ImageIcon("C:\\Users\\15269\\Desktop\\1.ico");
        icon3 = new ImageIcon("C:\\Users\\15269\\Desktop\\1.ico");
        icon4 = new ImageIcon("C:\\Users\\15269\\Desktop\\1.ico");*/

        //添加选项卡
        tabbedPane.addTab("选项卡一", icon1, button, "这里使用了按钮");

        checkBox = new JCheckBox("复选框");
        tabbedPane.addTab("选项卡二", null, checkBox, null);
        tabbedPane.setIconAt(1, icon2);      //为第二个选项卡添加标签图标

        textArea = new JTextArea("文本域");
        tabbedPane.addTab("选项卡三", icon3, textArea, null);
        tabbedPane.setToolTipTextAt(2, "这里使用了文本域");     //为第三个选项卡添加工具提示文本

        JRadioButton radioButton = new JRadioButton("单选按钮");
        tabbedPane.addTab("选项卡四", icon4, radioButton, null);

        add(tabbedPane);

        //设置窗口风格
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 300, 360, 300);
        setVisible(true);
    }

    //main方法
    public static void main(String args[]) {
        new TabbedPaneTest("JTabbedPane");
    }
}

