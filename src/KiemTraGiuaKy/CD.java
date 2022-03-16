package KiemTraGiuaKy;

import java.text.NumberFormat;

public class CD {
    private int MaCD;
    private String TenCD;
    private String CaSy;
    private int SoBH;
    private float Gia;

    public CD()
    {
        
    }
    public int getMaCD() {
        return MaCD;
    }
    public void setMaCD(int MaCD) {
        this.MaCD = MaCD;
    }
    public String getTenCD() {
        return TenCD;
    }
    public void setTenCD(String TenCD) {
        this.TenCD = TenCD;
    }
    public String getCaSy() {
        return CaSy;
    }
    public void setCaSy(String CaSy) {
        this.CaSy = CaSy;
    }
    public int getSoBH() {
        return SoBH;
    }
    public void setSoBH(int SoBH) {
        this.SoBH = SoBH;
    }
    public float getGia() {
        return Gia;
    }
    public void setGia(float Gia) {
        this.Gia = Gia;
    }
    @Override
    public String toString() {
        
        NumberFormat fm = NumberFormat.getCurrencyInstance();
        return "CD [Ma CD=" + MaCD + ", ten CD=" + TenCD + ", ca sy="
 + CaSy
 + ", So bai hat=" + SoBH + ", GiaThanh=" + fm.format(Gia)+ "]";
    }
    public void hienThiCD(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n",MaCD,TenCD,CaSy,SoBH,Gia);
    }
}
