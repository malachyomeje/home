package Management;

import Mala.Degree;
import Mala.UserRole;

public class Casher  extends Users{
    private int days;
    private String work;




    public Casher(){};
    public Casher(String name, String place, String rank, int age , UserRole role, Degree degree , int days, String work) {
     super( name,place,rank, age ,role);

        this.days = days;
        this.work = work;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}

