import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class main extends JPanel implements ActionListener, KeyListener {
    // sets the size of the window
    int winWidth = 500;
    int winHeight = 500;

    // the bird's parameters
    int birdX = winWidth/8;
    int birdY = winWidth/2;
    int birdWidth = 30;
    int birdHeight = 25;

    // the pipe's parameters
    int pipeX = winHeight;
    int pipeY = 0;
    int pipeWidth = 64;
    int pipeHeight = 512;

    // takes in images 
    Image flappybird;
    Image flappybirdbg;
    Image toppipe;
    Image bottompipe;

    // bird class
    class bird {
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;

        Image image;

        bird(Image image){
            this.image = image;
        }
    }

    // pipe class
    class pipes {
        int x = pipeX;
        int y = pipeY;
        int width = pipeWidth;
        int height = pipeHeight;

        Image image;

        pipes(Image image){
            this.image = image;
        }
    } 

}



