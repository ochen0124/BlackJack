package guitest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controllercreateaccount {

    @FXML
    public Button Backbutton;

    @FXML
    public void Back(ActionEvent event) throws IOException {
        System.out.print(" goes back to main screen not logged \t");

        Parent tableViewParent = FXMLLoader.load(getClass().getResource("mainscreennotlogged.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();

    }

    @FXML
    public Button Enterbutton;
    @FXML
    public PasswordField username;
    @FXML
    public PasswordField password;

    @FXML
    public void CreateAcc(ActionEvent event) throws IOException {
        String myuser = "johndoe";
        String mypass = "password123";
        System.out.print("create account \t");
        String name = username.getText();
        String pass = password.getText();
        System.out.print(name);
        System.out.print(pass);

        if (name.isEmpty() || pass.isEmpty())
        {
            Alert missingfieldalert = new Alert(Alert.AlertType.ERROR);
            missingfieldalert.setHeaderText(null);
            missingfieldalert.setContentText("Please fill out all required fields");
            missingfieldalert.showAndWait();
        }
        //INSERT MONGODB LOGIN INFO HERE TO CHECK IF USER LOGGED IN CORRECTLY
        else if (name.equals(myuser))
        {
            Alert incorrectfieldalert = new Alert(Alert.AlertType.ERROR);
            incorrectfieldalert.setHeaderText(null);
            incorrectfieldalert.setContentText("Username already exists");
            incorrectfieldalert.showAndWait();

        }
        else
        {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("mainscreennotlogged.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(tableViewScene);
            window.show();
        }

    }
}
