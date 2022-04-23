package day13_stringManipulation;

import java.util.Locale;

public class C04_IsımGizlemek {
    public static void main(String[] args) {
        //Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin.
        //		            isim-soyisim : M***** B*******
        //		            kart no : **** **** **** 1234

        String isim = "Erkam";
        String soyIsim = "Uslu";
        String kKNo = "1234567890123456";

        String yeniIsim = isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String yeniSoyIsim = soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\S","*");
        String yeniKrediKNo = "**** **** **** "+ kKNo.substring(12);

        System.out.println("isim-soyisim= "+yeniIsim +" "+yeniSoyIsim+"\nyenikart no = "+yeniKrediKNo);
    }
}
