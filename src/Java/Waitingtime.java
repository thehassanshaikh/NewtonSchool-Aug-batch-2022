import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Waitingtime {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int time=sc.nextInt();
    int wait=sc.nextInt();
    int totalwaitingtime=time*wait;
    System.out.println(totalwaitingtime);
    }
}