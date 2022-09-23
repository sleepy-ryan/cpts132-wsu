package cpts132.LAs;

import java.awt.*;
import java.awt.event.ActionListener;

/**
 * This is a simple client for the BigOval class
 */
public class ButtonButton extends javax.swing.JFrame implements ActionListener {

    // the field for the graphic component
    private cpts132.graphics.BigOval dot;

    //colors the oval can be changed to
    java.awt.Color colors[] = {java.awt.Color.green, java.awt.Color.BLUE, java.awt.Color.RED, java.awt.Color.CYAN, Color.YELLOW, Color.magenta};
    //i points to the next color
    int i = 1;

    /**
     * Create the ButtonButton
     */
    public ButtonButton() {
        super("ButtonButton");
        setLocation(25, 25);
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // create the dot
        dot = new cpts132.graphics.BigOval();
        add(dot);

        // create a toolbar
        javax.swing.JPanel toolbar = new javax.swing.JPanel();
        add(toolbar, java.awt.BorderLayout.NORTH);

        // create a button
        javax.swing.JButton button;
        button = new javax.swing.JButton("Next Color");
        toolbar.add(button);
        button.addActionListener(this);


        //create prev button
        javax.swing.JButton prevButton;
        prevButton = new javax.swing.JButton("Prev Color");
        toolbar.add(prevButton);

        //inner class object
        ButtonHandler buttonClick = new ButtonHandler();
        //action listener for inner class object
        prevButton.addActionListener(buttonClick);



        // finally, set the window to be visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        setTitle("Button Pressed");
        dot.setFill(colors[i++ % colors.length]);
        }


    /**
     * The application method
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        new ButtonButton();
    }


    private class ButtonHandler implements ActionListener{
        public void actionPerformed(java.awt.event.ActionEvent e){
            setTitle("Thanks, I needed that");
            //i is the current color
            i--;
            //if i becomes less than or equal to zero, move i to the end of the list
            if(i<=0){
                i = colors.length ;
            }
            dot.setFill(colors[--i % colors.length]);
            //points i to next color
            i++;
        }
    }
}


