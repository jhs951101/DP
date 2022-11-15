package pkg;

public class Fibonacci {

	public void main() {
		int n = 5;
		// n: 수열에서 n번째 값을 구하는 것이 목표

		int[] nums = new int[n];
		// nums: 값을 DP 방식으로 구하기 위한 배열

		// 1,2번째 값은 1로 설정
		nums[0] = 1;
		nums[1] = 1;

		// 앞의 두 값을 계속 더해나감
		for(int i=2; i<n; i++)
			nums[i] = nums[i-1] + nums[i-2];

		System.out.println("수열의 n번째 값: " + nums[n-1]);
	}

	public static void main(String[] args) {
		Fibonacci main = new Fibonacci();
		main.main();
	}
}
