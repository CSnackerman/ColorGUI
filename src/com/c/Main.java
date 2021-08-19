package com.c;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // create window frame
        JFrame frame = Frames.createDefault("Random Stuff");

        // create + add panels to grid
        int numPanels = 25;
        for (int i = 0; i < numPanels; i++) {
            ColorPanel c = new ColorPanel();

            ColorButton cb = new ColorButton("Hello " + (i + 1));
            ColorButton cb2 = new ColorButton("Goodbye " + (i + 1));

            c.add(cb, GBC_Generator.gbc1());
            c.add(cb2, GBC_Generator.gbc2());


            frame.add(c);
        }

        // finalize the ui
        frame.validate();
    }
}
