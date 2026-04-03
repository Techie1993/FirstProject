package practice;

@FunctionalInterface
interface SqData {
	void check(int[] data);
}

@FunctionalInterface
interface Org {
	void init(String[] comp);
}

@FunctionalInterface
interface SQRT {
	void sqrt(double[] nums);
}

public class SquareLambda {

	public static void main(String[] args) {

		SqData S1 = (nums) -> {
			for (int i = 0; i < nums.length - 1; i++) {
				int sq = nums[i] * nums[i];
				System.out.println(sq);
			}
		};
		int digits[] = { 14, 12, 7, 5, 6 };
		S1.check(digits);
		System.out.println("\n");

		Org O1 = (comp) -> {
			for (int i = 0; i <= comp.length - 1; i++) {
				if (comp[i].startsWith("C")) {
					System.out.println(comp[i]);
				}
			}
		};

		String comp[] = { "Cybage", "CapG", "JP Morgan", "GE" };
		O1.init(comp);

		System.out.println("\n");

		SQRT S2 = (nums) -> {
			for (int i = 0; i<= nums.length; i++) {
				double sqrt = Math.sqrt(nums[i]);
				System.out.println("Square Root is:" + sqrt);
			}
		};
		double data[] = { 100.0, 121.0, 145.00 };
		S2.sqrt(data);		 

	}
}
