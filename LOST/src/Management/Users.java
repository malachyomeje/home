package Management;

import Mala.UserRole;

public class Users {
    private String name;
    private String place;
    private String rank;
    private int age;
    private UserRole role;

    public  Users(String name, String place, String rank, int age, UserRole role) {
        this.name = name;
        this.place = place;
        this.rank = rank;
        this.age = age;
        this.role = role;
    }
    public  Users(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}

