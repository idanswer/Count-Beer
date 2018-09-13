
public class Beer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=new String("bottles");//最好这样，因为java不是c，直接取地址是c的强项
		int compute=99;//先声明不要在循环条件中声明，方便以后更改
		for( ;compute>0;compute--){
			System.out.println(compute+" "+name+" "+"of beer on the wall,"+compute+" "+name+" "+"of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			if((compute-1)==1)//当墙上只有一个酒瓶时，变为单数
				name="bottle";
			if((compute-1)>0)
				System.out.println((compute-1)+" "+name+" "+"of beer on the wall.");
			if((compute)!=1)
				System.out.println("==============================");
		}
		System.out.println("No more bottles beer on the wall.");
	}

}
