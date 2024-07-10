package Package;

import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[][] args) {
        Person[] persons = new Person[10];

        Person a1 = new Person("Alexandra", 12, "Daria");
        Person a2 = new Person("Alex", 13, "David");
        Person a3 = new Person("Alexia", 15, "David");
        Person a4 = new Person("Alexa", 16, "David");
        Person a5 = new Person("Ana", 18, "David");
        Person a6 = new Person("Andrei", 19, "David");
        Person a7 = new Person("Ariana", 23, "David");
        Person a8 = new Person("Alexas", 25, "David");
        persons[0] = a1;
        persons[1] = a2;
        persons[2] = a3;
        persons[3] = a4;
        persons[4] = a5;
        persons[5] = a6;
        persons[6] = a7;
        persons[7] = a8;


        for (int i = 0; i < 10; i++) {
            persons[i] = new Person("Name" + i, i, "Surname" + i);
        }
        Arrays.sort(persons,
        @Override
        public int compare (Person o1, Person o2){
            if(o1.getAge() == o2.getAge()){
            return o2.getName().compareTo(o1.getName());
        );}

        for (int i = 0; i < 10; i++) {
            System.out.println(persons[i]);
        }
        System.out.println([0]);
    }
}
