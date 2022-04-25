package singleton;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		SingletonObject instance = SingletonObject.getInstance();
		SingletonObject instance2 = SingletonObject.getInstance();

		System.out.println(instance == instance2 ? "Only one object created" : "Two Objects created");
	}

}
