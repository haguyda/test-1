import java.util.Random;

public class exc1 {
    public static void main(String[] args) {
        Random rand1= new Random();
        int[] nums1= new int[15];
        int[] nums2= new int[15];

        for (int i:nums1) {

           nums1[i]= rand1.nextInt(9) ;
            System.out.print(nums1[i]+ " ");
        }
        System.out.println();
        System.out.println("--------------------------------");
        for (int i:nums2) {

            nums1[i]= rand1.nextInt(9) ;
            System.out.print(nums2[i]+ " ");
        }
    }
}