import java.util.Timer;
import java.util.TimerTask;
/*j  ava  2  s . c o m*/
class MyTimer extends TimerTask {
  public void run() {
    System.out.println("Timer task executed.");
  }



  public static void main(String args[]) {
    
	MyTimer tm=new MyTimer();
    Timer myTimer = new Timer();

    /*
     * Set an initial delay of 1 second, then repeat every half second.
     */
    myTimer.schedule(tm, 1000, 500);

    try {
      Thread.sleep(5000);
    } catch (InterruptedException exc) {
    }

    myTimer.cancel();
}
}