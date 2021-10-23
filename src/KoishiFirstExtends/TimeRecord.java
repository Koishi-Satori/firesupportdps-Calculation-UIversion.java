package KoishiFirstExtends;

import javax.swing.*;
/**A class use to show the run time.
 * <p><b>How to use:</b></p>
 * use the method {@link TimeRecord#start()} to set the start millisSeconds,then use one of the others to output the time.
 * Output format example:3.001s
 * @author KKoishi_
 * @author Yuyuko_
 * @since 2021/10/18
 * @version 1.0(base on JDK16.0.*+)
 * <p>The author's GitHub homepage:<a href="https://github.com/Koishi-Satori">rue~</a></p>
 */
public class TimeRecord {
    private static long start;
    /**
     * get the time start,and storage it.
     */
    public void start(){
        start = System.currentTimeMillis();
    }
    /**
     * Output the result with <b>ms</b>&the format println.
     */
    public void endPrintln() {
        long end = System.currentTimeMillis();
        System.out.println((double)(end - start)/1000);
    }
    /**
     * Output the result with <b>ms</b>&the format print.
     */
    public void endPrint() {
        long end = System.currentTimeMillis();
        System.out.print((double)(end - start)/1000);
    }
    /**
     * @return a Double,the time executing(in second)
     */
    public double endOutDouble() {
        long end = System.currentTimeMillis();
        return (double)(end - start)/1000;
    }
    /**
     * @return a String,the format output.(time+s)
     */
    public String endOutString() {
        long end = System.currentTimeMillis();
        return (double) (end - start) / 1000 +"s";
    }
    /**
     * Automatically summon a JFrame(SwingUI) to output the result(in second)
     * @param title a String,the title of the frame.
     * @param text a String,the text to show in the frame.
     * @param buttonText a String,the text of the button.
     */
    public void endWithFrame(String title,String text,String buttonText){
        long end = System.currentTimeMillis();
        double result = (double)(end - start)/1000;
        JFrame frameTime = new JFrame(title);
        frameTime.setBounds(400,200,200,120);
        frameTime.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frameTime.setResizable(false);
        JPanel panelTime = new JPanel();
        panelTime.setLayout(null);
        JLabel labelTime = new JLabel(text+result+"s");
        JButton buttonTime = new JButton(buttonText);
        labelTime.setBounds(10,10,180,30);
        buttonTime.setBounds(60,60,80,30);
        buttonTime.addActionListener(e -> frameTime.dispose());
        panelTime.add(labelTime);
        panelTime.add(buttonTime);
        panelTime.setVisible(true);
        frameTime.add(panelTime);
        frameTime.setVisible(true);
    }
}