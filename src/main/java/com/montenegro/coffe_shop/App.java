package com.montenegro.coffe_shop;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
	@Override
	public void start (Stage stage) {
		try {
			
			FXMLLoader fxmlLoader = new FXMLLoader (App.class.getResource ("view/Login_View.fxml"));
			Scene scene = new Scene (fxmlLoader.load ());
			stage.setTitle ("Coffe Shop");
			stage.setMinHeight (400);
			stage.setMinWidth (600);
			stage.setResizable (false);
			stage.setScene (scene);
			stage.show ();
		} catch (IOException e) {
			System.out.println ("Error en la ventana"+ e.getMessage ());
		}
	}
	
	public static void main (String[] args) {
		launch ();
	}
}