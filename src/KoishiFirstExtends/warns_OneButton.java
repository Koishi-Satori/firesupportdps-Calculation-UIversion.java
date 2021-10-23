package KoishiFirstExtends;

import javax.swing.*;

/**
 * When does not want to design some easy but multiple swingUIs,you can use this to create warning GUI directly.
 * There are many params you can select,to write and display in the way which can accord with your imagines,
 * and they are easy to provide.
 * @since 2021/10/17
 * @author KKoishi_
 * @author Yuyuko_
 * @version 1.0.1
 * <p>The author's GitHub homepage:<a href="https://github.com/Koishi-Satori">rue~</a></p>
 */
public class warns_OneButton {
    /**
     * The most basic warning UI.Only one text line can be set.
     * <p>After provide the text and use the method,JVM will automatically show a window
     * which display the text.If more are wanted,you can add param.The "PORTAL" links to other methods.</p>
     * @param text Here should provide a String.It can change the text in warn zone.
     * <br>PORTAL:{@link KoishiFirstExtends.warns_OneButton#oneLine_buttonClose(String UIName,String text)}
     */
    public  void oneLine_buttonClose(String text) {
        JFrame frame = new JFrame("Warning!");
        frame.setBounds(500,400,300,200);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel label = new JLabel(text);
        label.setBounds(10,40,280,30);
        JButton button = new JButton("Close");
        button.setBounds(110,90,80,30);
        button.addActionListener(e -> frame.dispose());
        panel.add(button);
        panel.add(label);
        panel.setVisible(true);
        frame.add(panel);
        frame.setVisible(true);
    }

    public void oneLine_buttonClose(String UIName,String text) {
        JFrame frame = new JFrame(UIName);
        frame.setBounds(500,400,300,200);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel label = new JLabel(text);
        label.setBounds(10,40,280,30);
        JButton button = new JButton("Close");
        button.setBounds(110,90,80,30);
        button.addActionListener(e -> frame.dispose());
        panel.add(button);
        panel.add(label);
        panel.setVisible(true);
        frame.add(panel);
        frame.setVisible(true);
    }

    public void oneLine_buttonClose(String UIname,String text,int x,int y) {
        JFrame frame = new JFrame(UIname);
        frame.setBounds(x,y,300,200);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel label = new JLabel(text);
        label.setBounds(10,40,280,30);
        JButton button = new JButton("Close");
        button.setBounds(110,90,80,30);
        button.addActionListener(e -> frame.dispose());
        panel.add(button);
        panel.add(label);
        panel.setVisible(true);
        frame.add(panel);
        frame.setVisible(true);
    }

    public void oneLine_buttonClose(String UIname,String text,int x,int y,int width,int height) {

    }
}
