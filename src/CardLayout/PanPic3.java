package CardLayout;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.JPanel;

public class PanPic3 extends JPanel {

    private ImageIcon image = new ImageIcon("img3.jpg");

    public PanPic3(ActionListener buttonListener) throws IOException {
        JLabel lblImage = new JLabel(image);
        add(lblImage);
    }
}
