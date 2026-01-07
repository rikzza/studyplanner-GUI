import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList <String> subjects = new ArrayList<>();
        ArrayList <String> tasks = new ArrayList<>();

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
                JOptionPane.showMessageDialog(frame, "Subject cannot be empty!", "error!", JOptionPane.ERROR_MESSAGE);
                return;
            }

            subjects.add(subject);
            JOptionPane.showMessageDialog(frame,"subject added: " + subject);
        });

        button2.addActionListener(e ->
        {
            String task = JOptionPane.showInputDialog(frame, "add task: ");

            if (task == null)
            {
                return;
            }

            if (task.isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "tasks cannot be empty!", "error!", JOptionPane.ERROR_MESSAGE);
                return;
            }

            tasks.add(task);
            JOptionPane.showMessageDialog(frame, "task added: " + task);
        });

        button3.addActionListener(e ->
        {
            StringBuilder message = new StringBuilder();
            message.append("subjects added: ");

            if (subjects.isEmpty())
            {
                message.append("none");
            }
            else
            {
                for (int i=0; i<subjects.size(); i++)
                {
                    message.append(i+1).append(". ").append(subjects.get(i)).append("\n");
                }
            }

            message.append("tasks added: ");
            if (tasks.isEmpty())
            {
                message.append("none");
            }
            else
            {
                for (int i=0; i<tasks.size(); i++)
                {
                    message.append(i+1).append(". ").append(tasks.get(i)).append("\n");
                }
            }

            JOptionPane.showMessageDialog(frame, message.toString(), ("subjects and tasks"), JOptionPane.INFORMATION_MESSAGE);
        });

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setVisible(true);
    }
}
