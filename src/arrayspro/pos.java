/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayspro;

/**
 *
 * @author Hemant-PC
 */
public class pos {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        o1=o2;
        String s=null;
        System.out.println(s.length());
        if (o1==o2) {
            System.out.println("hello");
        }else{
            System.out.println("hi");
        }
        //int n[]={3,4,10,16,4,3,20,1};
      //  int k[]=tenRen(n);
      //  for (int i = 0; i < k.length; i++) {
     //       System.out.println(k[i]);
   //     }
        System.out.println("");
    }
    public static int[] post4(int n[]){
        int k[]=new int[0];
        
        return k;
    }
    public static int[] tenRen(int n[]){
        int k[] = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            k[i]=n[i];
            if(n[i]==10){
                if (k[i-1]==10) {
                    k[i]=10;
                }
                k[i]=10;
            } 
            if(n[i]==20){
                if (k[i-1]==20) {
                    k[i]=20;
                }
                k[i]=20;
            } 
        }
        return k;
    }
    
}
