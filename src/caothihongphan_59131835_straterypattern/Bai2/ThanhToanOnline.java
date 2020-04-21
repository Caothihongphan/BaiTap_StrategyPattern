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
public abstract  class ThanhToanOnline implements IThanhToan {


    @Override
    public double thanhtoan(int tienHang) {
        if (tienHang<1000000) 
            return tienHang*0.05 ;
        else 
            return tienHang*0.07;
    }

   
        
}
