/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caothihongphan_59131835_straterypattern.Bai3;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class SinhVien {
    String hoTen;
    Date ngaySinh;
    float diemTB;
   

  
    public SinhVien()
    {
        super();
    }
    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    
    
    
}
