import java.io.FileNotFoundException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TransportService transportService = new TransportService("C:\\Programming\\inf403\\project\\Transport\\src\\main\\java\\transport.csv");
        List403<Transport> transports = transportService.readAll();
        List403<Bus> bus = transportService.readAllBus();


        System.out.println(bus);
    }
}