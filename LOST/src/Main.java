import Employing.Employing;
import Mala.Degree;
import Mala.Paying;

import Mala.UserRole;
import Management.Casher;
import Management.Manager;
import Management.Users;

public class Main {
    public static void main(String[] args) {


        Users staff = new Users(" OMEJE MALACHY", " ezimo -agu", "Staff 1",66 ,UserRole.Staff);
        Users stafff2 = new Users(" OMEJE MALACHY", "ezimo -agu ", " Staff 2",66, UserRole.Staff);
        Users salesAssociate = new Users(" OMEJE MALACHY", " ezimo-agu", "salesAssociate",99, UserRole.SalesAssociate);
        Users casher = new Users("----", " ezimo -agu", "cashier",89,UserRole.Casher);
        Users manager = new Users(" ODO LILIAN ", " OBOLLO AFOR", "MANAGER" , 45,UserRole.MANEGER);
        Users storeManager = new Users("EZE UGWU ", " NSUKKA", "storeManager",  22,UserRole.StoreManager);


        System.out.println("NAME:"+ manager.getName()+ "FROM:"+ manager.getPlace() + " RANK: " + manager.getRank() + " AGE:" + manager.getAge() + "ROLE: " + manager.getRole() );
        System.out.println("NAME:"+ casher.getName()+ "FROM:"+ casher.getPlace()+ "RANK: "+casher.getRank()+ "AGE:" +casher.getAge() );
        System.out.println("NAME:"+ storeManager.getName()+ " FROM:"+ storeManager.getPlace() + "RANK: "+ storeManager.getRank() + "AGE: " +storeManager.getAge()+" role:"+storeManager.getRole() );
        System.out.println(salesAssociate.getName() + " " + salesAssociate.getPlace() + " " + salesAssociate.getRank() + " " + salesAssociate.getAge());
        System.out.println( stafff2.getName() + " "+ stafff2.getPlace()+" "+stafff2.getRank()+" "+stafff2.getAge());
        System.out.println("...............................................................................................................");

        Casher moneny = new Casher( );
        Manager maneger =new Manager( "nnn","LLL"," JJ",90 , UserRole.MANEGER,Degree.BLC);



        Employing employ= new Employing();
        employ.empoy(maneger);
        System.out.println( employ.empoy(maneger));
        System.out.println(moneny);

    }


}



