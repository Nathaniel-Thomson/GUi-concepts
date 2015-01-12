package CardLayout;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.JPanel;

public class PanPic5 extends JPanel {

    private ImageIcon image = new ImageIcon("img5.jpg");

    public PanPic5(ActionListener buttonListener) throws IOException {
        JLabel lblImage = new JLabel(image);
        add(lblImage);
    }
}
