package Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AdventOfCode{
    public static void main(String[] args) throws FileNotFoundException{
        File data = new File("AdventOfCode/Day1/CaloriesOnElves.txt");
        Scanner scan = new Scanner(data);
        int max = 0;
        int currentSum = 0;
        ArrayList<Integer> temp = new ArrayList<>(); 
        ArrayList<Integer> calcValues = new ArrayList();
        
        while(scan.hasNext()){
            String line = scan.nextLine();
            if(line.isEmpty()){
                for(int i = 0; i < temp.size(); i++){
                    currentSum += temp.get(i);
                }
                System.out.println(currentSum);
                calcValues.add(currentSum);
                temp.clear();
                currentSum = 0;
            }
            else if(!line.isEmpty()){
                temp.add(Integer.parseInt(line));
            }
        }
        Collections.sort(calcValues);
        System.out.println(calcValues);
        int sumOfNumbers = calcValues.get(calcValues.size()-1) + calcValues.get(calcValues.size()-2) + calcValues.get(calcValues.size()-3);
        System.out.println(sumOfNumbers);
    }
}