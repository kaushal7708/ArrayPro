package arrayspro;

public class TwoDArr {

    public static void main(String[] args) {
        int a[][] = new int[3][];
//        System.out.println(a[0][1]);
        int val = 12;
        boolean flag = false;
        a[0] = new int[]{23, 34, 45, 56, 67};
        a[1] = new int[]{12, 23};
        a[2] = new int[]{10, 12, 34, 32};
        on:
        for (int i[] : a) {
            for (int j : i) {
                if (j == val) {
                    flag = true;
                    break on;
                }
            }
        }
        if (flag) {
            System.out.println("found in array");
        } else {
            System.out.println("not found");
        }

    }
}
