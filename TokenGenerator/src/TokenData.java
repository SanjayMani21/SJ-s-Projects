public class TokenData {
    int yourToken;
    int totalTokenPerDay = 50 ;
  int[] tokens = new int[totalTokenPerDay];


    public void NumberOfTokens(){

        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = i+1;
        }
    }




    public static void main(String[] args) {
        TokenData data = new TokenData();


    }



}
