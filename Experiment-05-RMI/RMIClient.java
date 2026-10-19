
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry =
                LocateRegistry.getRegistry("localhost", 1099);

            MyRemote service =
                (MyRemote) registry.lookup("MyRemoteService");

            System.out.println(service.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
