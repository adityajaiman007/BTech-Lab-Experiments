# Experiment 1: Student Registration Form using Java Swing

## Aim
To create a GUI-based student registration form using Java Swing.

## Components Used
- `JFrame` for the main window
- `JLabel` and `JTextField` for student name, roll number, and branch
- `JRadioButton` and `ButtonGroup` for gender selection
- `JCheckBox` for accepting Terms & Conditions
- `JButton` for Submit and Reset
- `JOptionPane` for validation messages and registration confirmation

## Algorithm
1. Create the registration form window.
2. Add fields for student name, roll number, gender, and branch.
3. Add the Terms & Conditions checkbox and Submit/Reset buttons.
4. When Reset is clicked, clear all fields and selections.
5. When Submit is clicked, validate each required field and the terms checkbox.
6. If validation succeeds, display a registration-success message with the entered details.

## How to Run
1. Install a JDK.
2. Open a terminal in this folder.
3. Compile:
   ```bash
   javac StudentRegistration.java
   ```
4. Run:
   ```bash
   java StudentRegistration
   ```

## Expected Result
A Student Registration Form window opens. Empty fields or missing selections show validation messages. When all required fields are completed and Terms & Conditions is accepted, a successful registration message displays the entered details.

## Output Screenshot
After running the program on your computer, take a screenshot of:
- The registration form window.
- The successful registration message (using sample details).

Save the screenshot in this folder as `output.png`.

Note: `output.png` is not included as a real application screenshot in this starter package. Add your own screenshot after running the Java program.
