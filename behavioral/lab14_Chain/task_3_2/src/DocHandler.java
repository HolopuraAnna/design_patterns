public class DocHandler extends FileHandler {

    @Override
    public void open(String file){
        String[] parts = file.split("\\.");

        if (parts[1].equals("doc"))
            System.out.println("Open doc file: " + file);
        else
            super.open(file);
    }
}
