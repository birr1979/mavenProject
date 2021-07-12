public class Test1 {
    public static void main(String[] args) {
        String y="Birhanu dagnew";
        int count;
      count=y.split(" ").length;
        System.out.println(count);

       }
    
    //new method to read the max number from the array
    int array={12,3,4,5,6,1,0,3};
    //using the for loop
    int max=array[0];
    
    for(int i=0;i<array.size();i++){
        if(array[i]>max){
            max=array[i]
            }
    }
    system.out.println(max+ ": is the maximum number in the given array.)
}
