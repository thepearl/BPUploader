/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpuploader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
 import javafx.scene.input.MouseEvent;

/**
 *
 * @author ThePear
 */
public class BPUploader extends Application {
    private double xSet = 0;
    private double ySet = 0;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        
        //Grabbig root
         root.setOnMousePressed((MouseEvent event)-> {
             xSet = event.getSceneX();
             ySet = event.getSceneY();
         }
         );
         
         //moving arround
         root.setOnMouseDragged((MouseEvent event) ->{
             stage.setX(event.getScreenX() - xSet);
             stage.setY(event.getScreenY() - ySet);
         }
         );
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
