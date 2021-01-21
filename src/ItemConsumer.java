public class ItemConsumer {

	Storage storage;
	int consumed = 0;
	int sum = 0;

	public ItemConsumer(Storage storage){
		this.storage = storage;
	}

	public boolean consumeItem(){
		storage.getItem();

		return true;
	}


}
