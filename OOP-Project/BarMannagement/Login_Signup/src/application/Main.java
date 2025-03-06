package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	    try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
	        Parent root = loader.load();
	        Scene scene = new Scene(root,900,600);
	        
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("BarMangement");
	        primaryStage.show();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    }
	    
	    public void start1(Stage primaryStage) {
	        // รายการเครื่องดื่ม
	        ObservableList<String> cocktails = FXCollections.observableArrayList(
	                "Martini - 140.-", 
	                "Old Fashioned - 140.-", 
	                "Mojito - 120.-", 
	                "Pina Colada - 120.-"
	        );

	        // ListView แสดงรายการ
	        ListView<String> listView = new ListView<>(cocktails);
	        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

	        // ปุ่มกดเลือก
	        Button addButton = new Button("Add to Cart");
	        addButton.setOnAction(_ -> {
	            ObservableList<String> selectedItems = listView.getSelectionModel().getSelectedItems();
	            System.out.println("Selected Cocktails: " + selectedItems);
	        });

	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	



	}

	