public class TransportPrintService {
    public void printRouteName(List403<Transport> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNumber() + ",");
        }
    }
}
