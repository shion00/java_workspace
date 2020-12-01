package test;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppMain extends Application{
	
	public AppMain() {

	}
	
	
	public void start(Stage stage) throws Exception {
		VBox parent=new VBox();
		
		Scene s=new Scene(parent);
		
		Button bt=new Button("나버튼");
		javafx.scene.control.TextField t=new javafx.scene.control.TextField("test");
		
		bt.setPrefWidth(200);
		bt.setPrefHeight(40);
		
		parent.getChildren().add(bt);
		parent.getChildren().add(t);
		
		stage.setScene(s);
		
		
		bt.setOnAction((e)->{
			System.out.println("클릭했어?");
		});
		
		
		stage.setMaxWidth(500);
		stage.setMaxHeight(500);
		stage.show();
	}
	
	public void init() throws Exception {
	}
	
	public void stop() throws Exception {
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
