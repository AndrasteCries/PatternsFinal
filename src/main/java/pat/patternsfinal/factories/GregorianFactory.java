package pat.patternsfinal.factories;

import pat.patternsfinal.calendars.GregorianCalendar;
import pat.patternsfinal.calendars.ICalendar;

public class GregorianFactory implements ICalendarFactory{
    @Override
    public ICalendar createCalendar() {
        return new GregorianCalendar();
    }
}
