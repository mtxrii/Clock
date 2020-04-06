package io.github.mtxrii.clock;

import java.time.LocalTime;

public final class Main {

    public static void main(String[] args) throws InterruptedException {

        // create new clock display
        Display clock = Display.displayer("Local time");

        // to record changes
        int lastMin = 61;
        int lastHr = 61;

        while (true) {

            // get components of current time
            int hour   = LocalTime.now().getHour();
            int minute = LocalTime.now().getMinute();
            int second = LocalTime.now().getSecond();

            // each component of time has 2 digits,
            // each digit being 4 bits makes each component 8 bits
            // h10s h01s   m10s m01s   s10s s01s  (h/m/s 10's or 01's place)
            // 0000.0000 : 0000.0000 : 0000.0000
            boolean[] hourBits   = intToBits(hour);
            boolean[] minuteBits = intToBits(minute);
            boolean[] secondBits = intToBits(second);

            // update seconds
            clock.resetSeconds();
            clock.formatSeconds(secondBits);

            // update minutes if theres a change
            if (lastMin != minute) {
                clock.resetMinutes();
                clock.formatMinutes(minuteBits);
            }

            // update hours if theres a change
            if (lastHr != hour) {
                clock.resetHours();
                clock.formatHours(hourBits);
            }

            // reset change detectors
            lastMin = minute;
            lastHr = hour;

            // do this every second
            Thread.sleep(1000);
        }

    }

    /**
     * arg: byte
     * returns: array holding bits in following format:
     *           4 bits in   4 bits in
     *           10's place  01's place
     *          [ 0 0 0 0    0 0 0 0 ]
     **/
    private static boolean[] byteToBits(byte i) {

        // make array to return
        boolean[] bits = new boolean[8];

        // split up 10's and 01's
        String s = String.valueOf(i);
        if (i < 10) s = "0" + s;
        char[] digits = s.toCharArray();
        byte tens = Byte.valueOf(digits[0] + "");
        byte ones = Byte.valueOf(digits[1] + "");

        // 10's place
        bits[3] = ((tens & 0x01) != 0);
        bits[2] = ((tens & 0x02) != 0);
        bits[1] = ((tens & 0x04) != 0);
        bits[0] = ((tens & 0x08) != 0);

        // 01's place
        bits[7] = ((ones & 0x01) != 0);
        bits[6] = ((ones & 0x02) != 0);
        bits[5] = ((ones & 0x04) != 0);
        bits[4] = ((ones & 0x08) != 0);
        return bits;
    }

    /**
     * arg: int (preferably 8 bits)
     * returns: array holding bits in following format:
     *           4 bits in   4 bits in
     *           10's place  01's place
     *          [ 0 0 0 0    0 0 0 0 ]
     **/
    private static boolean[] intToBits(int i) {
        // convert to byte
        return byteToBits((byte)i);
    }


}
