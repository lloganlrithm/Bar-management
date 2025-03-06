package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import model.Cocktail;

public class MenuController {
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button menu_Add;

    @FXML
    private AnchorPane menu_From;

    @FXML
    private GridPane menu_GridPane;

    @FXML
    private Label menu_Name;

    @FXML
    private Button menu_PayBtn;

    @FXML
    private Label menu_Price;

    @FXML
    private ComboBox<?> menu_Quantity;

    @FXML
    private ScrollPane menu_ScollPane;

    @FXML
    private Button menu_Sub;

    @FXML
    private ListView<?> menu_TableView;

    @FXML
    private Label menu_Total;

    private List<Cocktail> cocktails = new ArrayList<>();

    private List<Cocktail> getData() {
        List<Cocktail> cocktails = new ArrayList<>();
        Cocktail cocktail = new Cocktail(); 
        cocktails.add(cocktail);
        return cocktails;
    }
	        @FXML
	    void initialize() {

	    }
			public List<Cocktail> getCocktails() {
				return cocktails;
			}
			public void setCocktails(List<Cocktail> cocktails) {
				this.cocktails = cocktails;
			}
	    
	    

	}

