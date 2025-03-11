package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterController implements Initializable{
	private Stage stage;
	private Scene scene;
	
	@FXML
	private Button back;
	
	@FXML
	private TextField username;
	
	@FXML
	private TextField email;
	
	@FXML
	private TextField phone;
	
	@FXML
	private TextField password;
	
	@FXML
	public void BackButtonOnAction(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			scene = new Scene(root);
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	@FXML
	public void CreateAccountOnAction(ActionEvent event) {
		String fileName = ".\\src\\application\\Users.db";
		//check if username,email,phone,password is empty 
		if (username.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty() || password.getText().isEmpty()) {
			System.out.println("Please fill all informations");
		} else {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));	
				writer.newLine();
				writer.append(username.getText() + "," + email.getText() + "," + phone.getText() + "," + password.getText());
			
				writer.close();
				Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
				scene = new Scene(root);
				stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
