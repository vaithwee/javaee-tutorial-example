package xyz.vaith.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter implements Formatter<Date> {
    private String datePattern;

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
        this.dateFormat = new SimpleDateFormat(datePattern);
    }

    private SimpleDateFormat dateFormat;

    public DateFormatter() {
    }

    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        return dateFormat.parse(s);
    }

    @Override
    public String print(Date date, Locale locale) {
        return dateFormat.format(date);
    }
}
