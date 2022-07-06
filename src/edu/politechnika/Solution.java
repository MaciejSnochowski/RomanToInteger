package edu.politechnika;

import java.util.*;

public class Solution {
    public int romanToInt(String s) {
        if(s.length()==0|| s.length()>15) return 0;
        int sum=0;
        char[] sToChar= s.toCharArray();
        Map<Character,Integer> romanNumbers= new LinkedHashMap<>();
        //                 key,val
        romanNumbers.put(('I'),1);
        romanNumbers.put(('V'),5);
        romanNumbers.put(('X'),10);
        romanNumbers.put(('L'),50);
        romanNumbers.put(('C'),100);
        romanNumbers.put(('D'),500);
        romanNumbers.put(('M'),1000);

        for (int i = 0; i <sToChar.length; i++) {
                try { //example MCMXLIV


                    if (romanNumbers.get(sToChar[i]) < romanNumbers.get(sToChar[i + 1])) {
                        sum = sum - romanNumbers.get(sToChar[i]);
                    } else {
                        sum += romanNumbers.get(sToChar[i]);
                    }
               }catch (ArrayIndexOutOfBoundsException e){
                    sum += romanNumbers.get(sToChar[i]);
                }

           }

            return sum;

        }


    }


