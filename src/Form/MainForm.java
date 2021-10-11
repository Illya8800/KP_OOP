package Form;

import CoffeeMachine.Condition.BT1;
import CoffeeMachine.Condition.BT2;
import CoffeeMachine.Condition.BT3;
import CoffeeMachine.Drink.Beverage;
import CoffeeMachine.Drink.CoffeeBTnum.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class MainForm {
    private final int WINDOW_WIDTH = 715;
    private final int WINDOW_HEIGHT = 665;

    public static JTextField text;
    private JFrame frame;

    private ButtonGroup sugarButtonGroup;
    private ButtonGroup programModButtonGroup;
    private ButtonGroup drinkButtonGroup;

    public static ArrayList <JButton> buttonListSugar;// capacity = 2
    public static ArrayList <JButton> buttonListProgram;// capacity = 3
    public static ArrayList <JButton> buttonListDrink;// capacity = 7
    public static ArrayList <Beverage> actionListDrink = new ArrayList<>();// capacity = 7

    public static JLabel imgLabel;

    public static void setMainIMG(String path){
        imgLabel.setIcon(new ImageIcon(path));
    }

    public static EspressoBT espressoBT = new EspressoBT();
    public static DoppioBT doppioBT = new DoppioBT();
    public static AmericanoBT americanoBT = new AmericanoBT();
    public static FlatWhiteBT flatWhiteBT = new FlatWhiteBT();
    public static CappucinoBT cappucinoBT = new CappucinoBT();
    public static LatteBT latteBT = new LatteBT();
    public static MacchiatoBT macchiatoBT =  new MacchiatoBT();



    public void createFrom(){
        text = new JTextField("Приятного аппетита");
        text.setEditable(false);
        text.setFont(new Font("Times New Roman", Font.BOLD, 25));
        text.setHorizontalAlignment(JTextField.CENTER);

        frame = new JFrame("ЦэПенка");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setMaximumSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        frame.setMinimumSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));

        frame.setIconImage(new ImageIcon(Objects.requireNonNull(MainForm.class.getResource("icoMainWindow.png")).getPath()).getImage());

        createPanels();

        setButtonStyle();

        setOperations();
        frame.setVisible(true);
    }


    private void createPanels() {

        JPanel leftMainPanel = new JPanel(); //Left main panel
        leftMainPanel.setLayout(new BoxLayout(leftMainPanel, BoxLayout.Y_AXIS));
        //leftMainPanel.setBackground(Color.green);

        JPanel rightMainPanel = new JPanel(); //Right main panel
        //rightMainPanel.setBackground(Color.pink);
        rightMainPanel.setLayout(new FlowLayout());

        JPanel sugarTopPanel = new JPanel(); //Left top panel
        //sugarTopPanel.setBackground(Color.BLUE);
        sugarTopPanel.setLayout(new GridLayout(1,2,45,0));

        JPanel drinkBottomPanel = new JPanel(); //Left bottom panel
        drinkBottomPanel.setLayout(new GridLayout(7,1,0,7));

        JPanel programModTopPanel = new JPanel(); //Right top panel
        //programModTopPanel.setBackground(Color.black);

        JPanel textMiddlePanel = new JPanel(); //Right Middle panel
        textMiddlePanel.setBackground(Color.darkGray);
        text.setPreferredSize(new Dimension(WINDOW_WIDTH/2, 50));
        //textMiddlePanel.setMinimumSize(new Dimension(WINDOW_WIDTH/2,50));
        textMiddlePanel.add(text);

        JPanel imgPanel = new JPanel();
        //imgPanel.setBackground(Color.BLUE);
        imgLabel = new JLabel(new ImageIcon("C:\\IntelIdeaProject\\KP_OOP\\IMG\\DefaultPNG.png"));
        //setMainIMG("C:\\Не винда\\Без имени-2.jpg");

        imgLabel.setPreferredSize(new Dimension(WINDOW_WIDTH / 2, 500));

        sugarButtonGroup = new ButtonGroup();
        programModButtonGroup = new ButtonGroup();
        drinkButtonGroup = new ButtonGroup();

        buttonListSugar = new ArrayList<>(2);
        buttonListProgram = new ArrayList<>(3);
        buttonListDrink = new ArrayList<>(7);

        buttonListSugar.add(new JButton("-"));
        buttonListSugar.add(new JButton("+"));

        sugarTopPanel.setPreferredSize(new Dimension(WINDOW_WIDTH / 2 - 15, 0));
        sugarButtonGroup.add(buttonListSugar.get(0));
        sugarButtonGroup.add(buttonListSugar.get(1));
        sugarTopPanel.add(buttonListSugar.get(0));
        sugarTopPanel.add(buttonListSugar.get(1));

        for (int i = 0; i < 7; i++) {
            buttonListDrink.add(new JButton("1"));
            drinkBottomPanel.setPreferredSize(new Dimension(250, 450));
            drinkButtonGroup.add(buttonListDrink.get(i));
            drinkBottomPanel.add(buttonListDrink.get(i));
        }

        for (int i = 0; i < 3; i++) {
            buttonListProgram.add(new JButton("BT"+(i+1)));
            programModTopPanel.setPreferredSize(new Dimension(WINDOW_WIDTH / 2, 50));
            programModButtonGroup.add(buttonListProgram.get(i));
            programModTopPanel.add(buttonListProgram.get(i));
        }

        leftMainPanel.add(sugarTopPanel, BorderLayout.NORTH);
        leftMainPanel.add(drinkBottomPanel, BorderLayout.NORTH);
        rightMainPanel.add(programModTopPanel, BorderLayout.CENTER);
        rightMainPanel.add(textMiddlePanel, BorderLayout.WEST);
        rightMainPanel.add(imgLabel, BorderLayout.CENTER);
        frame.add(rightMainPanel);
        frame.add(leftMainPanel, BorderLayout.WEST);

    }


    private void setButtonStyle() {
        buttonListSugar.get(0).setBackground(Color.pink);
        buttonListSugar.get(1).setBackground(Color.green);

        for (JButton value : buttonListSugar) {
            value.setFont(new Font("Calibri", Font.BOLD, 35));
            value.setBorder(new RoundedBorder(15));
        }


        for (JButton button : buttonListDrink) {
            button.setFont(new Font("Calibri", Font.BOLD, 25));
            button.setBorder(new RoundedBorder(35));
        }
        buttonListDrink.get(0).setText("Эспрессо");
        buttonListDrink.get(1).setText("Доппио");
        buttonListDrink.get(2).setText("Американо");
        buttonListDrink.get(3).setText("Флэт вайт");
        buttonListDrink.get(4).setText("Капучино");
        buttonListDrink.get(5).setText("Латте");
        buttonListDrink.get(6).setText("Макиато");

        for (JButton jButton : buttonListProgram) {
            jButton.setFont(new Font("Calibri", Font.BOLD, 15));
            jButton.setBackground(new Color(167, 176, 205));
            jButton.setBorder(new RoundedBorder(10));
        }


    }


    public static void setButtonEnabled(boolean condition){
        for (JButton jButton : buttonListProgram) jButton.setEnabled(condition);
        for (JButton jButton : buttonListDrink) jButton.setEnabled(condition);


    }

    public void setOperations(){
        buttonListProgram.get(0).addActionListener(new BT1());
        buttonListProgram.get(1).addActionListener(new BT2());
        buttonListProgram.get(2).addActionListener(new BT3());

        buttonListDrink.get(0).addActionListener(espressoBT);
        actionListDrink.add(espressoBT);
        buttonListDrink.get(1).addActionListener(doppioBT);
        actionListDrink.add(doppioBT);
        buttonListDrink.get(2).addActionListener(americanoBT);
        actionListDrink.add(americanoBT);
        buttonListDrink.get(3).addActionListener(flatWhiteBT);
        actionListDrink.add(flatWhiteBT);
        buttonListDrink.get(4).addActionListener(cappucinoBT);
        actionListDrink.add(cappucinoBT);
        buttonListDrink.get(5).addActionListener(latteBT);
        actionListDrink.add(latteBT);
        buttonListDrink.get(6).addActionListener(macchiatoBT);
        actionListDrink.add(macchiatoBT);

    }
}



