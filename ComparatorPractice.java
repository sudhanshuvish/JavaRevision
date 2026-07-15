import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employeee{
    String name;
    int salary;
    int age;

    public Employeee(int age, int salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employeee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}

class EmployeeMethods{

    public void sortBySal(List<Employeee> ls){
        //Using Comparator
//        ls.sort(new Comparator<Employeee>() {
//            @Override
//            public int compare(Employeee o1, Employeee o2) {
//                if(o1.salary > o2.salary){
//                    return 1;
//                }
//                else return -1;
//            }
//        });
        //Using Lambda
        ls.sort((o1, o2)-> {
            if(o1.salary>o2.salary){
                return 1;
            } else return -1;
        });

        System.out.println(ls);
    }

    public void sortByName(List<Employeee> ls){
        ls.sort((o1,o2)-> {
            if(o1.name.charAt(0) > o2.name.charAt(0)){
                return 1;
            } else return -1;
        });

        System.out.println(ls);
    }

    public void sortByAge(List<Employeee> ls){
        ls.sort((o1,o2)-> {
            if(o1.age > o2.age){
                return 1;
            } else return -1;
        });

        System.out.println(ls);
    }

}

public class ComparatorPractice {

    public static void main(String[] args) {
        List<Employeee> employeees = new ArrayList<>();

        employeees.add(new Employeee(24, 10000, "Tobi"));
        employeees.add(new Employeee(21, 90000, "Pain"));
        employeees.add(new Employeee(20, 80000, "Itachi"));
        employeees.add(new Employeee(27, 15000, "Deidara"));

        //Sort By Salary
        EmployeeMethods em = new EmployeeMethods();
        System.out.println("Sored by salary");
        em.sortBySal(employeees);
        System.out.println("Sorted by name");

        em.sortByName(employeees);
        System.out.println("Sorted by age");
        em.sortByAge(employeees);


        //I didnt understand how to sort using anonymous class



    }



}
