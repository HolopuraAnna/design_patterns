public class ImageGallery {

    public static void main(String[] args) {
        // якщо виникає помилка завантаження, замініть відносний шлях на абсотютний шлях!
        String path = "task_3_1/resources/";

        DisplayObject[] images = {
                new ProxyFile(path + "image1.jpeg"),  //
                new ProxyFile(path + "image2.jpeg"),  //
                new ProxyFile(path + "image3.jpeg"),  //
                new ProxyFile(path + "image4.jpeg"),  //
                new ProxyFile(path + "image5.jpeg"),  //
                new ProxyFile(path + "image6.jpeg"),  //
                new ProxyFile(path + "image7.jpeg"),  //
                new ProxyFile(path + "image8.jpeg"),  //
                new ProxyFile(path + "image9.jpeg"),  //
                new ProxyFile(path + "image10.jpeg"),  // ,
        };

        for (DisplayObject image : images) {
            image.display();
        }

    }

}