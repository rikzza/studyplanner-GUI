import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList <String> subjects = new ArrayList<>();

        JFrame frame = new JFrame("study planner");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button1 = new JButton("Add subjects");
        JButton button2 = new JButton("Add tasks");
        JButton button3 = new JButton("View subjects and tasks");

        button1.setBounds(140,55,110,25);
        button2.setBounds(150,115,90,25);
        button3.setBounds(112,170,175,25);

        button1.addActionListener(e ->
        {
            String subject = JOptionPane.showInputDialog(frame,"enter the subject: ");

            if (subject==null)
            {
                return;
            }

            if (subject.isEmpty())
            {
                System.out.println("Subject cannot be empty! write something!");
            }

            subjects.add(subject);
            JOptionPane.showMessageDialog(frame,"subject added: " + subject);
        });

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setVisible(true);
    }
}
