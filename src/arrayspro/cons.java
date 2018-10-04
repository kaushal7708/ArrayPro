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
public class cons {
    String ar;
    int $i;
    static cons c1,c2;
    double j;
    {
        System.out.println("instance block cllled");
    }

    static 
    {
        System.out.println("staic block called");
    }
    cons(){}
    public cons(String ar, int i, double j) {
        this.ar = ar;
        this.$i = i;
        this.j = j;
    }
    public static void main(String[] args) {
        
        cons[] ccc={c1, c2};
     cons c=new cons();
     cons cc=new cons();
    }
    void sum(int i,int j){
        System.out.println(i+j);
    }
    int sum(float i, int j){
        return (int)i+j;
    }
}
