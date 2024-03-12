package com.montenegro.coffe_shop.controller;


import com.montenegro.coffe_shop.model.Message;
import com.montenegro.coffe_shop.model.login.Employee;
import com.montenegro.coffe_shop.model.login.GivenEmployee;
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
	Employee employee = new Employee ();
	GivenEmployee givenEmployee = new GivenEmployee ();
	@FXML
	private AnchorPane anchP_FP_QuestionForm;
	
	
	@Override
	public void initialize (URL location, ResourceBundle resources) {
		cb_Rc_Question.setItems (givenEmployee.questionList ());
		
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
	
	// ============ Star Registro ============
	@FXML
	public void register (ActionEvent event) {
		String username = txt_Rc_Username.getText ();
		String password = txt_Rc_Password.getText ();
		String question = (String) cb_Rc_Question.getValue ();
		String answer = txt_Rc_Answer.getText ();
		
		if (question == null) {
			System.out.println ("Por favor, selecciona una pregunta.");
		} else if (areAllFieldsFilled (username, password, answer, question)) {
			if (isValidInput (username) && isValidInput (answer)) {
				System.out.println ("Todos los campos están llenos y son válidos.");
				employee.setUsername (username);
				employee.setPassword (password);
				employee.setQuestion (question);
				employee.setAnswer (answer);
				
				if (givenEmployee.registerUser (employee)) {
					Message.information ("Usuario", "Successfully registered Account!");
					clearFields ();
					carrousel ();
					
				}
				
			} else {
				handleInvalidFields (username, answer);
			}
		} else {
			System.out.println ("Fallo en los campos");
		}
	}
	
	private void carrousel () {
		TranslateTransition slider = new TranslateTransition ();
		slider.setNode (anchP_SideForm);
		slider.setToX (0);
		slider.setDuration (Duration.seconds (0.5));
		
		slider.setOnFinished ((ActionEvent e) -> {
			btn_Side_AllReadyHave.setVisible (false);
			btn_Side_Create.setVisible (true);
		});
		slider.play ();
	}
	
	private void clearFields () {
		txt_Rc_Username.setText ("");
		txt_Rc_Password.setText ("");
		cb_Rc_Question.getSelectionModel ().clearSelection ();
		txt_Rc_Answer.setText ("");
	}
	
	//varargs (String... fields)
	private boolean areAllFieldsFilled (String... fields) {
		for (String field : fields) {
			if (field.isEmpty ()) {
				return false;
			}
		}
		return true;
	}
	
	private void handleInvalidFields (String username, String answer) {
		if (! isValidInput (username)) {
			System.out.println ("El nombre de usuario contiene caracteres inesperados.");
			txt_Rc_Username.clear ();
		}
		if (! isValidInput (answer)) {
			System.out.println ("La respuesta contiene caracteres inesperados.");
			txt_Rc_Answer.clear ();
		}
	}
	
	private boolean isValidInput (String input) {
		// Verificar si el input contiene solo letras (sin caracteres especiales)
		return input.matches ("[a-zA-Z]+");
	}
	// ============ End Registro ============
	
	@FXML
	public void switchForgotPass (ActionEvent event) {
	
	}
	
	@FXML
	public void switchForm (ActionEvent event) {
		TranslateTransition slider = new TranslateTransition (Duration.seconds (0.5));
		slider.setNode (anchP_SideForm);
		if (event.getSource () == btn_Side_Create) {
			slider.setToX (300);
			
			slider.setOnFinished (e -> {
				btn_Side_AllReadyHave.setVisible (true);
				btn_Side_Create.setVisible (false);
				
				anchP_FP_QuestionForm.setVisible (false);
				anchP_LC_LoginForm.setVisible (true);
				anchP_NP_NewPassForm.setVisible (false);
			});
		} else if (event.getSource () == btn_Side_AllReadyHave) {
			slider.setToX (0);
			slider.setOnFinished (e -> {
				btn_Side_AllReadyHave.setVisible (false);
				btn_Side_Create.setVisible (true);
				
				anchP_FP_QuestionForm.setVisible (false);
				anchP_LC_LoginForm.setVisible (true);
				anchP_NP_NewPassForm.setVisible (false);
			});
		}
		slider.play ();
		
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
	private ComboBox<String> cb_Fp_Question;
	
	@FXML
	private ComboBox<String> cb_Rc_Question;
	
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