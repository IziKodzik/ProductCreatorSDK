public class ItemConsumer {

	Storage storage;
	int consumed = 0;
	int sum = 0;

	public ItemConsumer(Storage storage){
		this.storage = storage;
	}

	public boolean consumeItem(){
			Item item = storage.getItem();
			if(item == null)
				return false;
			sum += item.getWeight();
			++consumed;
			if(consumed % 100 == 0)
				System.out.println(String.format("Consumed %d items.",consumed));

		return true;

	}


}
