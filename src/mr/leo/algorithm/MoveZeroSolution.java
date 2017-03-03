package mr.leo.algorithm;

public class MoveZeroSolution implements ISolution {

	@Override
	public void runSolution() {
		// TODO Auto-generated method stub
		int[] array1 = {1, 0, 5, 34354, 0, 9, 0, 3334};
		moveZero(array1);
	}

	private void moveZero(int[] array) {
		int end = array.length - 1;
		while(end >= 0) {
			if(array[end] == 0) {
				break;
			}
			
			end--;
		}
		
		int start = end - 1;
		while(start >= 0) {
			if(array[start] != 0) {
				array[end] = array[start];
				end--;
			}
			
			start--;
		}
		
		while(end >= 0) {
			array[end--] = 0;
		}
	}
}
