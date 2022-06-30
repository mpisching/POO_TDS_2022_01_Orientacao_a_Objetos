/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mypackage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/*
VM Option
--module-path "C:\JavaTools\JavaFX-openjfx-18.0.1_windows-x64_bin-sdk\javafx-sdk-18.0.1\lib" --add-modules=javafx.controls,javafx.fxml
*/

/**
 * FXML Controller class
 *
 * @author mpisc
 */
public class FXMLController implements Initializable {

    
        @FXML
    private Button btnOk;

    @FXML
    private Label lblMessage;

    @FXML
    void handleBtnOk(ActionEvent event) {
          lblMessage.setText("o botão foi pressionado");
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
