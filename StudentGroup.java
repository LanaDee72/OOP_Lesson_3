import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {

        private List<Student> students = new ArrayList<>();
        private String name;

        public StudentGroup(String name){
            this.name = name;
        }

    
        public void addStudent(Student student){
            students.add(student);
        }

        @Override
        public Iterator<Student> iterator() {
            Iterator<Student> it = new Iterator<Student>() {

                private int index = 0;
    
                @Override
                public boolean hasNext() {
                    return index < students.size();
                }
    
                @Override
                public Student next() {
                    return students.get(index++);
                }
            };
            return it;
        }

        @Override
        public String toString() {
            return name;
        }



}
