package Day2;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class AdventOfCode2 {

    public static void main(String[] args) throws FileNotFoundException {
        File data = new File("Day2/RockPaperScissors.txt");
        Scanner scanner = new Scanner(data);
        int counter = 0;
        int counter2 = 0;

        while (true) {

            //Breaks while(true) loop if no more information is found in txt file
            if (!scanner.hasNext()) {
                break;
            }
            //two lines below get information from txt file and split
            //that information into two parts
            String getDuel = scanner.nextLine();
            String[] parts = getDuel.split(" ");

            if (parts[1].equals("X")) {
                counter += 1;
            } else if (parts[1].equals("Y")) {
                counter += 2;
            } else if (parts[1].equals("Z")) {
                counter += 3;
            }
            // Paper wins against Rock
            if (parts[0].equals("A") && parts[1].equals("Y")) {
                counter += 6;
                // Rock draws Rock
            } else if (parts[0].equals("A") && parts[1].equals("X")) {
                counter += 3;
                // Paper draws Paper
            } else if (parts[0].equals("B") && parts[1].equals("Y")) {
                counter += 3;
                // Scissors beat Paper
            } else if (parts[0].equals("B") && parts[1].equals("Z")) {
                counter += 6;
                // Rock beats Scissors
            } else if (parts[0].equals("C") && parts[1].equals("X")) {
                counter += 6;
                // Scissors draw Scissors
            } else if (parts[0].equals("C") && parts[1].equals("Z")) {
                counter += 3;
            }
            if(parts[0].equals("A")){
                if(parts[1].equals("X")){
                    counter2+=3;
                }else if(parts[1].equals("Y")){
                    counter2+=4;
                }else if(parts[1].equals("Z")){
                    counter2+=8;
                }
            }else if(parts[0].equals("B")){
                if(parts[1].equals("X")){
                    counter2+=1;
                }else if(parts[1].equals("Y")){
                    counter2+=5;
                }else if(parts[1].equals("Z")){
                    counter2+=9;
                }
            }else if(parts[0].equals("C")){
                if(parts[1].equals("X")){
                    counter2+=2;
                }else if(parts[1].equals("Y")){
                    counter2+=6;
                }else if(parts[1].equals("Z")){
                    counter2+=7;
                }
            }
        }
        System.out.println(counter);
        System.out.println(counter2);

    }

}