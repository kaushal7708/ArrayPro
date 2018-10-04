package arrayspro;
public class ArraysPro {
    public static void main(String[] args) {
        int array[] = {2, 3, 4, 5, 6, 7, 8, 9};
        int in[] = new int[3];
        in[0] = 12;
        in[2] = 32;
        in[1] = 43;
        System.out.println("for each");
         for (int i : in) {
            System.out.print(i + " \t");
        }
         System.out.println();
         System.out.println("for ");
         for (int i = 0; i < in.length; i++) {
             System.out.print(in[i]+"\t");
        }
        System.out.println();
        System.out.println("for each");
        for (int i : array) {
            System.out.print(i + " \t");
        }
        System.out.println();
        System.out.println("for ");
        for (int i = 0; i < array.length; i++) {
             System.out.print(array[i]+"\t");
        }
        System.out.println();

    }
}