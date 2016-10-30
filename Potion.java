public class Potion {
	private String name;
	private int value; 
	private int[] quantity = new int[5];

	public Potion(String name, int val, int[] quantity) {
		this.name = name;
		this.value = val;
		this.quantity = quantity; 
	}

	public Potion(String name, int[] quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public Potion(String name, int val) {
		this.name = name;
		this.value = val;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVal(int val) {
		this.value = val;
	}

	public void setQuantity(int[] quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return this.name;
	}

	public int getValue() {
		return this.value;
	}

	public int[] getQuantity() {
		return this.quantity;
	}
}