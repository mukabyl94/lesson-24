import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        int summa = 0;
        for (int i = 0; i < 400; i++) {
            integers.add(random.nextInt(0, 20));
            summa+=integers.get(i);
        }
        System.out.println(integers);
        System.out.println(summa);


        HashSet<Integer> integers1 = new HashSet<>();
        integers1.addAll(integers);
        int sum = 0;
        for (Integer integer : integers1) {
            sum+=integer;
        }
        System.out.println(integers1);
        System.out.println(sum);

        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Mukabyl", 28));
        students.add(new Student("Mukabyl", 28));
        students.add(new Student("Mukabyl", 28));
        students.add(new Student("Mukabyl", 28));
        students.add(new Student("Mukabyl", 28));

        System.out.println(students);

    }
}