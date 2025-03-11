package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.TreeMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable{
	
	private Stage stage;
	private Scene scene;
	private String line;
	private String [] fields;
	
	ObservableList<User> userList = FXCollections.observableArrayList();
	TreeMap<String,User> userTree = new TreeMap<String, User>();
	
	@FXML
	private Button Login;
	
	@FXML
	private Button CreateAccounts;
	
	@FXML
	private TextField username;
	
	@FXML
	private PasswordField password;
	
	@FXML
	private Label show;
	
	@FXML
	private void readDataFromFile() {
		String fileName = ".\\src\\application\\Users.db";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			User user;
			while((line=reader.readLine())!=null) {
				fields = line.split(","); //fields[0]=username, fields[1]=email , fields[2]=phone , fields[3]=password
				user = new User(fields[0],fields[1],fields[2],fields[3]);
				userTree.put(fields[0], user);
			}
		} catch(Exception e) {
			e.printStackTrace();   
		}
	}
	
	@FXML
	public void LoginButtonOnAction (ActionEvent event) {
		String Username = username.getText();
		String Passoword = password.getText();
		//check username exists in userTree
		if(userTree.containsKey(Username)) {
			User user = userTree.get(Username);
			//compare enter password with password in userTree
			if (user.getPassword().equals(Passoword)) {
				try {
					Parent root = FXMLLoader.load(getClass().getResource("MenuFood.fxml"));
					scene = new Scene(root);
					stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
					stage.setScene(scene);
					stage.show();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				show.setText("Password is incorrect");
				show.setVisible(true);
			}
		} else {
			show.setText("Please fill all information");
			show.setVisible(true);
			System.out.println("Please fill all information");
		}
	}
	
	@FXML
	public void CreateAccountOnAction(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Passcord.fxml"));
			scene = new Scene(root);
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		readDataFromFile();
	}
	
}
