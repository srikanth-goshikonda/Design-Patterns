package singleton;

public class SingletonObject {

	private static SingletonObject object = null;

	private SingletonObject() {

	}

	public static SingletonObject getInstance() {
		if (object == null) {
			object = new SingletonObject();
			return object;
		} else {
			return object;
		}

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
