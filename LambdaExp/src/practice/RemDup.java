package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface  Removal{
	void ShowData(ArrayList<Integer>Data);	
}

public class RemDup {

	public static void main(String[] args) {
		
		ArrayList<Integer>Data=new ArrayList<Integer>();
		Data.add(10);
		Data.add(5);
		Data.add(12);
		Data.add(12);
		Data.add(5);
		
		Removal R1=(a)->{
			
			List<Integer>Result=Data.stream().distinct().collect(Collectors.toList());
			System.out.println(Result);
			
		};
		R1.ShowData(Data);
		
	}
}
