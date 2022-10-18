import java.awt.*;
import java.awt.event.*;

class FrameFact extends Frame implements ActionListener {
    Button b1;
    Label l1;
    TextField t1;
    String msg = " ";

    FrameFact() {
        l1 = new Label("Enter the no.");
        t1 = new TextField(30);
        b1 = new Button("Compute Factorial");
        setLayout(new FlowLayout());
        add(l1);
        add(t1);
        add(b1);
        b1.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ae) {
                setVisible(false);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        int fact = 1;
        String s = t1.getText();
        int n = Integer.parseInt(s);
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        msg = "The Factorial is=" + fact;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 100);
    }
}

public class factorialbutton {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FrameFact o1 = new FrameFact();
        o1.setTitle("Factorial");
        o1.setVisible(true);
        o1.setSize(400, 400);
    }
}
