package pat.patternsfinal.factories;

public class CalendarFactoryProvider {
    public static ICalendarFactory getCalendarFactory(String calendarType) {
        if (calendarType.equalsIgnoreCase("Gregorian")) {
            return new GregorianFactory();
        } else if (calendarType.equalsIgnoreCase("Hebrew")) {
            return new HebrewFactory();
        } else {
            throw new IllegalArgumentException("Unknown calendar type: " + calendarType);
        }
    }
}
