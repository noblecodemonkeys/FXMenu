package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.Console;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable
{
    @FXML
    VBox vbMenu;


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        createMenu();

    }

    private void createMenu()
    {
//        ImageView ivSave = new ImageView(new Image(getClass().getResourceAsStream("Diskette.png")));
//        ivSave.setFitHeight(20);
//        ivSave.setFitWidth(20);
//        MenuBar mBar = new MenuBar();
//        Menu mMain = new Menu("Main");
//        Menu mAbout = new Menu("About");
//
//        MenuItem miSave = new MenuItem("Save");
//        miSave.setGraphic(ivSave);
//        miSave.setOnAction(this::handleMenuClicked);
//
//        MenuItem miExit = new MenuItem("Exit");
//        CheckMenuItem cbOnOff = new CheckMenuItem("Turn On");
//        SeparatorMenuItem smi = new SeparatorMenuItem();
//
//        mMain.getItems().addAll(miSave, miExit, smi, cbOnOff);
//
//        mBar.getMenus().addAll(mMain, mAbout);
//        vbMenu.getChildren().add(mBar);

    }

    @FXML
    private void handleMenuClicked(ActionEvent event)
    {
        //menu handle code
        System.out.println("Menu Save Clicked");
    }
}
