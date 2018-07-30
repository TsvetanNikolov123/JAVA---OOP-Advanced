package P02_FileStream;

public class Photo implements Streamable{

    private String photographer;
    private int length;
    private int bytesSent;

    public Photo(int length, int bytesSent) {
        this.length = length;
        this.bytesSent = bytesSent;
    }

    public int getLength() {
        return length;
    }

    public int getBytesSent() {
        return 0;
    }
}
