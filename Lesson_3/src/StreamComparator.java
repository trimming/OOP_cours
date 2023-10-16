import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        if(o1.getStudentGroupList().size() > o2.getStudentGroupList().size()){
            return -1;
        } else if (o1.getStudentGroupList().size() == o2.getStudentGroupList().size()) {
            return 0;
        } else {
            return 1;
        }
    }
}
