import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int index;
    private final List<Student> studentList;

    public StudentGroupIterator(List<Student> studentList) {
        this.index = 0;
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        if(!hasNext()){
            return null;
        }
        return studentList.get(index++);
    }

    @Override
    public void remove() {
        studentList.remove(index);
    }
}
