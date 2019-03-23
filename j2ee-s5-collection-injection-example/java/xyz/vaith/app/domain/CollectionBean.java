package xyz.vaith.app.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {
    private String[] strings;
    private List<String> list;
    private Set<String> stringSet;
    private Map<String, String> stringStringMap;

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Map<String, String> getStringStringMap() {
        return stringStringMap;
    }

    public void setStringStringMap(Map<String, String> stringStringMap) {
        this.stringStringMap = stringStringMap;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "strings=" + Arrays.toString(strings) +
                ", list=" + list +
                ", stringSet=" + stringSet +
                ", stringStringMap=" + stringStringMap +
                '}';
    }
}
