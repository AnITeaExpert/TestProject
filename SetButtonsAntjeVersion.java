package lecture01.kissExercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


/**
 * This application contains six buttons. The text in each button has to be set according to the
 * values from an array, which range from 1 to 6. These values are used to set the text in the
 * buttons. The original program set images, but the idea is the same.
 * 
 * The code you should improve:
 * 
 * - How the buttons are declared and initialized
 * 
 * - The contents of the method setButtons()
 */

public class SetButtonsAntjeVersion extends Application {

	  public static void main(String[] args) {
	        launch();
	    }

	  private static final int NUM_BUTTONS = 6;
	  
	    @Override
	    public void start(Stage primaryStage) throws Exception {
	    	HBox root = new HBox();
	    	MyButton [] buttons = new MyButton [NUM_BUTTONS];
	    	for (int i = 0; i < NUM_BUTTONS; i++) {
	    		buttons[i] = new MyButton(i);
	    		}
	        
	    	root.getChildren().addAll(buttons);
	    	
	        Scene scene = new Scene(root);
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("KISS example: SetButtons");
	        primaryStage.show();
	    }

	    
	    private static class MyButton extends Button {
			public MyButton(int id) {
				super();
				int number = (int) (Math.random() * NUM_BUTTONS + 1);
				if (number == 1) setText("One");
				if (number == 2) setText("Two");
				if (number == 3) setText("Three");
				if (number == 4) setText("Four");
				if (number == 5) setText("Five");
				if (number == 6) setText("Six");
				}		
		}
}
