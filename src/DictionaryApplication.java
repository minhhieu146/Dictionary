import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DictionaryApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(5,5,5,5));

        Label useName = new Label("Nhap tu ban muon tim: ");
        grid.add(useName, 0, 0);

        TextField userText = new TextField();
        grid.setPadding(new Insets(5, 150,50,5));
        grid.add(userText, 0, 1, 7, 5);
        Line line = new Line();
        line.setStartX(300);
        line.setEndX(300);
        line.setStartY(0);
        line.setEndY(700);
        line.setStrokeWidth(10);
        line.setStroke(Color.BLUEVIOLET);
        grid.add(line, 8,0,8,50);

        Scene scene = new Scene(grid, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
