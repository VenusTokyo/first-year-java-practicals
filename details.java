import java.awt.*;
import java.awt.event.*;
public class details extends Frame implements ActionListener
{
Button b1=new Button("A");
Button b2=new Button("B");
String msg=" ";
//int mX=0,mY=0;

public details()
{
setLayout(new FlowLayout());
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
setBackground(Color.pink);
MyWindowAdapter adapter=new MyWindowAdapter();
addWindowListener(adapter);
}

public void actionPerformed(ActionEvent a1)
{
String s1;
s1=a1.getActionCommand();
if(s1.equals("A"))
{
msg="Name:Shrutika Shaw    Course: B.Sc. Computer Science     Roll No.: 2019345     College:SRCASW";
repaint();
}
else if(s1.equals("B"))
{
msg="CGPA: 9.5";
repaint();
}
}

public void paint(Graphics g)
{
g.drawString(msg,500,500);
}

public static void main(String args[])
{
details k1=new details();
k1.setSize(300, 200);    
k1.setTitle("Frame Window Mouse events");
k1.setVisible(true);
}
}
class MyWindowAdapter extends WindowAdapter
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
}
