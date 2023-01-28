package Employing;

import Mala.Degree;
import Management.Casher;
import Management.Manager;

public class Payiing {


    public String paywokers(Casher casher) {
        int Days = 7;
        if (casher.getDays() >= 7 && casher.getWork().equals("complete")) {
            return " come and collect your payment";
        } else if (casher.getDays() < 7) {
          return   " come and collect your querry";
        }

        return null;
    }
}
