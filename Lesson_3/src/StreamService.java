import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamService {
    private List<Stream> streamList;

    public StreamService(List<Stream> streamList) {
        this.streamList = new ArrayList<>(streamList);
    }



    public List<Stream> getStreamList() {
        return streamList;
    }

    public List<Stream> getSortedBySizeStream(){
        List<Stream> streamList = new ArrayList<Stream>(getStreamList());
        streamList.sort(new StreamComparator());
        return streamList;
    }
}
