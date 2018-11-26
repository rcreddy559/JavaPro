package com.org.hackerrank;

public class RearrangeWord {

	public static void main(String[] args) {
		System.out.println(new RearrangeWord().rearrangeWord("hefg"));

	}

	String rearrangeWord(String word) {
		String OldWord = word;
		int length = word.length();
		System.out.println("length: "+length);
		 if(word.length() == 2) {
	            StringBuilder sb = new StringBuilder();
	            sb.append(word.charAt(1));
	            sb.append(word.charAt(0));
	            System.out.println(sb.toString());
	            if(sb.toString().equals(word)) {
	                return "no answar";
	            }
	        }
		System.out.println(word.charAt(0) +":"+ word.charAt(1));

		if (word.length() == 2) {
			if (word.charAt(0) == word.charAt(1)) {
				return "no answar";
			} else  {
				System.out.println( new StringBuffer(word.charAt(1)).append(word.charAt(0)).toString());
				StringBuffer sb = new StringBuffer();
				sb.append(word.charAt(1));
				sb.append(word.charAt(0));
				System.out.println();
				
				return sb.toString();
			}

		}
		
		  if(word.length() > 3) {
	            StringBuilder sb = new StringBuilder();
	            for(int i=0;i<length -2;i++) {
	            	
	                sb.append(word.charAt(i));
	            }
	            
	            sb.append(word.charAt(length-1));
	            sb.append(word.charAt(length-2));
	            System.out.println(sb.toString());
	            return sb.toString();
	        }

		return "no answar";
	}

}
