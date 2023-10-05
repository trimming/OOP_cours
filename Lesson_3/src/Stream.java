import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> studentGroupList;

    public Stream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "studentGroupList=" + studentGroupList +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this.studentGroupList);
    }
}
