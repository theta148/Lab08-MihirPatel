/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08.mihirpatel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PainterController {

    @FXML
    private RadioButton blackRadioButton;

    @FXML
    private RadioButton blueRadioButton;

    @FXML
    private VBox colorBox;

    @FXML
    private ToggleGroup colorToggleGroup;

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private RadioButton greenRadioButton;

    @FXML
    private RadioButton largeRadioButton;

    @FXML
    private RadioButton mediumRadioButton;

    @FXML
    private VBox penSizeBox;

    @FXML
    private RadioButton redRadioButton;

    @FXML
    private ToggleGroup sizeToggleGroup;

    @FXML
    private RadioButton smallRadioButton;

    @FXML
    void clearButtonPressed(ActionEvent event) {

    }

    @FXML
    void colorRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {

    }

    @FXML
    void sizeRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void undoButtonPressed(ActionEvent event) {

    }
}
