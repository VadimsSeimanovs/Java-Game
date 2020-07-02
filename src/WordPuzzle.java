import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class WordPuzzle extends Application{
	View view;
	GameView gameView;
	Model model;
	Controller controller;
	Stage mainStage, gamingStage;
	public static void main(String[] args) {
			launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		mainStage = new Stage();
		mainStage.setTitle("Word Puzzle");
		Pane root = new Pane();
		mainStage.setScene(new Scene(root, 1000, 600));
		mainStage.show();
			model = new Model();
			controller = new Controller(model, view);
			view = new View(root, model);
			mainStage.setFullScreenExitHint("DO NOT PLAY THIS SHIT!!");
			view.bFullMode.setOnAction(new EventHandler<ActionEvent>()
			{

				@Override
				public void handle(ActionEvent event) {
					mainStage.setFullScreen(true);
					view.name.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
					view.name.setLayoutX(mainStage.getWidth() / 2 - 200);
					view.bStart.setFont(Font.font("Verdana", 40));
					view.bStart.setLayoutX(mainStage.getWidth() / 2 - 200);
					view.bStart.setLayoutY(view.name.getLayoutY() + 200);
					view.bDifficulty.setFont(Font.font("Verdana", 40));
					view.bDifficulty.setLayoutX(view.bStart.getLayoutX() + 200);
					view.bDifficulty.setLayoutY(view.bStart.getLayoutY());
					view.bLeaderBoard.setFont(Font.font("Verdana", 40));
					view.bLeaderBoard.setLayoutY(270);
					view.bLeaderBoard.setLayoutX(mainStage.getWidth() / 2 - 200);
					view.bLeaderBoard.setLayoutY(view.bStart.getLayoutY() + 100);
					view.bExit.setFont(Font.font("Verdana", 40));
					view.bExit.setLayoutX(mainStage.getWidth() / 2 - 200);
					view.bExit.setLayoutY(view.bLeaderBoard.getLayoutY() + 100);
					
					BackgroundImage bgimg = new BackgroundImage(new Image("res/background.jpg",1920,1080,false,true), BackgroundRepeat.REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
					root.setBackground(new Background(bgimg)); 
				}
			});
			view.bExitMode.setOnAction(new EventHandler<ActionEvent>()
					{
						@Override
						public void handle(ActionEvent event) {
							mainStage.setFullScreen(false);
							mainStage.close();
							Pane root = new Pane();
							mainStage.setScene(new Scene(root, 1000, 600));			
							controller = new Controller(model, view);
							view = new View(root, model);
							mainStage.show();
						}	
					});
			view.bExit.setOnAction(new EventHandler<ActionEvent>() 
					{
						@Override
						public void handle(ActionEvent event) {
							mainStage.close();
						}
					});
	}
}
