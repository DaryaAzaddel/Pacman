package com.example.pacman;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class controller2{
    @FXML
    private AnchorPane pane;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void swichtoS1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private Arc a1;
    @FXML
    private Arc a2;


    int [][] b= {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,0,0,0,1,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,0,1,1,0,0,0,1,1,1,1,0},
            {0,1,0,0,0,1,1,0,0,0,1,1,1,1,0},
            {0,1,0,0,0,1,1,0,0,0,1,1,1,1,0},
            {0,1,0,0,0,1,1,0,0,0,1,1,1,1,0},
            {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,1,1,1,1,1,1,1,1,0},
            {0,1,0,0,1,1,1,1,1,1,1,1,1,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,1,1,1,1,1,1,0,0,0,0,0,0,0}


    };

    int [][] f= {
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,0,0,0,1,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,0,1,1,0,0,0,1,1,1,1,0},
            {0,1,0,0,0,1,1,0,0,0,1,1,1,1,0},
            {0,1,0,0,0,1,1,0,0,0,1,1,1,1,0},
            {0,1,0,0,0,1,1,0,0,0,1,1,1,1,0},
            {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,1,1,1,1,1,1,1,1,0},
            {0,1,0,0,1,1,1,1,1,1,1,1,1,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,1,1,1,1,1,1,0,0,0,0,0,0,0}


    };

    private Ghost[] ghosts;

    @FXML
    private Circle c01;
    @FXML
    private Circle c02;
    @FXML
    private Circle c03;
    @FXML
    private Circle c04;
    @FXML
    private Circle c05;
    @FXML
    private Circle c06;
    @FXML
    private Circle c07;
    @FXML
    private Circle c08;
    @FXML
    private Circle c09;
    @FXML
    private Circle c010;
    @FXML
    private Circle c011;
    @FXML
    private Circle c012;
    @FXML
    private Circle c013;
    @FXML
    private Circle c014;
    @FXML
    private Circle c10;
    @FXML
    private Circle c12;
    @FXML
    private Circle c13;
    @FXML
    private Circle c14;
    @FXML
    private Circle c15;
    @FXML
    private Circle c16;
    @FXML
    private Circle c17;
    @FXML
    private Circle c18;
    @FXML
    private Circle c19;
    @FXML
    private Circle c110;
    @FXML
    private Circle c111;
    @FXML
    private Circle c112;
    @FXML
    private Circle c113;
    @FXML
    private Circle c114;

    @FXML
    private Circle c20;
    @FXML
    private Circle c22;
    @FXML
    private Circle c23;
    @FXML
    private Circle c24;
    @FXML
    private Circle c27;
    @FXML
    private Circle c28;
    @FXML
    private Circle c29;
    @FXML
    private Circle c210;
    @FXML
    private Circle c211;
    @FXML
    private Circle c212;
    @FXML
    private Circle c213;
    @FXML
    private Circle c214;

    @FXML
    private Circle c30;
    @FXML
    private Circle c32;
    @FXML
    private Circle c33;
    @FXML
    private Circle c34;
    @FXML
    private Circle c37;
    @FXML
    private Circle c38;
    @FXML
    private Circle c39;
    @FXML
    private Circle c314;

    @FXML
    private Circle c40;
    @FXML
    private Circle c42;
    @FXML
    private Circle c43;
    @FXML
    private Circle c44;
    @FXML
    private Circle c47;
    @FXML
    private Circle c48;
    @FXML
    private Circle c49;
    @FXML
    private Circle c414;

    @FXML
    private Circle c50;
    @FXML
    private Circle c52;
    @FXML
    private Circle c53;
    @FXML
    private Circle c54;
    @FXML
    private Circle c57;
    @FXML
    private Circle c58;
    @FXML
    private Circle c59;
    @FXML
    private Circle c514;

    @FXML
    private Circle c60;
    @FXML
    private Circle c62;
    @FXML
    private Circle c63;
    @FXML
    private Circle c64;
    @FXML
    private Circle c67;
    @FXML
    private Circle c68;
    @FXML
    private Circle c69;
    @FXML
    private Circle c614;

    @FXML
    private Circle c70;
    @FXML
    private Circle c72;
    @FXML
    private Circle c73;
    @FXML
    private Circle c74;
    @FXML
    private Circle c75;
    @FXML
    private Circle c76;
    @FXML
    private Circle c77;
    @FXML
    private Circle c78;
    @FXML
    private Circle c79;
    @FXML
    private Circle c710;
    @FXML
    private Circle c711;
    @FXML
    private Circle c712;
    @FXML
    private Circle c713;
    @FXML
    private Circle c714;

    @FXML
    private Circle c80;
    @FXML
    private Circle c82;
    @FXML
    private Circle c83;
    @FXML
    private Circle c84;
    @FXML
    private Circle c85;
    @FXML
    private Circle c86;
    @FXML
    private Circle c87;
    @FXML
    private Circle c88;
    @FXML
    private Circle c89;
    @FXML
    private Circle c810;
    @FXML
    private Circle c811;
    @FXML
    private Circle c812;
    @FXML
    private Circle c813;
    @FXML
    private Circle c814;

    @FXML
    private Circle c90;
    @FXML
    private Circle c92;
    @FXML
    private Circle c93;
    @FXML
    private Circle c914;

    @FXML
    private Circle c100;
    @FXML
    private Circle c102;
    @FXML
    private Circle c103;
    @FXML
    private Circle c1014;

    @FXML
    private Circle c1100;
    @FXML
    private Circle c1101;
    @FXML
    private Circle c1102;
    @FXML
    private Circle c1103;
    @FXML
    private Circle c1104;
    @FXML
    private Circle c1105;
    @FXML
    private Circle c1106;
    @FXML
    private Circle c1107;
    @FXML
    private Circle c1108;
    @FXML
    private Circle c1109;
    @FXML
    private Circle c1110;
    @FXML
    private Circle c1111;
    @FXML
    private Circle c1112;
    @FXML
    private Circle c1113;
    @FXML
    private Circle c1114;

    @FXML
    private Circle c1200;
    @FXML
    private Circle c1201;
    @FXML
    private Circle c1202;
    @FXML
    private Circle c1203;
    @FXML
    private Circle c1204;
    @FXML
    private Circle c1205;
    @FXML
    private Circle c1206;
    @FXML
    private Circle c1207;
    @FXML
    private Circle c1208;
    @FXML
    private Circle c1209;
    @FXML
    private Circle c1210;
    @FXML
    private Circle c1211;
    @FXML
    private Circle c1212;
    @FXML
    private Circle c1213;
    @FXML
    private Circle c1214;

    @FXML
    private Circle c1300;
    @FXML
    private Circle c1301;
    @FXML
    private Circle c1308;
    @FXML
    private Circle c1309;
    @FXML
    private Circle c1310;
    @FXML
    private Circle c1311;
    @FXML
    private Circle c1312;
    @FXML
    private Circle c1313;
    @FXML
    private Circle c1314;

    @FXML
    private Circle c1400;
    @FXML
    private Circle c1401;
    @FXML
    private Circle c1408;
    @FXML
    private Circle c1409;
    @FXML
    private Circle c1410;
    @FXML
    private Circle c1411;
    @FXML
    private Circle c1412;
    @FXML
    private Circle c1413;
    @FXML
    private Circle c1414;

    @FXML
    private Label labelscore;

    private MediaPlayer scores = new MediaPlayer(new Media(getClass().getResource("/sounds/munch_2.wav").toString()));
    private MediaPlayer win = new MediaPlayer(new Media(getClass().getResource("/sounds/win.wav").toString()));

    private MediaPlayer loses=new MediaPlayer(new Media(getClass().getResource("/sounds/death_1.wav").toString()));




    int prow=0;
    int pcol=0;

    int score=0;

    int lives=2;

    Random random=new Random();

    public void initialize()  {
        int r1=random.nextInt(14);
        int c1=random.nextInt(14);
        while (b[r1][c1]==1){
             r1=random.nextInt(14);
             c1=random.nextInt(14);
        }
        int r2=random.nextInt(14);
        int c2=random.nextInt(14);
        while (b[r2][c2]==1){
            r2=random.nextInt(14);
            c2=random.nextInt(14);
        }
        int r3=random.nextInt(14);
        int c3=random.nextInt(14);
        while (b[r3][c3]==1){
            r3=random.nextInt(14);
            c3=random.nextInt(14);
        }
        int r4=random.nextInt(14);
        int c4=random.nextInt(14);
        while (b[r4][c4]==1){
            r4=random.nextInt(14);
            c4=random.nextInt(14);
        }
        ghosts=new Ghost[]{
                new Ghost(new ImageView("gh.png"),r1,c1,b),
                new Ghost(new ImageView("ghost2.jpg"),r2,c2,b),
                new Ghost(new ImageView("ghost3.png"),r3,c3,b),
                new Ghost(new ImageView("ghost4.png"),r4,c4,b),

        };

        for (int i=0;i< ghosts.length;i++){
            pane.getChildren().add(ghosts[i].getGhostimage());
            ghosts[i].getGhostimage().setFitHeight(48);
            ghosts[i].getGhostimage().setFitWidth(48);
        }
        setbooster();

        startghostmove();
    }



    private Timeline timeline;

    private double ghostspeed=0.5;



    private void startghostmove(){

            timeline=new Timeline(new KeyFrame(Duration.seconds(0.5),event -> {
            for (int i=0;i< ghosts.length;i++){
                ghosts[i].randommove(1);
                if (pcol==ghosts[i].getGcol() && prow==ghosts[i].getGrow() && !invisible){
                    if (lives==2){
                        a2.setFill(Color.web("#1fff9b"));
                        a2.setStroke(Color.web("#1fff9b"));
                        lives-=1;
                    }
                    else if (lives==1){
                        a1.setFill(Color.web("#1fff9b"));
                        a1.setStroke(Color.web("#1fff9b"));
                        lives-=1;
                    }
                    else{
                        loses.play();
                        try {
                            swichtol();
                        } catch (IOException e) {

                        }
                        catch (NullPointerException e2){

                        }
                    }
                }
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

    }


    @FXML
    public void handleKeyPress(KeyEvent event) {
        if (event.getCode() == KeyCode.W){
            if (check1()){
                shape1.setStartAngle(135);
                Up();
                prow-=1;
                food();
                playbooster();
            }
        }
        if (event.getCode() == KeyCode.S){
            if (check2()){
                shape1.setStartAngle(-45);
                Down();
                prow+=1;
                food();
                playbooster();
            }
        }
        if (event.getCode() == KeyCode.A){
            if (check3()){
                shape1.setStartAngle(-135);
                Left();
                pcol-=1;
                food();
                playbooster();
            }
        }
        if (event.getCode() == KeyCode.D){
            if (check4()){
                shape1.setStartAngle(45);
                Right();
                pcol+=1;
                food();
                playbooster();
            }
        }

    }

    int pspeed=48;

    private void Up(){
        shape1.setLayoutY(shape1.getLayoutY()-pspeed);
    }
    private void Down(){
        shape1.setLayoutY(shape1.getLayoutY()+pspeed);
    }
    private void Left(){
        shape1.setLayoutX(shape1.getLayoutX()-pspeed);
    }
    private void Right(){
        shape1.setLayoutX(shape1.getLayoutX()+pspeed);
    }

    @FXML
    private Arc shape1;







    public boolean check1(){
        if (prow>0){
            if (b[prow-1][pcol]==0){
                return true;
            }
            else {
                return false;

            }
        }
        else{ return false;}
    }
    public boolean check2(){
        if (prow<14){
            if (b[prow+1][pcol]==0){
                return true;
            }
            else {
                return false;

            }
        }
        else{ return false;}
    }

    public boolean check3(){
        if (pcol>0){
            if (b[prow][pcol-1]==0){
                return true;
            }
            else {
                return false;

            }
        }
        else{ return false;}
    }

    public boolean check4(){
        if (pcol<14){
            if (b[prow][pcol+1]==0){
                return true;
            }
            else {
                return false;

            }
        }
        else{ return false;}
    }

    private void load(){

    }

    public void food()  {
        if (f[prow][pcol]==0){
            if (prow==14 && pcol==0){
                score+=10;
                pm();
                f[prow][pcol]=1;
                hide(prow,pcol);
                if (score==183){
                    win.play();
                    try {
                        swichtow();
                    }
                    catch (Exception e){


                    }
                    System.out.println("w");
                }
            }
            else if (prow==0 && pcol==14){
                score+=10;
                pm();
                f[prow][pcol]=1;
                hide(prow,pcol);
                if (score==183){
                    win.play();
                    try {
                        swichtow();
                    }
                    catch (Exception e){


                    }
                    System.out.println("w");
                }
            }
            else if (prow==14 && pcol==14){
                score+=10;
                pm();
                f[prow][pcol]=1;
                hide(prow,pcol);
                if (score==183){
                    win.play();
                    try {
                        swichtow();
                    }
                    catch (Exception e){


                    }
                    System.out.println("w");
                }
            }
            else {
                score+=1;
                pm();
                f[prow][pcol]=1;
                hide(prow,pcol);
                if (score==183){
                    win.play();
                    try {
                        swichtow();
                    }
                    catch (Exception e){


                    }
                    System.out.println("w");
                }

            }
        }
        labelscore.setText("Score: "+score);

    }

    @FXML
    public void hide(int prow, int pcol){
        if (prow==0){
            if (pcol==1){
                c01.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==2){
                c02.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==3){
                c03.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==4){
                c04.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==5){
                c05.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==6){
                c06.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==7){
                c07.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==8){
                c08.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==9){
                c09.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==10){
                c010.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==11){
                c011.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==12){
                c012.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==13){
                c013.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c014.setFill(Color.web("#ADD8E6"));
            }
        }

        if (prow==1){
            if (pcol==0){
                c10.setFill(Color.web("#ADD8E6"));
            }

            if (pcol==2){
                c12.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==3){
                c13.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==4){
                c14.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==5){
                c15.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==6){
                c16.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==7){
                c17.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==8){
                c18.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==9){
                c19.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==10){
                c110.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==11){
                c111.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==12){
                c112.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==13){
                c113.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c114.setFill(Color.web("#ADD8E6"));
            }
        }
        if (prow==2){
            if (pcol==0){
                c20.setFill(Color.web("#ADD8E6"));
            }

            if (pcol==2){
                c22.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==3){
                c23.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==4){
                c24.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==7){
                c27.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==8){
                c28.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==9){
                c29.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==10){
                c210.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==11){
                c211.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==12){
                c212.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==13){
                c213.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c214.setFill(Color.web("#ADD8E6"));
            }
        }

        if (prow==3){
            if (pcol==0){
                c30.setFill(Color.web("#ADD8E6"));
            }

            if (pcol==2){
                c32.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==3){
                c33.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==4){
                c34.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==7){
                c37.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==8){
                c38.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==9){
                c39.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c314.setFill(Color.web("#ADD8E6"));
            }
        }

        if (prow==4){
            if (pcol==0){
                c40.setFill(Color.web("#ADD8E6"));
            }

            if (pcol==2){
                c42.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==3){
                c43.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==4){
                c44.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==7){
                c47.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==8){
                c48.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==9){
                c49.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c414.setFill(Color.web("#ADD8E6"));
            }
        }

        if (prow==5){
            if (pcol==0){
                c50.setFill(Color.web("#ADD8E6"));
            }

            if (pcol==2){
                c52.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==3){
                c53.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==4){
                c54.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==7){
                c57.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==8){
                c58.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==9){
                c59.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c514.setFill(Color.web("#ADD8E6"));
            }
        }

        if (prow==6){
            if (pcol==0){
                c60.setFill(Color.web("#ADD8E6"));
            }

            if (pcol==2){
                c62.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==3){
                c63.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==4){
                c64.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==7){
                c67.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==8){
                c68.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==9){
                c69.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c614.setFill(Color.web("#ADD8E6"));
            }
        }

        if (prow==7){
            if (pcol==0){
                c70.setFill(Color.web("#ADD8E6"));
            }

            if (pcol==2){
                c72.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==3){
                c73.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==4){
                c74.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==5){
                c75.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==6){
                c76.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==7){
                c77.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==8){
                c78.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==9){
                c79.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==10){
                c710.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==11){
                c711.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==12){
                c712.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==13){
                c713.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c714.setFill(Color.web("#ADD8E6"));
            }
        }

        if (prow==8){
            if (pcol==0){
                c80.setFill(Color.web("#ADD8E6"));
            }

            if (pcol==2){
                c82.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==3){
                c83.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==4){
                c84.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==5){
                c85.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==6){
                c86.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==7){
                c87.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==8){
                c88.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==9){
                c89.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==10){
                c810.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==11){
                c811.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==12){
                c812.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==13){
                c813.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c814.setFill(Color.web("#ADD8E6"));
            }
        }
        if (prow==9){
            if (pcol==0){
                c90.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==2){
                c92.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==3){
                c93.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c914.setFill(Color.web("#ADD8E6"));
            }
        }
        if (prow==10){
            if (pcol==0){
                c100.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==2){
                c102.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==3){
                c103.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c1014.setFill(Color.web("#ADD8E6"));
            }
        }

        if (prow==11){
            if (pcol==0){
                c1100.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==1){
                c1101.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==2){
                c1102.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==3){
                c1103.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==4){
                c1104.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==5){
                c1105.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==6){
                c1106.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==7){
                c1107.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==8){
                c1108.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==9){
                c1109.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==10){
                c1110.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==11){
                c1111.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==12){
                c1112.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==13){
                c1113.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c1114.setFill(Color.web("#ADD8E6"));
            }
        }

        if (prow==12){
            if (pcol==0){
                c1200.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==1){
                c1201.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==2){
                c1202.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==3){
                c1203.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==4){
                c1204.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==5){
                c1205.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==6){
                c1206.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==7){
                c1207.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==8){
                c1208.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==9){
                c1209.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==10){
                c1210.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==11){
                c1211.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==12){
                c1212.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==13){
                c1213.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c1214.setFill(Color.web("#ADD8E6"));
            }
        }

        if (prow==13){
            if (pcol==0){
                c1300.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==1){
                c1301.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==8){
                c1308.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==9){
                c1309.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==10){
                c1310.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==11){
                c1311.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==12){
                c1312.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==13){
                c1313.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c1314.setFill(Color.web("#ADD8E6"));
            }
        }

        if (prow==14){
            if (pcol==0){
                c1400.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==1){
                c1401.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==8){
                c1408.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==9){
                c1409.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==10){
                c1410.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==11){
                c1411.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==12){
                c1412.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==13){
                c1413.setFill(Color.web("#ADD8E6"));
            }
            if (pcol==14){
                c1414.setFill(Color.web("#ADD8E6"));
            }
        }
    }

    public void swichtow() throws IOException , NullPointerException {
        Stage stage1 = (Stage) pane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("win.fxml"));
        stage1.setScene(new Scene(root));

    }

    public void swichtol() throws IOException , NullPointerException {
        stage = (Stage) pane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("lose.fxml"));
        stage.setScene(new Scene(root));

    }

    private void pm(){
        if (scores.getStatus() == MediaPlayer.Status.PLAYING){
            scores.stop();
            scores.seek(scores.getStartTime());
        }
        scores.play();
    }
    ImageView booster1 = new ImageView("b2.png");
    ImageView booster2 = new ImageView("v.png");

    ImageView booster3 = new ImageView("i.png");

    private void setbooster(){

        booster1.setLayoutX(6*24);
        booster1.setLayoutY(14*24);

        booster2.setLayoutX(26*24);
        booster2.setLayoutY(26*24);

        booster3.setLayoutX(2*24);
        booster3.setLayoutY(22*24);

        pane.getChildren().add(booster1);
        pane.getChildren().add(booster2);
        pane.getChildren().add(booster3);

        booster1.setFitWidth(48);
        booster1.setFitHeight(48);
        booster2.setFitWidth(48);
        booster2.setFitHeight(48);
        booster3.setFitWidth(48);
        booster3.setFitHeight(48);

        dissapear(booster1,15);
        dissapear(booster2,15);
        dissapear(booster3,15);
    }

    private boolean boost=true;

    private void dissapear(ImageView b , int s){
        Timeline booterTimeline = new Timeline(new KeyFrame(Duration.seconds(s), event ->{
            pane.getChildren().remove(b);
            boost=false;
        }));
        booterTimeline.setCycleCount(1);
        booterTimeline.play();
    }

    private void playbooster(){
        if (prow==7 && pcol==3 && boost){
            pane.getChildren().remove(booster1);
            stopghosts();
        }

        if (pcol==13 && prow==13 && boost){
            pane.getChildren().remove(booster2);
            morespeed();
        }

        if (pcol==1 && prow==11 && boost){
            pane.getChildren().remove(booster3);
            invisible();
        }
    }

    private void stopghosts(){
        timeline.stop();
        Timeline replay = new Timeline(new KeyFrame(Duration.seconds(5),event -> timeline.play()));
        replay.setCycleCount(1);
        replay.play();
    }

    private void morespeed(){
        timeline.setRate(0.2);
        Timeline replay = new Timeline(new KeyFrame(Duration.seconds(5),event ->{
            timeline.setRate(0.5);
        }));
        replay.setCycleCount(1);
        replay.play();
    }

    boolean invisible=false;
    private void invisible(){
        shape1.setFill(Color.web("#ADD8E6"));
        invisible=true;
        Timeline replay = new Timeline(new KeyFrame(Duration.seconds(5),event -> {
            shape1.setFill(Color.web("#fcff1f"));
            invisible=false;
        }));
        replay.setCycleCount(1);
        replay.play();
    }






}
