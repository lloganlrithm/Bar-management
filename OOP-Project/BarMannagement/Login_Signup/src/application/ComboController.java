package application;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class ComboController {
	
	    @FXML
	    private ComboBox<Integer> quantityComboBox;

	    @FXML
	    private Button decreaseBtn, increaseBtn;

	    private final int MAX_QUANTITY = 10;

	    @FXML
	    private void initialize() {
	        //ComboBox เป็น 1-10
	        quantityComboBox.setItems(FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	        quantityComboBox.setValue(1); // ตั้งค่าเริ่มต้นเป็น 1
	        updateButtonState(); // อัปเดตสถานะปุ่ม
	    }

	    @FXML
	    private void increaseValue() {
	        int current = quantityComboBox.getValue();
	        if (current < MAX_QUANTITY) {
	            quantityComboBox.setValue(current + 1);
	            updateButtonState();
	        }
	    }

	    @FXML
	    private void decreaseValue() {
	        int current = quantityComboBox.getValue();
	        if (current > 1) {
	            quantityComboBox.setValue(current - 1);
	            updateButtonState();
	        }
	    }

	    @FXML
	    private void onQuantityChanged() {
	        updateButtonState(); //ค่าจาก ComboBox ให้เช็กปุ่ม +/- ด้วย
	    }

	    private void updateButtonState() {
	        int current = quantityComboBox.getValue();
	        decreaseBtn.setDisable(current == 1);
	        increaseBtn.setDisable(current == MAX_QUANTITY);
	    }
	}

