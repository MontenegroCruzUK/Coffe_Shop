package com.montenegro.coffe_shop.controller;


import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Login_Cotroller implements Initializable {
	@FXML
	private AnchorPane anchP_FP_QuestionForm;
	
	
	@Override
	public void initialize (URL location, ResourceBundle resources) {
	
	}
	
	@FXML
	public void backToLoginForm (ActionEvent event) {
	
	}
	
	@FXML
	public void backToQuestionForm (ActionEvent event) {
	
	}
	
	@FXML
	public void changePassword (ActionEvent event) {
	
	}
	
	@FXML
	public void login (ActionEvent event) {
	
	}
	
	@FXML
	public void proceed (ActionEvent event) {
	
	}
	
	@FXML
	public void register (ActionEvent event) {
	
	}
	
	@FXML
	public void switchForgotPass (ActionEvent event) {
	
	}
	
	@FXML
	public void switchForm (ActionEvent event) {
	
	
	}
	
	//Variables
	@FXML
	private AnchorPane anchP_LC_LoginForm;
	
	@FXML
	private AnchorPane anchP_NP_NewPassForm;
	
	@FXML
	private AnchorPane anchP_RC_SingUpForm;
	
	@FXML
	private AnchorPane anchP_SideForm;
	
	@FXML
	private Button btn_Fp_Back;
	
	@FXML
	private Button btn_Fp_Proceed;
	
	@FXML
	private Button btn_Lc_Login;
	
	@FXML
	private Button btn_Np_Back;
	
	@FXML
	private Button btn_Np_ChangePass;
	
	@FXML
	private Button btn_Rc_SingUp;
	
	@FXML
	private Button btn_Side_AllReadyHave;
	
	@FXML
	private Button btn_Side_Create;
	
	@FXML
	private ComboBox<?> cb_Fp_Question;
	
	@FXML
	private ComboBox<?> cb_Rc_Question;
	
	@FXML
	private TextField txt_Fp_Answer;
	
	@FXML
	private TextField txt_Fp_Username;
	
	@FXML
	private PasswordField txt_Lc_Password;
	
	@FXML
	private TextField txt_Lc_Username;
	
	@FXML
	private TextField txt_Np_ConfirPassword;
	
	@FXML
	private TextField txt_Np_Password;
	
	@FXML
	private TextField txt_Rc_Answer;
	
	@FXML
	private TextField txt_Rc_Password;
	
	@FXML
	private TextField txt_Rc_Username;
}