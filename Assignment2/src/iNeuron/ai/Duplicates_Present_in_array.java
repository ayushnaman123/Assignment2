package iNeuron.ai;

public class Duplicates_Present_in_array {

	public static void main(String[] args) {
		
        String [] arr = {"I am Python Developer", "I am Javascript Developer", "I am full stack Java Developer", "C is basic", "C++", "Python", "I am full stack Java Developer", "Vb.net", "HTML", "C"};
		
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
				 System.out.println("Found Duplicates Element:" +arr[i]);
				 flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("Duplicate Element Not Found");
		}


	}

}
