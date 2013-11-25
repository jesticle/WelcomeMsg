public class User {
	private String name;

	User(String name) {
		this.name = name;
	}

	public void welcomeMsg() {
		System.out.println(" Welcome "+name+"!");
	}
}