public class XlsHandler extends FileHandler {

    @Override
    public void open(String file){
        String[] parts = file.split("\\.");

        if (parts[1].equals("xls"))
            System.out.println("Open xls file: " + file);
        else
            super.open(file);
    }
}
