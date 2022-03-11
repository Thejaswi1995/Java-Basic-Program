package com.BridgelabzBasicCore;

    import java.util.Scanner;
    public class coin {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int numFlips = 0;
            int heads = 0;
            int tails = 0;
            String answer;


            System.out.print("Please Enter The Number Of Coin Tosses You Want: ");
            numFlips = input.nextInt();

            for(int x = 1;x <= numFlips; x++){
                if(coinToss() == 1){
                    answer = "Tails";
                    tails++;
                }
                else{
                    answer = "Heads";
                    heads++;
                }
                System.out.print("\nCoin Toss " + x + ": " + answer);
            }
            System.out.println("\n\n====== Overall Results ======" +
                    "\nPercentage Of Heads: " + (heads/numFlips)*100 + "\nPercentage Of Tails: " + (tails/numFlips)*100);
        }

        public static int coinToss(){
            double rAsFloat = 1 * (2 + Math.random( ) );
            int r = (int)rAsFloat;
            return r;
        }
    }

