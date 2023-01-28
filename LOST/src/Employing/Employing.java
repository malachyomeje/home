package Employing;

import Mala.Degree;
import Management.Casher;
import Management.Manager;

public class Employing {

 public String empoy(Manager manager) {
     if (manager.getDegree().equals(Degree.BLC)) {
         return " you are employed";
     }
     return " see you next time";


 }
}