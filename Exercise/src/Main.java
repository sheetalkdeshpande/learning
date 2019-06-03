import java.util.ArrayList;
import java.util.List;

public class Main {

    static int index_of_person_with_sword = 0;
    static List<Person> circle = new ArrayList<>();

    public static void main(String[] args) {

        circle.add(new Person("n1", true));
        circle.add(new Person("n2", false));
        circle.add(new Person("n3", false));
        circle.add(new Person("n4", false));
        circle.add(new Person("n5", false));
        circle.add(new Person("n6", false));
        circle.add(new Person("n7", false));
        circle.add(new Person("n8", false));

        passTheSword();

    }

    private static void  passTheSword() {

        if(circle.size() == 2){
            if(index_of_person_with_sword == 1)
            circle.remove(0);
            else
                circle.remove(1);
            System.out.println(circle.get(0).name + " is winner");
            return;
        }

        if(index_of_person_with_sword == circle.size()-1 ){
            arrangeTheListWhenIndexIsPointingToLast();
        }
        if(index_of_person_with_sword == circle.size() -2){
            arrangeTheListWhenIndexIsPointingToSecondLast();
        }

        circle.remove(index_of_person_with_sword + 1);
        circle.get(index_of_person_with_sword).hasSword = false;
        circle.get(index_of_person_with_sword + 1).hasSword = true;
        index_of_person_with_sword ++;


        System.out.println( "Name   hasSword");
        for (Person person :
          circle) {
            System.out.println(person.name+ "    " + person.hasSword);
        }
        System.out.println("Index : " + index_of_person_with_sword);
        System.out.println("============");
        if(circle.size() > 1){
            passTheSword();
        }

    }

    private static void arrangeTheListWhenIndexIsPointingToSecondLast() {
        final Person person = circle.get(circle.size()-2);
        circle.add(0, person);
        final Person person1 = circle.get(circle.size()-1);
        circle.add(1,person1);
        circle.remove(circle.size()-1);
        circle.remove(circle.size()-1);
        index_of_person_with_sword = 0;

    }

    private static void arrangeTheListWhenIndexIsPointingToLast() {
        final Person person = circle.get(circle.size()-1);
        circle.add(0, person);
        circle.remove(circle.size()-1);
        index_of_person_with_sword = 0;
    }

    public static class Person{
        String name;
        Boolean hasSword;


        public Person(String name, Boolean hasSword) {
            this.name = name;
            this.hasSword = hasSword;
        }


    }

}
