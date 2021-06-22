package java8.codility;

import static java.lang.Integer.max;


public class SumArrayElement {


    public static void main(String[] args){


//        Stream<Integer> s = Stream.of(5, 10, 20, 50);
//        Integer i = s.reduce((integer1, integer2)-> integer2 - integer1).orElse(-1);
//
//        System.out.println(i);

        int [] A = {8, 4, 0, 5, -3, 6};
        System.out.println(solution(A));

    }


        public static int solution(int []A) {
                int index = 0;
                int result = 0;

                for(int i = 0; i < A.length-1; i++){
                    int total = A[i] + i + A[index] - index;
                    result = max(result, total);
                    if(A[i] - i > A[index] - index){
                        index = i;
                    }
                }
                return result;
    }

}


