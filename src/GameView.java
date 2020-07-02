import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameView {
	Pane gameRoot;
	Model model;
	Stage gameStage;
	public GameView(Pane root, Model model) {
		super();
		this.gameRoot = root;
		this.model = model;
		gameStage = new Stage();
		Pane gameRoot = new Pane();
		gameStage.setScene(new Scene(gameRoot, 1000, 600));
		gameStage.show();
	}
}
