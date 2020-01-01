package resource.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class email_generator {
    public static String getCurrentDateTimeMS() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");
        String datetime = ft.format(dNow);
        String email = datetime + "@test.com";
        return email;
    }
}
