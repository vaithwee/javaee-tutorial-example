package xyz.vaith.app.util;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class UploadUtils {
    public static String getUUIDFileName(String filename) {
        int idx = filename.lastIndexOf('.');
        String extions = filename.substring(idx);
        return UUID.randomUUID().toString().replace("-", "") + extions;
    }

    public static String getPath(String filename) {
        int code1 = filename.hashCode();
        int d1 = code1 & 0xf;
        int code2 = code1 >>> 4;
        int d2 = code2 & 0xf;
        return "/" + d1 + "/" + d2;
    }

    @Test
    public void test1() {
        System.out.println(getUUIDFileName("aa.text"));
    }
}
