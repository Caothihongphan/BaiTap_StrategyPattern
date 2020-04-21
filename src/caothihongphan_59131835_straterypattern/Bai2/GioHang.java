/*
 * To change this license header, choose License Headers in Project Properties.
 * To chage this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caothihongphan_59131835_straterypattern.Bai2;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class GioHang implements IThanhToan{
    
    
    double thanhToan;

    public double getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(double thanhToan) {
        this.thanhToan = thanhToan;
    }
    

    

    public ArrayList<HangHoa> getDshanghoa() {
        return dshanghoa;
    }

    public void setDshanghoa(ArrayList<HangHoa> dshanghoa) {
        this.dshanghoa = dshanghoa;
    }
    
    private ArrayList<HangHoa> dshanghoa=new  ArrayList<>();

    public GioHang( ArrayList<HangHoa> dshanghoa) {
        this.dshanghoa=dshanghoa;
    }
    
    //methods

    @Override
    public double thanhtoan(int tienHang) {
        return thanhToan;
    }

  

    @Override
    public void inDS() {
        dshanghoa.forEach(hh->System.out.println(hh.hienThiTT()));
    }
    

   
    
    
}
