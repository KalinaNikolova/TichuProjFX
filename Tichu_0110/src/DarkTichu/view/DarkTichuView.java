package DarkTichu.view;

import DarkTichu.model.Card;
import DarkTichu.model.Card.Rank;
import DarkTichu.model.Card.Suit;
import DarkTichu.model.DarkTichuModel;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//public class DarkTichuView {
//	private DarkTichuModel model;
//	private Stage primaryStage;
//	private VBox root;
//	private TopMenu topMenu;
//	private ControlArea controlArea;
//	private BorderPane playersPane;
//	private HBox topBox;
//	// center cards
//	
//	public DarkTichuView(Stage primaryStage, DarkTichuModel model) {
//		this.model = model;
//		this.primaryStage = primaryStage;
//		topMenu= new TopMenu();
//		root = new VBox();
//		controlArea = new ControlArea();
//		playersPane = new BorderPane();
//		topBox= new HBox();
//		
//		
//		root.getChildren().addAll(topMenu.getMenuBar(),playersPane, controlArea);
//		topBox.getChildren().addAll(new Label("Now Playing: ---"),new Label("Team Player") );
//		playersPane.setTop(topBox);
//		playersPane.setBottom(new Label("Main Player"));
//		playersPane.setLeft(new Label ("Left Player"));
//		playersPane.setRight(new Label ("Right Player"));
//		playersPane.setCenter(new TextArea());
//		
//		
//		
//		inicialScene();
//		
//		
//	}
//	// Create inicial players Scene
//	public void inicialScene() {
//		Scene scene = new Scene(root,1100,800);
//		scene.getStylesheets().add(getClass().getResource("blue.css").toExternalForm());
//		primaryStage.setTitle("Tichu");
//		primaryStage.setScene(scene);
//		primaryStage.show();
//	}
//
//	
//	// All Getters & Setters
//	
//
//	public VBox getRoot() {
//		return root;
//	}
//
//	public BorderPane getPlayersPane() {
//		return playersPane;
//	}
//	public void setPlayersPane(BorderPane playersPane) {
//		this.playersPane = playersPane;
//	}
//	public TopMenu getTopMenu() {
//		return topMenu;
//	}
//
//	public void setTopMenu(TopMenu topMenu) {
//		this.topMenu = topMenu;
//	}
//
//
//
//	public ControlArea getControlArea() {
//		return controlArea;
//	}
//
//	public void setControlArea(ControlArea controlArea) {
//		this.controlArea = controlArea;
//	}
//
//
//
//	public DarkTichuModel getModel() {
//		return model;
//	}
//
//	public void setModel(DarkTichuModel model) {
//		this.model = model;
//	}
//
//	public Stage getPrimaryStage() {
//		return primaryStage;
//	}
//
//	public void setPrimaryStage(Stage primaryStage) {
//		this.primaryStage = primaryStage;
//	}
//	public MenuItem getAboutItem() {
//		return topMenu.about;
//	}
//	public MenuItem getGenRulesItem() {
//		return topMenu.genRuls;
//	}
//	public MenuItem getHandsItem() {
//		return topMenu.hands;
//	}
//	public MenuItem getNewGameItem() {
//		return topMenu.newGame;
//	}
//	public MenuItem getExitItem() {
//		return topMenu.exit;
//	}
//	
//}












public class DarkTichuView {
	private DarkTichuModel model;
	private Stage primaryStage;
	private BorderPane root;
	private TopMenu topMenu;
	private BorderPane bpCenter;
	private ControlArea controlArea;
	private BorderPane bpCenter2;
	private HBox mainPlayerHb;
	private VBox playerLeft;
	private HBox playerTop;
	private VBox playerRight;
	
	public DarkTichuView(Stage primaryStage, DarkTichuModel model) {
		this.model = model;
		this.primaryStage = primaryStage;
		topMenu= new TopMenu();
		root = new BorderPane();
		bpCenter= new BorderPane();
		controlArea = new ControlArea();
		playerTop= new HBox();
		bpCenter2 = new BorderPane();
		mainPlayerHb = new HBox();
		playerLeft= new VBox();
		playerRight = new VBox();
		
		playerLeft.getChildren().add(setPlayersImage());
		playerRight.getChildren().add(new Label ("Right Player"));
		playerTop.getChildren().addAll(new Label(""),new Label ("Team Player"));
		mainPlayerHb.getChildren().add(new Label("Main Player"));
		
		playerTop.setAlignment(Pos.CENTER);
		playerLeft.setAlignment(Pos.CENTER_LEFT);
		playerRight.setAlignment(Pos.CENTER_RIGHT);
		mainPlayerHb.setAlignment(Pos.TOP_CENTER);
		
		playerTop.getChildren().add(new Label("Now playing: ---"));
		
		
		root.setTop(topMenu.getMenuBar());
		root.setCenter(bpCenter);
		root.setBottom(controlArea);
		bpCenter.setTop(playerTop);
		bpCenter.setCenter(bpCenter2);
		bpCenter.setBottom(mainPlayerHb);
		bpCenter2.setLeft(playerLeft);
		bpCenter2.setRight(playerRight);
		//bpCenter2.setCenter(new Region());
	
		inicialScene();
		
		
	}
	public CardLabel setPlayersImage() {
		CardLabel card= new CardLabel();
		card.setCard(new Card(Suit.Pagodas, Rank.Two));
		return card;
		
	}
//		Image image = new Image(
//				getClass().getClassLoader().getResourceAsStream("dark_Tichu/images/SW_Queen.jpg"));
//		ImageView imv = new ImageView(image);
//		imv.fitWidthProperty().bind(this.widthProperty());
//		imv.fitHeightProperty().bind(this.heightProperty());
//		this.setGraphic(imv);
//		return imv;

	
	
	// Create inicial players Scene
	public void inicialScene() {
		Scene scene = new Scene(root,1100,800);
		scene.getStylesheets().add(getClass().getResource("blue.css").toExternalForm());
		primaryStage.setTitle("Tichu");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	// All Getters & Setters

	public BorderPane getRoot() {
		return root;
	}

	public TopMenu getTopMenu() {
		return topMenu;
	}

	public void setTopMenu(TopMenu topMenu) {
		this.topMenu = topMenu;
	}

	public BorderPane getBpCenter() {
		return bpCenter;
	}

	public ControlArea getControlArea() {
		return controlArea;
	}

	public void setControlArea(ControlArea controlArea) {
		this.controlArea = controlArea;
	}

	public HBox getPlayerTop() {
		return playerTop;
	}

	public void setPlayerTop(HBox playerTop) {
		this.playerTop = playerTop;
	}

	public BorderPane getBpCenter2() {
		return bpCenter2;
	}


	public HBox getMainPlayerHb() {
		return mainPlayerHb;
	}

	public void setMainPlayerHb(HBox mainPlayerHb) {
		this.mainPlayerHb = mainPlayerHb;
	}

	public VBox getPlayerLeft() {
		return playerLeft;
	}

	public void setPlayerLeft(VBox playerLeft) {
		this.playerLeft = playerLeft;
	}

	public VBox getPlayerRight() {
		return playerRight;
	}

	public void setPlayerRight(VBox playerRight) {
		this.playerRight = playerRight;
	}

	public DarkTichuModel getModel() {
		return model;
	}

	public void setModel(DarkTichuModel model) {
		this.model = model;
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	public MenuItem getAboutItem() {
		return topMenu.about;
	}
	public MenuItem getGenRulesItem() {
		return topMenu.genRuls;
	}
	public MenuItem getHandsItem() {
		return topMenu.hands;
	}
	public MenuItem getNewGameItem() {
		return topMenu.newGame;
	}
	public MenuItem getExitItem() {
		return topMenu.exit;
	}
	
}


	