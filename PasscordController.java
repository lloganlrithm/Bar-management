package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;


public class PasscordController implements Initializable{	
	
	private Stage stage;
	private Scene scene;
	
	@FXML
	private Button back;
	
	@FXML
	private Button submit;
	
	@FXML
	private PasswordField passcord;
	
	@FXML
	private Label show;
	
	@FXML
	public void BackButtonOnAction(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			scene = new Scene(root);
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void SubmitButtonOnAction(ActionEvent event) {
		String Passcord = passcord.getText();
		if (Passcord.isEmpty()) {
			show.setText("Please enter the passcord");
			show.setVisible(true);
		} else {
			if ("admin0123".equals(Passcord)) {
				try {
					Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
					scene = new Scene(root);
					stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
					stage.setScene(scene);
					stage.show();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			} else {
				show.setText("Passcord is incorrect");
				show.setVisible(true);
			}
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
