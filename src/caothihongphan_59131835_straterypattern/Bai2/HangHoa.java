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
public abstract class HangHoa {
    protected  String TenHH;
   protected  int gia;
    protected  String mota;

    public HangHoa()
    {
        super();
    }
    public HangHoa(String TenHH, int gia, String mota) {
        this.TenHH = TenHH;
        this.gia = gia;
        this.mota = mota;
    }
    

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
    
    public String hienThiTT() {
      String thongTin = "";
      thongTin = "tên hàng hóa" + TenHH + "giá cả" + gia +"Mô tả " + mota;
//      System.out.println(thongTin);
      return thongTin;
    }

    void inDS() {
    }
    
    
}
