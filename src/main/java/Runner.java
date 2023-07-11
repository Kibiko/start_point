public class Runner {

    public static void main(String[] args) {
        rectangleDemo();
        computerDemo();
        shoppingTrolleyDemo();
    }

    public static void rectangleDemo(){
        System.out.println("----------");
        System.out.println("Running rectangle tasks...");

        // 1. Create a new rectangle object
        Rectangle rectangle1 = new Rectangle(4,7);
        Rectangle rectangle2 = new Rectangle(6,6);

        // 2. Calculate the rectangle's area and store it in a variable
        int area = rectangle1.calcArea();
        System.out.println("The rectangle1 has an area of " + area);

        int area2 = rectangle2.calcArea();
        System.out.println("The rectangle2 has an area of " + area2);

        // 3. Check if your rectangle is actually a square
        boolean isRectangle1 = rectangle1.checkSqr();
        System.out.println("Object is a square (true/false): " + isRectangle1);

        boolean isRectangle2 = rectangle2.checkSqr();
        System.out.println("Object is a square (true/false): " + isRectangle2);

    }

    public static void computerDemo(){
        System.out.println("----------");
        System.out.println("Running computer tasks...");

        // 1. Create a new computer object
        Computer computer = new Computer(1024);

        // 2. Use a getter to find out how much storage the computer has
        int currentStorage = computer.getStorageSpace();
        System.out.println("Computer has " + currentStorage + "GB storage");

        // 3. Add more storage to the computer
        computer.addStorage(1024);
        // We use the getter again to check that the amount of storage has been updated
        int newStorage = computer.getStorageSpace();
        System.out.println("Computer now has " + newStorage + "GB storage");

        // 4. Use a setter to update the computer's printer property
        computer.setPrinterName("KODAK XPS 710J");
        // Write a getter and use it below to check that the setter worked
        String currentPrinter = computer.getPrinterName();
        System.out.println("Computer currently has a " + currentPrinter + " printer connected.");

//         5. Write a method to print a message.
//         To test this works *without* a printer too you can comment out the code for question 4
        computer.printMessage("Hello World!");
    }

    public static void shoppingTrolleyDemo(){
        System.out.println("----------");
        System.out.println("Running shopping trolley tasks...");

        // 1. Create a new shopping trolley
//        ShoppingTrolley trolley = <INSTANTIATE A NEW SHOPPINGTROLLEY OBJECT HERE>;

        // 2. Add an item to the trolley
//        <CALL YOUR METHOD HERE>;

        // 3. Count items in the trolley
//        int itemCount = <CALL YOUR METHOD HERE>;
//        System.out.println("The trolley contains " + itemCount + " items.");

        // 4. Check if an item is in the trolley
//        boolean itemInTrolley = <CALL YOUR METHOD HERE>;
//        System.out.println("Object is a square (true/false): " + itemInTrolley);
    }


}
