/**
 *
 */
package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author corrente
 *
 * Check array divisible by 4
 *
 *
 */
public class Java8 {

    /**
     * @param args
     */

    public static void main(String[] args) {

        Solution s = new Solution();
        Integer T1 []= {-3,10,-5,7,8,25,27,3}; //24
        Integer T2 [] = {2,-3,3,1,10,8,2,5,13,-5,3,-18}; //21
        Integer [] resultArray;
        String result = s.solution(T1);
        System.out.println(result);
    }

    static class Solution {

        public static final String WINTER = "WINTER";
        public static final String SPRING = "SPRING";
        public static final String SUMMER = "SUMMER";
        public static final String AUTUMN = "AUTUMN";



        public String solution(Integer[] T) {

            try {


                Integer arrayElements = T.length;
                Integer measureForSeason = arrayElements / 4;
                Integer seasonMeasures = arrayElements/measureForSeason;
                List<Integer> listValue =  Arrays.asList(T);
                HashMap<String, Integer> seasons= new HashMap<>();
                int winter = 0;
                int spring = 0;
                int summer = 0;
                int autumn = 0;

                if(measureForSeason == 2){

                    for(int i =0 ; i < listValue.size()-1; i++){

                        int maxDifference = Math.abs(listValue.get(i+1) - listValue.get(i));
                        for(int j = i+2; j< listValue.size()-1;j++ ){
                            if(maxDifference < Math.abs(listValue.get(j+1) - listValue.get(j))){
                                maxDifference = Math.abs(listValue.get(j+1) - listValue.get(j));
                            }
                        }
                    }

                    winter = checkNegativeNumber(T,1,0);
                    spring = checkNegativeNumber(T,3,2);
                    summer = checkNegativeNumber(T,5,4);
                    autumn = checkNegativeNumber(T,7,6);
                }else if(measureForSeason == 3){
                    winter = T[2]- T[1] - T[0];
                    spring = T[5]- T[4] - T[3];
                    summer = T[8] - T[7] - T[6];
                    autumn = T[11] - T[10] - T[9];
                }
                seasons.put(WINTER, Math.abs(winter));
                seasons.put(SPRING, Math.abs(spring));
                seasons.put(SUMMER, Math.abs(summer));
                seasons.put(AUTUMN, Math.abs(autumn));

                Integer value = seasons.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
                String key = seasons.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

                StringBuilder result = new StringBuilder();

                result.append(key);
                result.append(":");
                result.append(value);

                return result.toString();
            }catch (Exception e){
                return null;

            }
        }

        private Integer checkNegativeNumber(Integer[] T, int a, int b) {
            int season=0;
            if(T[b] < 0 ){
                season = Math.abs(T[a] + T[b]);
            }else{
                season = Math.abs(T[a] - T[b]);
            }
            return season;
        }
    }

    private Integer operator(Integer a, Integer b){

        if(b<0){
            a=a+b;
        }else{
            a=a-b;
        }
        return Math.abs(a);
    }

}
