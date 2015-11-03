/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author ericbeaudet
 */
public class AdEnvironment extends Environment {

    Image logo;

    public AdEnvironment() {
        this.setBackground(Color.white);
    }

    @Override
    public void initializeEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/Apple_Logo_Blue_Transparent.png");

    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        graphics.setColor(new Color(150, 100, 50));
        graphics.fillOval(150, 200, 200, 200);
        graphics.setColor(Color.green);
        graphics.fillOval(200, 420, 200, 200);
        graphics.setColor(Color.blue);
        graphics.fillOval(800, 200, 200, 200);
        graphics.setColor(Color.cyan);
        graphics.fillOval(600, 200, 200, 200);
        graphics.setColor(Color.orange);
        graphics.fillOval(100, 50, 200, 200);
        graphics.setColor(new Color(255, 255, 0, 100));
        graphics.fillOval(206, 310, 200, 200);
        graphics.setColor(Color.green);
        graphics.fillOval(40, 420, 200, 200);
        graphics.setColor(Color.blue);
        graphics.fillOval(120, 390, 200, 200);
        graphics.setColor(Color.cyan);
        graphics.fillOval(180, 20, 200, 200);
        graphics.setColor(Color.orange);
        graphics.fillOval(397, 50, 200, 200);
        
        int width = 100;
        int height = 200;
        
        
        graphics.setColor(Color.black);

        graphics.setFont(new Font("copperplate gothic ", Font.BOLD, 32));
        graphics.drawString("Better than Android", 120, 350);
        
        if (logo != null) {
            graphics.drawImage(logo, 200, 200, 100, 100, this);
        }

    }

}
