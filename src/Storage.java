import java.util.EmptyStackException;
import java.util.Stack;

public class Storage {

	Stack<Item> items = new Stack<>();
	volatile boolean created = false;
	volatile boolean done = false;

	public Storage(){}

	public synchronized void end(){
		done = true;
		created = true;
		notifyAll();
	}

	public synchronized void addItem(Item item){

		while (created){
			try {
				wait();
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		if(done)
			return;
		items.add(item);
		created = !created;
		notifyAll();


	}
	public synchronized Item getItem() {
		while (!created ){
			try {
				wait();
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		if(done)
			return null;

		Item i = items.pop();
		created = !created;
		notifyAll();

		return i;
	}


}
