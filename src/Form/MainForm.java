package Form;

import javax.swing.*;
import java.awt.*;

public class MainForm {
    private final int WINDOW_WIDTH = 700;
    private final int WINDOW_HEIGHT = 750;
    private final String WINDOW_NAME = "ЦЄпенко";

    public void createFrom(){
        JFrame frame = new JFrame(WINDOW_NAME);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon(MainForm.class.getResource("icoMainWindow.png").getPath()).getImage());

        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);


        /*
        JButton btn = new JButton("test");
        btn.setBackground(Color.pink);
        frame.add(btn);
         */
        frame.setVisible(true);


    }
}
