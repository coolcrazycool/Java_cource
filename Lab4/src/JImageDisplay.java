import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

public class JImageDisplay extends JComponent {
    private BufferedImage bufferedImg;

    /** This constructor sets up our image with the given width and height. **/
    public JImageDisplay(int width, int height) {
        bufferedImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Dimension dim = new Dimension(width, height);
        super.setPreferredSize(dim);
    }

    /** Simple drawing code. Just display the image. **/
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bufferedImg, 0, 0, bufferedImg.getWidth(), bufferedImg.getHeight(), null);
    }

    /** Set every pixel in the image to black. **/
    public void clearImage() {
        for (int i = 0; i < bufferedImg.getWidth(); i++) {
            for (int j = 0; j < bufferedImg.getHeight(); j++) {
                bufferedImg.setRGB(i, j, 0);
            }
        }
    }

    /** Set a specific pixel to a given RGB value. **/
    public void drawPixel(int x, int y, int rgbColor) {
        bufferedImg.setRGB(x, y, rgbColor);
    }
}
