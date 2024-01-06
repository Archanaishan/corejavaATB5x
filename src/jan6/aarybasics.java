package src.jan6;

public class aarybasics {
    public static void main(String[] args) {
        int[]arr1={10,20,30};
        int[]arr2={10,20,30};
        System.out.println(arr1==arr2);//not equal as arr1,arr2 are memory references
        int[]arr3=arr1;
        System.out.println(arr1==arr3);//equal as arr1,arr3 points to same memory location
        System.out.println(arr1.equals(arr2));//false as equals compares references in array.
        // but in string equals compares values
        arr3[0]=100;//reassign values of arr1 also
        System.out.println(arr1[0]+" " +arr3[0]);
        //printing array
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
