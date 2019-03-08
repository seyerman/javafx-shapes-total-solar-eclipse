package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class EclipseGUI {

    @FXML
    private Circle moon;

    @FXML
    private Circle crater1;

    @FXML
    private Circle crater3;

    @FXML
    private Circle crater2;
    
    private final static double INCREMENT = 10.0;

    @FXML
    public void move(ActionEvent event) {
    	moon.setLayoutX(moon.getLayoutX()+INCREMENT);
    	crater1.setLayoutX(crater1.getLayoutX()+INCREMENT);
    	crater2.setLayoutX(crater2.getLayoutX()+INCREMENT);
    	crater3.setLayoutX(crater3.getLayoutX()+INCREMENT);
    }
}
