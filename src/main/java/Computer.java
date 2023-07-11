public class Computer {

    //PROPERTIES

    private int storageSpace;
    private String printerName;

    //CONSTRUCTOR

    public Computer(int storage){
        this.storageSpace = storage;
        this.printerName = null;
    }

    //BEHAVIOURS

    public int getStorageSpace(){
        return storageSpace;
    }

    public void addStorage(int storage){
        storageSpace += storage;
    }

    public void setPrinterName(String printer){
        printerName = printer;
    }

    public String getPrinterName(){
        return printerName;
    }

    public void printMessage(String message){
        if(this.printerName != null) {
            System.out.println(message);
        } else{
            System.out.println("Error locating printer.");
        }
    }
}
