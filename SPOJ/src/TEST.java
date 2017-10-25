
import java.util.Scanner;


/**
 *
 * @author eduardo
 */
class TEST {

    // http://www.spoj.com/problems/TEST/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dado = sc.nextInt();
        while (dado != 42) {
            System.out.println(dado);
            dado = sc.nextInt();
        }
    }
}
