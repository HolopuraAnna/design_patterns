public class XlsxHandler extends FileHandler {

    @Override
    public void open(String file){
        String[] parts = file.split("\\.");

        if (parts[1].equals("xlsx"))
            System.out.println("Open xlsx file: " + file);
        else
            super.open(file);
    }
}
