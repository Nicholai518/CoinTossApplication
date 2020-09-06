package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {

        // Controls
        Label coinTossLabel = new Label("Toss the Coin!");
        Button tossButton = new Button("TOSS");

        // Trying to create a blank image view
        ImageView sideUP = new ImageView();
        sideUP.setFitWidth(100);
        sideUP.setFitHeight(100);
        sideUP.setPreserveRatio(true);

          //Images
          //Image PATH
        Image heads = new Image("file:heads.jpg");
        Image tails = new Image("file:tails.jpg");

         //Creating Imageview for each picture
        ImageView headsIview = new ImageView(heads);
        ImageView tailsIview = new ImageView(tails);


       // Setting Width, Height and preserving aspect ratio
        headsIview.setFitWidth(50);
        headsIview.setFitHeight(50);
        headsIview.setPreserveRatio(true);

        tailsIview.setFitWidth(50);
        tailsIview.setFitHeight(50);
        tailsIview.setPreserveRatio(true);

//        ImageView sideUP = new ImageView();
//        sideUP.setFitWidth(100);
//        sideUP.setFitHeight(100);
//        sideUP.setPreserveRatio(true);

        tossButton.setOnAction(e ->
        {
            // Random object, roll 0 or 1. 0 = heads, 1 = tails
            Random rng = new Random();
            int randomNumber = rng.nextInt(2);

            if (randomNumber == 0)
            {

                try
                {
                    sideUP.setImage(heads);
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }

//                // Heads Image
//                Image heads = new Image("file:Heads1.bmp");
//                ImageView headsIview = new ImageView(heads);
//                // Setting Width, Height and preserving aspect ratio
//                headsIview.setFitWidth(50);
//                headsIview.setFitHeight(50);
//                headsIview.setPreserveRatio(true);
//
//                //sideUP.setImage(heads);
//                // Add to container, scene and stage
//                HBox headsHBox = new HBox(headsIview);
//                Scene headsScene = new Scene(headsHBox, 500, 500);
//                primaryStage.setScene(headsScene);
//                primaryStage.setTitle("Heads wins!");
//                primaryStage.show();
            }
            else if (randomNumber == 1)
            {

                sideUP.setImage(tails);
                // Tails image
//                Image tails = new Image("file:Tails1.bmp");
//                ImageView tailsIview = new ImageView(tails);
//
//                // Setting Width, Height and preserving aspect ratio
//                tailsIview.setFitWidth(50);
//                tailsIview.setFitHeight(50);
//                tailsIview.setPreserveRatio(true);
//
//                // sideUP.setImage(tails);
//                // Add to container, scene and stage
//                HBox tailsHBox = new HBox(tailsIview);
//                Scene tailsScene = new Scene(tailsHBox, 500, 500);
//                primaryStage.setScene(tailsScene);
//                primaryStage.setTitle("Tails wins!");
//                primaryStage.show();
            }
        });


        // Container
        HBox topMenu = new HBox(50, coinTossLabel, tossButton);
        topMenu.setAlignment(Pos.CENTER);
        topMenu.setPadding(new Insets(10));

        VBox gameMenu = new VBox(50, topMenu, sideUP);
        gameMenu.setAlignment(Pos.CENTER);
        gameMenu.setPadding(new Insets(10));

        // Create Scene
        Scene scene = new Scene(gameMenu, 500, 500);

        // Create Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Coin Toss Game!");
        primaryStage.show();

//        // Create our second scene
//        Label coinResult = new Label("This side landed up!");
//
//        // Container
//        VBox coinVBox= new VBox(50, coinResult, sideUP );
//        coinVBox.setAlignment(Pos.CENTER);
//        coinVBox.setPadding(new Insets(25));
//
//        // Scene
//        Scene coinScene = new Scene(coinVBox, 500, 500);
//
//        // Stage
//        Stage coinStage = new Stage();
//        coinStage.setScene(coinScene);
//        coinStage.setTitle("Coin Results");
//        coinStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
