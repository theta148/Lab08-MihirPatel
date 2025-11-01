/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08.mihirpatel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML private RadioButton blackRadioButton;
    @FXML private RadioButton blueRadioButton;
    @FXML private RadioButton redRadioButton;
    @FXML private RadioButton greenRadioButton;
    @FXML private RadioButton smallRadioButton;
    @FXML private RadioButton mediumRadioButton;
    @FXML private RadioButton largeRadioButton;
    @FXML private Button undoButton;
    @FXML private Button clearBtn;
    @FXML private VBox colorBox;
    @FXML private VBox penSizeBox;
    @FXML private ToggleGroup colorToggleGroup;
    @FXML private ToggleGroup sizeToggleGroup;
    @FXML private Pane drawingAreaPane;
   
    private PenSize radius = PenSize.MEDIUM;
    private Paint brushColor = Color.BLACK;
    
    @FXML
    void clearButtonPressed(ActionEvent e) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void colorRadioButtonSelected(ActionEvent e) {
        Toggle selectedToggle = colorToggleGroup.getSelectedToggle();

        if (selectedToggle != null) {
            Object userData = selectedToggle.getUserData();
            brushColor = (Color) userData;
        }
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent e) {
        Circle circle = new Circle(e.getX(), e.getY(), radius.getRadius(), brushColor);
        
        drawingAreaPane.getChildren().add(circle);
    }

    @FXML
    void sizeRadioButtonSelected(ActionEvent e) {
        Toggle selectedToggle = sizeToggleGroup.getSelectedToggle();

        if (selectedToggle != null) {
            Object userData = selectedToggle.getUserData();
            radius = (PenSize) userData;
        }
    }

    @FXML
    void undoButtonPressed(ActionEvent e) {
        drawingAreaPane.getChildren().removeLast();
    }
    
    private enum PenSize {
        SMALL(2),
        MEDIUM(4),
        LARGE(6);
        
        private final int radius;
        
        PenSize(int radius) {this.radius = radius;}
        
        public int getRadius() {return radius;}
    }
    
    public void initialize() {
        blackRadioButton.setUserData(Color.BLACK);
        redRadioButton.setUserData(Color.RED);
        blueRadioButton.setUserData(Color.BLUE);
        greenRadioButton.setUserData(Color.GREEN);
        smallRadioButton.setUserData(PenSize.SMALL);
        mediumRadioButton.setUserData(PenSize.MEDIUM);
        largeRadioButton.setUserData(PenSize.LARGE);
    }
}
