
public class Beer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="bottles";
		int compute=99;
		for( ;compute>0;compute--){
			System.out.println(compute+" "+name+" "+"of beer on the wall,"+compute+" "+name+" "+"of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			if((compute-1)==1)
				name="bottle";
			if((compute-1)>0)
				System.out.println((compute-1)+" "+name+" "+"of beer on the wall.");
			if((compute)!=1)
				System.out.println("==============================");
		}
		System.out.println("No more bottles beer on the wall.");
	}

}
