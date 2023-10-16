package codingquestions;
public class MinMoves {

	public static void main(String[] args) {
		int[] a = new int[] { 1234, 4321 };
		int[] b = new int[] { 2345, 3214 };

		int countMove = countMoveToEqualArrayElements(a, b);

		System.out.println("Total moves to equal arrays: " + countMove);
	}

	private static int countMoveToEqualArrayElements(int[] a, int[] b) {
		int aLength = a.length;
		int counter = 0;

		if (a.length != b.length) {
			throw new RuntimeException("Make sure both arrays have equal elements");
		}

		for (int i = 0; i < aLength; i++) {
			String as = String.valueOf(a[i]);
			String bs = String.valueOf(b[i]);
			for (int c = 0; c < as.length(); c++) {
				int aValue = Integer.parseInt(Character.toString(as.charAt(c)));
				int bValue = Integer.parseInt(Character.toString(bs.charAt(c)));
				if (aValue > bValue) {
					counter += aValue - bValue;
				} else {
					counter += bValue - aValue;
				}
			}
		}

		return counter;
	}

}