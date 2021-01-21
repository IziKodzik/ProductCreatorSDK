public class Item {

	private int id;
	private int weight;


	public Item(String[] split){
		this(Integer.parseInt(split[0])
		,Integer.parseInt(split[1]));

	}
	public Item(int id, int weight) {
		this.id = id;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
