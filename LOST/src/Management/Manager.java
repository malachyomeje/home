package Management;

import Mala.Degree;
import Mala.UserRole;

public class Manager  extends Users{
    private Degree degree;

     public Manager   (String name, String place, String rank, int age , UserRole role, Degree degree ){
       super( name,place,rank, age ,role);
       this.degree=degree;
     }
    public Manager(){};

  public Degree getDegree() {
    return degree;
  }

  public void setDegree(Degree degree) {
    this.degree = degree;
  }
}

