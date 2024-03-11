package com.montenegro.coffe_shop.model.login;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GivenEmploye {
	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public ObservableList questionList () {
		String[] question = {"What is your favorite Color?", "What is your favorite food?", "What is your birth date?"};
		List<String> listQuestions = new ArrayList<> (Arrays.asList (question));
		return FXCollections.observableArrayList (listQuestions);
	}
}
