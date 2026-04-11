import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import static java.lang.System.load;

public class ProxyFile implements DisplayObject{

    final private String path;
    private DisplayObject imageFile;

    public ProxyFile(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (imageFile == null){
            imageFile = new ImageFile(path);
        }
        imageFile.display();
    }

    BufferedImage load(String path) {
        System.out.println("Loading image " + path + "...");
        BufferedImage image = null;
        File file = new File(path);
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
