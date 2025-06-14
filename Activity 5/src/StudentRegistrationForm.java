import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame {

    // Components
    private JTextField studentIDField, nameField, ageField;
    private JComboBox<String> courseComboBox;
    private JButton addButton, clearButton;
    private JTable studentTable;
    private DefaultTableModel tableModel;

    public StudentRegistrationForm() {
        // Set frame title and layout
        super("Student Registration Form");
        setLayout(new FlowLayout());

        // Initialize labels and fields
        add(new JLabel("Student ID:"));
        studentIDField = new JTextField(15);
        add(studentIDField);

        add(new JLabel("Name:"));
        nameField = new JTextField(15);
        add(nameField);

        add(new JLabel("Age:"));
        ageField = new JTextField(5);
        add(ageField);

        add(new JLabel("Course:"));
        String[] courses = {"Computer Science", "Engineering", "Mathematics"};
        courseComboBox = new JComboBox<>(courses);
        add(courseComboBox);

        // Buttons
        addButton = new JButton("Add Student");
        clearButton = new JButton("Clear Form");
        add(addButton);
        add(clearButton);

        // Table setup
        String[] columnNames = {"Student ID", "Name", "Age", "Course"};
        tableModel = new DefaultTableModel(columnNames, 0);
        studentTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(studentTable);
        scrollPane.setPreferredSize(new Dimension(400, 150));
        add(scrollPane);

        // Button actions
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFormAndTable();
            }
        });

        // Final frame settings
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addStudent() {
        String id = studentIDField.getText().trim();
        String name = nameField.getText().trim();
        String age = ageField.getText().trim();
        String course = (String) courseComboBox.getSelectedItem();

        if (id.isEmpty() || name.isEmpty() || age.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        tableModel.addRow(new Object[]{id, name, age, course});
        clearInputFields();
    }

    private void clearInputFields() {
        studentIDField.setText("");
        nameField.setText("");
        ageField.setText("");
        courseComboBox.setSelectedIndex(0);
    }

    private void clearFormAndTable() {
        clearInputFields();
        tableModel.setRowCount(0); // Clear all rows in the table
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
