package xyz.vaith.app.domain;

import java.util.Objects;

public class SteelAxe {

    private Integer id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SteelAxe)) return false;
        SteelAxe steelAxe = (SteelAxe) o;
        return Objects.equals(id, steelAxe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
