package day3_lecture1_topic_15;

public class Main {

	// inheritance Yaparak Logglama
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new FileLogger());
		customerManager.add(new DatabaseLogger());
		customerManager.add(new EmailLogger());
	}
}