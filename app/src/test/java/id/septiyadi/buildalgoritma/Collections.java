package id.septiyadi.buildalgoritma;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Collections {

    /*
    *
    * All function algoritm implemented with Java
    *
    * */

    @Test
    public void getTodayDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date today = new Date();
        String todayTime = format.format(today);

        System.out.print(todayTime);

    }
}
