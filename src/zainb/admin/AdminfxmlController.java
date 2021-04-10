/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zainb.admin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rimeh
 */
public class AdminfxmlController implements Initializable {
    
    @FXML
    private AnchorPane root;
    @FXML
    private Button resto;

     @FXML
    private void UserAcceuilAction(ActionEvent event)  {
            
    try {   
       
       AnchorPane pane   = FXMLLoader.load(getClass().getResource("/zainb/admin/Resto.fxml"));
  
Stage stage = new Stage();
stage.setScene(new Scene(pane));
stage.show();
    } catch(Exception e)
    {
     System.out.println("errur");
      System.out.println("errur");
}
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
