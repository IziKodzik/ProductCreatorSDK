
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {


		Storage storage = new Storage();
		new Thread(()->{

				ItemCreator c = new ItemCreator(storage,"Towary.txt");
				for(;c.createItem();){}

		}).start();
		new Thread(()->{

			ItemConsumer c = new ItemConsumer(storage);
			for(;c.consumeItem();){}
		}).start();

	}


}
