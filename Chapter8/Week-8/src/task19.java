public class task19 {
    //输出最大值 无需输入
    public static void main(String[] args) {
        printMax(1,3,5,7);
        printMax( new double[]{1,3,5,7} );
    }

    //Declare a printMax method
    public static void printMax(double...numbers){
        if(numbers.length ==0){
            System.out.println("No argument is passed");
            return;
        }
        double max =numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max =numbers[i];
            }
        }
        System.out.println("The max value is "+max);
    }

}
