package chp1;
import java.util.Scanner;
import java.util.Random;
class MaxOfArray{
    static int maxof(int[] maxArray){
        int max=maxArray[0];
        for(int i=1;i<maxArray.length;i++){
            if(max<maxArray[i])
                max=maxArray[i];
        }
        return max;
    }
    static int[] inverse(int[] array) {
    	for(int i=0;i<(array.length/2);i++) {
    		int temp=array[i];
    		array[i]=array[array.length-1-i];
    		array[array.length-i-1]=array[i];
    	}
    	return array;
    }
    static boolean equal(int[] array_left, int[] array_right) {
    	if(array_left.length!=array_right.length)
    		return false;
    	for(int i=0; i<array_left.length;i++) {
    		if(array_left[i]!=array_right[i])
    			return false;
    	}
		return false;
    	
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand=new Random();
        System.out.print("how many person?");
        int num=stdIn.nextInt();

        int[] height= new int[num];
        for(int i=0; i<height.length;i++){
            height[i]=100+rand.nextInt(90);
            System.out.println(height[i]);
        }
        System.out.println("max="+maxof(height));
        int[] height_inverse=new int[height.length];
        
        height_inverse=inverse(height);
        for(int i=0;i<height.length;i++) {
        	System.out.println(height[i]);
        }
        System.out.println("두배열은"+(equal(height,height_inverse)?"같습니다":"같지　않습니다"));
    }

}



   