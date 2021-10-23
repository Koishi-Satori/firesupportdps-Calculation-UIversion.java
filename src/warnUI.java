import javax.swing.*;
import java.util.Objects;

class warnUI extends version{
    public void nullInfo(String a$aa) {
        if (Objects.equals(a$aa,"")||Objects.equals(a$aa,null)) {
            text1 = String.valueOf(a$aa.getClass());
            text2 = "type";
        } else{
            text1 = "java.Lang.Integer";
            text2 = "text";
        }
        flag = true;
        JFrame frameIllegal = new JFrame("Warning ->lost"+text1);
        frameIllegal.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frameIllegal.setResizable(false);
        frameIllegal.setBounds(400, 400, 300, 150);
        JPanel panelIllegal = new JPanel();
        panelIllegal.setLayout(null);
        JLabel tips = new JLabel("Except a input,but "+text2+"is empty.");
        tips.setBounds(10, 10, 280, 50);
        JButton close = new JButton("Retype");
        close.setBounds(160, 80, 80, 30);
        close.addActionListener(e -> frameIllegal.dispose());
        panelIllegal.add(close);
        panelIllegal.add(tips);
        panelIllegal.setVisible(true);
        frameIllegal.add(panelIllegal);
        frameIllegal.setVisible(true);
    }

    public void Default(String a$aa,int ab$a,int aaa,int aa,int a,int ba$a,int aa$a,int a$a) {
        JFrame frameD = new JFrame("Warn:Text is null");
        frameD.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frameD.setResizable(false);
        frameD.setBounds(400,300,300,150);
        JPanel panelD = new JPanel();
        panelD.setLayout(null);
        JLabel labelD1 = new JLabel("The amount has been set to:");
        JLabel labelD2 = new JLabel(a$aa+" "+ab$a+" "+aaa+" "+aa+" "+a+" "+ba$a+" "+aa$a+" "+a$a);
        JButton closeee = new JButton("Close");
        labelD1.setBounds(10,10,280,30);
        labelD2.setBounds(10,50,280,30);
        closeee.setBounds(100,90,100,30);
        closeee.addActionListener(e -> frameD.dispose());
        panelD.add(labelD1);
        panelD.add(labelD2);
        panelD.add(closeee);
        panelD.setVisible(true);
        frameD.add(panelD);
        frameD.setVisible(true);
    }

    public void energency_en() {
        JFrame frameIllegal = new JFrame("EmergencyOut");
        frameIllegal.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frameIllegal.setResizable(false);
        frameIllegal.setBounds(400, 400, 300, 150);
        JPanel panelIllegal = new JPanel();
        panelIllegal.setLayout(null);
        JLabel tips = new JLabel();
        tips.setBounds(10, 10, 280, 50);
        JButton close = new JButton("Retype");
        close.setBounds(160, 80, 80, 30);
        close.addActionListener(e -> System.exit(0));
        panelIllegal.add(close);
        panelIllegal.add(tips);
        panelIllegal.setVisible(true);
        frameIllegal.add(panelIllegal);
        frameIllegal.setVisible(true);
    }
}