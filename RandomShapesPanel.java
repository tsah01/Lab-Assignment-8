package LabAssignment6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * This class demonstrates the five different shapes in the panel.
 * @author Tula Sah 
 * 4/15/2016
 */
public class RandomShapesPanel extends JPanel {

    private Color rColor;
    private Random random;
    private Timer space;
    int x1, width, y1, height, x2, y2, shape;

    public RandomShapesPanel() {
        super();
        space = new Timer(5000, new TimerDelayListener());
        random = new Random();
        //space.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = getWidth();
        int y = getHeight();

        for (int i = 1; i <= 175; i++) {
            shape = random.nextInt(2) + 1;

            switch (shape) {
                case 1:
                    rColor = new Color(random.nextInt(256),
                            random.nextInt(256), random.nextInt(256));
                    g.setColor(rColor);
                    x1 = random.nextInt(x - 1) + 1;
                    //  x1 = random.nextInt(x - 2) + 1;
                    x2 = random.nextInt(x - 1) + 1;
                    y1 = random.nextInt(y - 1) + 1;
                    y2 = random.nextInt(y - 1) + 1;
                    g.drawLine(x1, y1, x2, y2);

                    break;
                case 2:
                    rColor = new Color(random.nextInt(256), random.nextInt(256),
                            random.nextInt(256));
                    g.setColor(rColor);

                    x1 = random.nextInt(x - 1) + 1;
                    width = random.nextInt(51) + 10;
                    if (width + x1 > x) {
                        x1 -= width;
                    }
                    y1 = random.nextInt(y - 1) + 1;
                    height = random.nextInt(51) + 10;
                    if (height + y1 > y) {
                        y1 -= height;
                    }
                    shape = random.nextInt(4);
                    if (shape == 0) {
                        g.fillRect(x1, y1, width, height);
                    } else if (shape == 1) {
                        g.drawRect(x1, y1, width, height);
                    } else if (shape == 2) {
                        g.fillOval(x1, y1, width, height);
                    } else {
                        g.drawOval(x1, y1, width, height);
                    }

            }

        }
        space.start();
    }

    class TimerDelayListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            repaint();
        }
    }

}
