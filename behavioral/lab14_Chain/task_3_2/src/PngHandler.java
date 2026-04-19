public class PngHandler extends FileHandler {

    @Override
    public void open(String file){
        String[] parts = file.split("\\.");

        if (parts[1].equals("png"))
            System.out.println("Open png file: " + file);
        else
            super.open(file);
    }
}
