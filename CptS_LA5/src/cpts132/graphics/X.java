package cpts132.graphics;

/**
 * A sample component class.
 */
public class X extends javax.swing.JComponent {

    /**
     * Constructor, sets the preferred size.
     */
    public X() {
        setPreferredSize(new java.awt.Dimension(25, 25));
    }

    /**
     * The necessary method. This method
     * renders the component.
     * @param g The Graphics object use to render
     */
    @Override
    public void paintComponent(java.awt.Graphics g) {
        // paint the background
        super.paintComponent(g);
        // draw the two lines
        g.drawLine(0, 0, getWidth(), getHeight());
        g.drawLine(0, getHeight(), getWidth(), 0);
    }
}
