package arrayspro;

/**
 *
 * @author Hemant-PC
 */
public class one2 {

    public static void main(String[] args) {
        int i = 0, index = 0;
        one2 op = new one2();
//        int[] ar = op.makeLast();

        System.out.println(op.makeLast());
        int value = 6;

        int nextvalue = 323;

//        for (i = 0; i < ar.length; ++i) {
//            System.out.print(ar[i]);
//            if (ar[i] == value) {
//                ar[i] = nextvalue;
//                System.out.println("number changed");
//                index=i;
//                break;
//            }
//        }
//        if (ar[index] != nextvalue) {
            //System.out.println("number not found");
        

    }
public int[] make2(int[] a, int[] b) {
  int i[]=new int[2];
  if(a.length==0&&b.length>2){
  i[0]= b[0];
  i[1] = b[1];
  }
  else if(b.length==0&&a.length>2){
  i[0] = a[0];
  i[1]=a[1]; 
  }  
  
  
  
  
  
  return i;
}

    public boolean makeLast() {
      int[] nums = {3, 2};
//        int l = nums.length;
//        int temp[] = new int[2 * l];
//        temp[temp.length - 1] = nums[nums.length - 1];
        return (nums[0]==nums[nums.length-1]&&nums[0]==2||nums[0]==3);
    }
}
