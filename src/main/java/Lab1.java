
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;


public class Lab1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        double mult = 5.0;

        Group root = new Group();
        Scene scene = new Scene(root, 300 * mult, 250 * mult);
        scene.setFill(Color.rgb(0, 128, 129));


        Polygon polygonUpper = new Polygon();

        polygonUpper.getPoints().addAll(new Double[]{
                100.0 * mult, 40.0 * mult,
                200.0 * mult, 70.0 * mult,
                130.0 * mult, 100.0 * mult,
                50.0 * mult, 90.0 * mult});
        polygonUpper.setFill(Color.rgb(0, 255, 1));
        root.getChildren().add(polygonUpper);

        Polygon polygonLower = new Polygon();

        polygonLower.getPoints().addAll(new Double[]{
                50.0 * mult, 90.0 * mult,
                130.0 * mult, 100.0 * mult,
                150.0 * mult, 140.0 * mult,
                70.0 * mult, 145.0 * mult

        });
        polygonLower.setFill(Color.rgb(0, 255, 1));
        root.getChildren().add(polygonLower);

        Line l = new Line(50.0 * mult, 90.0 * mult, 130.0 * mult, 100.0 * mult);
        root.getChildren().add(l);
        l.setStroke(Color.BLACK);

        Polygon triangle = new Polygon();
        triangle.setFill(Color.YELLOW);
        triangle.getPoints().addAll(new Double[]{
                140.0 * mult, 102.0 * mult,
                175.0 * mult, 89.0 * mult,
                155.0 * mult, 130.0 * mult

        });
        root.getChildren().add(triangle);

        Rectangle eye1 = new Rectangle(82 * mult, 78 * mult, 5 * mult, 5 * mult);
        root.getChildren().add(eye1);
        eye1.setFill(Color.rgb(0, 152, 93));


        Rectangle eye2 = new Rectangle(77 * mult, 108 * mult, 5 * mult, 5 * mult);
        root.getChildren().add(eye2);
        eye2.setFill(Color.rgb(0, 152, 93));


        Line whiskerUpper = new Line(30 * mult, 33 * mult, 62 * mult, 78 * mult);
        root.getChildren().add(whiskerUpper);
        whiskerUpper.setStroke(Color.BLACK);
        whiskerUpper.setStrokeWidth(5.0 * mult);
        whiskerUpper.setStrokeLineCap(StrokeLineCap.ROUND);

        Line whiskerLower = new Line(25 * mult, 130 * mult, 59 * mult, 117 * mult);
        root.getChildren().add(whiskerLower);
        whiskerLower.setStroke(Color.BLACK);
        whiskerLower.setStrokeWidth(5.0 * mult);
        whiskerLower.setStrokeLineCap(StrokeLineCap.ROUND);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
