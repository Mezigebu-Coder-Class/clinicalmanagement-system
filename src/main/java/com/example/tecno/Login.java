package com.example.tecno;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Login {
        private Stage stage;
        private Scene scene;

        @FXML
        private Button login_btn;

        @FXML
        private Label page_lbl;

        @FXML
        private Label pass_lbl;

        @FXML
        private PasswordField pass_txt;

        @FXML
        private Label user_lbl;

        @FXML
        private TextField user_txt;

        @FXML
        void Login(ActionEvent event) throws IOException {

                FXMLLoader fxmlLoader = new FXMLLoader(Login.class.getResource("home.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(fxmlLoader.load());
                stage.setTitle("HOME ! ");
                stage.setScene(scene);
                stage.show();


        }

    }

