/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zainb.admin;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import zainb.connection.ConnectDB;
import zainb.entity.restaurant;
import zainb.service.restaurantservice;

/**
 * FXML Controller class
 *
 * @author Rimeh
 */
public class RestoController implements Initializable {
Connection c = ConnectDB.getInstance().getConnection();
restaurantservice srv = new restaurantservice();
    @FXML
    private TableView<restaurant> tabl;
        ObservableList<restaurant> oblist = FXCollections.observableArrayList();
         @FXML
    private TableColumn<restaurant, String> Nom;
    @FXML
    private TableColumn<restaurant, String> lieuR;
    @FXML
    private TableColumn<restaurant, String> specialite;
   

    restaurant u = new restaurant();
@FXML
 private Button home;
 @FXML
    private void home(ActionEvent event)  {
            
    try {   
       
       AnchorPane pane   = FXMLLoader.load(getClass().getResource("/zainb/admin/adminfxml.fxml"));
  
Stage stage = new Stage();
stage.setScene(new Scene(pane));
stage.show();
    } catch(Exception e)
    {
     System.out.println("errur");
}
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<restaurant> data = FXCollections.observableArrayList();

        data.addAll(srv.readAll());
        System.out.println(data.size());

        Nom.setCellValueFactory(new PropertyValueFactory<>("nomR"));
        lieuR.setCellValueFactory(new PropertyValueFactory<>("lieuR"));
        specialite.setCellValueFactory(new PropertyValueFactory<>("specialite"));
        

        tabl.setItems(data);
        // TODO
    }    
    
}
