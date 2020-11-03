package day10;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.*;
public class Bifi {
	
	public static void main(String[] args) {
		
	BiFunction<Double,Double,Double> pow =(a,b) ->(Math.pow(a,b));
	System.out.println(pow.apply(2.0,3.0));
	
	
	Function<String,Character>  b =(String a) -> {
		 Character ch=null;
		for(int i=0;i<a.length();i++) 
		{ ch= a.charAt(i);
			System.out.println(ch);
		}
		return ch;
		
	};
	
			System.out.println(b.apply("HCL"));
	
	
    

}
}