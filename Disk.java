
/**
 * Disks Class
 *
 * @author Anggito Anju
 * @version ver 1.0 - 9 June 21
 * REFERENCES : https://www.youtube.com/watch?v=39ZbYEV8fU8
 */


public class Disk
{
    private int length;
    private Disk next;

    public Disk(int length) {
        super();
        this.length = length;
        this.next = null;
    }

    public int getLength() {
        return length;
    }

    public Disk getNext() {
        return next;
    }

    public void setLength(int diskLength) {
        this.length = diskLength;
    }

    public void setNext(Disk nextDisk) {
        this.next = nextDisk;
    }
}
