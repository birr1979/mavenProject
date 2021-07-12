public class Test1 {

    public static void arrayMax(){
        //new method to read the max number from the array
        int [] array={12,3,4,5,6,1,0,3};
        //using the for loop to iterate through the numbers in the array
        int max=array[0];
        int size=array.length;

        for(int i = 0; i<size; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(new StringBuilder().append(max).append(": is the maximum number in the given array.").toString());

    }

    public static void main(String[] args) {
        String y="Birhanu dagnew";
        int count;
      count=y.split(" ").length;
        System.out.println(count);
        arrayMax();

       }

}
