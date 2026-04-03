package practice;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface  AlphaNums{
	void ShowData(ArrayList<String>Data);	
}

public class Alphabetical {

	public static void main(String[] args) {
		
		ArrayList<String>Comp=new ArrayList<String>();
		Comp.add("Barclays");
		Comp.add("Siemens");
		Comp.add("Coforge");
		Comp.add("Zoho CRM");
		Comp.add("RedHats");
		
		
		AlphaNums A1=(e)->{
			
			List<String>Res=Comp.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
			System.out.println(Res);
		};
		A1.ShowData(Comp);
	}
}
