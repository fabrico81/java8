package java8.codility;
/*

Short Description: Write a program to decide the winner in the counter game:

Louise and Richard play a game. They have a counter set to N. Louise gets the first turn and the turns alternate thereafter. In the game, they perform the following operations.
If N is not a power of 2, they reduce the counter by the largest power of 2 less than N.
If N is a power of 2, they reduce the counter by half of N.
The resultant value is the new N which is again used for subsequent operations.
The game ends when the counter reduces to 1, i.e., N == 1, and the last person to make a valid move wins.
Given N, your task is to find the winner of the game.
*/


import java.math.BigInteger;

public class CounterGame {
    public static void powerGame(BigInteger N) {
        String winner = "Richard";
        if (N.equals(BigInteger.valueOf(1))) {
            System.out.println(winner);
        } else {
            // convert N to binary. It's a given that this binary number starts with 1.
            String binaryNum = N.toString(2);
            winner = "Louise";
            while (true) {
                // if N is a power of 2, divide by 2 i.e. shift number 1 place right
                // if N is not a power of 2, subtract from largest power of 2 i.e. the leftmost 1
                // always check if N is 1 at the end
                int firstOne = binaryNum.indexOf("1", 1);
                if (firstOne == -1) {		// N is power of 2 (is in the form of 100...0)
                    binaryNum = binaryNum.substring(0, binaryNum.length()-1);
                    if (binaryNum.equals("1")) {
                        System.out.println(winner);
                        break;
                    } else {
                        winner = flipWinner(winner);
                    }
                } else {					// N is not power of 2
                    binaryNum = binaryNum.substring(firstOne);
                    if (binaryNum.equals("1")) {
                        System.out.println(winner);
                        break;
                    } else {
                        winner = flipWinner(winner);
                    }
                }
            }
        }
    }

    public static String flipWinner(String winner){
        if (winner == "Richard"){
            return "Louise";
        } else {
            return "Richard";
        }
    }
/*
                     powerGame(1560834904) === 'Richard' ? 'passed' : 'not passed');
  $('#result2').html(powerGame(1768820483) === 'Richard' ? 'passed' : 'not passed');
  $('#result3').html(powerGame(1533726144) === 'Louise' ? 'passed' : 'not passed');
  $('#result4').html(powerGame(1620434450) === 'Richard' ? 'passed' : 'not passed');
  $('#result5').html(powerGame(1463674015
 */
    public static void main(String[] args) {
        powerGame(BigInteger.valueOf(15));
    }
}

