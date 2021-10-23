import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.*;

public class version {
    static int[] damage = new int[1];
    static int[] DefenceBreak = new int[1];
    static int[] accuracy = new int[1];
    static int[] fill = new int[1];
    static int[] force = new int[1];
    static int[] miss = new int[1];
    static int[] amount = new int[1];
    static String[] Type = new String[1];
    static boolean flag = false;
    String text1;
    String text2;
    String text3;

    public static void main(String[] args) {
        selectLanguageUI();
    }

    public static void selectLanguageUI() {
        JFrame frame1 = new JFrame("Fire-support Calculator --> language select");
        frame1.setResizable(false);
        frame1.setBounds(500, 300, 400, 225);
        frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        JLabel label1 = new JLabel("Please select language.------------------------------请选择你的语言.");
        JButton buttonLan1 = new JButton("en英文");
        JButton buttonLan2 = new JButton("zh_cn中文");
        label1.setBounds(20, 15, 360, 50);
        buttonLan1.setBounds(40, 80, 100, 30);
        buttonLan1.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        buttonLan2.setBounds(240, 80, 100, 30);
        buttonLan2.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        buttonLan1.addActionListener(e -> {
            enMainUI();
            Toolkit.getDefaultToolkit().beep();
            frame1.dispose();
        });
        buttonLan2.addActionListener(e -> {
            cnMainUI();
            Toolkit.getDefaultToolkit().beep();
            frame1.dispose();
        });
        panel1.add(label1);
        panel1.add(buttonLan1);
        panel1.add(buttonLan2);
        JLabel label = new JLabel("rua CCS&Autumn");
        panel1.add(label);
        JButton exit1 = new JButton("exit");
        exit1.setBounds(150, 140, 100, 40);
        exit1.addActionListener(e -> {
            frame1.setTitle(e.getSource().toString());
            frame1.dispose();
        });
        panel1.add(exit1);
        panel1.setVisible(true);
        frame1.add(panel1);
        frame1.setVisible(true);
    }

    public static void cnMainUI() {
        damage[0] = 0;
        accuracy[0] = 0;
        DefenceBreak[0] = 0;
        fill[0] = 0;
        force[0] = 0;
        miss[0] = 0;
        amount[0] = 0;
        Type[0] = "2b14）";
        JFrame frame2 = new JFrame("输入数值 ->中文<-");
        JPanel panel2 = new JPanel();
        frame2.setResizable(false);
        frame2.setBounds(400, 200, 600, 500);
        frame2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        panel2.setLayout(null);
        JLabel labelType = new JLabel("选择重装种类" + Type[0] + "(默认值)");
        JButton B_2b14 = new JButton("2b14");
        JButton B_bgm71 = new JButton("bgm71");
        JButton B_at4 = new JButton("at4");
        JButton B_ags30 = new JButton("ags30");
        JButton B_m2 = new JButton("m2");
        JButton B_mk153 = new JButton("mk153");
        JLabel labelDamage = new JLabel("杀伤数值");
        JLabel labelDefenceBreak = new JLabel("破防数值");
        JLabel labelAccuracy = new JLabel("精度数值");
        JLabel labelFill = new JLabel("装填数值");
        JLabel labelMiss = new JLabel("敌方闪避");
        JLabel labelForce = new JLabel("敌方力场");
        JLabel labelAmount = new JLabel("敌方扩编");
        JTextField textDamage = new JTextField();
        JTextField textDefenceBreak = new JTextField();
        JTextField textAccuracy = new JTextField();
        JTextField textFill = new JTextField();
        JTextField textForce = new JTextField();
        JTextField textMiss = new JTextField();
        JTextField textAmount = new JTextField();
        JButton buttonConfirm = new JButton("全部确认");
        JButton buttonStartCal = new JButton("计算");
        JButton buttonExit = new JButton("退出");
        JButton buttonBack = new JButton("返回");
        JButton buttonShow = new JButton("展示历史计算记录");
        buttonShow.setBounds(360, 10, 160, 30);
        labelDamage.setBounds(10, 15, 100, 30);
        textDamage.setBounds(110, 10, 200, 40);
        labelDefenceBreak.setBounds(10, 75, 100, 30);
        textDefenceBreak.setBounds(110, 70, 200, 40);
        labelAccuracy.setBounds(10, 135, 100, 30);
        textAccuracy.setBounds(110, 130, 200, 40);
        labelForce.setBounds(10, 195, 100, 30);
        textForce.setBounds(110, 190, 200, 40);
        labelFill.setBounds(10, 255, 100, 30);
        textFill.setBounds(110, 250, 200, 40);
        labelMiss.setBounds(10, 315, 100, 30);
        textMiss.setBounds(110, 310, 200, 40);
        labelAmount.setBounds(10, 375, 100, 30);
        textAmount.setBounds(110, 370, 200, 40);
        buttonConfirm.setBounds(40, 420, 120, 30);
        buttonStartCal.setBounds(240, 420, 150, 30);
        buttonBack.setBounds(420, 420, 70, 30);
        buttonExit.setBounds(510, 420, 70, 30);
        labelType.setBounds(350, 80, 170, 30);
        B_2b14.setBounds(340, 120, 100, 30);
        B_ags30.setBounds(340, 170, 100, 30);
        B_at4.setBounds(460, 120, 100, 30);
        B_bgm71.setBounds(460, 170, 100, 30);
        B_m2.setBounds(340, 220, 100, 30);
        B_mk153.setBounds(460, 220, 100, 30);
        B_2b14.addActionListener(e -> {
            Type[0] = B_2b14.getText();
            labelType.setText("Select type:" + Type[0]);
        });
        B_ags30.addActionListener(e -> {
            Type[0] = B_ags30.getText();
            labelType.setText("Select type:" + Type[0]);
        });
        B_at4.addActionListener(e -> {
            Type[0] = B_at4.getText();
            labelType.setText("Select type:" + Type[0]);
        });
        B_bgm71.addActionListener(e -> {
            Type[0] = B_bgm71.getText();
            labelType.setText("Select type:" + Type[0]);
        });
        B_m2.addActionListener(e -> {
            Type[0] = B_m2.getText();
            labelType.setText("Select type:" + Type[0]);
        });
        B_mk153.addActionListener(e -> {
        });
        buttonBack.addActionListener(e -> {
            selectLanguageUI();
            Toolkit.getDefaultToolkit().beep();
            frame2.dispose();
        });
        buttonExit.addActionListener(e -> System.exit(0));
        buttonConfirm.addActionListener(e -> {
            if (Objects.equals(textAccuracy.getText(), "") || Objects.equals(textAmount.getText(), "") ||
                    Objects.equals(textDamage.getText(), "") || Objects.equals(textFill.getText(), "") ||
                    Objects.equals(textForce.getText(), "") || Objects.equals(textDefenceBreak.getText(), "") ||
                    Objects.equals(textMiss.getText(), "") || Objects.equals(textAccuracy.getText(), null) ||
                    Objects.equals(textAmount.getText(), null) || Objects.equals(textDamage.getText(), null) ||
                    Objects.equals(textFill.getText(), null) || Objects.equals(textForce.getText(), null) ||
                    Objects.equals(textDefenceBreak.getText(), null) || Objects.equals(textMiss.getText(), null))
                new processDef().ifIllegal(damage[0], DefenceBreak[0], accuracy[0], fill[0], force[0], miss[0], amount[0]);
            else {
                damage[0] = Integer.parseInt(textDamage.getText());
                DefenceBreak[0] = Integer.parseInt(textDefenceBreak.getText());
                accuracy[0] = Integer.parseInt(textAccuracy.getText());
                fill[0] = Integer.parseInt(textFill.getText());
                miss[0] = Integer.parseInt(textMiss.getText());
                force[0] = Integer.parseInt(textForce.getText());
                amount[0] = Integer.parseInt(textAmount.getText());
            }
        });
        buttonStartCal.addActionListener(e -> {
            if (Objects.equals(textAccuracy.getText(), "") || Objects.equals(textAmount.getText(), "") ||
                    Objects.equals(textDamage.getText(), "") || Objects.equals(textFill.getText(), "") ||
                    Objects.equals(textForce.getText(), "") || Objects.equals(textDefenceBreak.getText(), "") ||
                    Objects.equals(textMiss.getText(), "") || Objects.equals(textAccuracy.getText(), null) ||
                    Objects.equals(textAmount.getText(), null) || Objects.equals(textDamage.getText(), null) ||
                    Objects.equals(textFill.getText(), null) || Objects.equals(textForce.getText(), null) ||
                    Objects.equals(textDefenceBreak.getText(), null) || Objects.equals(textMiss.getText(), null)) {
                new warnUI().nullInfo(Type[0]);
                flag = true;
            } else {
                if (Objects.equals(Type[0], "") || Objects.equals(Type[0], null)) Type[0] = "2b14";
                labelType.setText("选择重装:" + Type[0]);
                frame2.setTitle("重装计算器 ->计算中");
                Control_en(Type[0], damage[0], DefenceBreak[0], accuracy[0], fill[0], miss[0], force[0], amount[0]);
                frame2.setTitle("选择界面 ->中文<-");
                flag = false;
            }
            if (flag) {
                Random generation = new Random(System.nanoTime());
                Type[0] = "2b14";
                damage[0] = generation.nextInt(200) + 100;
                DefenceBreak[0] = generation.nextInt(100) + 100;
                accuracy[0] = generation.nextInt(200) + 70;
                fill[0] = generation.nextInt(300) + 350;
                miss[0] = 0;
                force[0] = generation.nextInt(1000) + 1000;
                amount[0] = generation.nextInt(4) + 1;
                new warnUI().Default(Type[0], damage[0], DefenceBreak[0], accuracy[0], fill[0], miss[0], force[0], amount[0]);
                textAccuracy.setText(String.valueOf(accuracy[0]));
                textAmount.setText(String.valueOf(amount[0]));
                textDamage.setText(String.valueOf(damage[0]));
                textFill.setText(String.valueOf(fill[0]));
                textForce.setText(String.valueOf(force[0]));
                textDefenceBreak.setText(String.valueOf(DefenceBreak[0]));
                textMiss.setText(String.valueOf(miss[0]));
                labelType.setText("选择重装种类:2b14(默认值)");
                Type[0] = "2b14";
            }
        });
        buttonShow.addActionListener(e -> ShowHistory.cn());
        panel2.add(labelAccuracy);
        panel2.add(labelAmount);
        panel2.add(labelDamage);
        panel2.add(labelFill);
        panel2.add(labelDefenceBreak);
        panel2.add(labelForce);
        panel2.add(labelMiss);
        panel2.add(B_m2);
        panel2.add(labelType);
        panel2.add(B_2b14);
        panel2.add(buttonBack);
        panel2.add(buttonExit);
        panel2.add(buttonConfirm);
        panel2.add(buttonStartCal);
        panel2.add(B_ags30);
        panel2.add(textForce);
        panel2.add(textAccuracy);
        panel2.add(textAmount);
        panel2.add(textDamage);
        panel2.add(textFill);
        panel2.add(textDefenceBreak);
        panel2.add(textMiss);
        panel2.add(B_at4);
        panel2.add(B_bgm71);
        panel2.add(B_mk153);
        panel2.add(buttonShow);
        panel2.setVisible(true);
        frame2.add(panel2);
        frame2.setVisible(true);
    }

    public static void enMainUI() {
        damage[0] = 0;
        accuracy[0] = 0;
        DefenceBreak[0] = 0;
        fill[0] = 0;
        force[0] = 0;
        miss[0] = 0;
        amount[0] = 0;
        Type[0] = "2b14";
        JFrame frame2 = new JFrame("Input Page ->EN<-");
        JPanel panel2 = new JPanel();
        frame2.setResizable(false);
        frame2.setBounds(400, 200, 600, 540);
        frame2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        panel2.setLayout(null);
        JLabel labelType = new JLabel("Select type:" + Type[0] + "DefaultValue");
        JButton B_2b14 = new JButton("2b14");
        JButton B_bgm71 = new JButton("bgm71");
        JButton B_at4 = new JButton("at4");
        JButton B_ags30 = new JButton("ags30");
        JButton B_m2 = new JButton("m2");
        JButton B_mk153 = new JButton("mk153");
        JLabel labelDamage = new JLabel("Damage");
        JLabel labelDefenceBreak = new JLabel("DefenceBreak");
        JLabel labelAccuracy = new JLabel("Accuracy");
        JLabel labelFill = new JLabel("Filling");
        JLabel labelMiss = new JLabel("Miss");
        JLabel labelForce = new JLabel("Force");
        JLabel labelAmount = new JLabel("Amount");
        JTextField textDamage = new JTextField();
        JTextField textDefenceBreak = new JTextField();
        JTextField textAccuracy = new JTextField();
        JTextField textFill = new JTextField();
        JTextField textForce = new JTextField();
        JTextField textMiss = new JTextField();
        JTextField textAmount = new JTextField();
        JButton buttonConfirm = new JButton("Confirm all");
        JButton buttonStartCal = new JButton("Calculate");
        JButton buttonExit = new JButton("Exit");
        JButton buttonBack = new JButton("Back");
        JButton buttonShow = new JButton("HistoryRecords");
        buttonShow.setBounds(360, 10, 160, 30);
        labelDamage.setBounds(10, 15, 100, 30);
        textDamage.setBounds(110, 10, 200, 40);
        labelDefenceBreak.setBounds(10, 75, 100, 30);
        textDefenceBreak.setBounds(110, 70, 200, 40);
        labelAccuracy.setBounds(10, 135, 100, 30);
        textAccuracy.setBounds(110, 130, 200, 40);
        labelForce.setBounds(10, 195, 100, 30);
        textForce.setBounds(110, 190, 200, 40);
        labelFill.setBounds(10, 255, 100, 30);
        textFill.setBounds(110, 250, 200, 40);
        labelMiss.setBounds(10, 315, 100, 30);
        textMiss.setBounds(110, 310, 200, 40);
        labelAmount.setBounds(10, 375, 100, 30);
        textAmount.setBounds(110, 370, 200, 40);
        buttonConfirm.setBounds(40, 440, 120, 30);
        buttonStartCal.setBounds(220, 440, 150, 30);
        buttonBack.setBounds(420, 440, 70, 30);
        buttonExit.setBounds(510, 440, 70, 30);
        labelType.setBounds(350, 80, 170, 30);
        B_2b14.setBounds(340, 120, 100, 30);
        B_ags30.setBounds(340, 170, 100, 30);
        B_at4.setBounds(460, 120, 100, 30);
        B_bgm71.setBounds(460, 170, 100, 30);
        B_m2.setBounds(340, 220, 100, 30);
        B_mk153.setBounds(460, 220, 100, 30);
        B_2b14.addActionListener(e -> {
            Type[0] = B_2b14.getText();
            labelType.setText("Select type:" + Type[0]);
        });
        B_ags30.addActionListener(e -> {
            Type[0] = B_ags30.getText();
            labelType.setText("Select type:" + Type[0]);
        });
        B_at4.addActionListener(e -> {
            Type[0] = B_at4.getText();
            labelType.setText("Select type:" + Type[0]);
        });
        B_bgm71.addActionListener(e -> {
            Type[0] = B_bgm71.getText();
            labelType.setText("Select type:" + Type[0]);
        });
        B_m2.addActionListener(e -> {
            Type[0] = B_m2.getText();
            labelType.setText("Select type:" + Type[0]);
        });
        B_mk153.addActionListener(e -> {
        });
        buttonBack.addActionListener(e -> {
            selectLanguageUI();
            Toolkit.getDefaultToolkit().beep();
            frame2.dispose();
        });
        buttonExit.addActionListener(e -> System.exit(0));
        buttonConfirm.addActionListener(e -> {
            if (Objects.equals(textAccuracy.getText(), "") || Objects.equals(textAmount.getText(), "") ||
                    Objects.equals(textDamage.getText(), "") || Objects.equals(textFill.getText(), "") ||
                    Objects.equals(textForce.getText(), "") || Objects.equals(textDefenceBreak.getText(), "") ||
                    Objects.equals(textMiss.getText(), "") || Objects.equals(textAccuracy.getText(), null) ||
                    Objects.equals(textAmount.getText(), null) || Objects.equals(textDamage.getText(), null) ||
                    Objects.equals(textFill.getText(), null) || Objects.equals(textForce.getText(), null) ||
                    Objects.equals(textDefenceBreak.getText(), null) || Objects.equals(textMiss.getText(), null))
                new processDef().ifIllegal(damage[0], DefenceBreak[0], accuracy[0], fill[0], force[0], miss[0], amount[0]);
            else {
                damage[0] = Integer.parseInt(textDamage.getText());
                DefenceBreak[0] = Integer.parseInt(textDefenceBreak.getText());
                accuracy[0] = Integer.parseInt(textAccuracy.getText());
                fill[0] = Integer.parseInt(textFill.getText());
                miss[0] = Integer.parseInt(textMiss.getText());
                force[0] = Integer.parseInt(textForce.getText());
                amount[0] = Integer.parseInt(textAmount.getText());
            }
        });
        buttonStartCal.addActionListener(e -> {
            if (Objects.equals(textAccuracy.getText(), "") || Objects.equals(textAmount.getText(), "") ||
                    Objects.equals(textDamage.getText(), "") || Objects.equals(textFill.getText(), "") ||
                    Objects.equals(textForce.getText(), "") || Objects.equals(textDefenceBreak.getText(), "") ||
                    Objects.equals(textMiss.getText(), "") || Objects.equals(textAccuracy.getText(), null) ||
                    Objects.equals(textAmount.getText(), null) || Objects.equals(textDamage.getText(), null) ||
                    Objects.equals(textFill.getText(), null) || Objects.equals(textForce.getText(), null) ||
                    Objects.equals(textDefenceBreak.getText(), null) || Objects.equals(textMiss.getText(), null)) {
                new warnUI().nullInfo(Type[0]);
                flag = true;
            } else {
                if (Objects.equals(Type[0], "") || Objects.equals(Type[0], null)) Type[0] = "2b14";
                labelType.setText("Select type:" + Type[0]);
                frame2.setTitle("Fire-support Calculator->calculating");
                Control_en(Type[0], damage[0], DefenceBreak[0], accuracy[0], fill[0], miss[0], force[0], amount[0]);
                frame2.setTitle("Fire-support Calculator");
                flag = false;
            }
            if (flag) {
                Random generation = new Random(System.nanoTime());
                Type[0] = "2b14";
                damage[0] = generation.nextInt(200) + 100;
                DefenceBreak[0] = generation.nextInt(100) + 100;
                accuracy[0] = generation.nextInt(200) + 70;
                fill[0] = generation.nextInt(300) + 350;
                miss[0] = 0;
                force[0] = generation.nextInt(1000) + 1000;
                amount[0] = generation.nextInt(4) + 1;
                new warnUI().Default(Type[0], damage[0], DefenceBreak[0], accuracy[0], fill[0], miss[0], force[0], amount[0]);
                textAccuracy.setText(String.valueOf(accuracy[0]));
                textAmount.setText(String.valueOf(amount[0]));
                textDamage.setText(String.valueOf(damage[0]));
                textFill.setText(String.valueOf(fill[0]));
                textForce.setText(String.valueOf(force[0]));
                textDefenceBreak.setText(String.valueOf(DefenceBreak[0]));
                textMiss.setText(String.valueOf(miss[0]));
                labelType.setText("Select Type:2b14(DefaultValue)");
                Type[0] = "2b14";
            }
        });
        buttonShow.addActionListener(e -> ShowHistory.en());
        panel2.add(labelAccuracy);
        panel2.add(labelAmount);
        panel2.add(labelDamage);
        panel2.add(labelFill);
        panel2.add(labelDefenceBreak);
        panel2.add(labelForce);
        panel2.add(labelMiss);
        panel2.add(B_m2);
        panel2.add(labelType);
        panel2.add(B_2b14);
        panel2.add(buttonBack);
        panel2.add(buttonExit);
        panel2.add(buttonConfirm);
        panel2.add(buttonStartCal);
        panel2.add(B_ags30);
        panel2.add(textForce);
        panel2.add(textAccuracy);
        panel2.add(textAmount);
        panel2.add(textDamage);
        panel2.add(textFill);
        panel2.add(textDefenceBreak);
        panel2.add(textMiss);
        panel2.add(B_at4);
        panel2.add(B_bgm71);
        panel2.add(B_mk153);
        panel2.add(buttonShow);
        panel2.setVisible(true);
        frame2.add(panel2);
        frame2.setVisible(true);
    }

    public static void Control_en(String type, int damage, int DefenceBreak, int accuracy, int fill, int force, int miss, int amount) {
        //use the class Main_operation(which integrate all the calculation-used class&methods)and the other class
        //调用Main_operation类（集成了所有用于计算dps的类与方法）与其他类
        Main_operation op = new Main_operation();
        int language_id = 1;
        switch (language_id) {
            case 0 -> {
                JFrame frameIllegal = new JFrame("Language Error");
                frameIllegal.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frameIllegal.setResizable(false);
                frameIllegal.setBounds(400, 400, 300, 150);
                JPanel panelIllegal = new JPanel();
                panelIllegal.setLayout(null);
                JLabel tips = new JLabel("HHHH,It is A rosterEgg,how can you reach it?");
                tips.setBounds(10, 10, 280, 50);
                JButton close = new JButton("Close");
                close.setBounds(160, 80, 80, 30);
                close.addActionListener(e -> frameIllegal.dispose());
                panelIllegal.add(close);
                panelIllegal.add(tips);
                panelIllegal.setVisible(true);
                frameIllegal.add(panelIllegal);
                frameIllegal.setVisible(true);
            }
            //case1 - en
            case 1 -> //main calculation
                    op.en_main(type, damage, DefenceBreak, accuracy, fill, force, miss, amount);
        }
    }

    public static void Control_cn(String type, int damage, int DefenceBreak, int accuracy, int fill, int force, int miss, int amount) {
        //use the class Main_operation(which integrate all the calculation-used class&methods)and the other class
        //调用Main_operation类（集成了所有用于计算dps的类与方法）与其他类
        Main_operation op = new Main_operation();
        op.cn_main(type, damage, DefenceBreak, accuracy, fill, force, miss, amount);
    }
}

class processDef {
    static String type_1 = "bgm71";
    static String type_2 = "2b14";
    static String type_3 = "at4";
    static String type_4 = "ags30";
    static String type_5 = "m2";
    static String type_6 = "mk153";
    static String type_7 = "pp93";
    String lan_zh = "zh_cn";
    String lan_en = "en";

    public int def_type(String type) {
        if (type.equals(processDef.type_1)) return 1;
        else if (type.equals(processDef.type_2)) return 2;
        else if (type.equals(processDef.type_3)) return 3;
        else if (type.equals(processDef.type_4)) return 4;
        else if (type.equals(processDef.type_5)) return 5;
        else if (type.equals(processDef.type_6)) return 6;
        else if (type.equals(processDef.type_7)) return 7;
        else return 0;
    }

    public double miss(int accuracy, int miss) {
        return ((double) accuracy / ((double) accuracy + 8 * (double) miss));
    }

    public double shotspeed(int fill) {
        return (Math.floor(1500 / Math.ceil((300 + (double) fill) / 30)) / 30);
    }

    public void ifIllegal(int number, int num, int numm, int nummm, int miaomiaomiao, int miao, int miaomiao) {
        String tip, title;
        int def = 0;
        if ((number > 0 && number < 700) && (num > 0 && num < 888) && (numm > 0 && numm < 600) && (nummm > 0 && nummm < 700)
                && miao > 0 && miaomiao > 0 && miaomiaomiao > 0) {
            tip = "Successfully input!";
            title = "Tips  --  success";
        } else {
            tip = "Error!Range does not match.";
            title = "Warn->out of range";
            def = 1;
            for (int i = 0; i < 5; i++) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
        JFrame frameIllegal = new JFrame(title);
        frameIllegal.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frameIllegal.setResizable(false);
        frameIllegal.setBounds(400, 400, 300, 150);
        JPanel panelIllegal = new JPanel();
        panelIllegal.setLayout(null);
        JLabel tips = new JLabel(tip);
        tips.setBounds(10, 10, 280, 50);
        JButton close = new JButton("Close");
        close.setBounds(160, 80, 80, 30);
        if (def == 1) close.setBackground(Color.RED);
        close.addActionListener(e -> frameIllegal.dispose());
        panelIllegal.add(close);
        panelIllegal.add(tips);
        panelIllegal.setVisible(true);
        frameIllegal.add(panelIllegal);
        frameIllegal.setVisible(true);
    }

    public int language(String language) {
        if (language.equals(lan_en)) return 1;
        else if (language.equals(lan_zh)) return 2;
        else return 0;
    }
}

class warns {
    public void TypeError_zh_cn() {
        int data = 0;
        String filepath = ".\\language_pack\\zh_cn_TypeError.pack";
        try {
            FileReader file = new FileReader(filepath);
            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void TypeError_en() {
        int data = 0;
        String filepath = ".\\language_pack\\en_TypeError.pack";
        try {
            FileReader file = new FileReader(filepath);
            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//C,
class tips {
    public void keyInType_zh_cn() {
        int data = 0;
        String filepath = ".\\language_pack\\zh_cn_text.pack";
        try {
            FileReader file = new FileReader(filepath);
            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void keyInType_en() {
        int data = 0;
        String filepath = ".\\language_pack\\en_text.pack";
        try {
            FileReader file = new FileReader(filepath);
            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void SelLanguage() {
        int ruaAutumn = 0;
        String filepath = ".\\language_pack\\ALL\\languageSelect.package";
        try {
            FileReader file = new FileReader(filepath);
            while ((ruaAutumn = file.read()) != -1) {
                System.out.print((char) ruaAutumn);
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Main_operation extends version {
    public void en_main(String type, int damage, int DefenceBreak, int accuracy, int fill, int force, int miss, int amount) {
        processDef def = new processDef();
        warns warn = new warns();
        calculate method_114514 = new calculate();
        double dps = 0;
        List<Double> list = new ArrayList<>();

        switch (def.def_type(type)) {
            case 0 -> {
                warn.TypeError_en();
                System.exit(0);
            }
            case 1 -> dps = method_114514.bgm71(damage, DefenceBreak, accuracy, fill, force, miss, amount);
            case 2 -> dps = method_114514._2b14(damage, DefenceBreak, accuracy, fill, force, miss, amount);
            case 3 -> dps = method_114514.at4(damage, DefenceBreak, accuracy, fill, force, miss, amount);
            case 4 -> dps = method_114514.ags30(damage, DefenceBreak, accuracy, fill, force, miss, amount);
            case 5 -> dps = method_114514.m2(damage, DefenceBreak, accuracy, fill, force, miss, amount);
            case 6 -> dps = method_114514.mk153(damage, DefenceBreak, accuracy, fill, force, miss, amount);
            case 7 -> {
                //has not been finished
            }
        }
        JFrame frameEnOut = new JFrame("Result");
        frameEnOut.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frameEnOut.setResizable(false);
        frameEnOut.setBounds(450, 500, 500, 300);
        JPanel panelEnOut = new JPanel();
        panelEnOut.setLayout(null);
        JTextArea textArea = new JTextArea("");
        String str = String.valueOf(dps);
        textArea.setText("The final result(averaged):" + str + "\r\n\tThe input data is:Damage" + damage + " DefenceBreak"
                + DefenceBreak + " Accuracy" + accuracy + "\r\n\tfill" + fill + " miss" + miss + " force" + force + " amount" + amount);
        textArea.setBounds(20, 20, 460, 160);
        JButton button1 = new JButton("Input File");
        JButton button2 = new JButton("Close");
        button1.setBounds(150, 200, 90, 30);
        button2.setBounds(260, 200, 90, 30);
        double finalDps = dps;
        button1.addActionListener(e -> {
            String filepath = "..\\storagedResult.rua";
            Calendar cal = Calendar.getInstance();
            LinkedList<String> time = new LinkedList<>();
            time.add(String.valueOf(cal.get(Calendar.YEAR)));
            time.add(String.valueOf(cal.get(Calendar.MONTH)));
            time.add(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
            time.add(String.valueOf(cal.get(Calendar.HOUR_OF_DAY)));
            time.add(String.valueOf(cal.get(Calendar.MINUTE)));
            time.add(String.valueOf(cal.get(Calendar.SECOND)));
            try {
                FileWriter fileWriter = new FileWriter(filepath, true);
                fileWriter.write("\n" + time.get(1) + "/" + time.get(2) + "/" + time.get(0) +
                        "->[" + time.get(3) + ":" + time.get(4) + ":" + time.get(5) + "]The final result(averaged):" + str + "\n\tThe input" +
                        " data is:Damage" + damage + " DefenceBreak"
                        + DefenceBreak + " Accuracy" + accuracy + "\n\tfill" + fill + " miss" + miss + " force" + force + " amount" + amount);
                fileWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            button1.setText("Success");
            button1.setEnabled(false);
        });
        button2.addActionListener(e -> frameEnOut.dispose());
        panelEnOut.add(textArea);
        panelEnOut.add(button1);
        panelEnOut.add(button2);
        panelEnOut.setVisible(true);
        frameEnOut.add(panelEnOut);
        frameEnOut.setVisible(true);
    }

    public void cn_main(String type, int damage, int DefenceBreak, int accuracy, int fill, int force, int miss, int amount) {
        processDef def = new processDef();
        warns warn = new warns();
        tips tip = new tips();
        calculate method_1145141919810 = new calculate();
        double dps = 0;

        switch (def.def_type(type)) {
            case 0 -> {
                warn.TypeError_zh_cn();
                System.exit(0);
            }
            case 1 -> dps = method_1145141919810.bgm71(damage, DefenceBreak, accuracy, fill, force, miss, amount);
            case 2 -> dps = method_1145141919810._2b14(damage, DefenceBreak, accuracy, fill, force, miss, amount);
            case 3 -> dps = method_1145141919810.at4(damage, DefenceBreak, accuracy, fill, force, miss, amount);
            case 4 -> dps = method_1145141919810.ags30(damage, DefenceBreak, accuracy, fill, force, miss, amount);
            case 5 -> dps = method_1145141919810.m2(damage, DefenceBreak, accuracy, fill, force, miss, amount);
            case 6 -> dps = method_1145141919810.mk153(damage, DefenceBreak, accuracy, fill, force, miss, amount);
            case 7 -> {
                //has not been finished
            }
        }
        JFrame frameEnOut = new JFrame("Result");
        frameEnOut.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frameEnOut.setResizable(false);
        frameEnOut.setBounds(450, 500, 500, 300);
        JPanel panelEnOut = new JPanel();
        panelEnOut.setLayout(null);
        JTextArea textArea = new JTextArea("");
        String str = String.valueOf(dps);
        textArea.setText("最终结果:" + str + "\n\t输入的数值" +
                " 是:杀伤" + damage + " 破防"
                + DefenceBreak + " 精度" + accuracy + "\n\t装填" + fill + " 闪避" + miss + " 力场" + force + " 编制" + amount);
        textArea.setBounds(20, 20, 460, 160);
        JButton button1 = new JButton("Input File");
        JButton button2 = new JButton("Close");
        button1.setBounds(150, 200, 90, 30);
        button2.setBounds(260, 200, 90, 30);
        double finalDps = dps;
        button1.addActionListener(e -> {
            String filepath = "..\\storagedResult.rua";
            Calendar cal = Calendar.getInstance();
            LinkedList<String> time = new LinkedList<>();
            time.add(String.valueOf(cal.get(Calendar.YEAR)));
            time.add(String.valueOf(cal.get(Calendar.MONTH)));
            time.add(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
            time.add(String.valueOf(cal.get(Calendar.HOUR_OF_DAY)));
            time.add(String.valueOf(cal.get(Calendar.MINUTE)));
            time.add(String.valueOf(cal.get(Calendar.SECOND)));
            try {
                FileWriter fileWriter = new FileWriter(filepath, true);
                fileWriter.write("\n" + time.get(1) + "/" + time.get(2) + "/" + time.get(0) +
                        "->[" + time.get(3) + ":" + time.get(4) + ":" + time.get(5) + "]最终结果:" + str + "\n\t输入的数值" +
                        " 是:杀伤" + damage + " 破防"
                        + DefenceBreak + " 精度" + accuracy + "\n\t装填" + fill + " 闪避" + miss + " 力场" + force + " 编制" + amount);
                fileWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            button1.setText("Success");
            button1.setEnabled(false);
        });
        button2.addActionListener(e -> frameEnOut.dispose());
        panelEnOut.add(textArea);
        panelEnOut.add(button1);
        panelEnOut.add(button2);
        panelEnOut.setVisible(true);
        frameEnOut.add(panelEnOut);
        frameEnOut.setVisible(true);
    }
}

class calculate {
    public double bgm71(int damage, int DefenceBreak, int accuracy, int fill, int force, int miss, int amount) {
        processDef def = new processDef();
        double MissDef = def.miss(accuracy, miss);
        double shotspeed = def.shotspeed(fill);
        totalCalculation_bgm71 cal = new totalCalculation_bgm71();
        int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[0];
        int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[1];
        double totalEcptBreak = cal.AttackDamage_afterBreak(damage, DefenceBreak, MissDef, amount, Times_onBreak);
        return totalEcptBreak / ((double) (Times_totalBreak + 5000) * shotspeed);
    }

    public double _2b14(int damage, int DefenceBreak, int accuracy, int fill, int force, int miss, int amount) {
        processDef def = new processDef();
        double MissDef = def.miss(accuracy, miss);
        double shotspeed = def.shotspeed(fill);
        totalCalculation_2b14 cal = new totalCalculation_2b14();
        int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[0];
        int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[1];
        return cal.AttackDamage_afterBreak(damage, MissDef, amount, Times_onBreak, shotspeed) / (((double) (5000 + Times_totalBreak)) * shotspeed);
    }

    public double at4(int damage, int DefenceBreak, int accuracy, int fill, int force, int miss, int amount) {
        processDef def = new processDef();
        double MissDef = def.miss(accuracy, miss);
        double shotspeed = def.shotspeed(fill);
        totalCalculation_at4 cal = new totalCalculation_at4();
        int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[0];
        int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[1];
        double totalEcptBreak = cal.AttackDamage_afterBreak(damage, DefenceBreak, MissDef, Times_onBreak, amount, shotspeed);
        return totalEcptBreak / (shotspeed * (double) (5000 + Times_totalBreak));
    }

    public double ags30(int damage, int DefenceBreak, int accuracy, int fill, int force, int miss, int amount) {
        processDef def = new processDef();
        int accuracyT = (int) (Math.ceil((double) accuracy * 1.3));
        int damageT = (int) (Math.ceil((double) damage / 3));
        int DefenceBreakT = (int) (Math.ceil((double) DefenceBreak / 3));
        double MissDef = def.miss(accuracyT, miss);
        double shotspeed = def.shotspeed(fill);
        totalCalculation_ags30 cal = new totalCalculation_ags30();
        int Times_onBreak = cal.DefenceBreak(force, DefenceBreakT, MissDef, shotspeed)[1];
        int Times_totalBreak = cal.DefenceBreak(force, DefenceBreakT, MissDef, shotspeed)[0];
        double totalEcptBreak = cal.AttackDamage_afterBreak(damageT, DefenceBreak, MissDef, Times_onBreak, amount, shotspeed);
        return totalEcptBreak / (shotspeed * (double) (1250 + Times_totalBreak));
    }

    public double m2(int damage, int DefenceBreak, int accuracy, int fill, int force, int miss, int amount) {
        processDef def = new processDef();
        double shotspeed = def.shotspeed(fill);
        totalCalculation_m2 cal = new totalCalculation_m2();
        int def_force_E = cal.def_force_E(force);
        int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, accuracy, miss)[0];
        int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, accuracy, miss)[1];
        double totalEcptBreak = cal.AttackDamage_afterBreak(damage, DefenceBreak, accuracy, Times_onBreak, amount, def_force_E, miss);
        return totalEcptBreak / (shotspeed * (double) (5000 + Times_totalBreak));
    }

    public double mk153(int damage, int DefenceBreak, int accuracy, int fill, int force, int miss, int amount) {
        processDef def = new processDef();
        totalCalculation_mk153 cal = new totalCalculation_mk153();
        double shotspeed = def.shotspeed(fill);
        int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, miss, accuracy, damage, amount)[0];
        int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, miss, accuracy, damage, amount)[1];
        int hit_tryShot = cal.DefenceBreak(force, DefenceBreak, miss, accuracy, damage, amount)[3];
        int extraDamage = cal.DefenceBreak(force, DefenceBreak, miss, accuracy, damage, amount)[4];
        double totalEcptBreak = cal.AttackDamage_afterBreak(damage, accuracy, miss, amount, Times_onBreak, DefenceBreak, extraDamage, hit_tryShot);
        return totalEcptBreak / shotspeed * (double) (5000 + Times_totalBreak);
    }

    public double pp93(int damage, int DefenceBreak, int accuracy, int fill, int force, int miss, int amount) {
        //has not been finished
        return 0;
    }
}

class ShowHistory {
    public static void en() {
        JFrame frameShow = new JFrame("History Records");
        frameShow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frameShow.setResizable(false);
        frameShow.setBounds(200, 200, 500, 600);
        JPanel panelShow = new JPanel();
        panelShow.setLayout(null);
        JTextArea area = new JTextArea();
        String path = "..\\storagedResult.rua";
        String ruaAutumn = readInputString(path);
        area.setText(ruaAutumn);
        area.setBounds(20, 20, 460, 400);
        JButton buttonEdit = new JButton("Edit");
        buttonEdit.setBounds(40, 475, 100, 30);
        JButton buttonSave = new JButton("Save");
        buttonSave.setBounds(145, 475, 100, 30);
        area.setEditable(false);
        JButton buttonClose = new JButton("Close");
        buttonClose.setBounds(260, 475, 100, 30);
        buttonClose.addActionListener(e -> frameShow.dispose());
        buttonSave.addActionListener(e -> {
            try {
                FileWriter fileWriter = new FileWriter(path, false);
                fileWriter.write(area.getText());
                fileWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            buttonSave.setText("Saved");
            buttonSave.setEnabled(false);
        });
        buttonEdit.addActionListener(e -> {
            area.setEditable(true);
            buttonSave.setEnabled(true);
        });
        panelShow.add(area);
        panelShow.add(buttonClose);
        panelShow.add(buttonEdit);
        panelShow.add(buttonSave);
        buttonSave.setEnabled(false);
        panelShow.setVisible(true);
        frameShow.add(panelShow);
        frameShow.setVisible(true);
    }

    public static void cn() {
        JFrame frameShow = new JFrame("历史记录->查看");
        frameShow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frameShow.setResizable(false);
        frameShow.setBounds(200, 200, 500, 600);
        JPanel panelShow = new JPanel();
        panelShow.setLayout(null);
        JTextArea area = new JTextArea();
        String path = "..\\storagedResult.rua";
        String ruaAutumn = readInputString(path);
        area.setText(ruaAutumn);
        area.setBounds(20, 20, 460, 400);
        JButton buttonEdit = new JButton("编辑");
        buttonEdit.setBounds(40, 475, 100, 30);
        JButton buttonSave = new JButton("保存");
        buttonSave.setBounds(145, 475, 100, 30);
        buttonSave.setEnabled(false);
        area.setEditable(false);
        JButton buttonClose = new JButton("关闭");
        buttonClose.setBounds(260, 475, 100, 30);
        buttonClose.addActionListener(e -> frameShow.dispose());
        buttonSave.addActionListener(e -> {
            try {
                FileWriter fileWriter = new FileWriter(path, false);
                fileWriter.write(area.getText());
                fileWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            buttonSave.setText("已保存");
            buttonSave.setEnabled(false);
        });
        buttonEdit.addActionListener(e -> {
            area.setEditable(true);
            buttonSave.setEnabled(true);
        });
        panelShow.add(area);
        panelShow.add(buttonClose);
        panelShow.add(buttonEdit);
        panelShow.add(buttonSave);
        panelShow.setVisible(true);
        frameShow.add(panelShow);
        frameShow.setVisible(true);
    }

    public static String readInputString(String path) {
        StringBuilder ruaFallen = new StringBuilder();//rua Fallen_Breath
        FileReader fileReader;
        File file = new File(path);
        try {
            fileReader = new FileReader(file);
            char[] chars = new char[10];
            while (fileReader.read(chars) != -1) {
                ruaFallen.append(String.valueOf(chars));
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ruaFallen.toString();
    }
}