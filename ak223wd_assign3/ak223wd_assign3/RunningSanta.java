package ak223wd_assign3;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;

public class RunningSanta extends Application {
    private int x_speed;
    private ImageView Santa = new ImageView();
    private ArrayList<Image> listSanta = new ArrayList<>();//RUN SANTA IMAGES
    private int index=0;
    private boolean runninForwardB;

    @Override
    public void start(Stage primaryStage) {

        //BACKGROUND IMAGE
        Image bg = new Image("BG.png");
        ImageView bgIV = new ImageView(bg);
        bgIV.setFitWidth(1500);
        bgIV.setFitHeight(900);
        //bgIV.preserveRatioProperty();

        getSantaImage();//Method call
        Santa.setX(1);
        Santa.setY(70);
        //Santa.setFitHeight(100);
        //Santa.setFitWidth(100);

        Group root = new Group();
        root.getChildren().addAll(bgIV,Santa);
        Scene scene = new Scene(root,1500,768);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Running Santa");
        primaryStage.show();

        KeyFrame k = new KeyFrame(Duration.millis(2), event -> {
            if(Santa.getX()==800){
                setrunninForwardB(false);
                runningBackward();
            } else if(Santa.getX()==1){
                setrunninForwardB(true);
                runningForward();
            } else if(Santa.getX()>1 && Santa.getX()<800){
                if(getrunninForwardB() == true){
                    runningForward();
                } else if(getrunninForwardB() == false){
                    runningBackward();
                }
            }

        });

        Timeline t = new Timeline();
        t.getKeyFrames().addAll(k);
        t.setCycleCount(Timeline.INDEFINITE);
        t.play();
    }

    private void getSantaImage(){
        for(int i =1; i<=11;i++) {
            listSanta.add(new Image("Run "+"("+i+")"+".png"));
        }
    }

    private void runningForward(){
        x_speed =1;//we add 5
        Santa.setImage(listSanta.get(index%11));
        Santa.setScaleX(1);//Change
        Santa.setX(Santa.getX()+x_speed);
        index++;
    }
    private void setrunninForwardB(Boolean t){
        if(t==true){
            runninForwardB = true;
        } else {
            runninForwardB = false;
        }
    }
    private boolean getrunninForwardB(){
        return runninForwardB;
    }
    private void runningBackward(){
        x_speed =1;
        Santa.setImage(listSanta.get(index%11));
        Santa.setScaleX(-1);
        Santa.setX(Santa.getX()-x_speed);
        index++;
    }


    public static void main(String[] args) {

        launch(args);
    }
}
