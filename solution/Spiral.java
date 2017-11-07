import java.util.Arrays;

class Spiral {

	public static int[][] create(int size) {
		int[][] grid = new int[size][size];
		if (size % 2 != 0) {
			int x = Math.round(size / 2);
			int y = x;
			String direction = "left";
			int move = 2;
			int count = 0;
			while (x >= 0 && x < size && y >= 0 && y < size) {
				grid[y][x] = 1;
				count++;
				switch (direction) {
					case "left":
						if (count < move) {
							x--;
						} else {
							count = 1;
							direction = "bottom";
							move++;
							y++;
						}
						break;

					case "bottom":
						if (count < move) {
							y++;
						} else {
							count = 1;
							direction = "right";
							move++;
							x++;
						}
						break;

					case "right":
						if (count < move) {
							x++;
						} else {
							count = 1;
							direction = "top";
							move++;
							y--;
						}
						break;

					case "top":
						if (count < move) {
							y--;
						} else {
							count = 1;
							direction = "left";
							move++;
							x--;
						}
						break;
				}
			}
		} else {
			return null;
		}
		return grid;
	}
}
