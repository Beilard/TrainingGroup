package ua.myCompany.lessons.lesson12;

import java.util.Objects;

public class B {
    private int code;

    public B(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b = (B) o;
        return getCode() == b.getCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }
}
