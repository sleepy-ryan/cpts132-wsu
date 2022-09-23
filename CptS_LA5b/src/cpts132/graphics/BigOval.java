package cpts132.graphics;

/**
 * A simple graphic component that draws a big oval.
 * The fill color for the oval is a property.
 * @author Dan
 */
public class BigOval extends javax.swing.JComponent {

    // field to hold the property value
    java.awt.Color fill;

    /**
     * Creates a BigOval with a white fill.
     */
    public BigOval() {
        fill = java.awt.Color.green;
    }

    /**
     * Get the current fill color.
     * @return Current fill color
     */
    public java.awt.Color getFill() {
        return fill;
    }

    /**
     * Set the fill color.
     * @param color The desired fill color
     */
    public void setFill(java.awt.Color color) {
        fill = color;
        repaint();
    }

    /**
     * Render the component
     * @param g The Graphics object to draw the component
     */
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        int x = getWidth() / 7;
        int y = getHeight() / 7;
        int w = 5 * x;
        int h = 5 * y;
        g.setColor(fill);
        g.fillOval(x, y, w, h);
        g.setColor(java.awt.Color.black);
        g.drawOval(x, y, w, h);
    }

}