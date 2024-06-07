import java.util.Collections;
import java.util.List;


public class StreamServise{

    private List<Stream> streams;

    public StreamServise(List<Stream> streams){
        this.streams = streams;
    }

    public List<Stream> sort(){
        Collections.sort(streams, new StreamComparator());
        return streams;
    }

}
