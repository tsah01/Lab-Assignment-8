
package LabAssignment6;

import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 * This is the driver class of RandomShapesPanel class
 * @author Tula Sah
 * 4/15/2016
 */
public class LabAssign6 extends JFrame {
  public LabAssign6()
  {
      RandomShapesPanel rsp = new RandomShapesPanel();
      add(rsp);
  }

    
    public static void main(String[] args) {
        LabAssign6 la6 = new LabAssign6();
       la6.setSize(500,400);
        la6.setTitle("LabAssign6");
         la6.setLocationRelativeTo(null); 
        la6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        la6.setVisible(true);
        
    }
    
}
