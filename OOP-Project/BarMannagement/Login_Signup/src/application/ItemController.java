package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ItemController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    }

    @FXML
    private Button AddBtn;

    @FXML
    private ImageView Img;

    @FXML
    private Label NameLabel;

    @FXML
    private Label PriceLabel;

    @FXML
    private Label TypeLabel;
}