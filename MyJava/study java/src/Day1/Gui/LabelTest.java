package Day1.Gui;

import javax.swing.*;

//GUI Swing中的JLabel组件
//学习JLabel组件的使用和相关的功能
public class LabelTest extends JFrame {
   public  LabelTest(){
       JLabel jl =new JLabel("这是一个JLabel标签");
       jl.setIcon(new ImageIcon("F:\\Github\\First\\My Java\\study java\\src\\Day1\\Gui\\img\\e324683e3c2ee5d33147eedd4666c114.png"));


      this.setSize(1920, 1080);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      this.add(jl);
      this.setVisible(true);
   }



    public static void main(String[] args) {
        new  LabelTest();
    }

}
