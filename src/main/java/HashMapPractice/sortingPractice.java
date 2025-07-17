package HashMapPractice;

public class sortingPractice {
    public static void main(String[] args) {
        int[] input = new int[]{23,43,21,1,2,5,799,987,786,1,2,799};

        selectionSort(input);
    }

    public static void selectionSort(int[] input) {

        System.out.println("***starting selection sort***");
        int length = input.length;

        for(int i =0; i<length; i++){
            int indx =i;
            for(int j =i+1; j<length; j++){
                if(input[indx]>input[j]){
                    indx = j;
                }
            }
            if(indx!=i){
                int temp = input[indx];
                input[indx] = input[i];
                input[i] = temp;
            }
        }
        for(int i: input){
            System.out.println(i);
        }
    }


}
