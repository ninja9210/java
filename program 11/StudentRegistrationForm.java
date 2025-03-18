import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StudentRegistrationForm extends JFrame implements ActionListener {
    JLabel nameLabel, rollLabel, genderLabel, dobLabel, addressLabel, courseLabel, termsLabel, msgLabel;
    JTextField nameField, rollField;
    JRadioButton male, female;
    JComboBox<String> dayBox, monthBox, yearBox, courseBox;
    JTextArea addressArea;
    JCheckBox termsCheckBox;
    JButton submitButton;

    StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(400, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 30, 100, 20);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(130, 30, 150, 20);
        add(nameField);

        rollLabel = new JLabel("Roll No:");
        rollLabel.setBounds(20, 70, 100, 20);
        add(rollLabel);

        rollField = new JTextField();
        rollField.setBounds(130, 70, 150, 20);
        add(rollField);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 110, 100, 20);
        add(genderLabel);

        male = new JRadioButton("Male");
        male.setBounds(130, 110, 70, 20);
        female = new JRadioButton("Female");
        female.setBounds(210, 110, 80, 20);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        add(male);
        add(female);

        dobLabel = new JLabel("DOB:");
        dobLabel.setBounds(20, 150, 100, 20);
        add(dobLabel);

        String days[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        String years[] = { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" };

        dayBox = new JComboBox<>(days);
        monthBox = new JComboBox<>(months);
        yearBox = new JComboBox<>(years);
        dayBox.setBounds(130, 150, 50, 20);
        monthBox.setBounds(190, 150, 60, 20);
        yearBox.setBounds(260, 150, 70, 20);
        add(dayBox);
        add(monthBox);
        add(yearBox);

        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(20, 190, 100, 20);
        add(addressLabel);

        addressArea = new JTextArea();
        addressArea.setBounds(130, 190, 200, 60);
        add(addressArea);

        courseLabel = new JLabel("Course:");
        courseLabel.setBounds(20, 260, 100, 20);
        add(courseLabel);

        String courses[] = { "BCA", "BBA", "BMS", "B.Tech", "MBA" };
        courseBox = new JComboBox<>(courses);
        courseBox.setBounds(130, 260, 150, 20);
        add(courseBox);

        termsCheckBox = new JCheckBox("Accept Terms and Conditions");
        termsCheckBox.setBounds(20, 300, 250, 20);
        add(termsCheckBox);

        submitButton = new JButton("Submit");
        submitButton.setBounds(130, 340, 100, 30);
        submitButton.addActionListener(this);
        add(submitButton);

        msgLabel = new JLabel("");
        msgLabel.setBounds(20, 380, 300, 20);
        add(msgLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (termsCheckBox.isSelected()) {
            String name = nameField.getText();
            String roll = rollField.getText();
            String gender = male.isSelected() ? "Male" : "Female";
            String dob = dayBox.getSelectedItem() + "-" + monthBox.getSelectedItem() + "-" + yearBox.getSelectedItem();
            String address = addressArea.getText();
            String course = (String) courseBox.getSelectedItem();

            msgLabel.setText("Registration Successful for " + name);
            JOptionPane.showMessageDialog(this, "Student Registered Successfully!\n\n" +
                    "Name: " + name + "\nRoll No: " + roll + "\nGender: " + gender +
                    "\nDOB: " + dob + "\nAddress: " + address + "\nCourse: " + course);
        } else {
            msgLabel.setText("Please accept the terms & conditions!");
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}