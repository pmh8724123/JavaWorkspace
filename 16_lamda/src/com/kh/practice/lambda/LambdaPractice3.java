package com.kh.practice.lambda;


public class LambdaPractice3 {
	public static void main(String[] args) {
		MyFunction <String, String> first = String::toUpperCase; //(str) -> str.toUpperCase();
		System.out.println(first.apply("asdf"));
		
		MyFunction <String, Boolean> second = (str) -> str.length() >= 5;
		System.out.println(second.apply("asddfe"));
		
		MyFunction <String, String> third = (str) ->{ 
			String[] arr = str.split("");
			StringBuilder sb = new StringBuilder();
			for(String s : arr) {
				sb.append(s).append("-");
			}
			
			sb.deleteCharAt(sb.length()-1);
			
			return sb.toString();
		};
		System.out.println(third.apply("lambda"));
		
	}
	
	@FunctionalInterface
	interface MyFunction<V, B>{
		B apply(V v);
	}
}
