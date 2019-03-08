package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class EclipseGUI {

    @FXML
    private Pane sky;

    @FXML
    private Circle sun;

    @FXML
    private Circle moon;

    @FXML
    private Circle crater1;

    @FXML
    private Circle crater3;

    @FXML
    private Circle crater2;
    
    private final static int[] ILLUMINATED = new int[] {255, 249, 139};
    
    private final static double INCREMENT = 10.0;

    @FXML
    public void forward(ActionEvent event) {
    	move(INCREMENT);
    }
    
    @FXML
    public void backward(ActionEvent event) {
    	move(-INCREMENT);
    }
    
    private void move(double inc) {
    	moon.setLayoutX(moon.getLayoutX()+inc);
    	crater1.setLayoutX(crater1.getLayoutX()+inc);
    	crater2.setLayoutX(crater2.getLayoutX()+inc);
    	crater3.setLayoutX(crater3.getLayoutX()+inc);
    	
    	double diff = Math.abs(sun.getLayoutX()-moon.getLayoutX());
    	double diameter = moon.getRadius()*2;
    	if(diff<=diameter) {
    		double pos = diff/diameter;
    		int r = (int)(ILLUMINATED[0]*pos);
    		int g = (int)(ILLUMINATED[1]*pos);
    		int b = (int)(ILLUMINATED[2]*pos);
    		sky.setStyle("-fx-background-color:rgb("+r+","+g+","+b+");");
    	}    	
    }
}
