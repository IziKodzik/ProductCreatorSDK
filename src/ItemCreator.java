import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ItemCreator {

	int created;

	Storage storage;
	BufferedReader reader;

	public ItemCreator(Storage storage,String path) throws FileNotFoundException {
		this.storage = storage;
		reader = new BufferedReader(new FileReader(path));
	}

	public boolean createItem() throws IOException {
		String line =  reader.readLine();
		if(line == null) {
			storage.end();
			return false;
		}
		storage.addItem(new Item((line).split(" ")));
		++created;
		if(created%200 == 0)
			System.out.println(created + "<- number of items.");
		return true;
	}

}
