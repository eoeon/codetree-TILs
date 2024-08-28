import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char aS = sc.next().charAt(0);
        int aT = sc.nextInt();

        char bS = sc.next().charAt(0);
        int bT = sc.nextInt();

        char cS = sc.next().charAt(0);
        int cT = sc.nextInt();

        char aE = ' ';
        char bE = ' ';
        char cE = ' ';


        if ( aS == 'Y' ){

            if ( aT >= 37 ) {
                aE = 'A';
            }

            else {
                aE = 'C';
            }
        }

        if ( aS == 'N' ) {

            if ( aT >= 37 ) {
                aE = 'B';
            }

            else {
                aE = 'D';
            }
        }

        if ( bS == 'Y' ) {
            
            if ( bT >= 37 ){
                bE = 'A';
            }

            else {
                bE = 'C';
            }
        }

        if ( bS == 'N' ) {

            if ( bT >= 37 ){
                bE = 'B';
            }

            else {
                bE = 'D';
            }
        }

        if ( cS == 'Y' ) {

            if ( cT >= 37 ){
                cE = 'A';
            }

            else {
                cE = 'C';
            }
        }

        if ( cS == 'N' ) {

            if ( cT >= 37 ) {
                cE = 'B';
            }

            else {
                cE = 'D';
            }
        
        }


        if ( (( aE == 'A' ) && ( bE == 'A' )) || ( ( bE == 'A' ) && ( cE == 'A' )) || (( aE == 'A' ) && ( cE == 'A' )) || ( ( aE == 'A' ) && ( bE == 'A' ) && ( cE == 'A' ) ) ) {
            System.out.print("E");
        } 

        else {
            System.out.print("N");
        }

    }
}