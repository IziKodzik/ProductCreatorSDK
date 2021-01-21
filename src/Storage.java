import java.util.EmptyStackException;
import java.util.Stack;

public class Storage {

	Stack<Item> items = new Stack<>();
	volatile boolean created = false;

	public Storage(){}

	public synchronized void addItem(){

		while (created){
			try {
				wait();
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("set");
		created = !created;
		notifyAll();


	}
	public synchronized void getItem() {
		while (!created){
			try {
				wait();
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("get");
		created = !created;
		notifyAll();
	}


}
