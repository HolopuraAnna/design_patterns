public class PptxHandler extends FileHandler {

    @Override
    public void open(String file){
        String[] parts = file.split("\\.");

        if (parts[1].equals("pptx"))
            System.out.println("Open pptx file: " + file);
        else
            super.open(file);
    }
}
