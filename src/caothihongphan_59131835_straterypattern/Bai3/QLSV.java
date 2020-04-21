/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caothihongphan_59131835_straterypattern.Bai3;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public abstract class QLSV  implements ISoSanh{
     private ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
     
     public QLSV(ArrayList<SinhVien> dsSinhvien) {
        this.dsSinhVien = dsSinhVien;
    }

    @Override
    public void sapXep() {
        
    }

    @Override
    public void inDS() {
    }

  
  
}
