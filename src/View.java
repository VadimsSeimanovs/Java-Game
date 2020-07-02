import java.util.Timer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class View {
	
	Pane root;
	Model model;
	Button bStart, bDifficulty, bLeaderBoard, bExit, bFullMode, bExitMode, bSubmitUser;
	Button bLetterOne, bLetterTwo, bLetterThree, bLetterFour, bLetterFive, bLetterSix, bLetterSeven, bLetterEight;
	Button bLetterNine, bLetterTen;
	Button easy, medium, hard;
	Label name, userTitle, title, time, score, firstLetter, secondLetter, thirdLetter, fourLetter, fiveLetter;
	BackgroundImage bgimg;
	Image fullScreen, exitFullScreen;
	TextArea userName;
	Image mainImg;
	ImageView mainViewImg;
	Label difficultyMenu;

	public View(Pane root, Model model) {
		super();
		this.root = root;
		this.model=model;
			
		name = new Label("Word Puzzle");
		name.setLayoutX(350);
		name.setLayoutY(100);
		name.setFont(Font.font("Verdana", FontWeight.BOLD, 34));
		name.setTextFill(Color.CORAL);
		name.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		bStart = new Button("Start");
		bStart.setLayoutX(350);
		bStart.setLayoutY(200);
		bStart.setFont(Font.font("Verdana", 20));
		bStart.setStyle("-fx-background-color: #32CD32;");
		bStart.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bStart.setTextFill(Color.BLACK);
		bStart.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bStart.setStyle("-fx-background-color: Orange;");
				bStart.setTextFill(Color.BLACK);
			}
		});
		bStart.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bStart.setStyle("-fx-background-color:#32CD32;");
				bStart.setTextFill(Color.BLACK);
		}
		});
		
		bDifficulty = new Button("Difficulty");
		bDifficulty.setLayoutX(450);
		bDifficulty.setLayoutY(200);
		bDifficulty.setFont(Font.font("Verdana", 20));
		bDifficulty.setStyle("-fx-background-color: Brown;");
		bDifficulty.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bDifficulty.setTextFill(Color.ORANGE);
		bDifficulty.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bDifficulty.setStyle("-fx-background-color: Orange;");
				bDifficulty.setTextFill(Color.BLACK);
			}
		});
		bDifficulty.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bDifficulty.setStyle("-fx-background-color:Brown;");
				bDifficulty.setTextFill(Color.ORANGE);
		}
		});
		bDifficulty.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				difficultyMenu();
			}
		});
		
		bLeaderBoard = new Button("LeaderBoard");
		bLeaderBoard.setLayoutX(350);
		bLeaderBoard.setLayoutY(250);
		bLeaderBoard.setFont(Font.font("Verdana", 20));
		bLeaderBoard.setStyle("-fx-background-color: Brown;");
		bLeaderBoard.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bLeaderBoard.setTextFill(Color.ORANGE);
		bLeaderBoard.setOnMouseEntered(new EventHandler<MouseEvent>()
				{
					public void handle(MouseEvent t) {
						bLeaderBoard.setStyle("-fx-background-color: Orange;");
						bLeaderBoard.setTextFill(Color.BLACK);
					}
				});
		bLeaderBoard.setOnMouseExited(new EventHandler<MouseEvent>() 
			{
			public void handle(MouseEvent t) {
				bLeaderBoard.setStyle("-fx-background-color:Brown;");
				bLeaderBoard.setTextFill(Color.ORANGE);
			}
		});
		
		bExit = new Button("Exit");
		bExit.setLayoutX(350);
		bExit.setLayoutY(300);
		bExit.setFont(Font.font("Verdana", 20));
		bExit.setStyle("-fx-background-color: Red;");
		bExit.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bExit.setTextFill(Color.BLACK);
		bExit.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bExit.setStyle("-fx-background-color: Orange;");
				bExit.setTextFill(Color.BLACK);
			}
		});
		bExit.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bExit.setStyle("-fx-background-color:Red;");
				bExit.setTextFill(Color.BLACK);
		}
		});
		
		fullScreen = new Image(getClass().getResourceAsStream("res/fullScreen.png"));
		ImageView icon = new ImageView(fullScreen);
		icon.setFitHeight(20);
		icon.setFitWidth(20);
		bFullMode = new Button();
		bFullMode.setGraphic(icon);
		bFullMode.setLayoutX(10);
		bFullMode.setLayoutY(10);
		
		exitFullScreen = new Image(getClass().getResourceAsStream("res/exitFullS.png"));
		ImageView exitIcon = new ImageView(exitFullScreen);
		exitIcon.setFitHeight(20);
		exitIcon.setFitWidth(20);
		bExitMode = new Button();
		bExitMode.setGraphic(exitIcon);
		bExitMode.setLayoutX(50);
		bExitMode.setLayoutY(10);
		
		bStart.setOnMouseClicked(new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent event) {
				root.getChildren().clear();
				userScreen();
			}			
		});
	
		
		BackgroundImage bgimg = new BackgroundImage(new Image("res/background.jpg",1000,600,false,true), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		root.setBackground(new Background(bgimg));
		root.getChildren().addAll(name, bStart, bDifficulty, bExit, bLeaderBoard, bFullMode, bExitMode);
	}
	
	public void resize() {
		name.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
	}
	
	public void userScreen() {
		
		userTitle = new Label("Please enter your username: ");
		userTitle.setLayoutX(300);
		userTitle.setLayoutY(100);
		userTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
		userTitle.setTextFill(Color.CORAL);
		userTitle.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		userName = new TextArea();
		userName.setLayoutX(300);
		userName.setLayoutY(200);
		userName.setPrefSize(300, 0);
		userName.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		
		bSubmitUser = new Button("Submit");
		bSubmitUser.setLayoutX(300);
		bSubmitUser.setLayoutY(300);
		bSubmitUser.setFont(Font.font("Verdana", 20));
		bSubmitUser.setStyle("-fx-background-color:#32CD32;");
		bSubmitUser.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bSubmitUser.setTextFill(Color.BLACK);
		bSubmitUser.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bSubmitUser.setStyle("-fx-background-color: Orange;");
				bSubmitUser.setTextFill(Color.BLACK);
			}
		});
		bSubmitUser.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bSubmitUser.setStyle("-fx-background-color:#32CD32;");
				bSubmitUser.setTextFill(Color.BLACK);
		}
		});
		bSubmitUser.setOnAction(new EventHandler<ActionEvent>()
				{
					@Override
					public void handle(ActionEvent arg0) {
						root.getChildren().clear();
						gamingStage();
						firstLevel();
					}
				});
		root.getChildren().addAll(userTitle, userName, bSubmitUser);
	}
	
	public void difficultyMenu() {
		root.getChildren().clear();
		difficultyMenu = new Label("Please select the difficulty below.");
		difficultyMenu.setLayoutX(100);
		difficultyMenu.setLayoutY(50);
		difficultyMenu.setFont(Font.font("Verdana", FontWeight.BOLD, 34));
		difficultyMenu.setTextFill(Color.CORAL);
		difficultyMenu.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		easy = new Button("Easy");
		easy.setLayoutX(200);
		easy.setLayoutY(200);
		easy.setFont(Font.font("Verdana", 20));
		easy.setStyle("-fx-background-color: #32CD32;");
		easy.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		easy.setTextFill(Color.BLACK);
		easy.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				easy.setStyle("-fx-background-color: Orange;");
				easy.setTextFill(Color.BLACK);
			}
		});
		easy.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				easy.setStyle("-fx-background-color:#32CD32;");
				easy.setTextFill(Color.BLACK);
		}
		});
		easy.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event) {
				root.getChildren().clear();
				userScreenEasy();
			}		
		});
		
		medium = new Button("Medium");
		medium.setLayoutX(300);
		medium.setLayoutY(200);
		medium.setFont(Font.font("Verdana", 20));
		medium.setStyle("-fx-background-color: Orange;");
		medium.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		medium.setTextFill(Color.BLACK);
		medium.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				medium.setStyle("-fx-background-color: Green;");
				medium.setTextFill(Color.BLACK);
			}
		});
		medium.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				medium.setStyle("-fx-background-color:Orange;");
				medium.setTextFill(Color.BLACK);
		}
		});
		
		hard = new Button("Hard");
		hard.setLayoutX(500);
		hard.setLayoutY(200);
		hard.setFont(Font.font("Verdana", 20));
		hard.setStyle("-fx-background-color: Red;");
		hard.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		hard.setTextFill(Color.BLACK);
		hard.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				hard.setStyle("-fx-background-color: Orange;");
				hard.setTextFill(Color.BLACK);
			}
		});
		hard.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				hard.setStyle("-fx-background-color:Red;");
				hard.setTextFill(Color.BLACK);
		}
		});
		
		root.getChildren().addAll(difficultyMenu, easy, medium, hard);
	}
	
		public void userScreenEasy() {
		
		userTitle = new Label("Please enter your username: ");
		userTitle.setLayoutX(300);
		userTitle.setLayoutY(100);
		userTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
		userTitle.setTextFill(Color.CORAL);
		userTitle.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		userName = new TextArea();
		userName.setLayoutX(300);
		userName.setLayoutY(200);
		userName.setPrefSize(300, 0);
		userName.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		
		bSubmitUser = new Button("Submit");
		bSubmitUser.setLayoutX(300);
		bSubmitUser.setLayoutY(300);
		bSubmitUser.setFont(Font.font("Verdana", 20));
		bSubmitUser.setStyle("-fx-background-color:#32CD32;");
		bSubmitUser.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bSubmitUser.setTextFill(Color.BLACK);
		bSubmitUser.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bSubmitUser.setStyle("-fx-background-color: Orange;");
				bSubmitUser.setTextFill(Color.BLACK);
			}
		});
		bSubmitUser.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bSubmitUser.setStyle("-fx-background-color:#32CD32;");
				bSubmitUser.setTextFill(Color.BLACK);
		}
		});
		bSubmitUser.setOnAction(new EventHandler<ActionEvent>()
				{
					@Override
					public void handle(ActionEvent arg0) {
						root.getChildren().clear();
						gamingStage();
						firstLevel();
					}
				});
		root.getChildren().addAll(userTitle, userName, bSubmitUser);
	}
		public void userScreenMedium() {
			
			userTitle = new Label("Please enter your username: ");
			userTitle.setLayoutX(300);
			userTitle.setLayoutY(100);
			userTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
			userTitle.setTextFill(Color.CORAL);
			userTitle.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
			
			userName = new TextArea();
			userName.setLayoutX(300);
			userName.setLayoutY(200);
			userName.setPrefSize(300, 0);
			userName.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
			
			bSubmitUser = new Button("Submit");
			bSubmitUser.setLayoutX(300);
			bSubmitUser.setLayoutY(300);
			bSubmitUser.setFont(Font.font("Verdana", 20));
			bSubmitUser.setStyle("-fx-background-color:#32CD32;");
			bSubmitUser.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
			bSubmitUser.setTextFill(Color.BLACK);
			bSubmitUser.setOnMouseEntered(new EventHandler<MouseEvent>()
			{
				public void handle(MouseEvent t) {
					bSubmitUser.setStyle("-fx-background-color: Orange;");
					bSubmitUser.setTextFill(Color.BLACK);
				}
			});
			bSubmitUser.setOnMouseExited(new EventHandler<MouseEvent>() 
			{
				public void handle(MouseEvent t) {
					bSubmitUser.setStyle("-fx-background-color:#32CD32;");
					bSubmitUser.setTextFill(Color.BLACK);
			}
			});
			bSubmitUser.setOnAction(new EventHandler<ActionEvent>()
					{
						@Override
						public void handle(ActionEvent arg0) {
							root.getChildren().clear();
							gamingStage();
							firstLevel();
						}
					});
			root.getChildren().addAll(userTitle, userName, bSubmitUser);
		}
		
		public void userScreenHard() {
			
			userTitle = new Label("Please enter your username: ");
			userTitle.setLayoutX(300);
			userTitle.setLayoutY(100);
			userTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
			userTitle.setTextFill(Color.CORAL);
			userTitle.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
			
			userName = new TextArea();
			userName.setLayoutX(300);
			userName.setLayoutY(200);
			userName.setPrefSize(300, 0);
			userName.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
			
			bSubmitUser = new Button("Submit");
			bSubmitUser.setLayoutX(300);
			bSubmitUser.setLayoutY(300);
			bSubmitUser.setFont(Font.font("Verdana", 20));
			bSubmitUser.setStyle("-fx-background-color:#32CD32;");
			bSubmitUser.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
			bSubmitUser.setTextFill(Color.BLACK);
			bSubmitUser.setOnMouseEntered(new EventHandler<MouseEvent>()
			{
				public void handle(MouseEvent t) {
					bSubmitUser.setStyle("-fx-background-color: Orange;");
					bSubmitUser.setTextFill(Color.BLACK);
				}
			});
			bSubmitUser.setOnMouseExited(new EventHandler<MouseEvent>() 
			{
				public void handle(MouseEvent t) {
					bSubmitUser.setStyle("-fx-background-color:#32CD32;");
					bSubmitUser.setTextFill(Color.BLACK);
			}
			});
			bSubmitUser.setOnAction(new EventHandler<ActionEvent>()
					{
						@Override
						public void handle(ActionEvent arg0) {
							root.getChildren().clear();
							gamingStage();
							firstLevel();
						}
					});
			root.getChildren().addAll(userTitle, userName, bSubmitUser);
		}
	
	public void gamingStage() {
		
		title = new Label("Level: ");
		title.setLayoutX(350);
		title.setLayoutY(50);
		title.setFont(Font.font("Verdana", FontWeight.BOLD, 34));
		title.setTextFill(Color.CORAL);
		title.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		time = new Label("Time: ");
		time.setLayoutX(100);
		time.setLayoutY(100);
		time.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
		time.setTextFill(Color.CORAL);
		time.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		score = new Label("Score: ");
		score.setLayoutX(700);
		score.setLayoutY(100);
		score.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
		score.setTextFill(Color.CORAL);
		score.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		firstLetter = new Label();
		firstLetter.setLayoutX(100);
		firstLetter.setLayoutY(450);
		firstLetter.setPrefSize(50, 50);
		firstLetter.setAlignment(Pos.CENTER);
		firstLetter.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
		firstLetter.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		firstLetter.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		secondLetter = new Label();
		secondLetter.setLayoutX(300);
		secondLetter.setLayoutY(450);
		secondLetter.setPrefSize(50, 50);
		secondLetter.setAlignment(Pos.CENTER);
		secondLetter.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
		secondLetter.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		secondLetter.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));

		thirdLetter = new Label();
		thirdLetter.setLayoutX(500);
		thirdLetter.setLayoutY(450);
		thirdLetter.setPrefSize(50, 50);
		thirdLetter.setAlignment(Pos.CENTER);
		thirdLetter.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
		thirdLetter.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		thirdLetter.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));

		fourLetter = new Label();
		fourLetter.setLayoutX(700);
		fourLetter.setLayoutY(450);
		fourLetter.setPrefSize(50, 50);
		fourLetter.setAlignment(Pos.CENTER);
		fourLetter.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
		fourLetter.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		fourLetter.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		fiveLetter = new Label();
		fiveLetter.setLayoutX(900);
		fiveLetter.setLayoutY(450);
		fiveLetter.setPrefSize(50, 50);
		fiveLetter.setAlignment(Pos.CENTER);
		fiveLetter.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
		fiveLetter.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		fiveLetter.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		bLetterOne = new Button();
		bLetterOne.setLayoutX(100);
		bLetterOne.setLayoutY(550);
		bLetterOne.setPrefSize(50, 50);
		bLetterOne.setStyle("-fx-background-color: Brown;");
		bLetterOne.setFont(Font.font("Verdana", 20));
		bLetterOne.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bLetterOne.setTextFill(Color.ORANGE);
		bLetterOne.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bLetterOne.setStyle("-fx-background-color: Orange;");
				bLetterOne.setTextFill(Color.BLACK);
			}
		});
		bLetterOne.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bLetterOne.setStyle("-fx-background-color:Brown;");
				bLetterOne.setTextFill(Color.ORANGE);
		}
		});
		
		bLetterTwo = new Button();
		bLetterTwo.setLayoutX(175);
		bLetterTwo.setLayoutY(550);
		bLetterTwo.setPrefSize(50, 50);
		bLetterTwo.setStyle("-fx-background-color: Brown;");
		bLetterTwo.setFont(Font.font("Verdana", 20));
		bLetterTwo.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bLetterTwo.setTextFill(Color.ORANGE);
		bLetterTwo.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bLetterTwo.setStyle("-fx-background-color: Orange;");
				bLetterTwo.setTextFill(Color.BLACK);
			}
		});
		bLetterTwo.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bLetterTwo.setStyle("-fx-background-color:Brown;");
				bLetterTwo.setTextFill(Color.ORANGE);
		}
		});
		
		bLetterThree = new Button();
		bLetterThree.setLayoutX(250);
		bLetterThree.setLayoutY(550);
		bLetterThree.setPrefSize(50, 50);
		bLetterThree.setStyle("-fx-background-color: Brown;");
		bLetterThree.setFont(Font.font("Verdana", 20));
		bLetterThree.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bLetterThree.setTextFill(Color.ORANGE);
		bLetterThree.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bLetterThree.setStyle("-fx-background-color: Orange;");
				bLetterThree.setTextFill(Color.BLACK);
			}
		});
		bLetterThree.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bLetterThree.setStyle("-fx-background-color:Brown;");
				bLetterThree.setTextFill(Color.ORANGE);
		}
		});
		
		bLetterFour = new Button();
		bLetterFour.setLayoutX(325);
		bLetterFour.setLayoutY(550);
		bLetterFour.setPrefSize(50, 50);
		bLetterFour.setStyle("-fx-background-color: Brown;");
		bLetterFour.setFont(Font.font("Verdana", 20));
		bLetterFour.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bLetterFour.setTextFill(Color.ORANGE);
		bLetterFour.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bLetterFour.setStyle("-fx-background-color: Orange;");
				bLetterFour.setTextFill(Color.BLACK);
			}
		});
		bLetterFour.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bLetterFour.setStyle("-fx-background-color:Brown;");
				bLetterFour.setTextFill(Color.ORANGE);
		}
		});
		
		bLetterFive = new Button();
		bLetterFive.setLayoutX(400);
		bLetterFive.setLayoutY(550);
		bLetterFive.setPrefSize(50, 50);
		bLetterFive.setStyle("-fx-background-color: Brown;");
		bLetterFive.setFont(Font.font("Verdana", 20));
		bLetterFive.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bLetterFive.setTextFill(Color.ORANGE);
		bLetterFive.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bLetterFive.setStyle("-fx-background-color: Orange;");
				bLetterFive.setTextFill(Color.BLACK);
			}
		});
		bLetterFive.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bLetterFive.setStyle("-fx-background-color:Brown;");
				bLetterFive.setTextFill(Color.ORANGE);
		}
		});
		
		bLetterSix = new Button();
		bLetterSix.setLayoutX(475);
		bLetterSix.setLayoutY(550);
		bLetterSix.setPrefSize(50, 50);
		bLetterSix.setStyle("-fx-background-color: Brown;");
		bLetterSix.setFont(Font.font("Verdana", 20));
		bLetterSix.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bLetterSix.setTextFill(Color.ORANGE);
		bLetterSix.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bLetterSix.setStyle("-fx-background-color: Orange;");
				bLetterSix.setTextFill(Color.BLACK);
			}
		});
		bLetterSix.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bLetterSix.setStyle("-fx-background-color:Brown;");
				bLetterSix.setTextFill(Color.ORANGE);
		}
		});
		
		bLetterSeven = new Button();
		bLetterSeven.setLayoutX(550);
		bLetterSeven.setLayoutY(550);
		bLetterSeven.setPrefSize(50, 50);
		bLetterSeven.setStyle("-fx-background-color: Brown;");
		bLetterSeven.setFont(Font.font("Verdana", 20));
		bLetterSeven.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bLetterSeven.setTextFill(Color.ORANGE);
		bLetterSeven.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bLetterSeven.setStyle("-fx-background-color: Orange;");
				bLetterSeven.setTextFill(Color.BLACK);
			}
		});
		bLetterSeven.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bLetterSeven.setStyle("-fx-background-color:Brown;");
				bLetterSeven.setTextFill(Color.ORANGE);
		}
		});
		
		bLetterEight = new Button();
		bLetterEight.setLayoutX(625);
		bLetterEight.setLayoutY(550);
		bLetterEight.setPrefSize(50, 50);
		bLetterEight.setStyle("-fx-background-color: Brown;");
		bLetterEight.setFont(Font.font("Verdana", 20));
		bLetterEight.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bLetterEight.setTextFill(Color.ORANGE);
		bLetterEight.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bLetterEight.setStyle("-fx-background-color: Orange;");
				bLetterEight.setTextFill(Color.BLACK);
			}
		});
		bLetterEight.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bLetterEight.setStyle("-fx-background-color:Brown;");
				bLetterEight.setTextFill(Color.ORANGE);
		}
		});
		
		bLetterNine = new Button();
		bLetterNine.setLayoutX(700);
		bLetterNine.setLayoutY(550);
		bLetterNine.setPrefSize(50, 50);
		bLetterNine.setStyle("-fx-background-color: Brown;");
		bLetterNine.setFont(Font.font("Verdana", 20));
		bLetterNine.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bLetterNine.setTextFill(Color.ORANGE);
		bLetterNine.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bLetterNine.setStyle("-fx-background-color: Orange;");
				bLetterNine.setTextFill(Color.BLACK);
			}
		});
		bLetterNine.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bLetterNine.setStyle("-fx-background-color:Brown;");
				bLetterNine.setTextFill(Color.ORANGE);
		}
		});
		
		bLetterTen = new Button();
		bLetterTen.setLayoutX(775);
		bLetterTen.setLayoutY(550);
		bLetterTen.setPrefSize(50, 50);
		bLetterTen.setStyle("-fx-background-color: Brown;");
		bLetterTen.setFont(Font.font("Verdana", 20));
		bLetterTen.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		bLetterTen.setTextFill(Color.ORANGE);
		bLetterTen.setOnMouseEntered(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent t) {
				bLetterTen.setStyle("-fx-background-color: Orange;");
				bLetterTen.setTextFill(Color.BLACK);
			}
		});
		bLetterTen.setOnMouseExited(new EventHandler<MouseEvent>() 
		{
			public void handle(MouseEvent t) {
				bLetterTen.setStyle("-fx-background-color:Brown;");
				bLetterTen.setTextFill(Color.ORANGE);
		}
		});
		
		root.getChildren().addAll(title, time, score, firstLetter, secondLetter, thirdLetter, bLetterOne, bLetterTwo, bLetterThree, bLetterFour, bLetterFive, bLetterSix);
	}
	
	
	public void firstLevel() {
		
		
		title.setText("Level: 1 out 10");
		
		mainImg = new Image("res/firstLevel.jpg");
		
		mainViewImg = new ImageView(mainImg);
		mainViewImg.setLayoutX(100);
		mainViewImg.setLayoutY(150);
		mainViewImg.setFitHeight(250);
		mainViewImg.setFitWidth(700);
		mainViewImg.setSmooth(true);
		mainViewImg.setCache(true);
		
		bLetterOne.setText("A");
		bLetterOne.setOnAction(new EventHandler<ActionEvent>()
				{
					@Override
					public void handle(ActionEvent arg0) {
						firstLetter.setText("A");
						checkFirst();
					}
				});
		bLetterTwo.setText("B");
		bLetterThree.setText("I");
		bLetterThree.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				secondLetter.setText("I");
				checkFirst();
			}
		});
		
		bLetterFour.setText("C");
		bLetterFive.setText("R");
		bLetterFive.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				thirdLetter.setText("R");
				checkFirst();
			}
		});
		bLetterSix.setText("G");
		
		root.getChildren().addAll(mainViewImg);
	}
	
	public void checkFirst() {
		if(firstLetter.getText() == "A" && secondLetter.getText() == "I" && thirdLetter.getText() == "R") {
			root.getChildren().removeAll(mainViewImg);
			gamingStage();
			secondLevel();
		}
	}
	
	public void secondLevel() {
		title.setText("Level: 2 out 10; What is it?");
		title.setLayoutX(200);
		
		mainImg = new Image("res/secondLevel.jpg");
		
		mainViewImg = new ImageView(mainImg);	
		mainViewImg.setLayoutX(100);
		mainViewImg.setLayoutY(150);
		mainViewImg.setFitHeight(250);
		mainViewImg.setFitWidth(700);
		mainViewImg.setSmooth(true);
		mainViewImg.setCache(true);
		
		bLetterOne.setText("A");
		bLetterOne.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				thirdLetter.setText("A");
				checkSecond();
			}
		});
		bLetterTwo.setText("L");
		bLetterTwo.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				firstLetter.setText("L");
				checkSecond();
			}
		});
		bLetterThree.setText("I");
		bLetterFour.setText("C");
		bLetterFive.setText("E");
		bLetterFive.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				secondLetter.setText("E");
				checkSecond();
			}
		});
		bLetterSix.setText("G");
		bLetterSeven.setText("F");
		bLetterSeven.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				fourLetter.setText("F");
				checkSecond();
			}
		});
		bLetterEight.setText("J");
		
		root.getChildren().addAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter);
	}
	
	public void checkSecond() {
		if(firstLetter.getText() == "L" && secondLetter.getText() == "E" && thirdLetter.getText() == "A" && fourLetter.getText() == "F") {
			root.getChildren().removeAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter);
			gamingStage();
			thirdLevel();
		}
	}
	
	public void thirdLevel() {
		
		title.setText("Level: 3 out 10; What animal is it?");
		title.setLayoutX(200);
		
		mainImg = new Image("res/thirdLevel.jpg");
		
		mainViewImg = new ImageView(mainImg);	
		mainViewImg.setLayoutX(100);
		mainViewImg.setLayoutY(150);
		mainViewImg.setFitHeight(250);
		mainViewImg.setFitWidth(700);
		mainViewImg.setSmooth(true);
		mainViewImg.setCache(true);
		
		bLetterOne.setText("I");
		bLetterOne.setOnAction(new EventHandler<ActionEvent>()
				{
					@Override
					public void handle(ActionEvent arg0) {
						secondLetter.setText("I");
						checkThird();
					}			
				});
		bLetterTwo.setText("H");
		bLetterThree.setText("B");
		bLetterThree.setOnAction(new EventHandler<ActionEvent>()
				{
					@Override
					public void handle(ActionEvent arg0) {
						firstLetter.setText("B");
						checkThird();
					}			
				});
		bLetterFour.setText("J");
		bLetterFive.setText("R");
		bLetterFive.setOnAction(new EventHandler<ActionEvent>()
				{
					@Override
					public void handle(ActionEvent arg0) {
						thirdLetter.setText("R");	
						checkThird();
					}			
				});
		bLetterSix.setText("K");
		bLetterSeven.setText("F");
		bLetterEight.setText("D");
		bLetterEight.setOnAction(new EventHandler<ActionEvent>()
				{
					@Override
					public void handle(ActionEvent arg0) {
						fourLetter.setText("D");
						checkThird();
					}			
				});
		
		root.getChildren().addAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter);
	}
	
	public void checkThird() {
		if(firstLetter.getText() == "B" && secondLetter.getText() == "I" && thirdLetter.getText() == "R" && fourLetter.getText() == "D") {
			root.getChildren().removeAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter);
			gamingStage();
			fourLevel();
		}			
	}
	
	public void fourLevel() {
		title.setText("Level: 4 out 10; What is it?");
		title.setLayoutX(200);
		
		mainImg = new Image("res/fourLevel.jpg");
		
		mainViewImg = new ImageView(mainImg);	
		mainViewImg.setLayoutX(100);
		mainViewImg.setLayoutY(150);
		mainViewImg.setFitHeight(250);
		mainViewImg.setFitWidth(700);
		mainViewImg.setSmooth(true);
		mainViewImg.setCache(true);
		
		bLetterOne.setText("S");
		bLetterOne.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				fiveLetter.setText("S");
				checkFour();
			}			
		});
		bLetterTwo.setText("H");
		bLetterTwo.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				firstLetter.setText("H");
				checkFour();
			}			
		});
		bLetterThree.setText("B");
		bLetterFour.setText("J");
		bLetterFive.setText("R");
		bLetterSix.setText("N");
		bLetterSix.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				thirdLetter.setText("N");
				checkFour();
			}			
		});
		bLetterSeven.setText("F");
		bLetterEight.setText("D");
		bLetterEight.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				fourLetter.setText("D");
				checkFour();
			}			
		});
		bLetterNine.setText("O");
		bLetterTen.setText("A");
		bLetterTen.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				secondLetter.setText("A");
				checkFour();
			}			
		});
		
		root.getChildren().addAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter, fiveLetter, bLetterNine, bLetterTen);
	}
	public void checkFour() {
		if(firstLetter.getText() == "H" && secondLetter.getText() == "A" && thirdLetter.getText() == "N" && fourLetter.getText() == "D" && fiveLetter.getText() == "S") {
			root.getChildren().removeAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter, fiveLetter, bLetterNine, bLetterTen);
			gamingStage();
			fiveLevel();
		}
	}
	
	public void fiveLevel() {
		title.setText("Level: 5 out 10; What animal is it?");
		title.setLayoutX(200);
		
		mainImg = new Image("res/fiveLevel.jpg");
		
		mainViewImg = new ImageView(mainImg);	
		mainViewImg.setLayoutX(100);
		mainViewImg.setLayoutY(150);
		mainViewImg.setFitHeight(250);
		mainViewImg.setFitWidth(700);
		mainViewImg.setStyle("-fx-background-color: Black;");
		mainViewImg.setSmooth(true);
		mainViewImg.setCache(true);
		
		bLetterOne.setText("I");
		bLetterOne.setOnAction(new EventHandler<ActionEvent>()
				{
					@Override
					public void handle(ActionEvent event) {
						// TODO Auto-generated method stub
						secondLetter.setText("I");
						checkFive();
					}				
				});
		bLetterTwo.setText("B");
		bLetterThree.setText("H");
		bLetterThree.setOnAction(new EventHandler<ActionEvent>()
				{

					@Override
					public void handle(ActionEvent event) {
						// TODO Auto-generated method stub	
						fourLetter.setText("H");
						checkFive();
					}
				});
		bLetterFour.setText("J");
		bLetterFive.setText("S");
		bLetterFive.setOnAction(new EventHandler<ActionEvent>()
				{

					@Override
					public void handle(ActionEvent event) {
						// TODO Auto-generated method stub
						thirdLetter.setText("S");
						checkFive();
					}
				});
		bLetterSix.setText("N");
		bLetterSeven.setText("F");
		bLetterSeven.setOnAction(new EventHandler<ActionEvent>()
				{
					@Override
					public void handle(ActionEvent event) {
						// TODO Auto-generated method stub
						firstLetter.setText("F");
						checkFive();
					}		
				});
		bLetterEight.setText("D");
		
		root.getChildren().addAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter);
	}
	public void checkFive() {
		if(firstLetter.getText() == "F" && secondLetter.getText() == "I" && thirdLetter.getText() == "S" && fourLetter.getText() == "H") {
			root.getChildren().removeAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter);
			gamingStage();
			sixLevel();
		}
	}
	public void sixLevel() {
		//bug here
		title.setText("Level: 6 out 10; What is it?");
		title.setLayoutX(200);
		
		mainImg = new Image("res/sixLevel.jpg");
		
		mainViewImg = new ImageView(mainImg);	
		mainViewImg.setLayoutX(100);
		mainViewImg.setLayoutY(150);
		mainViewImg.setFitHeight(250);
		mainViewImg.setFitWidth(700);
		mainViewImg.setSmooth(true);
		mainViewImg.setCache(true);
		
		bLetterOne.setText("E");
		bLetterOne.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				secondLetter.setText("E");
				checkSix();
			}			
		});
		bLetterTwo.setText("I");
		bLetterThree.setText("D");
		bLetterThree.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				fourLetter.setText("D");
				checkSix();
			}			
		});
		bLetterFour.setText("J");
		bLetterFive.setText("R");
		bLetterSix.setText("A");
		bLetterSix.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				thirdLetter.setText("A");
				checkSix();
			}			
		});
		bLetterSeven.setText("F");
		bLetterEight.setText("H");
		bLetterEight.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				firstLetter.setText("H");
				checkSix();
			}			
		});
		
		root.getChildren().addAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter);
	}
	public void checkSix() {
		if(firstLetter.getText() == "H" && secondLetter.getText() == "E" && thirdLetter.getText() == "A" && fourLetter.getText() == "D") {
			root.getChildren().removeAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter, fiveLetter, bLetterNine, bLetterTen);
			gamingStage();
			sevenLevel();
		}
	}
	public void sevenLevel() {
		title.setText("Level: 7 out 10; What is it?");
		title.setLayoutX(200);
		
		mainImg = new Image("res/sevenLevel.jpg");
		
		mainViewImg = new ImageView(mainImg);	
		mainViewImg.setLayoutX(100);
		mainViewImg.setLayoutY(150);
		mainViewImg.setFitHeight(250);
		mainViewImg.setFitWidth(700);
		mainViewImg.setSmooth(true);
		mainViewImg.setCache(true);
		
		bLetterOne.setText("U");
		bLetterOne.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				thirdLetter.setText("U");
				checkSeven();
			}			
		});
		bLetterTwo.setText("H");
		bLetterThree.setText("R");
		bLetterThree.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				secondLetter.setText("R");
				checkSeven();
			}			
		});
		bLetterFour.setText("I");
		bLetterFour.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				fourLetter.setText("I");
				checkSeven();
			}			
		});
		bLetterFive.setText("T");
		bLetterFive.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				fiveLetter.setText("T");
				checkSeven();
			}			
		});
		bLetterSix.setText("N");
		bLetterSeven.setText("F");
		bLetterSeven.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				firstLetter.setText("F");
				checkSeven();
			}			
		});
		bLetterEight.setText("D");
		bLetterNine.setText("O");
		bLetterTen.setText("A");

		root.getChildren().addAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter, fiveLetter, bLetterNine, bLetterTen);
	}
	public void checkSeven() {
		if(firstLetter.getText() == "F" && secondLetter.getText() == "R" && thirdLetter.getText() == "U" && fourLetter.getText() == "I" && fiveLetter.getText() == "T") {
			root.getChildren().removeAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter, fiveLetter, bLetterNine, bLetterTen);
			gamingStage();
			eightLevel();
		}
	}
	public void eightLevel() {
		title.setText("Level: 8 out 10; What is it?");
		title.setLayoutX(200);
		
		mainImg = new Image("res/eightLevel.jpg");
		
		mainViewImg = new ImageView(mainImg);	
		mainViewImg.setLayoutX(100);
		mainViewImg.setLayoutY(150);
		mainViewImg.setFitHeight(250);
		mainViewImg.setFitWidth(700);
		mainViewImg.setSmooth(true);
		mainViewImg.setCache(true);
		
		bLetterOne.setText("S");
		bLetterOne.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				fourLetter.setText("S");
				checkEight();
			}			
		});
		bLetterTwo.setText("G");
		bLetterTwo.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				thirdLetter.setText("G");
				checkEight();
			}			
		});
		bLetterThree.setText("B");
		bLetterFour.setText("J");
		bLetterFive.setText("L");
		bLetterFive.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				firstLetter.setText("L");
				checkEight();
			}			
		});
		bLetterSix.setText("N");
		bLetterSeven.setText("F");
		bLetterEight.setText("E");
		bLetterEight.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				secondLetter.setText("E");
				checkEight();
			}			
		});

		
		root.getChildren().addAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter);
	}
	public void checkEight() {
		if(firstLetter.getText() == "L" && secondLetter.getText() == "E" && thirdLetter.getText() == "G" && fourLetter.getText() == "S") {
			root.getChildren().removeAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter, fiveLetter, bLetterNine, bLetterTen);
			gamingStage();
			nineLevel();
		}
	}
	public void nineLevel() {
		title.setText("Level: 9 out 10; What is it?");
		title.setLayoutX(200);
		
		mainImg = new Image("res/nineLevel.jpg");
		
		mainViewImg = new ImageView(mainImg);	
		mainViewImg.setLayoutX(100);
		mainViewImg.setLayoutY(150);
		mainViewImg.setFitHeight(250);
		mainViewImg.setFitWidth(700);
		mainViewImg.setSmooth(true);
		mainViewImg.setCache(true);
		
		bLetterOne.setText("T");
		bLetterOne.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				fourLetter.setText("T");
				checkNine();
			}			
		});
		bLetterTwo.setText("H");
		bLetterThree.setText("O");
		bLetterThree.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				secondLetter.setText("O");
				checkSeven();
			}			
		});
		bLetterFour.setText("J");
		bLetterFive.setText("R");
		bLetterFive.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				firstLetter.setText("R");
				checkNine();
			}			
		});
		bLetterSix.setText("N");
		bLetterSeven.setText("F");
		bLetterEight.setText("O");
		bLetterEight.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				thirdLetter.setText("O");
				checkNine();
			}			
		});
		
		
		root.getChildren().addAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter);
	}
	public void checkNine() {
		if(firstLetter.getText() == "R" && secondLetter.getText() == "O" && thirdLetter.getText() == "O" && fourLetter.getText() == "T") {
			root.getChildren().removeAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter);
			gamingStage();
			tenLevel();
		}
	}
	public void tenLevel() {
		title.setText("Level: 10 out 10; What is it?");
		title.setLayoutX(200);
		
		mainImg = new Image("res/tenLevel.jpg");
		
		mainViewImg = new ImageView(mainImg);	
		mainViewImg.setLayoutX(100);
		mainViewImg.setLayoutY(150);
		mainViewImg.setFitHeight(250);
		mainViewImg.setFitWidth(700);
		mainViewImg.setSmooth(true);
		mainViewImg.setCache(true);
		
		bLetterOne.setText("S");
		bLetterOne.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				firstLetter.setText("S");
				checkTen();
			}			
		});
		bLetterTwo.setText("H");
		bLetterThree.setText("E");
		bLetterThree.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				thirdLetter.setText("E");
				checkSeven();
			}			
		});
		bLetterFour.setText("J");
		bLetterFive.setText("R");
		bLetterSix.setText("N");
		bLetterSeven.setText("T");
		bLetterSeven.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				secondLetter.setText("T");
				checkTen();
			}			
		});
		bLetterEight.setText("M");
		bLetterEight.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) {
				fourLetter.setText("M");
				checkTen();
			}			
		});
		
		root.getChildren().addAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter);
	}
	public void checkTen() {
		if(firstLetter.getText() == "S" && secondLetter.getText() == "T" && thirdLetter.getText() == "E" && fourLetter.getText() == "M") {
			root.getChildren().removeAll(mainViewImg, bLetterSeven, bLetterEight, fourLetter);
			
		}
	}
}
