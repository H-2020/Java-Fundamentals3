

import javax.swing.*;
import java.awt.*;

public class Logo extends JFrame {

    public Logo(String title){
       super.setTitle(title);

    }

    // METHOD_OVERRIDE_FROM_WINDOW
    public void paint(Graphics graphics) {

        // DO_NOT_DELETE
        super.paint(graphics);

        // opdracht 01: draw 3 rectangles with:
            // - x: 10, y: 20, w: 1000, h: 400
            // - x: 70, y: 90, w: 200, h: 1000
            // - x: 100, y: 50, w: 512, h: 512
        graphics.setColor(Color.BLUE);
        graphics.draw3DRect(10, 20, 1000, 4000, true);

    }
}
