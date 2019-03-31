package xyz.vaith.app.domain;

import java.util.Objects;

public class StoneAxe {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StoneAxe)) return false;
        StoneAxe stoneAxe = (StoneAxe) o;
        return Objects.equals(name, stoneAxe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
