package ak223wd_assign2;

import javafx.application.Application; import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Snowman extends Application {
    @Override
    public void start(Stage primaryStage) {
        //CODE THAT WILL DISPLAY
        //DRAWING THE CIRCLE
        Circle circleHead = new Circle (300, 290, 25);
        circleHead.setFill(Color.WHITE);
        Circle circleBody = new Circle(300,350, 38);
        circleBody.setFill(Color.WHITE);
        Circle circleLowerBody = new Circle (300, 445, 60);
        circleLowerBody.setFill(Color.WHITE);
        //SNOW
        Rectangle snowRectangle = new Rectangle(0,500, 600,600);
        snowRectangle.setFill(Color.WHITE);
        //EYES OF SNOW MAN
        Circle eye1 = new Circle(291,285, 3);
        Circle eye2 = new Circle(309,285, 3);
        //NOSE
        Circle nose = new Circle(300,293,3);
        //MOUTH
        Rectangle mouth = new Rectangle(292,300, 16,3);
        mouth.setArcHeight(5);
        mouth.setArcWidth(5);
        //Line mouth = new Line(292,295,307,295);

        //BUTTON OF SNOWMAN
        Circle buttonSnow1 = new Circle(300,330,3);
        Circle buttonSnow2 = new Circle(300,348,3);
        Circle buttonSnow3 = new Circle(300,366,3);
        //SUN
        Circle sun = new Circle(450,100,50);
        sun.setFill(Color.YELLOW);


        // EXECUTE THE WHOLE CODE

        Group root = new Group();
        root.getChildren().addAll(snowRectangle,circleBody,circleHead,circleLowerBody,sun,
                buttonSnow1, buttonSnow2, buttonSnow3, eye1,eye2,nose,mouth);//CREATING A GROUP OBJECT
        Scene scene = new Scene(root, 600, 600, Color.rgb(77,184,255));//CREATING A SCENE OBJECT
        primaryStage.setTitle("Snowman");//SETTING TITLE TO THE STAGE
        primaryStage.setScene(scene);//ADDING SCENE TO THE STAGE
        primaryStage.show();//DISPLAYING THE CONTENT OF THE STAGE
    }
    public static void main(String[] args) {
        launch(args);
    }
}