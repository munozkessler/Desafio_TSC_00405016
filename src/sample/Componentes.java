package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Componentes {

    public void btn_back(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }


    public void c(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/c.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Matriz C");
            stage.setScene(new Scene(root1, 1200, 1200));
            stage.show();
        }catch (Exception e) {
            System.out.println("No se puede cargar la siguiente ventana.");
        }
    }

    public void f(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/f.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Matriz F");
            stage.setScene(new Scene(root1, 1200, 1200));
            stage.show();
        }catch (Exception e) {
            System.out.println("No se puede cargar la siguiente ventana.");
        }
    }

    public void d(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/d.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Matriz D");
            stage.setScene(new Scene(root1, 1200, 1200));
            stage.show();
        }catch (Exception e) {
            System.out.println("No se puede cargar la siguiente ventana.");
        }
    }

    public void k(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/k.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Matriz K");
            stage.setScene(new Scene(root1, 1200, 1200));
            stage.show();
        }catch (Exception e) {
            System.out.println("No se puede cargar la siguiente ventana.");
        }
    }

    public void l(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/l.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Matriz L");
            stage.setScene(new Scene(root1, 1200, 1200));
            stage.show();
        }catch (Exception e) {
            System.out.println("No se puede cargar la siguiente ventana.");
        }
    }

    public void h(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/h.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Matriz H");
            stage.setScene(new Scene(root1, 1200, 1200));
            stage.show();
        }catch (Exception e) {
            System.out.println("No se puede cargar la siguiente ventana.");
        }
    }




}
