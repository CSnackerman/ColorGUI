package com.c;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorButton extends JButton {

    private static int r;
    private static int g;
    private static int b;


    public ColorButton (String value) {

        super (value);

        setFont(new Font ("helvetica", Font.BOLD, 17));

        r = Utility.rand(255);
        g = Utility.rand(255);
        b = Utility.rand(255);

        super.setBackground(new Color(r,g,b));

        super.setForeground(new Color(255,255,255));

        this.addActionListener(e -> {
            r = Utility.rand(255);
            g = Utility.rand(255);
            b = Utility.rand(255);
            setBG();
        });
    }

    private void setBG() {
        super.setBackground(new Color(r,g,b));
    }
}
