/** * * * * * * * * * * **
* SharedSecrets.java  *
* @author Joey Yearsley  *
* @version 1.0           *
 * * * * * * * * * * * * */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Math inputs
        int base;
        int modulo;
        //Person-specific
        String name1;
        int private1;
        int publicPrivate1;
        int sharedSecret1;
        String name2;
        int private2;
        int publicPrivate2;
        int sharedSecret2;

        // Initial input gain
        System.out.print("Welcome to the Shared Secret Project! ");
        Scanner stdin = new Scanner(System.in);
        System.out.println("Please input the base value. *INTEGERS ONLY*");
        base = stdin.nextInt();
        System.out.println("Please input the modulo value. *INTEGERS ONLY*");
        modulo = stdin.nextInt();
        System.out.println("Please enter NAME 1");
        name1 = stdin.next();
        System.out.println("Please enter " + name1 + "'s private number");
        private1 = stdin.nextInt();
        System.out.println("Please enter NAME 2");
        name2 = stdin.next();
        System.out.println("Please enter " + name2 + "'s private number");
        private2 = stdin.nextInt();

        //Public-private calculation
        // MUST CAST TO INT because Math.pow will return a double here by default
        publicPrivate1 = (int) (Math.pow(base, private1) % modulo);
        publicPrivate2 = (int) (Math.pow(base, private2) % modulo);

        //Shared secret for each name. 1 is name 1 2 is name 2. Pretty obvious stuff.
        sharedSecret1 = (int) (Math.pow(publicPrivate2, private1) % modulo);
        sharedSecret2 = (int) (Math.pow(publicPrivate1, private2) % modulo);

        //Caclulated key tables
        // NAME 1
        System.out.println(name1 + "'s keys are:");
        System.out.println("private:" + private1);
        System.out.println("public-private" + publicPrivate1);
        System.out.println("shared-secret:" + sharedSecret1);
        // NAME 2
        System.out.println(name2 + "'s keys are:");
        System.out.println("private:" + private2);
        System.out.println("public-private" + publicPrivate2);
        System.out.println("shared-secret:" + sharedSecret2);




    }

}
