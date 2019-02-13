//
// Name: Tran, Denise
// Homework: #1 ButtonDemo
// Due: 2/4/19
// Course: cs-2450-02-sp19
//
// Description:
// Implement the ButtonDemo Project. Display name as initial text under buttons as 
// "by D. Tran". The buttons will be Ok and Cancel and the response text will be displayed appropriately. 
//


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonDemo implements ActionListener {

    private JLabel jlab;

    ButtonDemo() {

        // Create a new JFrame container. 
        JFrame jfrm = new JFrame("A Button Example");

        // Specify FlowLayout for the layout manager. 
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size. 
        jfrm.setSize(220, 90);

        // Terminate the program when the user closes the application. 
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make two buttons. 
        JButton jbtnFirst = new JButton("Ok");
        JButton jbtnSecond = new JButton("Cancel");

        // Add action listeners. 
        jbtnFirst.addActionListener(this);
        jbtnSecond.addActionListener(this);

        // Add the buttons to the content pane. 
        jfrm.add(jbtnFirst);
        jfrm.add(jbtnSecond);
        
        //jbtnFirst.setText("Third");

        // Create a text-based label. 
        jlab = new JLabel("by D. Tran");

        // Add the label to the frame. 
        jfrm.add(jlab);

        // Display the frame. 
        jfrm.setVisible(true);
    }

    // Handle button events. 
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("Ok")) {
            jlab.setText("Ok button was pressed.");
        } else {
            jlab.setText("Cancel button was pressed. ");
        }
    }

    public static void main(String args[]) {

        // Create the frame on the event dispatching thread. 
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo();
            }
        });

    }
}