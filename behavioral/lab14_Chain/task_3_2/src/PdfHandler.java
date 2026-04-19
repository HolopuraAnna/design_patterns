public class PdfHandler extends FileHandler {

    @Override
    public void open(String file){
        String[] parts = file.split("\\.");

        if (parts[1].equals("pdf"))
            System.out.println("Open pdf file: " + file);
        else
            super.open(file);
    }
}
