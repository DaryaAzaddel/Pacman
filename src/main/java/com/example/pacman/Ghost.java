package com.example.pacman;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Ghost {

    private ImageView ghostimage;
    private int[][] d;
    private int grow;
    private int gcol;

    private int dir;
    private final Random random=new Random();



    public Ghost(ImageView ghostimage, int grow, int gcol, int[][] d) {
        this.ghostimage = ghostimage;
        this.grow = grow;
        this.gcol = gcol;
        this.d = d;
        this.dir=random.nextInt(4);
        moveg();
    }
    public void randommove(int b){
        if (canmove(1)){
            switch (dir){
                case 0: grow-=b; break;
                case 1: grow+=b; break;
                case 2: gcol-=b; break;
                case 3: gcol+=b; break;
            }
            moveg();
        }else {
            dir=random.nextInt(4);
        }

    }

    private boolean canmove(int b){
        if (b==1){
            if (dir==0){
                if (grow<=0){
                    return false;
                }
                else{
                    return d[grow-1][gcol]==0;
                }
            }
            else if (dir==1){
                if (grow>=14){
                    return false;
                }
                else{
                    return d[grow+1][gcol]==0;
                }
            }

            else if (dir==2){
                if (gcol<=0){
                    return false;
                }
                else{
                    return d[grow][gcol-1]==0;
                }
            }

            else if (dir==3){
                if (gcol>=14){
                    return false;
                }
                else{
                    return d[grow][gcol+1]==0;
                }
            }
            return false;

        }
        else {
            if (dir==0){
                if (grow<=1){
                    return false;
                }
                else{
                    if (d[grow-1][gcol]!=0){
                        return false;
                    }
                    else{
                        if (d[grow-2][gcol]!=0){
                            return false;

                        }
                        else{
                            return true;
                        }
                    }

                }
            }
            else if (dir==1){
                if (grow>=13){
                    return false;
                }
                else{
                    if (d[grow+1][gcol]!=0){
                        return false;
                    }
                    else{
                        if (d[grow+2][gcol]!=0){
                            return false;
                        }
                        else{
                            return true;

                        }
                    }

                }
            }

            else if (dir==2){
                if (gcol<=0){
                    return false;
                }
                else{
                    return d[grow][gcol-1]==0;
                }
            }

            else if (dir==3){
                if (gcol>=14){
                    return false;
                }
                else{
                    return d[grow][gcol+1]==0;
                }
            }
            return false;
        }
    }

    private void moveg(){
        ghostimage.setX((2*gcol)*24);
        ghostimage.setY((2*grow)*24);
    }

    public int getGrow() {
        return grow;
    }

    public int getGcol() {
        return gcol;
    }

    public ImageView getGhostimage(){
        return ghostimage;
    }
}
