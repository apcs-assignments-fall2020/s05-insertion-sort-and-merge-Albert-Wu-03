import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList<Integer> insertion = new ArrayList<Integer>();
        insertion.add(list.get(0));
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) < insertion.get(0)){
                insertion.add(0, list.get(i));
            }else{
                for(int j = 0; j < insertion.size(); j++){
                    if(insertion.get(j)>list.get(i)){
                        insertion.add(j, list.get(i));
                    }
                }
                insertion.add(list.get(i));
            }
        }
            
        return insertion;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] arr = new int[arr1.length + arr2.length];
        int a = 0;
        int b = 0;
        int c = 0;
        while(a < arr1.length && b < arr2.length){
            if(arr1[a] > arr2[b]){
                arr[c] = arr2[b];
                b++;
            }else{
                arr[c] = arr1[a];
                a++;
            }
            c++;
        }
        while(a < arr1.length){
            arr[c] = arr1[a];
            a++;
            c++;
        }
        while(b < arr2.length){
            arr[c] = arr2[b];
            b++;
            c++;
        }
        return arr;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
