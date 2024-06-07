import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    
    private List<StudentGroup> streamGroups;
    private String name;
    
    

    public Stream(String name){
        streamGroups = new ArrayList<>();
        this.name = name;
    }

    public void addStudentGroupInStream(StudentGroup group){
        streamGroups.add(group);
    }

    public int size(){
        return this.streamGroups.size();
    }

    public String getName(){
        return name;
    }

    @Override
    public Iterator<StudentGroup> iterator() {

        Iterator<StudentGroup> it = new Iterator<StudentGroup>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < streamGroups.size();
            }

            @Override
            public StudentGroup next() {
                return streamGroups.get(index++);
            }
        };
        return it;
    }

    @Override
    public String toString() {
        return name;
    }

    
    
}
