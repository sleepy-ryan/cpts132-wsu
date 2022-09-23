/**
 * @author Ryan Garbutt
 * CPTS 132
 * LA10: Timer
 * Spring 2021
 */

package cpts132.thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Timer extends javax.swing.JFrame implements ActionListener {

    private JLabel timeCounter;
    private JButton startButton;
    private JButton stopButton;
    private JPanel window;

    private static int seconds = 0;
    private static int minutes = 0;

    private static boolean state = false;

    public Timer() {
        super("My Timer");
        setLocation(25, 25);
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        window = new JPanel();
        add(window, java.awt.BorderLayout.NORTH);

        startButton = new javax.swing.JButton("Start");
        startButton.addActionListener(this);

        stopButton = new javax.swing.JButton("Reset");
        stopButton.addActionListener(this);

        window.add(startButton);
        window.add(stopButton);


        timeCounter = new JLabel("0.00 seconds", SwingConstants.CENTER);

        timeCounter.setFont(new Font("Arial", Font.BOLD, 36));
        add(timeCounter);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        String action = (String) ae.getActionCommand();
        state = true;


        Thread t = new Thread() {
            public void run() {

                for (; ; ) {
                    if (state) {
                        try {

                            sleep(10);
                            seconds++;

                            if (seconds > 59) {
                                seconds = 0;
                                minutes++;
                            }

                            timeCounter.setText(minutes + ":" + seconds + " seconnds");

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Exception");
                        }
                    } else
                        break;
                }
            }
        };


        if (action.equals("Start")) {
            startButton.setText("Pause");
            t.start();
        } else if (action.equals("Pause")) {
            state = false;
            startButton.setText("Continue");
            t.start();
        } else if (action.equals("Continue")) {
            startButton.setText("Pause");
            state = true;
            t.start();
        } else if (action.equals("Reset")) {
            state = false;
            seconds = 0;
            minutes = 0;
            timeCounter.setText("0.00 seconds");
        }
    }

    public static void main(String[] args) {
        new Timer();
    }
}