public class Herb {
	private String name;
	private int value; // Possibly expand this to gold, silver, and copper depending on precision.

	public Herb(String name, int val) {
		this.name = name;
		this.value = val;
	}

	public Herb(String name) {
		this.name = name;
		this.value = 0;
	}

	public int getVal() {
		return this.value;
	}

	public String getName() {
		return this.name;
	}
	
	public void setVal(int value) {
		this.value = value;
	}
}