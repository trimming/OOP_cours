import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private int index;
    private final List<StudentGroup> studentGroupList;

    public StreamIterator(List<StudentGroup> studentGroupList) {
        this.index = 0;
        this.studentGroupList = studentGroupList;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        if(!hasNext()){
            return null;
        }
        return studentGroupList.get(index++);
    }

    @Override
    public void remove() {
        studentGroupList.remove(index);
    }
}
