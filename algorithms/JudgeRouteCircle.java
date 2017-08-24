class Solution {
	public boolean judgeCircle(String moves) {
		int x = 0;
		int y = 0;
		for (char step : moves.toCharArray()) {
			switch (step) {
			case 'L':
				x--;
				break;
			case 'R':
				x++;
				break;
			case 'U':
				y++;
				break;
			case 'D':
				y--;
			}
		}
		return x == 0 && y == 0 ? true : false;
	}
}