package pat.patternsfinal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pat.patternsfinal.calendars.ICalendar;
import pat.patternsfinal.factories.CalendarFactoryProvider;
import pat.patternsfinal.factories.ICalendarFactory;

@SpringBootApplication
public class PatternsFinalApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PatternsFinalApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Hello user.");

        ICalendarFactory gregorianFactory = CalendarFactoryProvider.getCalendarFactory("Gregorian");
        ICalendar gregorianCalendar = gregorianFactory.createCalendar();
        System.out.println(gregorianCalendar.displayDate());

        ICalendarFactory hebrewFactory = CalendarFactoryProvider.getCalendarFactory("Hebrew");
        ICalendar hebrewCalendar = hebrewFactory.createCalendar();
        System.out.println(hebrewCalendar.displayDate());
    }
}
