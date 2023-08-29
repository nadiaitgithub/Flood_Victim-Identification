import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class ImageToGrayScale {
    public static void main(String[] args) {
        try {

            BufferedImage originalImage = ImageIO.read(new File("P:\\Program\\SPL\\MyOpenCv1\\src\\Image\\download (1).jpeg"));
            BufferedImage grayImage = convertToGrayScale(originalImage);
            File outputFile = new File("P:\\Program\\SPL\\MyOpenCv1\\src\\Image\\Grayscale.jpeg");
            ImageIO.write(grayImage, "jpg", outputFile);

            System.out.println("Image converted to grayscale successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    private static BufferedImage convertToGrayScale(BufferedImage image) {
        BufferedImage grayImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        ColorConvertOp convertOp = new ColorConvertOp(null);
        convertOp.filter(image, grayImage);
        return grayImage;
    }
}
