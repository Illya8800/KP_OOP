package Form;

import CoffeeMachine.Condition.BT1;
import CoffeeMachine.Drink.Espresso;

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

    ArrayList <JButton> sugarButtonList;// capacity = 2
    ArrayList <JButton> programButtonList;// capacity = 3
    ArrayList <JButton> drinkButtonList;// capacity = 7


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
        JLabel imgLabel = new JLabel(new ImageIcon("C:\\Не винда\\Без имени-2.jpg"));
        imgLabel.setPreferredSize(new Dimension(WINDOW_WIDTH / 2, 500));

        sugarButtonGroup = new ButtonGroup();
        programModButtonGroup = new ButtonGroup();
        drinkButtonGroup = new ButtonGroup();

        sugarButtonList = new ArrayList<>(2);
        programButtonList = new ArrayList<>(3);
        drinkButtonList = new ArrayList<>(7);

        sugarButtonList.add(new JButton("-"));
        sugarButtonList.add(new JButton("+"));

        sugarTopPanel.setPreferredSize(new Dimension(WINDOW_WIDTH / 2 - 15, 0));
        sugarButtonGroup.add(sugarButtonList.get(0));
        sugarButtonGroup.add(sugarButtonList.get(1));
        sugarTopPanel.add(sugarButtonList.get(0));
        sugarTopPanel.add(sugarButtonList.get(1));

        for (int i = 0; i < 7; i++) {
            drinkButtonList.add(new JButton("1"));
            drinkBottomPanel.setPreferredSize(new Dimension(250, 450));
            drinkButtonGroup.add(drinkButtonList.get(i));
            drinkBottomPanel.add(drinkButtonList.get(i));
        }

        for (int i = 0; i < 3; i++) {
            programButtonList.add(new JButton("BT"+(i+1)));
            programModTopPanel.setPreferredSize(new Dimension(WINDOW_WIDTH / 2, 50));
            programModButtonGroup.add(programButtonList.get(i));
            programModTopPanel.add(programButtonList.get(i));
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
        sugarButtonList.get(0).setBackground(Color.pink);
        sugarButtonList.get(1).setBackground(Color.green);
        for (int i = 0; i < sugarButtonList.size(); i++) {
            sugarButtonList.get(i).setFont(new Font("Calibri", Font.BOLD, 35));
            sugarButtonList.get(i).setBorder(new RoundedBorder(15));
        }



        for (int i = 0; i < drinkButtonList.size(); i++){
            drinkButtonList.get(i).setFont(new Font("Calibri", Font.BOLD, 25));
            drinkButtonList.get(i).setBorder(new RoundedBorder(35));
        }
        drinkButtonList.get(0).setText("Эспрессо");
        drinkButtonList.get(1).setText("Доппио");
        drinkButtonList.get(2).setText("Американо");
        drinkButtonList.get(3).setText("Американо с молоком");
        drinkButtonList.get(4).setText("Капучино");
        drinkButtonList.get(5).setText("Латте");
        drinkButtonList.get(6).setText("Раф-кофе");

        for (int i = 0; i < programButtonList.size(); i++){
            programButtonList.get(i).setFont(new Font("Calibri", Font.BOLD, 15));
            programButtonList.get(i).setBackground(new Color(167, 176, 205));
            programButtonList.get(i).setBorder(new RoundedBorder(10));
        }


    }

     synchronized public void setOperations(){
        programButtonList.get(0).addActionListener(new BT1());


        drinkButtonList.get(0).addActionListener(new Espresso());
    }
}



