/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caothihongphan_59131835_straterypattern.Bai1;

/**
 *
 * @author DELL
 */
public class Main1 {
    public static void main(String[] args) {
        Context context1 = new Context();
        
        
        context1.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + context1.tinh(75, 12));
        
        context1.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + context1.tinh(54, 78));
        
        
    }
}
