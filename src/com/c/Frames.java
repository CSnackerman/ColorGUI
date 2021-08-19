package com.c;

import javax.swing.*;
import java.awt.*;

public class Frames {

    // config vars
    private static final int width = 800;
    private static final int height = 600;


    /**
     * Generates a window frame which serves as the root component
     *
     * @param title sets the title value of the title bar
     * @return default window frame (JFrame)
     */
    public static JFrame createDefault(String title) {

        // instantiate
        JFrame default_frame = new JFrame (title);

        // configure
        default_frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        default_frame.getContentPane().setBackground( new Color(0x1f0e1d) );
        default_frame.setSize (width, height);
        default_frame.setLayout(new GridLayout(5,5));
        default_frame.setVisible (true);

        // log
        Utility.logFrame("Default Frame", default_frame);

        return default_frame;
    }



}
