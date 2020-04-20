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
public class HangHoa {
    String TenHH;
    int gia;
    String mota;

    public String getTenHH() {
        return TenHH;
    }

    public int getGia() {
        return gia;
    }

    public String getMota() {
        return mota;
    }

    public void setTenHH(String TenHH) {
        this.TenHH = TenHH;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    
    @Override
    public String toString() {
        return "HangHoa@[Ten Hang Hoa=" + TenHH + ", Gia=" + gia + ",mo ta : "+ mota+"]";
    }
}
