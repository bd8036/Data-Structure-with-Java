package selectsort;
/*
 * 선택 정렬
 * { 3, 5, 4, 2, 1}
 * 1) 배열 0부터 5까지 돌면서 가장 작은값 찾기
 * 2) 가장 작은 값을 맨 앞 데이터와 교체
 * 3) 0번 index 설정 되었으므로 1번 index부터 제일 작은값 찾기
 * 4) 1번 index와 자리 바꾸기
 * 5) ... 
 * 
 * 결과 시간복잡도 : O(n^2)
 */

public class sort_select {
	
	private static void selectionSort(int[] arr){
		selectionSort(arr,0);
	}
	private static void selectionSort(int[] arr, int start){
		if(start < arr.length-1){
			// 가장 작은 값 저장
			int min_index= start;
			for(int i = start; i< arr.length; i++){
				if(arr[i]<arr[min_index]) min_index=i;
			}
			swap(arr,start,min_index);
			selectionSort(arr,start+1);
		}
	}
	private static void swap(int[] arr, int index1, int index2){
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2]=tmp;
	}
	
	private static void printArray(int[] arr){
		for(int data : arr){
			System.out.print(data+", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int[] arr = {3,6,1,8,2,4};
		printArray(arr);
		selectionSort(arr);
		printArray(arr);
	}
}
