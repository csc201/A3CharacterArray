public class CharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder input = new StringBuilder("800 Test St VA");
		//String newInput ="";
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
			if(Character.isDigit(input.charAt(i))) {
				input.replace(i, i+1,"*");
				//input[i] = '*';
			}

			//	System.out.print(input.substring(i, i+1).toCharArray()[0]);
			System.out.println(input);
		}


	}

}
