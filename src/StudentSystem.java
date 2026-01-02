import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StudentSystem {

    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Information System");
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        JLabel idLabel = new JLabel("ID:");
        JTextField idField = new JTextField(10);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(10);

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(10);

        JLabel courseLabel = new JLabel("Course:");
        JTextField courseField = new JTextField(10);

        JButton addButton = new JButton("Add Student");
        JButton viewButton = new JButton("View Students"); // ✅ FIX

        frame.add(idLabel);
        frame.add(idField);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(courseLabel);
        frame.add(courseField);
        frame.add(addButton);
        frame.add(viewButton);

        frame.setVisible(true);

        // ADD STUDENT
        addButton.addActionListener(e -> {
            try {
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                String course = courseField.getText();

                Student student = new Student(id, name, age, course);
                students.add(student);

                JOptionPane.showMessageDialog(frame,
                        "Student Added Successfully!");

                // Clear fields
                idField.setText("");
                nameField.setText("");
                ageField.setText("");
                courseField.setText("");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame,
                        "Please enter valid ID and Age",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        // VIEW STUDENTS
        viewButton.addActionListener(e -> {
            if (students.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "No students added yet.");
                return;
            }

            StringBuilder data = new StringBuilder();
            for (Student s : students) {
                data.append(s).append("\n");
            }

            JOptionPane.showMessageDialog(frame,
                    data.toString(),
                    "Student List",
                    JOptionPane.INFORMATION_MESSAGE);
        });
    }
}

