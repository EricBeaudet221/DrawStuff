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
class DrawEnvironment extends Environment {

    public DrawEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/Apple_Logo_Blue_Transparent.png");
        this.setBackground(Color.yellow);

    }

    Image logo;

    @Override
    public void initializeEnvironment() {

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
        graphics.setColor(Color.orange);
        graphics.fillOval(100, 150, 300, 300);
        graphics.setColor(Color.red);
        graphics.fillOval(300, 150, 300, 300);
        graphics.setColor(Color.blue);
        graphics.fillOval(500, 150, 300, 300);
        graphics.setColor(Color.green);
        graphics.fillOval(200, 300, 300, 300);
        graphics.setColor(Color.cyan);
        graphics.fillOval(400, 300, 300, 300);
        graphics.setColor(Color.orange);
        graphics.fillOval(40, 40, 40, 40);
        graphics.fill3DRect(70, 45, 17, 60, true);

        graphics.setColor(new Color(0, 255, 255));
        graphics.fillOval(200, 200, 200, 200);

        int width = 100;
        int height = 200;

        graphics.setColor(Color.red);

        graphics.setFont(new Font("Calibri", Font.ITALIC, 32));
        graphics.drawString("Sam has no balls", width, width);

        if (logo != null) {
            graphics.drawImage(logo, 400, 300, 150, 150, this);

        }
    }

}
