/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortactivity;

/**
 *
 * @author HEX
 */
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {

    private BufferedImage image;

    public ImagePanel() {
        try {
            BufferedImage myPicture = ImageIO.read(new File("joel.jpg"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            add(picLabel);
        } catch (IOException ex) {
            Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
