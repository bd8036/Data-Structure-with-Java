package selectsort;
/*
 * 버블 정렬
 * { 3, 5, 4, 2, 1}
 * 1) 앞에서 두개씩 비교해서 교환(3이랑5, 5랑 4, ...) -> 맨 끝 index 정렬 끝
 * 2) 다시 앞으로 가서 맨 끝 index 제외하고 두개씩 비교 -> 맨끝, 그 앞 index 정렬 끝
 * 3) ...
 * 4)
 * 5) 
 * 
 * 결과 시간복잡도 : O(n^2)
 */
public class sort_bubble {
	private static void bubbleSort(int[] arr){
		bubbleSort(arr,arr.length-1);
	}
	private static void bubbleSort(int[] arr, int last){
		if(last>0){
			for(int i=1;i<=last;i++){
				if(arr[i-1]>arr[i]){
					swap(arr,i-1,i);
				}
			}
			bubbleSort(arr,last-1);
		}
	}
	private static void swap(int[] arr, int source, int target){
		int tmp=arr[source];
		arr[source]=arr[target];
		arr[target]=tmp;
	}
	private static void printArray(int[] arr){
		for(int data : arr){
			System.out.print(data+", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int[] arr = {3,5,4,2,1};
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}

}
