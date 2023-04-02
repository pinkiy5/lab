package thrusdaylab_30march;
//problem statement 2

class LoaderThread  implements Runnable {
	int[] intArray = new int[100];
	int startNumber = 0;
	int lastNumber = 100;
	public void loadList(int startNumber, int lastNumber) {  //creating method loadlist with 2 arguments
		for(int i = startNumber; i<= lastNumber; i++) {
			intArray[i]= i;
		}
	}
    
	public LoaderThread (int startNumber, int lastNumber) {
		this.startNumber = startNumber;
		this.lastNumber = lastNumber;
	}
    @Override
	public void run() {
		loadList(0,100);		
			try { Thread.sleep(1000);} catch(Exception e) {}
		}
	}

public class Modified_Program {
	public static void main(String[] args) {
		LoaderThread l = new LoaderThread();
		Thread t1 = new Thread(l);
        Thread t2 = new Thread(l);
        t1.start();
        t2.start();
	}

}
