

import java.util.Arrays;

public class DSHD {
    HoaDon dshd[];

    void input1HD(String mahd,String manv,String makh,String ngaylap,int thanhtien){
        if(viTriHD(mahd)==-1){
            dshd=Arrays.copyOf(dshd, dshd.length);
            dshd[dshd.length-1]=new HoaDon(mahd,manv,makh,ngaylap,thanhtien);
        }
    }
    void detele1HD(String mahd){
        int k=viTriHD(mahd);
        if(k!=-1){
            for(int i=viTriHD(mahd);i<dshd.length;i++)
            {
                dshd[i]=dshd[i+1];
            }
            dshd=Arrays.copyOf(dshd, dshd.length-1);
        }
    }
    void sua1Manv(String mahd,String str){
        int k=viTriHD(mahd);
        if(k!=-1){
            dshd[k].setManv(str);
        }
    }
    void sua1Makh(String mahd,String str){
        int k=viTriHD(mahd);
        if(k!=-1){
            dshd[k].setMakh(str);
        }
    }void sua1NgayLap(String mahd,String str){
        int k=viTriHD(mahd);
        if(k!=-1){
            dshd[k].setNgaylap(str);
        }
    }
    HoaDon searchHoaDon(String mahd){
        int k=viTriHD(mahd);
        if(k==-1) return null;
        return dshd[k];
    }



    
    int viTriHD(String mahd){
        for(int i=0;i<dshd.length;i++)
            if(dshd[i].getMahd()==mahd) return i;
        return -1;
    }
}
