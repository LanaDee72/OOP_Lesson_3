import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        
// Создать класс Студент
// Создать класс УчебнаяГруппа
// Создать класс УчебнаяГруппаИтератор, заставив его реализовать
// интерфейс Iterator
// Реализовать его контракты (включая удаление)

        StudentGroup studentGroup1 = new StudentGroup("Group 1");

        Student ivan = new Student("Van", 2);
        Student igor = new Student("Igorivich", 1);
        Student alex = new Student("Alex", 4);
        Student alexey = new Student("Alexey", 3);

        studentGroup1.addStudent(ivan);
        studentGroup1.addStudent(igor);
        studentGroup1.addStudent(alex);
        studentGroup1.addStudent(alexey);



        StudentGroup studentGroup2 = new StudentGroup("Group 2");

        Student misha = new Student("Misha", 5);
        Student sveta = new Student("Sveta", 6);
        Student helena = new Student("Helena", 7);
        Student maksim = new Student("Maksim", 8);

        studentGroup2.addStudent(misha);
        studentGroup2.addStudent(sveta);
        studentGroup2.addStudent(helena);
        studentGroup2.addStudent(maksim);


        StudentGroup studentGroup3 = new StudentGroup("Group 3");

        Student olga = new Student("Olga", 9);
        Student gleb = new Student("Gleb", 10);
        Student denis = new Student("Denis", 11);
        Student nastya = new Student("Nastya", 12);

        studentGroup3.addStudent(olga);
        studentGroup3.addStudent(gleb);
        studentGroup3.addStudent(denis);
        studentGroup3.addStudent(nastya);


        Stream stream1 = new Stream("Stream 1");

        stream1.addStudentGroupInStream(studentGroup1);
        stream1.addStudentGroupInStream(studentGroup2);


        Stream stream2 = new Stream("Stream 2");

        stream2.addStudentGroupInStream(studentGroup3);


        // Реализация итератора
        for (StudentGroup group : stream1) {
            List<Student> students = new ArrayList<>();
            
            for (Student student : group) {
                students.add(student);
            }
            System.out.println(stream1.getName() + " - " + group + ": " + students); 
        }

        for (StudentGroup group : stream2) {
            List<Student> students = new ArrayList<>();
            
            for (Student student : group) {
                students.add(student);
            }
            System.out.println(stream2.getName() + " - " + group + ": " + students); 
        }
            

        // // Реализация StreamComparator (от меньшего к большему) 


        List<Stream> allStreams = new ArrayList<>();
        allStreams.add(stream1);
        allStreams.add(stream2);

        StreamServise streamServise = new StreamServise(allStreams);

        System.out.println(allStreams);
        streamServise.sort();
        System.out.println(allStreams);




        // Реализация StreamComparator (от меньшего к большему) без класса StreamServise

        // List<Stream> allStreams = new ArrayList<>();
        // allStreams.add(stream1);
        // allStreams.add(stream2);
        // System.out.println(allStreams);
        // Collections.sort(allStreams, new StreamComparator());
        // System.out.println(allStreams);




        // КОД С УРОКА

        // // Iterator<Student> iterator = new StudendGroupIterator(studentGroup);
        // // while (iterator.hasNext()) {
        // //     System.out.println(iterator.next());
        // // }

        // for (Student student: studentGroup1){
        //     System.out.println("Student: " + student);
        // }

        // ArrayList<Student> arrayList = new ArrayList<>(List.of(ivan, igor, alex, alexey));
        // System.out.println(arrayList);
        // // Collections.sort(arrayList, Comparator.reverseOrder());  // сортировка через compareTo
        // // Collections.sort(arrayList, new StudentComparator());  // сортировка через класс StudenComparator
        // Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id); // сортировка через лямда выражение
        // System.out.println(arrayList);
    }
}