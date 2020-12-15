package jojo;
import java.awt.Button;
import java.awt.Label;

import javafx.application.Application;
public class Fx2 extends Application{
	public void start(Stage primaryStage) throws Exceptioin{
		VBox root = new VBox();
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		Label label = new Label();
		label.setText("Hello javafx");
		Button button = new Button();
		button.setText("È®ÀÎ");
		button.setOnAction(event->Platform);
	}
	public static void main(String[] args) {
		Launch(args);
	}
}
