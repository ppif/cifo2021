package wordsoperations;

public class Vertical {
		
		public static void print(String wordtoPrint) {
			//scope #3
			System.out.print(wordtoPrint);
		}
		
		public static void print(char chartoPrint) {
			//scope #4
			System.out.print(chartoPrint);
		}
		
		public static void linebreak() {
			//scope #5
			System.out.print("\n");
		}
		
		
		public static void printStringHG (String wordtoPrint) {
			//scope #11
			int i = 0;
			linebreak();
			int sizeWordtoPrint = wordtoPrint.length();
			
			while (i < sizeWordtoPrint) {
			print(wordtoPrint.charAt(i) + "" );
			i++; // i = i +1;

			}
			
			
			
		}
		
		
		
	}


