import java.util.ArrayList;

public class Model {
	ArrayList<User> users = new ArrayList<User>();
	public void addUsers(String userName, double score) {
		users.add(new User(userName, score));
	}
}
class User{
	String userName;
	double score;
	
	public User(String userName, double score) {
		super();
		this.userName = userName;
		this.score = score;
	}
}
