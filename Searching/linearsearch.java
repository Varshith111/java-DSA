public class linearsearch{
    public static void main(String[] args){
    int[] arr ={2,3,1,5,7,6,4};
    int target = 5;
    System.out.print(search(arr,target));
    }
    static int search(int[] arr ,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i =0 ; i<arr.length ; i++){
            int elem = arr[i];
            if(elem == target){
                return i;
            }
        }
        return -1;
    }
}