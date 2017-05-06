package caesarchiper;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CaesarChiper extends Application  {
    
    

    public static void main(String[] args){
        // TODO code application logic here
        
        launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        Logic logic = new Logic();
        stage.setTitle("Caesar Chiper");
        stage.setMinHeight(200);
        stage.setMinWidth(400);
        
        TextField originalText = new TextField();
        TextField convertedText = new TextField();
        Button encryptButton = new Button("Encrypt");
        Button decryptButton = new Button("Decrypt");

        encryptButton.setOnAction((event) -> {
            convertedText.setText(logic.convert(originalText.getText()));
        });
        
        decryptButton.setOnAction((event) -> {
            convertedText.setText(logic.decrypt(originalText.getText()));
        });
        
        
        BorderPane borderpane = new BorderPane();
        
        HBox hbox = new HBox();
        hbox.getChildren().addAll(encryptButton, decryptButton);
        
        borderpane.setTop(originalText);
        borderpane.setBottom(convertedText);
        borderpane.setCenter(hbox);
       
        hbox.setSpacing(40);
        hbox.setPrefWidth(200);
        borderpane.setPrefSize(200,400);

        Scene scene = new Scene(borderpane);
        
        stage.setScene(scene);
        stage.show();
    }
    
}
