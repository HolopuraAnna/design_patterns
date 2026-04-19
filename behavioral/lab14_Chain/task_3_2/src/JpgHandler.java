public class JpgHandler extends FileHandler {

    @Override
    public void open(String file){
        String[] parts = file.split("\\.");

        if (parts[1].equals("jpg"))
            System.out.println("Open jpg file: " + file);
        else
            super.open(file);
    }
}
