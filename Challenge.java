public class Challenge {
	public static String isbn13(String str) {
        if(str.length() == 10) return checkIsbn10(str);
        else if(str.length() == 13) return checkIsbn13(str);
        return "Invalid";
    }

    public static String convertIsbn10ToIsbn13(String str) {
        str = "978" + str.substring(0, str.length() - 1);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) == 'X' ? 10 : Integer.parseInt(str.charAt(i) + "");
            if(i == 0 || i % 2 == 0) sum += num;
            else sum += num * 3;
        }
        return str + (10 - (sum % 10 == 0 ? 10 : sum % 10));
    }

    public static String checkIsbn10(String str) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int num = str.charAt(i) == 'X' ? 10 : Integer.parseInt(str.charAt(i) + "");
            sum += num * (10 - i);
        }
        if(sum % 11 == 0) return convertIsbn10ToIsbn13(str);
        else return "Invalid";
    }

    public static String checkIsbn13(String str){
        int sum = 0;
        for (int i = 0; i < 13; i++) {
            int num = str.charAt(i) == 'X' ? 10 : Integer.parseInt(str.charAt(i) + "");
            if(i == 0 || i % 2 == 0) sum += num;
            else sum += num * 3;
        }
        if(sum % 10 == 0) return "Valid";
        else return "Invalid";
    }
    public static void main(String[] args){
        
    }

}