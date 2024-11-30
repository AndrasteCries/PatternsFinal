package pat.patternsfinal.factories;

import pat.patternsfinal.calendars.GregorianCalendar;
import pat.patternsfinal.calendars.ICalendar;

public class HebrewFactory implements ICalendarFactory{
    @Override
    public ICalendar createCalendar() {
        return new GregorianCalendar();
    }
}
