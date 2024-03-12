package com.montenegro.coffe_shop.model.login;

import com.montenegro.coffe_shop.model.DB_Connector;
import com.montenegro.coffe_shop.model.Message;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Date;

public class GivenEmployee {
	private Connection connection;
	
	private PreparedStatement ps;
	private ResultSet rs;
	
	public ObservableList questionList () {
		String[] question = {"What is your favorite Color?", "What is your favorite food?", "What is the name of your first pet?"};
		List<String> listQuestions = new ArrayList<> (Arrays.asList (question));
		return FXCollections.observableArrayList (listQuestions);
	}
	
	public boolean registerUser (Employee employee) {
		try {
			Date date = new Date ();
			java.sql.Date sqlDate = new java.sql.Date (date.getTime ());
			String checkUsername =
				"SELECT username FROM employees WHERE username = '" + employee.getUsername () + "'";
			connection = DB_Connector.getConnection ();
			ps = connection.prepareStatement (checkUsername);
			rs = ps.executeQuery ();
			if (rs.next ()) {
				Message.error ("Error Message", employee.getUsername () + " is already take");
				return false;
			} else if (employee.getPassword ().length () < 8) {
				Message.error ("Error Message", "Invalid Password, atlas 8 characters are needed");
				return false;
			} else {
				String query =
					"INSERT INTO employees (username, password, question, answer, date) VALUES (?,?,?,?," + "?)";
				ps = connection.prepareStatement (query);
				
				ps.setString (1, employee.getUsername ());
				ps.setString (2, employee.getPassword ());
				ps.setString (3, employee.getQuestion ());
				ps.setString (4, employee.getAnswer ());
				ps.setString (5, String.valueOf (sqlDate));
				
				ps.executeUpdate ();
				return true;
			}
		} catch (SQLException e) {
			System.out.println ("Error al registrar el usuario: " + e.toString ());
			return false;
		}
	}
}
