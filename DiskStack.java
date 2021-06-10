
/**
 * Stack with methods for disks
 *
 * @author Anggito Anju
 * @version ver 1.0 - 9 June 21
 */
public class DiskStack
{
    private Disk headDisk;
    
    public Disk getHead() {
        return headDisk;
    }

    // Add Disk
    public void push(Disk nextDisk) {
        if(headDisk == null) {
            headDisk = nextDisk;
        }
        else {
            Disk currDisk = headDisk;
            while(currDisk.getNext() != null) {
                currDisk = currDisk.getNext();
            }
            currDisk.setNext(nextDisk);
        }
    }

    public Disk pop() {
        Disk popDisk = null;

        if(count() == 1) {
            popDisk = headDisk;
            headDisk = null;
        }

        else if(count() > 1) {
            Disk curr = headDisk;
            while(curr.getNext().getNext() != null)  {
                curr = curr.getNext();
            }
            popDisk = curr.getNext();
            curr.setNext(null);
        }

        return popDisk;
    }

    public int count() {
        int counter = 0;
        Disk curr = headDisk;
        while(curr != null) {
            counter++;
            curr = curr.getNext();
        }

        return counter;
    }
}
