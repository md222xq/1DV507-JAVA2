package ak223wd_assign2;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Yahtzee extends Application {
    private int count = 3;
    @Override
    public void start(Stage primaryStage) {

        //GridPane pane = new GridPane();
        /*HBox root = new HBox();
        root.setPadding(new Insets(5));
        root.setSpacing(5);
        Text texT = new Text();
        texT.setText("Yahtzee");
        texT.setFont(Font.font(30));
        texT.setTextAlignment(TextAlignment.CENTER);
        root.getChildren().add(texT);*/


        ArrayList<Image> list = new ArrayList<>();
        for (int i =1; i<=6;i++){
            //list.add(new Image(getClass().getResource("dice-"+i+".png").toExternalForm()));
            list.add(new Image("dice-"+i+".png"));
        }

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(2,2,2,2));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        pane.setStyle("-fx-background-color: #FDFEFE");
        Text text = new Text("Yahtzee");
        text.setFont(Font.font(30));
        pane.add(text,0,0);
        ImageView im0 = new ImageView(list.get(0));
        ImageView im1 = new ImageView(list.get(1));
        ImageView im2 = new ImageView(list.get(2));
        ImageView im3 = new ImageView(list.get(3));
        ImageView im4 = new ImageView(list.get(4));
        ImageView im5 = new ImageView(list.get(5));

        //IMG0
        pane.add(im0,0,1);
        im0.setFitHeight(100);
        im0.setFitWidth(100);
        im0.setX(50);
        im0.setY(100);
        im0.setPreserveRatio(true);
        im0.setImage(list.get(0));
        CheckBox check0 = new CheckBox();
        check0.setDisable(true);
        pane.add(check0,0,2);
        GridPane.setHalignment(check0,HPos.CENTER);

        //IMG1
        pane.add(im1,1,1);
        im1.setFitHeight(100);
        im1.setFitWidth(100);
        im1.setX(150);
        im1.setY(100);
        im1.setPreserveRatio(true);
        im1.setImage(list.get(1));
        CheckBox check1 = new CheckBox();
        check1.setDisable(true);
        pane.add(check1,1,2);
        GridPane.setHalignment(check1,HPos.CENTER);

        //IMG2
        pane.add(im2,2,1);
        im2.setFitHeight(100);
        im2.setFitWidth(100);
        im2.setX(250);
        im2.setY(100);
        im2.setPreserveRatio(true);
        im2.setImage(list.get(2));
        CheckBox check2 = new CheckBox();
        check2.setDisable(true);
        pane.add(check2,2,2);
        GridPane.setHalignment(check2,HPos.CENTER);

        //IMG3
        pane.add(im3,3,1);
        im3.setFitHeight(100);
        im3.setFitWidth(100);
        im3.setX(350);
        im3.setY(100);
        im3.setPreserveRatio(true);
        im3.setImage(list.get(3));
        CheckBox check3 = new CheckBox();
        check3.setDisable(true);
        pane.add(check3,3,2);
        GridPane.setHalignment(check3,HPos.CENTER);

        //IMG4
        pane.add(im4,4,1);
        im4.setFitHeight(100);
        im4.setFitWidth(100);
        im4.setX(450);
        im4.setY(100);
        im4.setPreserveRatio(true);
        im4.setImage(list.get(4));
        CheckBox check4 = new CheckBox();
        check4.setDisable(true);
        pane.add(check4,4,2);
        GridPane.setHalignment(check4,HPos.CENTER);

        //IMG5
        //pane.add(im5,5,1);
        im5.setFitHeight(100);
        im5.setFitWidth(100);
        im5.setX(550);
        im5.setY(100);
        im5.setPreserveRatio(true);
        im5.setImage(list.get(5));
        //CheckBox check5 = new CheckBox();
        //check5.setDisable(true);
        //pane.add(check5,5,2);
        //GridPane.setHalignment(check5,HPos.CENTER);


        //BUTTON
        Button rollDice = new Button("Roll the dice !");
        pane.add(rollDice,2,3);
        //GridPane.setHalignment(rollDice,HPos.CENTER);
        rollDice.setLayoutX(250);
        rollDice.setLayoutY(300);



        Label result = new Label("You have 3 rolls left");
        result.setLayoutX(287);
        result.setLayoutY(400);
        //result.setAlignment(Pos.CENTER);
        GridPane.setHalignment(result,HPos.CENTER);
        pane.add(result,0,8);

        rollDice.setOnAction(event -> {
            count--;
            //System.out.println(count);
            check0.setDisable(false);
            check1.setDisable(false);
            check2.setDisable(false);
            check3.setDisable(false);
            check4.setDisable(false);
            //check5.setDisable(false);
            Random rand = new Random();
            ImageView[] imageV = {im0,im1,im2,im3,im4};
            CheckBox[] checkB = {check0, check1,check2,check3,check4};
            if(count == 0 ){
                check0.setDisable(true);
                check1.setDisable(true);
                check2.setDisable(true);
                check3.setDisable(true);
                check4.setDisable(true);
                rollDice.setDisable(true);
                int [] countHowMany = new int[list.size()]; //we count how many times an image appears
                System.out.println(imageV.length);
                System.out.println(list.size());

                for (int i =0; i<imageV.length;i++){
                    if(checkB[i].isSelected()){

                    } else {
                        int rd = rand.nextInt(imageV.length+1);
                        imageV[i].setImage(list.get(rd));

                    }
                    result.setText("You have "+(count)+" rolls left.");


                }

                for(int i =0; i<imageV.length;i++){
                    countHowMany[i]+=0;
                    for (int j =0; j<list.size();j++){
                        if(imageV[i].getImage().equals(list.get(j))){
                            //System.out.println("Parfait");
                            countHowMany[j]+=1;
                        }

                    }
                }
                ArrayList<Integer> test = new ArrayList<>();
                for (int i=0;i<countHowMany.length;i++)
                    test.add(countHowMany[i]);
                if(test.contains(5)){
                    result.setText("Yahtzee");
                } else if(test.contains(4)){
                    result.setText("Four of a kind");
                } else if(test.contains(3) && test.contains(2)){
                    result.setText("Full house");
                } else if(test.contains(3)){
                    result.setText("Three of a kind");
                } else if((countHowMany[0]>=1&&countHowMany[1]>=1&&countHowMany[2]>=1&&countHowMany[3]>=1&&countHowMany[4]>=1) ||
                        (countHowMany[1]>=1&&countHowMany[2]>=1&&countHowMany[3]>=1&&countHowMany[4]>=1&&countHowMany[5]>=1)){
                    result.setText("Large Straight");
                } else if((countHowMany[0]==1&&countHowMany[1]>=1&&countHowMany[2]>=1&&countHowMany[3]>=1) ||
                        (countHowMany[1]>=1&&countHowMany[2]>=1&&countHowMany[3]>=1&&countHowMany[4]>=1) || (countHowMany[2]>=1&&
                        countHowMany[3]>=1&&countHowMany[4]>=1&&countHowMany[5]>=1&&countHowMany[6]>=1)){
                    result.setText("Small Straight");
                }
                else if(test.contains(2)){
                    result.setText("Pair");
                }


            }  else{

                for (int i =0; i<imageV.length;i++){
                    if(checkB[i].isSelected()){

                    } else {
                        int rd = rand.nextInt(imageV.length+1);//Put random images
                        imageV[i].setImage(list.get(rd));

                    }
                    result.setText("You have "+(count)+" rolls left.");


                }


            }


        });


        //GROUP ALL
        //Group i = new Group();
        //i.getChildren().addAll(rollDice,pane,result);

        //DISPLAY THE WHOLE CODE
        Scene scene = new Scene(pane,700,400);
        primaryStage.setTitle("Yahtzee");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
