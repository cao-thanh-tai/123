public class HoaDon {
    private String mahd;
    private String manv;
    private String makh;
    private String ngaylap;
    private int thanhtien;

    public String getMahd() {
        return this.mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getManv() {
        return this.manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMakh() {
        return this.makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getNgaylap() {
        return this.ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public int getThanhtien() {
        return this.thanhtien;
    }

    public void setThanhtien(int thanhtien) {
        this.thanhtien = thanhtien;
    }
    HoaDon(){};
    HoaDon(String mahd,String manv,String makh,String ngaylap,int thanhtien){
        this.mahd=mahd;
        this.manv=manv;
        this.makh=makh;
        this.ngaylap=ngaylap;
        this.thanhtien=thanhtien;
    }
    HoaDon(HoaDon hd){
        this.mahd=hd.mahd;
        this.manv=hd.manv;
        this.makh=hd.makh;
        this.ngaylap=hd.ngaylap;
        this.thanhtien=hd.thanhtien;
    }
}
