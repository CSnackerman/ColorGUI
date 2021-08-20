package com.c;

import java.awt.*;

public class GBC_Generator {

    public static GridBagConstraints gbc1() {
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.weightx = 0;
        gbc.weighty = 0.3;

        gbc.gridx = 0;
        gbc.gridy = 0;

        return gbc;
    }

    public static GridBagConstraints gbc2() {
        GridBagConstraints gbc = new GridBagConstraints();


        gbc.weightx = 0;
        gbc.weighty = 0.3;


        gbc.gridx = 0;
        gbc.gridy = 1;

        return gbc;
    }

}
