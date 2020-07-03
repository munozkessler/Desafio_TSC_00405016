package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MainMenu {

    public void btn_back(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void btn_domain(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/domain.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("DOMINIO");
            stage.setScene(new Scene(root1, 600, 800));
            stage.show();
        }catch (Exception e){
            System.out.println("No se puede cargar la siguiente ventana.");
        }


    }

    public void btn_malla(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/malla.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("MALLA");
            stage.setScene(new Scene(root1, 600, 800));
            stage.show();
        }catch (Exception e){
            System.out.println("No se puede cargar la siguiente ventana.");
        }


    }

    public void btn_conectividades(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/conectividades.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("TABLA DE CONECTIVIDADES");
            stage.setScene(new Scene(root1, 600, 800));
            stage.show();
        }catch (Exception e){
            System.out.println("No se puede cargar la siguiente ventana.");
        }


    }

    public void btn_model(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/model.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("MODELO");
            stage.setScene(new Scene(root1, 600, 800));
            stage.show();
        }catch (Exception e){
            System.out.println("No se puede cargar la siguiente ventana.");
        }


    }

    public void btn_mef(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/mef.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("MEF");
            stage.setScene(new Scene(root1, 600, 800));
            stage.show();
        }catch (Exception e){
            System.out.println("No se puede cargar la siguiente ventana.");
        }


    }

    public void btn_ensamblaje(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/ensamblaje.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("ENSAMBLAJE");
            stage.setScene(new Scene(root1, 600, 800));
            stage.show();
        }catch (Exception e){
            System.out.println("No se puede cargar la siguiente ventana.");
        }


    }

    public void btn_contorno(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/contorno.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("CONDICIONES DE CONTORNO");
            stage.setScene(new Scene(root1, 600, 800));
            stage.show();
        }catch (Exception e){
            System.out.println("No se puede cargar la siguiente ventana.");
        }


    }

    public void btn_componentes(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/componentes.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("COMPONENTES DE LAS MATRICES");
            stage.setScene(new Scene(root1, 600, 800));
            stage.show();
        }catch (Exception e){
            System.out.println("No se puede cargar la siguiente ventana.");
        }


    }


}
