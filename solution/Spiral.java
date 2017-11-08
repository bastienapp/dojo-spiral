import java.util.Arrays;

class Spiral {

	public static int[][] create(int size) {
		int[][] grid = new int[size][size];
		if (size % 2 != 0) {
			int x = Math.round(size / 2);
			int y = x;
			String direction = "left";
			int distance = 1;
			int move = 0;
			while (x >= 0 && x < size && y >= 0 && y < size) {
				grid[y][x] = 1;
				switch (direction) {
					case "left":
						if (move < distance) {
							x--;
						} else {
							move = 0;
							direction = "bottom";
							distance++;
							y++;
						}
						break;

					case "bottom":
						if (move < distance) {
							y++;
						} else {
							move = 0;
							direction = "right";
							distance++;
							x++;
						}
						break;

					case "right":
						if (move < distance) {
							x++;
						} else {
							move = 0;
							direction = "top";
							distance++;
							y--;
						}
						break;

					case "top":
						if (move < distance) {
							y--;
						} else {
							move = 0;
							direction = "left";
							distance++;
							x--;
						}
						break;
				}
				move++;
			}
		} else {
			return null;
		}
		return grid;
	}
}
