public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String result = middleChar(input);
        System.out.println(result);
    }

    private static String middleChar(String input) {
        String result = "";

        if (input.length()%2==0){
            for (int i = (input.length()/2)-1; i <=(input.length()/2) ; i++) {
                result=result+input.charAt(i);
            }
        }else {
            for (int i = input.length()/2; i <=input.length()/2 ; i++) {
                result = result+input.charAt(i);
            }
        }
        return result;
  
