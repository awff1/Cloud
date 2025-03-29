import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TransportService {
    private File file;

    public TransportService(String fileName) {
        this.file = new File(fileName);
    }

    public List403<Transport> readAll() throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        List403<Transport> result = new List403Impl<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] str = line.split(";");
            result.add(
                    switch (str[0]) {
                        case "bus" -> new Bus(str[1], str[2], str[3], str[4]);
                        case "tramp" -> new Tramp(str[1], str[2], str[3], str[4]);
                        case "trolleybus" -> new Trolleybus(str[1], str[2], str[3], str[4]);
                        default -> null;
                    }
            );
        }
        sc.close();
        return result;
    }

    public List403<Bus> readAllBus() throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        List403<Bus> result = new List403Impl<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] str = line.split(";");
            if (str[0].equals("bus")) {
                result.add(new Bus(str[1], str[2], str[3], str[4]));
            }
        }
        sc.close();
        return result;
    }

    public List403<Tramp> readAllTramp() throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        List403<Tramp> result = new List403Impl<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] str = line.split(";");
            if (str[0].equals("tramp")) {
                result.add(new Tramp(str[1], str[2], str[3], str[4]));
            }
        }
        sc.close();
        return result;
    }

    public List403<Trolleybus> readAllTrolleybus() throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        List403<Trolleybus> result = new List403Impl<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] str = line.split(";");
            if (str[0].equals("trolleybus")) {
                result.add(new Trolleybus(str[1], str[2], str[3], str[4]));
            }
        }
        sc.close();
        return result;
    }
}
