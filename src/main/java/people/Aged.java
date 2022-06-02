package people;

import java.util.Objects;

public class Aged {
    private int age;

    public Aged(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aged)) return false;
        Aged aged = (Aged) o;
        return getAge() == aged.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge());
    }

    public int getAge() {
        return age;
    }
}
