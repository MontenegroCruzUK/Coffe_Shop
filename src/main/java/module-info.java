module com.montenegro.coffe_shop {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	
	opens com.montenegro.coffe_shop to javafx.fxml;
	exports com.montenegro.coffe_shop;
	exports com.montenegro.coffe_shop.controller;
	opens com.montenegro.coffe_shop.controller to javafx.fxml;
}