
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {


		Storage storage = new Storage();
		new Thread(()->{

			ItemCreator c = null;
			try {
				c = new ItemCreator(storage,"Towary.txt");
				for(;c.createItem();){}
				System.out.println("created");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}).start();
		new Thread(()->{
			ItemConsumer c = new ItemConsumer(storage);
			for(;c.consumeItem();){}
			System.out.println("counted");
		}).start();

	}


}
