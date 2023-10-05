import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        int result = o1.getStudentGroupList().compareTo(o2.getStudentGroupList());
    }
}
