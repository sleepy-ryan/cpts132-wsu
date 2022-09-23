package cpts132.graphics;

import java.awt.*;
    /**
     * A sample component class.
     */
    public class X2 extends javax.swing.JComponent {

        private java.awt.Color lc;

        /**
         * Constructor, sets the preferred size.
         */
        public X2() {
            setPreferredSize(new java.awt.Dimension(25, 25));
            setLineColor(Color.black);
        }

        public java.awt.Color getLineColor() {
            return lc;
        }

        public void setLineColor(java.awt.Color rgb){
            lc = rgb;
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
            g.setColor(lc);
            // draw the two lines
            g.drawLine(0, 0, getWidth()-1, getHeight()-1);
            g.drawLine(0, getHeight()-1, getWidth()-1, 0);
        }
    }

