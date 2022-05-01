import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * A simple class that you can use to create, manipulate and save an image.
 */
public class PNGImage {
    public BufferedImage buffer_ = null;

    // --------------------------------------------------------------- //

    /**
     * Constructor that gets the image width and height in pixels.
     */
    public PNGImage(int width, int height) {
        buffer_ = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    }

    // --------------------------------------------------------------- //

    /**
     * Set the pixel at coordinate (x,y) to the specified color defined in RGB space with
     * red/green/blue in [0, 255].
     */
    public void setPixel(int x, int y, int red, int green, int blue) {
        // --- convert color values to RGB value
        int rgb = 0;
        rgb = rgb | red;
        rgb = rgb << 8;
        rgb = rgb | green;
        rgb = rgb << 8;
        rgb = rgb | blue;
        // ---
        buffer_.setRGB(x, y, rgb);
    }

    // --------------------------------------------------------------- //

    /**
     * Save the current image to the given filename. The extension should be '.png' because we use a
     * png-fileformat.
     */
    public void saveToFile(String filename) {
        File image_file = new File(filename);
        try {
            ImageIO.write(buffer_, "PNG", image_file);
        } catch (Exception e) {
            System.out.println("Writing image to file failed.");
            System.out.println(e.getMessage());
        }
        System.out.println("Saved image to " + filename);
    }
}
