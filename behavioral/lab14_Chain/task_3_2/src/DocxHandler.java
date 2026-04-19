public class DocxHandler extends FileHandler {

    @Override
    public void open(String file){
        String[] parts = file.split("\\.");

        if (parts[1].equals("docx"))
            System.out.println("Open docx file: " + file);
        else
            super.open(file);
    }
}
