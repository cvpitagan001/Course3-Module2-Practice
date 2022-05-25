import java.util.ArrayList;

public class index {

    public static void main(String[] args) {
        ArrayList<String> addressList = new ArrayList<>();

        addressList.add("1600 Pennsylvania Avenue");
        addressList.add("221B Baker Street");
        addressList.add("221B Baker Street");
        addressList.add("8700 St. Bungang Kahoy");

        for (String data : addressList) {
            System.out.println(data);
        }
        
    }
}