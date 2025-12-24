import javax.swing.*;
import java.awt.*;

public class StudentSystem {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Information System");
        frame.setSize(800,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        //frame.setVisible(true);
        //layout
        frame.setLayout(new FlowLayout());
        JLabel idLable = new JLabel("ID:");
        JTextField idField = new JTextField(10);
        JLabel nameLabel = new JLabel("Name :");
        JTextField nameField = new JTextField(10);
        JLabel ageLabel = new JLabel("Age :");
        JTextField ageField = new JTextField(10);
        JLabel courseLabel = new JLabel("Course : ");
        JTextField courseField = new JTextField(10);
        JButton addButton = new JButton("Add Student");
        frame.add(idLable);
        frame.add(idField);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(courseLabel);
        frame.add(courseField);
        frame.add(addButton);

        frame.setVisible(true);

    }
}
