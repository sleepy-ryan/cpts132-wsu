package cpts132.graphics;

/**
     * A sample component class.
     */
    public class O2 extends javax.swing.JComponent {
        private java.awt.Color lineColor;
        private java.awt.Color fillColor;

        public O2(){
            setPreferredSize(new java.awt.Dimension(25, 25));
            setLineColor(java.awt.Color.black);
            setFillColor(java.awt.Color.white);
        }

        public java.awt.Color getLineColor() {
            return lineColor;
        }

        public java.awt.Color getFillColor() {
            return fillColor;
        }

        public void setLineColor(java.awt.Color rgb) {
            lineColor = rgb;
            repaint();
        }

        public void setFillColor(java.awt.Color rgb) {
            fillColor = rgb;
            repaint();
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
        g.setColor(fillColor);
        //draw two lines
        g.fillOval(0, 0, getWidth() - 1, getHeight() - 1);
        g.setColor(lineColor);
        g.drawOval(0, 0, getWidth() - 1, getHeight() - 1);
    }
}
