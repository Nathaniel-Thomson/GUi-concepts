//taken from http://stackoverflow.com/questions/4287499/rotate-jlabel-or-imageicon-on-java-swing
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class test {

    public static void main(String args[]) throws Exception {
        JFrame frame = new JFrame("Rotation Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final BufferedImage bi = ImageIO.read(new File("imgstand.jpg"));
        frame.add(new JPanel() {

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(bi.getWidth(), bi.getHeight());
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.rotate(Math.PI / -1, bi.getWidth() / 2, bi.getHeight() / 2);
                g2.drawImage(bi, -80, 0, null);
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
}
