package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RemoveDuplicate {
    public static void main(String[] args) {

        Integer[] list = {1,1,2,2,7,7,3,3,7,7,77,77,23,4,54,1,1,2,2,3,4,4,1,2,35,6,6,7};
        Integer[] result = removeDuplicates(list);

        for (Integer integer : result) {
            System.out.print(integer + ", ");
        }

        System.out.println("-----------------------------------");

        String[] listString = {"aa", "bb", "ba", "ff","gg","aa", "ca", "ac", "ca","aa","bb","ff"};
        String[] resultString = removeDuplicatesString(listString);

        for (String s : resultString) {
            System.out.println(s);
        }

    }

    public static Integer[] removeDuplicates(Integer[] input){

        if(input.length == 0){
            return new Integer[0];
        }

        List<Integer> result = new ArrayList<>();
        result.add(input[0]);


        for(int i = 1;input.length>i; i++){
            if(!result.contains(input[i])){
                result.add(input[i]);
            }
        }

        return result.toArray(Integer[]::new);
    }

    public static String[] removeDuplicatesString(String[] input){

        if(input.length == 0){
            return new String[0];
        }

        List<String> result = new ArrayList<>();
        result.add(input[0]);

        for(int i =1; input.length>i; i++){
            boolean bool = true;
            for (String s : result) {
                if (Objects.equals(input[i], s)) {
                    bool = false;
                    break;
                }
            }
            if(bool) result.add(input[i]);
            bool = true;
        }

        return result.toArray(String[]::new);
    }
}
