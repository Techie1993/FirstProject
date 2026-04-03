package practice;

import java.util.ArrayList;
import java.util.Optional;

@FunctionalInterface
interface MaxLength{
	void Show(ArrayList<String>Data);
}

public class MaxStrLength {

	public static void main(String[] args) {
		
		ArrayList<String>Result=new ArrayList<String>();
		Result.add("Accenture");
		Result.add("Capgemini");
		Result.add("Barclays");
		Result.add("Coforge");
		Result.add("Ernst & Young");
		Result.add("Zoho CRM");
		
		MaxLength M1=(e)->{
			Optional<String> max=Result.stream().max((a,b)->a.length()-b.length());
			max.ifPresent(d->{
				System.out.println(d);
			});

		};	
		
		M1.Show(Result);
	}
}
