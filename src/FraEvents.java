import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;*/
public class FraEvents extends JFrame {
    private JLabel lblName1;
    private JButton btnClick1;
    public FraEvents() { // constructor
        //Setup the window
   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 600);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.btnClick1 = new JButton("Hello");
        btnInteract e1 = new btnInteract(); // hearing aid for the button
        btnClick1.addActionListener(e1);//Make the button listen for the action
        this.add(btnClick1);
        this.lblName1 = new JLabel(" ");
        this.add(lblName1);
    }
    public class btnInteract implements ActionListener { // must override the ActionPerformed method
        int nCount = 0;
        public void actionPerformed(ActionEvent e) {
            if (nCount < 3) {
                lblName1.setText("go away");
                lblName1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
                lblName1.setForeground(Color.red);
                nCount++;
            } else {
                lblName1.setText("Seriously i mean it");
            }
        }
    }
    public static void main(String[] args) /*throws FileNotFoundException*/ {
       // Scanner sin = new Scanner(new FileReader("Annoying.txt"));
        FraEvents fraEvents = new FraEvents();
    }
}