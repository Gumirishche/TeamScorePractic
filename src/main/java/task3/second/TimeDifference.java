package task3.second;

import java.time.*;

public class TimeDifference {

    public static String timeDifference(String dateTime, String timeZone1, String timeZone2) {
        Instant dateTime1 = ZonedDateTime.parse(dateTime).toLocalDateTime().toInstant(ZoneOffset.UTC);
        ZoneId zoneId1 = ZoneId.of(timeZone1);
        ZoneId zoneId2 = ZoneId.of(timeZone2);
        ZonedDateTime zonedDateTime1 = dateTime1.atZone(zoneId1);
        ZonedDateTime zonedDateTime2 = dateTime1.atZone(zoneId2);
        if ((zonedDateTime1.getYear() - zonedDateTime2.getYear()) != 0) {
            return "YEAR";
        } else if ((zonedDateTime1.getMonth().getValue() - zonedDateTime2.getMonth().getValue()) != 0) {
            return "MONTH";
        } else if ((zonedDateTime1.getDayOfMonth() - zonedDateTime2.getDayOfMonth()) != 0) {
            return "DAY";
        } else if ((zonedDateTime1.getHour() - zonedDateTime2.getHour()) != 0) {
            return "HOUR";
        } else {
            return "0";
        }
    }
}
