package web.model;

import javax.persistence.*;

@Entity
@Table(name = "webUsers")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long ID;
    @Column(name = "name")
    String name;
    @Column(name = "age")
    int age;
    @Column(name = "lastname")
    String lastname;

    public User() {
    }

    public User(String name, int age, String lastname) {
        this.name = name;
        this.age = age;
        this.lastname = lastname;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
