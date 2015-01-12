package CardLayout;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import static javax.swing.JFrame.*;

public class Slideshow2 extends JFrame implements ActionListener {

    JPanel PanPicHolder;
    CardLayout cardLayout;
    JButton btnNext = new JButton();

    public Slideshow2() throws IOException {
        setLayout(new BorderLayout());
        btnNext.setText("Next");
        btnNext.setSize(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ActionListener buttonListener = new ButtonListener();
        setSize(500, 500);
        setTitle("Slideshow Attempt two");
        setResizable(false);

        PanPic1 panPic1 = new PanPic1(buttonListener);
        PanPic2 panPic2 = new PanPic2(buttonListener);
        PanPic3 panPic3 = new PanPic3(buttonListener);
        PanPic4 panPic4 = new PanPic4(buttonListener);
        PanPic5 panPic5 = new PanPic5(buttonListener);

        PanPicHolder = new JPanel(new CardLayout());

        PanPicHolder.add(panPic1);
        PanPicHolder.add(panPic2);
        PanPicHolder.add(panPic3);
        PanPicHolder.add(panPic4);
        PanPicHolder.add(panPic5);
        add(PanPicHolder);
        setVisible(true);
        cardLayout = (CardLayout) PanPicHolder.getLayout();
        btnNext.addActionListener(this);

        add(btnNext, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sAction;
        sAction = e.getActionCommand();
        if (sAction.equals("Next")) {
            cardLayout.next(PanPicHolder);

        }
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String sAction;
            sAction = e.getActionCommand();
            if (sAction.equals("Next")) {
                cardLayout.next(PanPicHolder);

            }
        }
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        new Slideshow2().setVisible(true);
    }
}
