package xyz.vaith.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SpringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if (s == null) {
            throw  new RuntimeException("请输入要转换的日期");
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("转换失败");
        }
    }
}
