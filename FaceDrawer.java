//Submitted by: Laura Neff

import acm.graphics.GRect;
import acm.breadboards.OneButtonBreadboard;
import acm.graphics.GOval;
import java.awt.Color;
import acm.graphics.GLine;
public class FaceDrawer extends OneButtonBreadboard {
        public void run () {
            //Text
            this.getTextArea().setText("You know how they say how Monet paintings are good from afar but not up close?\nWell this isn't good from no matter what distance.\n#OneUglyBarnacleBoiiii");
            //Head
            GRect head = new GRect(200,225);
            head.setLocation(120,100);
            this.add(head);
            this.setSize(200,250);
            //Hair
            GOval hair = new GOval(300,130);
            hair.setLocation(70,20);
            this.add(hair);
            hair.setFilled(true);
            hair.setFillColor(Color.GREEN);
            //Eye 1
            GOval eye1 = new GOval(20,30);
            eye1.setLocation(130,160);
            this.add(eye1);
            eye1.setFilled(true);
            eye1.setFillColor(Color.CYAN);
            //Eye 2
            GOval eye2 = new GOval(20,30);
            eye2.setLocation(270,160);
            this.add(eye2);
            Color purple = new Color(80,0,100);
            eye2.setFilled(true);
            eye2.setFillColor(purple);
            //Clown Nose
            GOval nose = new GOval(80,100);
            nose.setLocation(170,170);
            this.add(nose);
            nose.setFilled(true);
            nose.setFillColor(Color.RED);
            //Mouth
            GLine line1 = new GLine(170, 270, 200, 310);
            this.add(line1);
            GLine line2 = new GLine(200, 310, 270, 270);
            this.add(line2);









            //GOval oval = new GOval(200,300);
            //oval.setLocation(120,50);
            //this.add(oval);


        }

    }
