package com.montenegro.coffe_shop.model;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class Message {
	public static void confirmation (String titulo, String mensaje) {
		Alert alert = new Alert (Alert.AlertType.CONFIRMATION);
		alert.setTitle (titulo);
		alert.setHeaderText (null);
		alert.setContentText (mensaje);
		alert.showAndWait ();
	}
	
	public static void warning (String titulo, String mensaje) {
		Alert alert = new Alert (Alert.AlertType.WARNING);
		alert.setTitle (titulo);
		alert.setHeaderText (null);
		alert.setContentText (mensaje);
		alert.showAndWait ();
	}
	
	public static void error (String titulo, String mensaje) {
		Alert alert = new Alert (Alert.AlertType.ERROR);
		alert.setTitle (titulo);
		alert.setHeaderText (null);
		alert.setContentText (mensaje);
		alert.showAndWait ();
	}
	
	public static Boolean information (String titulo, String mensaje) {
		Alert alert = new Alert (Alert.AlertType.INFORMATION);
		alert.setTitle (titulo);
		alert.setHeaderText (null);
		alert.setContentText (mensaje);
		Optional<ButtonType> result = alert.showAndWait ();
		return result.isPresent () && result.get () == ButtonType.OK;
	}
}
