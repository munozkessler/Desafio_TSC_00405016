package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MEF {

    public void btn_back(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }


    public void btn_paso1(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/paso1.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("PASO 1");
            stage.setScene(new Scene(root1, 600, 800));
            stage.show();
        }catch (Exception e){
            System.out.println("No se puede cargar la siguiente ventana.");
        }


    }

    public void btn_paso2(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/paso2.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("PASO 2");
            stage.setScene(new Scene(root1, 600, 800));
            stage.show();
        }catch (Exception e){
            System.out.println("No se puede cargar la siguiente ventana.");
        }


    }

    public void btn_paso3(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/paso3.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("PASO 3");
            stage.setScene(new Scene(root1, 600, 800));
            stage.show();
        }catch (Exception e){
            System.out.println("No se puede cargar la siguiente ventana.");
        }


    }

    public void btn_paso4(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/paso4.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("PASO 4");
            stage.setScene(new Scene(root1, 600, 800));
            stage.show();
        }catch (Exception e){
            System.out.println("No se puede cargar la siguiente ventana.");
        }


    }

    public void btn_paso5(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/paso5.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("PASO 5");
            stage.setScene(new Scene(root1, 600, 1200));
            stage.show();
        }catch (Exception e){
            System.out.println("No se puede cargar la siguiente ventana.");
        }


    }

    public void btn_paso6(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/paso6.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("PASO 6");
            stage.setScene(new Scene(root1, 600, 1200));
            stage.show();
        }catch (Exception e){
            System.out.println("No se puede cargar la siguiente ventana.");
        }


    }



}
