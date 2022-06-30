/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package exemplojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author mpisc
 */
public class FXMLMensagemController implements Initializable {

    @FXML
    private Label lbMensagemFinal;
    @FXML
    private TextField tfMensagem1;
    @FXML
    private TextField tfMensagem2;
    @FXML
    private Button btOk;
    @FXML
    private Button btLimpar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleBtOk(ActionEvent event) {
        String msg1 = tfMensagem1.getText();
        String msg2 = tfMensagem2.getText();
        String msgFinal = msg1 + " " + msg2;
        lbMensagemFinal.setText(msgFinal);
        //as linhas acima em uma instrução só!!
        //lbMensagemFinal.setText(tfMensagem1.getText() + "  " + tfMensagem2.getText());
    }

    @FXML
    private void handleBtLimpar(ActionEvent event) {
        tfMensagem1.setText("");
        tfMensagem2.setText("");
        lbMensagemFinal.setText("");
        tfMensagem1.requestFocus();
    }
    
}
