import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

interface Calculatorr{
    int calculate(int a, int b);
}

interface AnonymousExample{
    List<String> sorted(List<String> list);
}

public class FunctionalInterfaceCoding {
    public static void main(String[] args) {

        Calculatorr calc = (a, b) ->  a+b;

        System.out.println(calc.calculate(10,20));

        //Sort a list of string using 1. anonymous class

        List<String> ls = new ArrayList<>();

        ls.add("Luffy");
        ls.add("Zoro");
        ls.add("Sanji");

        AnonymousExample ae = new AnonymousExample(){
            public List<String> sorted(List<String> list){
                list.sort(new Comparator<String> (){
                    public int compare(String s1, String s2){
                        return s1.compareTo(s2);
                    }
                });
                        return list;
            }
        };

        //Sort a list of string using 2. lambda expression

//        AnonymousExample anonymousExample = (List<String> list) -> list.sort((s1, s2) -> s1.compareTo(s2));
//        some confusion in this...




        System.out.println(ae.sorted(ls));


    }
}
