package com.company;

import java.text.DecimalFormat;

public class Model {
    private Viewer viewer;
    Model(Viewer viewer) {
        this.viewer = viewer;
    }

    public void doAction(String value) {
        String a = viewer.getValueOne();
        String b = viewer.getValueTwo();

        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);

        double answer = (x*100)/y;

        String formattedDouble = String.format("%.2f", answer);

        String temp = "" + formattedDouble;



        //String formattedDouble = new DecimalFormat("0.00").format(temp);

        viewer.update(temp);
    }
}
