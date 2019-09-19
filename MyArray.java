




public class MyArray {
  public static void main(String[] args) {
    
    String vituniv[] = {"VIP-AP", "VIT-Vellore", "VIT-Chennai", "VIT-Bhopal"};
    
    int num[] = {1,2,3,4,5};

    int num1[];

    num1 = new int[20];

    System.out.println("THe value of num1 is"+ num1);

    System.out.println("Before changing array value 0:"+ vituniv[0]);

    vituniv[0] = "VIT-Bangalore";

    System.out.println("After changing array value at index 0:" +vituniv[0]);

    System.out.println("Array length is:" + vituniv.length);

    for (int i = 0; i < vituniv.length; i++) 
    {
  		System.out.println("array element at index"+i+":"+vituniv[i]);
	}

	for (int i : num) 
	{
  		System.out.println(i);
  		System.out.println(num);
	}
  }
}