package com.c;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ColorPanel extends JPanel {

    private static int r;
    private static int g;
    private static int b;

    public ColorPanel() {
        r = Utility.rand(255);
        g = Utility.rand(255);
        b = Utility.rand(255);

        super.setBackground(new Color(r,g,b));

        // setup layout manager
        this.setLayout(new GridBagLayout());

        this.addMouseListener(new MouseListener() {

            @Override
            public void mousePressed(MouseEvent e) {
                onMousePressed();
            }

            // unused
            @Override public void mouseClicked(MouseEvent e) {}
            @Override public void mouseReleased(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {
                onMouseEntered();
            }
            @Override public void mouseExited(MouseEvent e) {}
        });
    }

    private void setBG() {
        super.setBackground(new Color(r,g,b));
    }



    private void onMousePressed() {
        r = Utility.rand(255);
        g = Utility.rand(255);
        b = Utility.rand(255);
        setBG();
    }

    private void onMouseEntered() {
        r = Utility.rand(255);
        g = Utility.rand(255);
        b = Utility.rand(255);
        setBG();
    }

}
