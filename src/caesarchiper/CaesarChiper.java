package caesarchiper;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CaesarChiper extends Application {

    public static void main(String[] args) {
        // TODO code application logic here

        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        Logic logic = new Logic();
        stage.setTitle("Caesar Chiper");
        stage.setMinHeight(200);
        stage.setMinWidth(700);

        Label text = new Label("Give a String: ");
        Label keyValue = new Label("Give a key value(Between 1-25)");

        TextField originalText = new TextField();
        TextField convertedText = new TextField();
        TextField numberKey = new TextField();
        numberKey.setPrefWidth(40);

        Button encryptButton = new Button("Encrypt");
        Button decryptButton = new Button("Decrypt");

        encryptButton.setOnAction((event) -> {

            try {
                //if (keyValue != null && keyValue.getText().matches("[0-2][0"));

                convertedText.setText(logic.encrypt(originalText.getText(), Integer.parseInt(numberKey.getText())));
            } catch (NumberFormatException e) {
                convertedText.setText("Invalid number or text");
            }

        });

        decryptButton.setOnAction((event) -> {
            convertedText.setText(logic.decrypt(originalText.getText(), Integer.parseInt(numberKey.getText())));
        });

        BorderPane borderpane = new BorderPane();

        HBox buttonsHbox = new HBox();
        buttonsHbox.getChildren().addAll(encryptButton, decryptButton);

        HBox inputHbox = new HBox();
        inputHbox.getChildren().addAll(text, originalText, keyValue, numberKey);
        inputHbox.setSpacing(10);

        borderpane.setTop(inputHbox);
        borderpane.setBottom(convertedText);
        borderpane.setCenter(buttonsHbox);

        buttonsHbox.setSpacing(40);
        buttonsHbox.setPrefWidth(200);
        borderpane.setPrefSize(200, 400);

        Scene scene = new Scene(borderpane);

        stage.setScene(scene);
        stage.show();
    }

}
