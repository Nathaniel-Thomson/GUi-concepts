
import javax.swing.JFrame;

public class FirstFrame {

    public static void main(String[] args) {

        FraOne fraOne = new FraOne();
        fraOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fraOne.setVisible(true);
    }
}

class FraOne extends JFrame {

    public FraOne() {
        setTitle("Frame One");
        setSize(300, 300);
    }
}
