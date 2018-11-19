package Colormixing;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Colormix extends Application {

    static Colorpalette colormix1;


    public static void main(String[]args){





        launch(args);



    }
    public Colormix(){
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25));

        Text scenetitle=new Text("COLORPALETTE");
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0,0);


        //Colorchanging boxes:

        Rectangle box1=new Rectangle(100,100);
        grid.add(box1,1,1);

        Rectangle box2=new Rectangle(100,100);
        grid.add(box2,2,1);

        Rectangle box3=new Rectangle(100,100);
        grid.add(box3,3,1);





        Scene scene=new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(750);
        primaryStage.setMinHeight(750);
        primaryStage.setResizable(true);










        primaryStage.show();

    }
}


