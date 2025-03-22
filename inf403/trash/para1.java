class para1 {
	public static void main ( String [] args) {
		String varStr1 = "Строка 1";

		char[] charData = {'w','q','e','r','g'};
		String varStr2 = new String(charData, 1 , 3);
		System.out.println(varStr2);
	}
}