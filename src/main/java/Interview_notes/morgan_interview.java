package Interview_notes;

import Models.Producer;

import java.util.ArrayList;
import java.util.List;

public class morgan_interview {

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
//        List<String> messages = new ArrayList<>();
//
//        Producer producer = new Producer();
//        producer.setMessage("new Message from P1");
//        Thread t1 = new Thread();

        String input = "madammmm";
        String output = "";
        if(isPalindrome(input)){
            output = input;
        }
        System.out.println(output);
//        for(int i=0; i<input.length();i++){
//            for(int j =input.length();j>0;j--){
//
//            }
//
//        }


    }

    private static boolean isPalindrome(String input){
        System.out.println(input.indexOf("mad"));
        return input.substring(input.length()-1,0).equals(input);

    }



}
