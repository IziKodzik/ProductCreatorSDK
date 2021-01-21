import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ItemCreator {

	int created;
	int sumWeight;
	Storage storage;
	BufferedReader reader;

	public ItemCreator(Storage storage,String path)  {
		this.storage = storage;
//		reader = new BufferedReader(new FileReader(path));
	}

	public boolean createItem() {
		storage.addItem();
		return true;
	}

}
