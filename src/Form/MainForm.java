package Form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class MainForm {




    public void createFrom(){
        final int WINDOW_WIDTH = 700;
        final int WINDOW_HEIGHT = 650;
        final Dimension dimension = new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);


        JFrame frame = new JFrame("ЦэПенка");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setMaximumSize(dimension);
        frame.setMinimumSize(dimension);

        frame.setIconImage(new ImageIcon(Objects.requireNonNull(MainForm.class.getResource("icoMainWindow.png")).getPath()).getImage());

        JPanel leftMainPanel = new JPanel(); //Left main panel
        leftMainPanel.setLayout(new BoxLayout(leftMainPanel, BoxLayout.Y_AXIS));
        //leftMainPanel.setBackground(Color.green);


        JPanel rightMainPanel = new JPanel(); //Right main panel
        rightMainPanel.setBackground(Color.pink);
        rightMainPanel.setLayout(new GridLayout(3,1));


        JPanel sugarTopPanel = new JPanel(); //Left top panel
        //sugarTopPanel.setBackground(Color.BLUE);
        sugarTopPanel.setLayout(new GridLayout(1,2,45,0));

        JPanel drinkBottomPanel = new JPanel(); //Left bottom panel
        drinkBottomPanel.setLayout(new GridLayout(7,1,0,7));


        ButtonGroup sugarButtonGroup = new ButtonGroup();
        ButtonGroup programModButtonGroup = new ButtonGroup();
        ButtonGroup drinkButtonGroup = new ButtonGroup();

        ArrayList <JButton> sugarButtonList = new ArrayList<>(2);
        ArrayList <JButton> programButtonList = new ArrayList<>(3);
        ArrayList <JButton> drinkButtonList = new ArrayList<>(7);

        sugarButtonList.add(new JButton("+"));
        sugarButtonList.add(new JButton("-"));


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



        leftMainPanel.add(sugarTopPanel, BorderLayout.NORTH);
        leftMainPanel.add(drinkBottomPanel, BorderLayout.NORTH);
        frame.add(leftMainPanel, BorderLayout.WEST);
        frame.add(rightMainPanel, BorderLayout.EAST);








        /*
        JButton btn = new JButton("test");
        btn.setBackground(Color.pink);
        frame.add(btn);
         */
        frame.setVisible(true);


    }
}



