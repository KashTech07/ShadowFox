import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // 1. Create the window (The Stage)
        JFrame frame = new JFrame("Student System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Create a button (A Prop)
        JButton button = new JButton("Click Me!");

        // 3. Add the button to the frame
        frame.add(button);

        // 4. Make it visible
        frame.setVisible(true);
    }
}
