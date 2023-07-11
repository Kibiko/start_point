import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShoppingTrolley {

    //PROPERTIES

    private ArrayList<String> shopping;

    //CONSTRUCTOR
    public ShoppingTrolley(){
        this.shopping = new ArrayList<>();
    }

    //BEHAVIOURS

    public void addItem(String product){
        shopping.add(product);
    }

    public int itemCount(){
        return shopping.size();
    }

    public boolean checkItem(String product){
        return shopping.contains(product);
    }
}
