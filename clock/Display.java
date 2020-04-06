package io.github.mtxrii.clock;

import javax.swing.*;
import java.awt.*;

public final class Display extends JFrame {
    private JPanel Background;
    private JLabel a1;
    private JLabel b1;
    private JLabel c1;
    private JLabel d1;
    private JLabel e1;
    private JLabel f1;
    private JLabel g1;
    private JLabel spacer1;
    private JPanel disp1;
    private JPanel topSpace1;
    private JPanel btmSpace1;
    private JLabel semi1;
    private JPanel disp2;
    private JLabel a2;
    private JLabel b2;
    private JLabel c2;
    private JLabel d2;
    private JLabel e2;
    private JLabel f2;
    private JLabel g2;
    private JPanel topSpace2;
    private JPanel btmSpace2;
    private JLabel spacer2;
    private JLabel spacer3;
    private JLabel semi2;
    private JPanel disp3;
    private JPanel topSpace3;
    private JPanel btmSpace3;
    private JLabel a3;
    private JLabel b3;
    private JLabel c3;
    private JLabel d3;
    private JLabel e3;
    private JLabel f3;
    private JLabel g3;
    private JLabel spacer4;
    private JPanel disp4;
    private JLabel spacer5;
    private JLabel spacer6;
    private JLabel spacer7;
    private JPanel topSpace4;
    private JPanel btmSpace4;
    private JLabel a4;
    private JLabel b4;
    private JLabel c4;
    private JLabel d4;
    private JLabel e4;
    private JLabel f4;
    private JLabel g4;
    private JPanel disp5;
    private JPanel topSpace5;
    private JPanel btmSpace5;
    private JLabel a5;
    private JLabel b5;
    private JLabel c5;
    private JLabel d5;
    private JLabel e5;
    private JLabel f5;
    private JLabel g5;
    private JPanel disp6;
    private JPanel topSpace6;
    private JPanel btmSpace6;
    private JLabel a6;
    private JLabel b6;
    private JLabel c6;
    private JLabel d6;
    private JLabel e6;
    private JLabel f6;
    private JLabel g6;

    // background color (segment "off" color)
    private Color c = Color.decode("#3c3f41");

    // private constructor (use factory method)
    private Display() {
        
        // light up colon segments
        semi1.setForeground(Color.red);
        semi2.setForeground(Color.red);
    }
    
    // make seconds number segments grey
    void resetSeconds() {
        a5.setForeground(c);
        b5.setForeground(c);
        c5.setForeground(c);
        d5.setForeground(c);
        e5.setForeground(c);
        f5.setForeground(c);
        g5.setForeground(c);
        a6.setForeground(c);
        b6.setForeground(c);
        c6.setForeground(c);
        d6.setForeground(c);
        e6.setForeground(c);
        f6.setForeground(c);
        g6.setForeground(c);
    }

    // make minutes number segments grey
    void resetMinutes() {
        a3.setForeground(c);
        b3.setForeground(c);
        c3.setForeground(c);
        d3.setForeground(c);
        e3.setForeground(c);
        f3.setForeground(c);
        g3.setForeground(c);
        a4.setForeground(c);
        b4.setForeground(c);
        c4.setForeground(c);
        d4.setForeground(c);
        e4.setForeground(c);
        f4.setForeground(c);
        g4.setForeground(c);
    }

    // make hours number segments grey
    void resetHours() {
        a1.setForeground(c);
        b1.setForeground(c);
        c1.setForeground(c);
        d1.setForeground(c);
        e1.setForeground(c);
        f1.setForeground(c);
        g1.setForeground(c);
        a2.setForeground(c);
        b2.setForeground(c);
        c2.setForeground(c);
        d2.setForeground(c);
        e2.setForeground(c);
        f2.setForeground(c);
        g2.setForeground(c);
    }

    // Light up correct segments for each 4 bit series
    // Logic table here: https://media.geeksforgeeks.org/wp-content/cdn-uploads/20191125170248/1221.png
    void formatHours(boolean[] array) {
        boolean A10 = array[0];
        boolean B10 = array[1];
        boolean C10 = array[2];
        boolean D10 = array[3];

        boolean A01 = array[4];
        boolean B01 = array[5];
        boolean C01 = array[6];
        boolean D01 = array[7];

        // + + + + + + + + + + + + + + [ HOURS TENS ]

        if (!A10 && !B10 && !C10 && !D10) {
            a1.setForeground(Color.red);
            b1.setForeground(Color.red);
            c1.setForeground(Color.red);
            d1.setForeground(Color.red);
            e1.setForeground(Color.red);
            f1.setForeground(Color.red);
//          g1.setForeground(Color.red);
        }

        if (!A10 && !B10 && !C10 && D10) {
//          a1.setForeground(Color.red);
            b1.setForeground(Color.red);
            c1.setForeground(Color.red);
//          d1.setForeground(Color.red);
//          e1.setForeground(Color.red);
//          f1.setForeground(Color.red);
//          g1.setForeground(Color.red);
        }

        if (!A10 && !B10 && C10 && !D10) {
            a1.setForeground(Color.red);
            b1.setForeground(Color.red);
//          c1.setForeground(Color.red);
            d1.setForeground(Color.red);
            e1.setForeground(Color.red);
//          f1.setForeground(Color.red);
            g1.setForeground(Color.red);
        }

        if (!A10 && !B10 && C10 && D10) {
            a1.setForeground(Color.red);
            b1.setForeground(Color.red);
            c1.setForeground(Color.red);
            d1.setForeground(Color.red);
//          e1.setForeground(Color.red);
//          f1.setForeground(Color.red);
            g1.setForeground(Color.red);
        }

        if (!A10 && B10 && !C10 && !D10) {
//          a1.setForeground(Color.red);
            b1.setForeground(Color.red);
            c1.setForeground(Color.red);
//          d1.setForeground(Color.red);
//          e1.setForeground(Color.red);
            f1.setForeground(Color.red);
            g1.setForeground(Color.red);
        }

        if (!A10 && B10 && !C10 && D10) {
            a1.setForeground(Color.red);
//          b1.setForeground(Color.red);
            c1.setForeground(Color.red);
            d1.setForeground(Color.red);
//          e1.setForeground(Color.red);
            f1.setForeground(Color.red);
            g1.setForeground(Color.red);
        }

        if (!A10 && B10 && C10 && !D10) {
            a1.setForeground(Color.red);
//          b1.setForeground(Color.red);
            c1.setForeground(Color.red);
            d1.setForeground(Color.red);
            e1.setForeground(Color.red);
            f1.setForeground(Color.red);
            g1.setForeground(Color.red);
        }

        if (!A10 && B10 && C10 && D10) {
            a1.setForeground(Color.red);
            b1.setForeground(Color.red);
            c1.setForeground(Color.red);
//          d1.setForeground(Color.red);
//          e1.setForeground(Color.red);
//          f1.setForeground(Color.red);
//          g1.setForeground(Color.red);
        }

        if (A10 && !B10 && !C10 && !D10) {
            a1.setForeground(Color.red);
            b1.setForeground(Color.red);
            c1.setForeground(Color.red);
            d1.setForeground(Color.red);
            e1.setForeground(Color.red);
            f1.setForeground(Color.red);
            g1.setForeground(Color.red);
        }

        if (A10 && !B10 && !C10 && D10) {
            a1.setForeground(Color.red);
            b1.setForeground(Color.red);
            c1.setForeground(Color.red);
            d1.setForeground(Color.red);
//          e1.setForeground(Color.red);
            f1.setForeground(Color.red);
            g1.setForeground(Color.red);
        }

        // + + + + + + + + + + + + + + [ HOURS ONES ]

        if (!A01 && !B01 && !C01 && !D01) {
            a2.setForeground(Color.red);
            b2.setForeground(Color.red);
            c2.setForeground(Color.red);
            d2.setForeground(Color.red);
            e2.setForeground(Color.red);
            f2.setForeground(Color.red);
//          g2.setForeground(Color.red);
        }

        if (!A01 && !B01 && !C01 && D01) {
//          a2.setForeground(Color.red);
            b2.setForeground(Color.red);
            c2.setForeground(Color.red);
//          d2.setForeground(Color.red);
//          e2.setForeground(Color.red);
//          f2.setForeground(Color.red);
//          g2.setForeground(Color.red);
        }

        if (!A01 && !B01 && C01 && !D01) {
            a2.setForeground(Color.red);
            b2.setForeground(Color.red);
//          c2.setForeground(Color.red);
            d2.setForeground(Color.red);
            e2.setForeground(Color.red);
//          f2.setForeground(Color.red);
            g2.setForeground(Color.red);
        }

        if (!A01 && !B01 && C01 && D01) {
            a2.setForeground(Color.red);
            b2.setForeground(Color.red);
            c2.setForeground(Color.red);
            d2.setForeground(Color.red);
//          e2.setForeground(Color.red);
//          f2.setForeground(Color.red);
            g2.setForeground(Color.red);
        }

        if (!A01 && B01 && !C01 && !D01) {
//          a2.setForeground(Color.red);
            b2.setForeground(Color.red);
            c2.setForeground(Color.red);
//          d2.setForeground(Color.red);
//          e2.setForeground(Color.red);
            f2.setForeground(Color.red);
            g2.setForeground(Color.red);
        }

        if (!A01 && B01 && !C01 && D01) {
            a2.setForeground(Color.red);
//          b2.setForeground(Color.red);
            c2.setForeground(Color.red);
            d2.setForeground(Color.red);
//          e2.setForeground(Color.red);
            f2.setForeground(Color.red);
            g2.setForeground(Color.red);
        }

        if (!A01 && B01 && C01 && !D01) {
            a2.setForeground(Color.red);
//          b2.setForeground(Color.red);
            c2.setForeground(Color.red);
            d2.setForeground(Color.red);
            e2.setForeground(Color.red);
            f2.setForeground(Color.red);
            g2.setForeground(Color.red);
        }

        if (!A01 && B01 && C01 && D01) {
            a2.setForeground(Color.red);
            b2.setForeground(Color.red);
            c2.setForeground(Color.red);
//          d2.setForeground(Color.red);
//          e2.setForeground(Color.red);
//          f2.setForeground(Color.red);
//          g2.setForeground(Color.red);
        }

        if (A01 && !B01 && !C01 && !D01) {
            a2.setForeground(Color.red);
            b2.setForeground(Color.red);
            c2.setForeground(Color.red);
            d2.setForeground(Color.red);
            e2.setForeground(Color.red);
            f2.setForeground(Color.red);
            g2.setForeground(Color.red);
        }

        if (A01 && !B01 && !C01 && D01) {
            a2.setForeground(Color.red);
            b2.setForeground(Color.red);
            c2.setForeground(Color.red);
            d2.setForeground(Color.red);
//          e2.setForeground(Color.red);
            f2.setForeground(Color.red);
            g2.setForeground(Color.red);
        }
    }
    void formatMinutes(boolean[] array) {
        boolean a30 = array[0];
        boolean b30 = array[1];
        boolean c30 = array[2];
        boolean d30 = array[3];

        boolean A01 = array[4];
        boolean B01 = array[5];
        boolean C01 = array[6];
        boolean D01 = array[7];

        // + + + + + + + + + + + + + + [ MINS TENS ]

        if (!a30 && !b30 && !c30 && !d30) {
            a3.setForeground(Color.red);
            b3.setForeground(Color.red);
            c3.setForeground(Color.red);
            d3.setForeground(Color.red);
            e3.setForeground(Color.red);
            f3.setForeground(Color.red);
//          g3.setForeground(Color.red);
        }

        if (!a30 && !b30 && !c30 && d30) {
//          a3.setForeground(Color.red);
            b3.setForeground(Color.red);
            c3.setForeground(Color.red);
//          d3.setForeground(Color.red);
//          e3.setForeground(Color.red);
//          f3.setForeground(Color.red);
//          g3.setForeground(Color.red);
        }

        if (!a30 && !b30 && c30 && !d30) {
            a3.setForeground(Color.red);
            b3.setForeground(Color.red);
//          c3.setForeground(Color.red);
            d3.setForeground(Color.red);
            e3.setForeground(Color.red);
//          f3.setForeground(Color.red);
            g3.setForeground(Color.red);
        }

        if (!a30 && !b30 && c30 && d30) {
            a3.setForeground(Color.red);
            b3.setForeground(Color.red);
            c3.setForeground(Color.red);
            d3.setForeground(Color.red);
//          e3.setForeground(Color.red);
//          f3.setForeground(Color.red);
            g3.setForeground(Color.red);
        }

        if (!a30 && b30 && !c30 && !d30) {
//          a3.setForeground(Color.red);
            b3.setForeground(Color.red);
            c3.setForeground(Color.red);
//          d3.setForeground(Color.red);
//          e3.setForeground(Color.red);
            f3.setForeground(Color.red);
            g3.setForeground(Color.red);
        }

        if (!a30 && b30 && !c30 && d30) {
            a3.setForeground(Color.red);
//          b3.setForeground(Color.red);
            c3.setForeground(Color.red);
            d3.setForeground(Color.red);
//          e3.setForeground(Color.red);
            f3.setForeground(Color.red);
            g3.setForeground(Color.red);
        }

        if (!a30 && b30 && c30 && !d30) {
            a3.setForeground(Color.red);
//          b3.setForeground(Color.red);
            c3.setForeground(Color.red);
            d3.setForeground(Color.red);
            e3.setForeground(Color.red);
            f3.setForeground(Color.red);
            g3.setForeground(Color.red);
        }

        if (!a30 && b30 && c30 && d30) {
            a3.setForeground(Color.red);
            b3.setForeground(Color.red);
            c3.setForeground(Color.red);
//          d3.setForeground(Color.red);
//          e3.setForeground(Color.red);
//          f3.setForeground(Color.red);
//          g3.setForeground(Color.red);
        }

        if (a30 && !b30 && !c30 && !d30) {
            a3.setForeground(Color.red);
            b3.setForeground(Color.red);
            c3.setForeground(Color.red);
            d3.setForeground(Color.red);
            e3.setForeground(Color.red);
            f3.setForeground(Color.red);
            g3.setForeground(Color.red);
        }

        if (a30 && !b30 && !c30 && d30) {
            a3.setForeground(Color.red);
            b3.setForeground(Color.red);
            c3.setForeground(Color.red);
            d3.setForeground(Color.red);
//          e3.setForeground(Color.red);
            f3.setForeground(Color.red);
            g3.setForeground(Color.red);
        }

        // + + + + + + + + + + + + + + [ MINS ONES ]

        if (!A01 && !B01 && !C01 && !D01) {
            a4.setForeground(Color.red);
            b4.setForeground(Color.red);
            c4.setForeground(Color.red);
            d4.setForeground(Color.red);
            e4.setForeground(Color.red);
            f4.setForeground(Color.red);
//          g4.setForeground(Color.red);
        }

        if (!A01 && !B01 && !C01 && D01) {
//          a4.setForeground(Color.red);
            b4.setForeground(Color.red);
            c4.setForeground(Color.red);
//          d4.setForeground(Color.red);
//          e4.setForeground(Color.red);
//          f4.setForeground(Color.red);
//          g4.setForeground(Color.red);
        }

        if (!A01 && !B01 && C01 && !D01) {
            a4.setForeground(Color.red);
            b4.setForeground(Color.red);
//          c4.setForeground(Color.red);
            d4.setForeground(Color.red);
            e4.setForeground(Color.red);
//          f4.setForeground(Color.red);
            g4.setForeground(Color.red);
        }

        if (!A01 && !B01 && C01 && D01) {
            a4.setForeground(Color.red);
            b4.setForeground(Color.red);
            c4.setForeground(Color.red);
            d4.setForeground(Color.red);
//          e4.setForeground(Color.red);
//          f4.setForeground(Color.red);
            g4.setForeground(Color.red);
        }

        if (!A01 && B01 && !C01 && !D01) {
//          a4.setForeground(Color.red);
            b4.setForeground(Color.red);
            c4.setForeground(Color.red);
//          d4.setForeground(Color.red);
//          e4.setForeground(Color.red);
            f4.setForeground(Color.red);
            g4.setForeground(Color.red);
        }

        if (!A01 && B01 && !C01 && D01) {
            a4.setForeground(Color.red);
//          b4.setForeground(Color.red);
            c4.setForeground(Color.red);
            d4.setForeground(Color.red);
//          e4.setForeground(Color.red);
            f4.setForeground(Color.red);
            g4.setForeground(Color.red);
        }

        if (!A01 && B01 && C01 && !D01) {
            a4.setForeground(Color.red);
//          b4.setForeground(Color.red);
            c4.setForeground(Color.red);
            d4.setForeground(Color.red);
            e4.setForeground(Color.red);
            f4.setForeground(Color.red);
            g4.setForeground(Color.red);
        }

        if (!A01 && B01 && C01 && D01) {
            a4.setForeground(Color.red);
            b4.setForeground(Color.red);
            c4.setForeground(Color.red);
//          d4.setForeground(Color.red);
//          e4.setForeground(Color.red);
//          f4.setForeground(Color.red);
//          g4.setForeground(Color.red);
        }

        if (A01 && !B01 && !C01 && !D01) {
            a4.setForeground(Color.red);
            b4.setForeground(Color.red);
            c4.setForeground(Color.red);
            d4.setForeground(Color.red);
            e4.setForeground(Color.red);
            f4.setForeground(Color.red);
            g4.setForeground(Color.red);
        }

        if (A01 && !B01 && !C01 && D01) {
            a4.setForeground(Color.red);
            b4.setForeground(Color.red);
            c4.setForeground(Color.red);
            d4.setForeground(Color.red);
//          e4.setForeground(Color.red);
            f4.setForeground(Color.red);
            g4.setForeground(Color.red);
        }
    }
    void formatSeconds(boolean[] array) {
        boolean a30 = array[0];
        boolean b30 = array[1];
        boolean c30 = array[2];
        boolean d30 = array[3];

        boolean A01 = array[4];
        boolean B01 = array[5];
        boolean C01 = array[6];
        boolean D01 = array[7];

        // + + + + + + + + + + + + + + [ SECS TENS ]

        if (!a30 && !b30 && !c30 && !d30) {
            a5.setForeground(Color.red);
            b5.setForeground(Color.red);
            c5.setForeground(Color.red);
            d5.setForeground(Color.red);
            e5.setForeground(Color.red);
            f5.setForeground(Color.red);
//          g5.setForeground(Color.red);
        }

        if (!a30 && !b30 && !c30 && d30) {
//          a5.setForeground(Color.red);
            b5.setForeground(Color.red);
            c5.setForeground(Color.red);
//          d5.setForeground(Color.red);
//          e5.setForeground(Color.red);
//          f5.setForeground(Color.red);
//          g5.setForeground(Color.red);
        }

        if (!a30 && !b30 && c30 && !d30) {
            a5.setForeground(Color.red);
            b5.setForeground(Color.red);
//          c5.setForeground(Color.red);
            d5.setForeground(Color.red);
            e5.setForeground(Color.red);
//          f5.setForeground(Color.red);
            g5.setForeground(Color.red);
        }

        if (!a30 && !b30 && c30 && d30) {
            a5.setForeground(Color.red);
            b5.setForeground(Color.red);
            c5.setForeground(Color.red);
            d5.setForeground(Color.red);
//          e5.setForeground(Color.red);
//          f5.setForeground(Color.red);
            g5.setForeground(Color.red);
        }

        if (!a30 && b30 && !c30 && !d30) {
//          a5.setForeground(Color.red);
            b5.setForeground(Color.red);
            c5.setForeground(Color.red);
//          d5.setForeground(Color.red);
//          e5.setForeground(Color.red);
            f5.setForeground(Color.red);
            g5.setForeground(Color.red);
        }

        if (!a30 && b30 && !c30 && d30) {
            a5.setForeground(Color.red);
//          b5.setForeground(Color.red);
            c5.setForeground(Color.red);
            d5.setForeground(Color.red);
//          e5.setForeground(Color.red);
            f5.setForeground(Color.red);
            g5.setForeground(Color.red);
        }

        if (!a30 && b30 && c30 && !d30) {
            a5.setForeground(Color.red);
//          b5.setForeground(Color.red);
            c5.setForeground(Color.red);
            d5.setForeground(Color.red);
            e5.setForeground(Color.red);
            f5.setForeground(Color.red);
            g5.setForeground(Color.red);
        }

        if (!a30 && b30 && c30 && d30) {
            a5.setForeground(Color.red);
            b5.setForeground(Color.red);
            c5.setForeground(Color.red);
//          d5.setForeground(Color.red);
//          e5.setForeground(Color.red);
//          f5.setForeground(Color.red);
//          g5.setForeground(Color.red);
        }

        if (a30 && !b30 && !c30 && !d30) {
            a5.setForeground(Color.red);
            b5.setForeground(Color.red);
            c5.setForeground(Color.red);
            d5.setForeground(Color.red);
            e5.setForeground(Color.red);
            f5.setForeground(Color.red);
            g5.setForeground(Color.red);
        }

        if (a30 && !b30 && !c30 && d30) {
            a5.setForeground(Color.red);
            b5.setForeground(Color.red);
            c5.setForeground(Color.red);
            d5.setForeground(Color.red);
//          e5.setForeground(Color.red);
            f5.setForeground(Color.red);
            g5.setForeground(Color.red);
        }

        // + + + + + + + + + + + + + + [ SECS ONES ]

        if (!A01 && !B01 && !C01 && !D01) {
            a6.setForeground(Color.red);
            b6.setForeground(Color.red);
            c6.setForeground(Color.red);
            d6.setForeground(Color.red);
            e6.setForeground(Color.red);
            f6.setForeground(Color.red);
//          g6.setForeground(Color.red);
        }

        if (!A01 && !B01 && !C01 && D01) {
//          a6.setForeground(Color.red);
            b6.setForeground(Color.red);
            c6.setForeground(Color.red);
//          d6.setForeground(Color.red);
//          e6.setForeground(Color.red);
//          f6.setForeground(Color.red);
//          g6.setForeground(Color.red);
        }

        if (!A01 && !B01 && C01 && !D01) {
            a6.setForeground(Color.red);
            b6.setForeground(Color.red);
//          c6.setForeground(Color.red);
            d6.setForeground(Color.red);
            e6.setForeground(Color.red);
//          f6.setForeground(Color.red);
            g6.setForeground(Color.red);
        }

        if (!A01 && !B01 && C01 && D01) {
            a6.setForeground(Color.red);
            b6.setForeground(Color.red);
            c6.setForeground(Color.red);
            d6.setForeground(Color.red);
//          e6.setForeground(Color.red);
//          f6.setForeground(Color.red);
            g6.setForeground(Color.red);
        }

        if (!A01 && B01 && !C01 && !D01) {
//          a6.setForeground(Color.red);
            b6.setForeground(Color.red);
            c6.setForeground(Color.red);
//          d6.setForeground(Color.red);
//          e6.setForeground(Color.red);
            f6.setForeground(Color.red);
            g6.setForeground(Color.red);
        }

        if (!A01 && B01 && !C01 && D01) {
            a6.setForeground(Color.red);
//          b6.setForeground(Color.red);
            c6.setForeground(Color.red);
            d6.setForeground(Color.red);
//          e6.setForeground(Color.red);
            f6.setForeground(Color.red);
            g6.setForeground(Color.red);
        }

        if (!A01 && B01 && C01 && !D01) {
            a6.setForeground(Color.red);
//          b6.setForeground(Color.red);
            c6.setForeground(Color.red);
            d6.setForeground(Color.red);
            e6.setForeground(Color.red);
            f6.setForeground(Color.red);
            g6.setForeground(Color.red);
        }

        if (!A01 && B01 && C01 && D01) {
            a6.setForeground(Color.red);
            b6.setForeground(Color.red);
            c6.setForeground(Color.red);
//          d6.setForeground(Color.red);
//          e6.setForeground(Color.red);
//          f6.setForeground(Color.red);
//          g6.setForeground(Color.red);
        }

        if (A01 && !B01 && !C01 && !D01) {
            a6.setForeground(Color.red);
            b6.setForeground(Color.red);
            c6.setForeground(Color.red);
            d6.setForeground(Color.red);
            e6.setForeground(Color.red);
            f6.setForeground(Color.red);
            g6.setForeground(Color.red);
        }

        if (A01 && !B01 && !C01 && D01) {
            a6.setForeground(Color.red);
            b6.setForeground(Color.red);
            c6.setForeground(Color.red);
            d6.setForeground(Color.red);
//          e6.setForeground(Color.red);
            f6.setForeground(Color.red);
            g6.setForeground(Color.red);
        }
    }





    // --------------- STATIC THINGS ----------------

    /**
     * return: configured display ready to be set
     * */
    static Display displayer(String title) {

        // create new JFrame
        JFrame disp = new JFrame("Display");
        Display set = new Display();

        // give it the properties to make it look like a digital clock
        disp.setContentPane(set.Background);
        disp.setTitle(title);

        // configure it to work
        disp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        disp.pack();
        disp.setVisible(true);

        return set;
    }
}
