package EighthLessonHomeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow(){
        setLocation(650, 650);
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel  panel = new JPanel(new GridLayout(1,2));

        JButton btn1 = new JButton("Push the button");
        JButton btn2 = new JButton("Exit");

        ActionListener actionListener = new CloseActionListener();
        btn1.addActionListener(actionListener);

        panel.add(btn1);
        panel.add(btn2);

        add(panel, BorderLayout.SOUTH);

        setVisible(true);
    }

}
