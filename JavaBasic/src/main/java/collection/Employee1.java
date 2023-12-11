package collection;

import java.util.Objects;

public class Employee1 {

    int id;
    String name;

    Employee1()
    {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return id == employee1.id &&
                Objects.equals(name, employee1.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
