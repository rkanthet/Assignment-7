import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Login {
    private String userName="";
    private String password="";

    public int getUserType() {
        return userType;
    }

    private int userType=0;
    HashMap<String, String> buyers_data = new HashMap<>();
    HashMap<String, String> sellers_data = new HashMap<>();

    public void getCredentials(){
        File buyerInfo = new File(
                "BuyerInfo.txt");
        File sellerInfo = new File(
                "SellerInfo.txt");

        try {
            Scanner sc = new Scanner(buyerInfo);
            Scanner scanner = new Scanner(sellerInfo);
            String str;

            while (sc.hasNextLine()){
                str = sc.nextLine();
                String[] temp = str.split(":");
                buyers_data.put(temp[0], temp[1]);
            }
            while(scanner.hasNextLine()){
                str = scanner.nextLine();
                String[] temp = str.split(":");
                sellers_data.put(temp[0], temp[1]);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean login(){
        Scanner in = new Scanner(System.in);
        System.out.println("Username: ");
        userName = in.next();
        System.out.println("Password: ");
        password = in.next();
        getCredentials();
        if(buyers_data.containsKey(userName)){
            if(password.equals(buyers_data.get(userName))){
                System.out.println("Welcome! "+" Buyer "+userName);
                userType=0;
                return true;
            }else{
                System.out.println("No such user exists in database");
                return false;
            }
        } else if (sellers_data.containsKey(userName)){
            if(password.equals(sellers_data.get(userName))){
                System.out.println("Welcome! "+" Seller " + userName );
                userType=1;
                return true;
            }else{
                System.out.println("No such user exists in database");
                return false;
            }
        }else{
            System.out.println("No such user exists in database");
            return false;
        }
    }
}
