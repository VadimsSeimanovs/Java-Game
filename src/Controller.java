import javafx.event.Event;
import javafx.event.EventHandler;

public class Controller implements EventHandler{
Model model;
View view;
	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public void handle(Event arg0) {
		addUser(
				view.userName.getText(), 0
				);
	}
	public void addUser(String userName, double score) {
		model.addUsers(userName, score);
	}
	
}
