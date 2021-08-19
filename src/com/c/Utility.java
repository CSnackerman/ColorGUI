package com.c;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Utility {

    private static final Random random = new Random();

    public static int rand(int max) {
        return random.nextInt(max);
    }

    @SuppressWarnings("StringConcatenationInLoop")
    public static void logFrame (String header, JFrame f) {
        String log = "";
        log += "\n--- " + header + " ---";
        log += "\n  root -> " + f.getRootPane().toString();
        log += "\n  layout -> " + f.getLayout().toString();
        log += "\n  components -> ";

        // print each component
        int num_components = f.getComponentCount();
        Component[] components = f.getComponents();
        for (int i = 0; i < num_components; i++) {
            log += "\n    " + (i + 1) + ". " + components[i].toString();
        }

        System.out.print (log + "\n");
    }
}
