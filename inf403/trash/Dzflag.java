public class Dzflag {
  public static void main(String[] args) {
    String RESET = "\u001B[0m";

    int[] top = {0xFFFFFF,  0xFFFFFF, 0xE4181C,};
    int[] middle = {0x1C3578, 0x008000, 0xFFFFFF};
    int[] bottom = {0xE4181C, 0xE4181C, 0xE4181C};
    String[] names = {"Россия", "Болгария", "Австрия"};
    
    String RECTANGLE = "\u2588"; 

    for(int i = 0; i < top.length; i++) {
      System.out.println(names[i]);
      int rt = (0xFF0000 & top[i]) >> 16; 
      int gt = (0xFF00 & top[i]) >> 8; 
      int bt = 0xFF & top[i]; 
      System.out.print("\u001B[38;2;" + rt + ";" + gt + ";" + bt + "m");
      System.out.print(RECTANGLE);
      System.out.print(RECTANGLE);
      System.out.println(RECTANGLE);
      int rm = (0xFF0000 & middle[i]) >> 16; 
      int gm = (0xFF00 & middle[i]) >> 8; 
      int bm = 0xFF & middle[i]; 
      System.out.print("\u001B[38;2;" + rm + ";" + gm + ";" + bm + "m");
      System.out.print(RECTANGLE);
      System.out.print(RECTANGLE);
      System.out.println(RECTANGLE)
      int rb = (0xFF0000 & bottom[i]) >> 16; 
      int gb = (0xFF00 & bottom[i]) >> 8; 
      int bb = 0xFF & bottom[i]; 
      System.out.print("\u001B[38;2;" + rb + ";" + gb + ";" + bb + "m");
      System.out.print(RECTANGLE);
      System.out.print(RECTANGLE);
      System.out.println(RECTANGLE);
      System.out.println();
                                                  System.out.println(RESET);
      
    }


     
        System.out.println(RESET);
  }
}
