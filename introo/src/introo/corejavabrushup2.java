package introo;

public class corejavabrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 122 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);

			} else {
				System.out.println(arr[i] + "not multiple of two");
			}
		}

	}

}
