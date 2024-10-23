package vehicle;

import user.User;

public class Bike extends Vehicle {
	private String type = "bike";
	Bike(String name, User user){
		super(name, user);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
