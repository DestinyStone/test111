package com.example.util;

import com.example.entity.Project;
import org.apache.poi.ss.formula.functions.T;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.reflect.Field;
import java.util.*;

public class Func {

    public static  <T>List<T> generateTestData(Class<T> claszz, int count) {
        ArrayList<T> ts = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            ts.add(generateTestData(claszz));
        }
        return ts;
    }


    public static  <T> T generateTestData(Class<T> claszz) {
        T t = null;
        try {
            t = claszz.newInstance();
            Field[] fields = claszz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                try {
                    if (Objects.equals(field.getType(), Long.class)) {
                        field.set(t, 1000L);
                        continue;
                    }
                    if (Objects.equals(field.getType(), XMLGregorianCalendar.class)) {
                        field.set(t, DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
                        continue;
                    }
                    field.set(t, field.getName());
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }

}
