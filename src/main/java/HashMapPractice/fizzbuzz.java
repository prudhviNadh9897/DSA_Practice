package HashMapPractice;

public class fizzbuzz {
    public static void main(String[] args) {
        fizzbuzz(100);
    }

    private static void fizzbuzz(int range){
        for(int i =1; i<=range; i++){
            StringBuilder output =new StringBuilder();
            if(i%3==0){
                output.append("Fizz");
            }
            if(i%5==0){
                output.append("Buzz");
            }
            System.out.println(output.toString().isEmpty()? i: output);

        }
    }
}
