package java8.codility;

/**
 * @author faber
 */

public class PrintNumbers {

    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7,8,9};

        int i = a[0], j = a.length;
//
//        boolean sentinel =true;
//
//        for( i=i, j=j; i<=5 && j>=5 ; i++, j--) {
//            sentinel = true;
//            while (sentinel) {
//                if (i != j) {
//                    System.out.print(i + "" + j);
//                    i++;
//                    j--;
//                } else {
//                    sentinel = false;
//                    System.out.print(i);
//                    int temp = i;
//                    i = i-(j-1);
//                    j = j+(temp-i);
//                    System.out.println("");
//                }
//            }
//        }

         for( i=1, j=9; i<=5 && j>=5 ; i++, j--){
             if(i!=j){
                 System.out.print(i +""+ j);
             }else{
                 System.out.println(i+"");
                 int temp = i;
                 i = temp-1;
                 j = temp + (temp -1);
             }
         }


    }
}
