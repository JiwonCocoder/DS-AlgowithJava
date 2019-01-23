package chp3Search;
import java.util.Random;
public class SeqSearchSen {


	public static void main(String[] args) {
		int[] searchArray= {0,1,2,3,4,5,6};
		Random random=new Random();
		int key=random.nextInt(10);
		int indexSearched=-1;
		for(int i:searchArray) {
			if(searchArray[i]==key) {
				indexSearched=i;
				break;
			}
		}
		if(indexSearched<0) 
			System.out.println("no");
		else 
			System.out.println("yes.it's location is "+indexSearched+"and key is "+key);
	}
}
