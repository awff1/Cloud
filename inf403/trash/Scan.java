import java.util.Scanner;

public class Scan {
	public static void main(String args[]) {
		boolean flag = true;
		int enter = 8219;
		while (flag) {
			int labirint[][] = {
				{1,0,0,0,0,1,1},
				{1,0,1,1,1,0,1},
				{1,0,1,0,1,1,1},
				{1,1,1,0,0,0,1},
				{0,0,0,1,1,1,1},
				{0,0,0,1,0,0,0},
				{0,0,0,1,1,1,1}
			};
			int hud[][] = {
				{1,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0}
			};


			int x = 0;
			int y = 0;
			while (enter != 0) {
				System.out.println("1 - Right" + "\n" + "2 - Left" + "\n" + "3 - Up" + "\n" + "4 - Down" + "\n" + "0 - Finish_game");
				for (int i = 0; i < labirint.length; i++) {
					for (int j = 0; j < labirint[i].length; j++) {
						System.out.print(hud[i][j]);
						}
					System.out.println();
				}
				System.out.println();

				if (labirint[6][6] == hud[6][6]) {
					System.out.println("------Congats!!! You complete my quest.");
					flag = false;
					break;
				}
				System.out.print("Make a move: ");
				Scanner in = new Scanner(System.in);
				enter = in.nextInt();
				System.out.println();
				if (enter == 0) {
					flag = false;
				}
				

				try {
					if (enter == 1) {
						x++;
						if (labirint[y][x] == 1) {
							hud[y][x] = 1;

						} else {
							System.out.println("-------Wall observed, try another way((");
							break;
						}
					}
					if (enter == 2) {
						x -= 1;
						if (labirint[y][x] == 1) {
							hud[y][x] = 1;
						} else {
							System.out.println("-------Wall found, try again and again...");
							break;
						}
					}
					if (enter == 3) {
						y -= 1;
						if (labirint[y][x] == 1) {
							hud[y][x] = 1;
						} else {
							System.out.println("--------Well done, you found the wall, but try to found exit");
							break;
						}
					}
					if (enter == 4) {
						y++;
						if (labirint[y][x] == 1) {
							hud[y][x] = 1;
						} else {
							System.out.println("---------Omg, another wall");
							break;
						}
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("-------Wall observed, take a break and try again))");
					break;
				}
			}
		}
	}
}