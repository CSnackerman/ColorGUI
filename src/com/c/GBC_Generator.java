package com.c;

import java.awt.*;

public class GBC_Generator {

    public static GridBagConstraints gbc1() {
        GridBagConstraints gbc = new GridBagConstraints();

//        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.weightx = 0.3;
        gbc.weighty = 0.3;

        gbc.gridwidth = 2;
        gbc.gridheight = 5;
        gbc.gridx = 0;
        gbc.gridy = 2;

        return gbc;
    }

    public static GridBagConstraints gbc2() {
        GridBagConstraints gbc = new GridBagConstraints();

//        gbc.anchor = GridBagConstraints.LAST_LINE_START;
        gbc.weightx = 0.3;
        gbc.weighty = 0.3;

        gbc.gridwidth = 2;
        gbc.gridheight = 5;
        gbc.gridx = 0;
        gbc.gridy = 3;

        return gbc;
    }

}
