package ak223wd_assign2;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.CacheHint;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;
//import java.awt.*;

public class CompoundInterest extends Application {

    @Override
    public void start(Stage primaryStage) {

        //Text text = new Text(158,40,"Compound Interest");
        //text.setFont(Font.font("SansSerif",20));

        /*HBox text = new HBox();
        text.setPadding(new Insets(5));
        text.setSpacing(5);
        Label texT = new Label("Compound Interest");
        texT.setFont(Font.font("SansSerif",20));
        //texT.setAlignment(Pos.CENTER);
        text.getChildren().add(texT);*/

        GridPane pane = new GridPane();
        //pane.getChildren().addAll(texT);
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5,12.5,14.5,15));
        pane.setHgap(5.5);
        pane.setVgap(5.5);


        pane.add(new Label("Start amount"),0,0);
        final TextField startAmount = new TextField();//TEXT HERE
        pane.add(startAmount,1,0);

        pane.add(new Label("Interest"), 0,1);
        final TextField interestP = new TextField();
        pane.add(interestP,1,1);

        pane.add(new Label("Number of years"),0,2);
        final TextField nbrYears = new TextField();
        pane.add(nbrYears,1,2);

        final Label result = new Label();
        pane.add(result,0,4);

        Button calculate = new Button("Calculate");
        pane.add(calculate,1,3);
        GridPane.setHalignment(calculate, HPos.CENTER);

        calculate.setOnAction(event -> {
            if(startAmount.getText().isEmpty() || interestP.getText().isEmpty() || nbrYears.getText().isEmpty()){
                result.setText(" ");
            } else {
                try{
                    double compoundInterest = Double.parseDouble(startAmount.getText())*Math.pow((1+((Double.parseDouble(interestP.getText())/100)
                    )),Double.parseDouble(nbrYears.getText()));
                    int finalResult = (int) Math.round(compoundInterest);
                    result.setText("In total that will be : "+ String.valueOf(finalResult));
                }catch (Exception e){
                    result.setText("Please provide numbers");
                }

            }


        });

        //DISPLAY THE WHOLE CODE
        //Group root = new Group();
        //root.getChildren().addAll(text);
        Scene scene = new Scene(pane, 500,300);
        primaryStage.setTitle("Compound Interest");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {

        launch(args);
    }
}