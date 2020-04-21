/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caothihongphan_59131835_straterypattern.Bai2;

/**
 *
 * @author DELL
 */
public class Main2 {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HangHoa hanghoa = new HangHoa() {} ;
        
        hanghoa.setTenHH("gao");
        hanghoa.setGia(30000);
        hanghoa.setMota("kg");
        
        System.out.println("danh sach hang hoa");
         hanghoa.inDS();
           

}
}
