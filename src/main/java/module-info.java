module com.montenegro.coffe_shop {
	requires javafx.controls;
	requires javafx.fxml;
	
	
	opens com.montenegro.coffe_shop to javafx.fxml;
	exports com.montenegro.coffe_shop;
}