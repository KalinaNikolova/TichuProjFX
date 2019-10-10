package DarkTichu.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

public class ControlArea extends HBox {
//	private DeckLabel lblDeck = new DeckLabel();
	private Region spacer = new Region(); // Empty spacer
	Button btnPass = new Button("Pass");
	Button btnStart = new Button("Start");
	
	
	Label lblWinner = new Label("Winner: ");

	public ControlArea() {
		super(); // Always call super-constructor first !!

		this.getChildren().addAll( btnPass,btnStart, lblWinner);

		HBox.setHgrow(spacer, Priority.ALWAYS); // Use region to absorb resizing
		this.setId("controlArea"); // Unique ID in the CSS
	}

//	public void linkDeck(DeckOfCards deck) {
//		lblDeck.setDeck(deck);
//	}
}
