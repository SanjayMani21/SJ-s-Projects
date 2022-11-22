import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Player {

    String P1;
    String P2;
    String player1WinOrnot = null;
    String player2WinOrNot = null;


    String PlayerTurn = P1;
     Scanner sc = new Scanner(System.in);
     Board board = new Board();


    public void P1() {
        if (PlayerTurn == P1) {
            String p1Input = "X";
            System.out.println("Where would you like to place ur 'X' ");
            String input =sc.nextLine(); // 1

            if (input.equals("1")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("1") ){
                            board.matrix[i][j] = String.valueOf(p1Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP1();

                }



            }else if (input.equals("2")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("2") ){
                            board.matrix[i][j] = String.valueOf(p1Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP1();

                }


            }else if (input.equals("3")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("3") ){
                            board.matrix[i][j] = String.valueOf(p1Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP1();

                }


            }else if (input.equals("4")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("4") ){
                            board.matrix[i][j] = String.valueOf(p1Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP1();

                }


            }else if (input.equals("5")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("5") ){
                            board.matrix[i][j] = String.valueOf(p1Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP1();

                }


            }else if (input.equals("6")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("6") ){
                            board.matrix[i][j] = String.valueOf(p1Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP1();

                }


            }else if (input.equals("7")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("7") ){
                            board.matrix[i][j] = String.valueOf(p1Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP1();

                }


            }else if (input.equals("8")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("8") ){
                            board.matrix[i][j] = String.valueOf(p1Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP1();

                }


            }else if (input.equals("9")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("9") ){
                            board.matrix[i][j] = String.valueOf(p1Input);
                        }


                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP1();

                }
            }

        }
        if (player1WinOrnot == "win" ){
            System.out.println( "Player 1 Won ");
            WHoIsTheWinner();

        }else{
            System.out.println("Player 2's turn");
            P2();
        }
}
    public void P2() {
        if (PlayerTurn == P2) {
            String p2Input = "O";
            System.out.println("Where would you like to place ur 'O' ");
            String input =sc.nextLine(); // 1

            if (input.equals("1")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("1") ){
                            board.matrix[i][j] = String.valueOf(p2Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP2();

                }


            }else if (input.equals("2")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("2") ){
                            board.matrix[i][j] = String.valueOf(p2Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP2();

                }


            }else if (input.equals("3")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("3") ){
                            board.matrix[i][j] = String.valueOf(p2Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP2();

                }


            }else if (input.equals("4")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("4") ){
                            board.matrix[i][j] = String.valueOf(p2Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP2();

                }


            }else if (input.equals("5")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("5") ){
                            board.matrix[i][j] = String.valueOf(p2Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP2();

                }


            }else if (input.equals("6")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("6") ){
                            board.matrix[i][j] = String.valueOf(p2Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP2();

                }


            }else if (input.equals("7")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("7") ){
                            board.matrix[i][j] = String.valueOf(p2Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP2();

                }


            }else if (input.equals("8")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("8") ){
                            board.matrix[i][j] = String.valueOf(p2Input);
                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP2();

                }


            }else if (input.equals("9")) {
                for (int i = 0; i < board.matrix.length; i++) {
                    //System.out.println("this is " + i + " row" );

                    for (int j = 0; j < board.matrix[i].length; j++) {
                        //System.out.println("this is " + j + " column ");

                        if(board.matrix[i][j].equals("9") ){
                            board.matrix[i][j] = String.valueOf(p2Input);
                        }
                        else {

                        }

                    }
                    System.out.println(Arrays.toString(board.matrix[i]));
                    CheckForP2();

                }


            }


        } if (player2WinOrNot == "win" ){
            System.out.println( "Player 2 Won ");
            WHoIsTheWinner();

        }else{
            System.out.println("Player 1's Turn");
            P1();
        }

    }
    
    public  void CheckForP1(){
        //Horizontal 1 row

        
        String[] win1 = {"X", "X", "X"};
        String win = Arrays.toString(win1); //converting arrays to string

        String check = Arrays.toString(board.matrix[0]);
        String check1 = Arrays.toString(board.matrix[1]);
        String check2 = Arrays.toString(board.matrix[2]);

        String[][] win2 ={{"X","",""},{"X","",""},{"X","",""}};




        if(check.equals(win) ){
            //System.out.println("win");
            player1WinOrnot = "win";
        }else {

        }
//----------------------------------------------------------------------------
        if(check1.equals(win) ){
            //System.out.println("win");
            player1WinOrnot = "win";
        }else {

        }
//----------------------------------------------------------------------------
        if(check2.equals(win) ){
            //System.out.println("win");
            player1WinOrnot = "win";
        }else {

        }
//----------------------------------------------------------------------------
        //[X, 2, 3]
        //[X, 5, 6]
        //[X, 8, 9]

//col1
        String r0c0 = board.matrix[0][0];
        String r1c0 = board.matrix[1][0];
        String r2c0 = board.matrix[2][0];
//col 2
        String r0c1 = board.matrix[0][1];
        String r1c1 = board.matrix[1][1];
        String r2c1 = board.matrix[2][1];
//col 3
        String r0c2 = board.matrix[0][2];
        String r1c2 = board.matrix[1][2];
        String r2c2 = board.matrix[2][2];

        //----------------------------------------------------------------------------
        if (r0c0== "X" && r1c0 =="X" && r2c0 == "X") {
            //System.out.println("win");
            player1WinOrnot = "win";
        }else{

        }
        //----------------------------------------------------------------------------
        if (r0c1== "X" && r1c1 =="X" && r2c1 == "X") {
            //System.out.println("win");
            player1WinOrnot = "win";
        }else{

        }
        //----------------------------------------------------------------------------
        if (r0c2== "X" && r1c2 =="X" && r2c2 == "X") {
            //System.out.println("win");
            player1WinOrnot = "win";
        }else{

        }
        //----------------------------------------------------------------------------
        if (r0c0== "X" && r1c1 =="X" && r2c2 == "X") {
            //System.out.println("win");
            player1WinOrnot = "win";
        }else{

        }
        //----------------------------------------------------------------------------
        if (r0c2== "X" && r1c1 =="X" && r2c0 == "X") {
            //System.out.println("win");
            player1WinOrnot = "win";
        }else{

        }
    }



    public  void CheckForP2(){
        //Horizontal 1 row


        String[] win1 = {"O", "O", "O"};
        String win = Arrays.toString(win1); //converting arrays to string

        String check = Arrays.toString(board.matrix[0]);
        String check1 = Arrays.toString(board.matrix[1]);
        String check2 = Arrays.toString(board.matrix[2]);

        String[][] win2 ={{"O","",""},{"O","",""},{"O","",""}};




        if(check.equals(win) ){
            //System.out.println("win");
            player2WinOrNot = "win";
        }else {

        }
//----------------------------------------------------------------------------
        if(check1.equals(win) ){
            //System.out.println("win");
            player2WinOrNot = "win";
        }else {

        }
//----------------------------------------------------------------------------
        if(check2.equals(win) ){
            //System.out.println("win");
            player2WinOrNot = "win";
        }else {

        }
//----------------------------------------------------------------------------
        //[X, 2, 3]
        //[X, 5, 6]
        //[X, 8, 9]

//col1
        String r0c0 = board.matrix[0][0];
        String r1c0 = board.matrix[1][0];
        String r2c0 = board.matrix[2][0];
//col 2
        String r0c1 = board.matrix[0][1];
        String r1c1 = board.matrix[1][1];
        String r2c1 = board.matrix[2][1];
//col 3
        String r0c2 = board.matrix[0][2];
        String r1c2 = board.matrix[1][2];
        String r2c2 = board.matrix[2][2];

        //----------------------------------------------------------------------------
        if (r0c0== "O" && r1c0 =="O" && r2c0 == "O") {
            //System.out.println("win");
            player2WinOrNot = "win";
        }else{

        }
        //----------------------------------------------------------------------------
        if (r0c1== "O" && r1c1 =="O" && r2c1 == "O") {
            //System.out.println("win");
            player2WinOrNot = "win";
        }else{

        }
        //----------------------------------------------------------------------------
        if (r0c2== "O" && r1c2 =="O" && r2c2 == "O") {
            //System.out.println("win");
            player2WinOrNot = "win";
        }else{

        }
        //----------------------------------------------------------------------------
        if (r0c0== "O" && r1c1 =="O" && r2c2 == "O") {
            //System.out.println("win");
            player2WinOrNot = "win";
        }else{

        }
        //----------------------------------------------------------------------------
        if (r0c2== "O" && r1c1 =="O" && r2c0 == "O") {
            //System.out.println("win");
            player2WinOrNot = "win";
        }else{

        }



    }


    public void WHoIsTheWinner (){
        WInner wInner = new WInner();
        if (player1WinOrnot == "win"){

        wInner.Player1Celebration();
        }else if (player2WinOrNot == "win"){
        wInner.Player2Celebration();

        }

    }
}

