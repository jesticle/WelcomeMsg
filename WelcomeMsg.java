public class WelcomeMsg {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println(" [ERROR] No user specified.");
		} else if (args[0].equals("james")) {
			User user = new User("James");
			user.welcomeMsg();
		 else if (args[].equals("jess")) {
		 	User user = new User("Jess");
		 	user.welcomeMsg();
		 }	
		} else {
			System.out.println(" [ERROR] User "+args[0]+" does not exist.");
		}
	}
}
