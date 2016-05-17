package acgozlu;

import java.util.ArrayList;

public class AcGozlu {

    public static ArrayList<Sehir> yol = new ArrayList<>();
    
    public static void main(String[] args) {
        Sehir s1 = new Sehir("Afyon", 239);
        Sehir s2 = new Sehir("Ankara", 0);
        Sehir s3 = new Sehir("Balıkesir", 427);
        Sehir s4 = new Sehir("Bolu", 139);
        Sehir s5 = new Sehir("Bursa", 323);
        Sehir s6 = new Sehir("Çanakkale", 547);
        Sehir s7 = new Sehir("Edirne", 565);
        Sehir s8 = new Sehir("Eskişehir", 199);
        Sehir s9 = new Sehir("İstanbul", 350);
        Sehir s10 = new Sehir("İzmir", 521);
        Sehir s11 = new Sehir("Kocaeli", 265);
        Sehir s12 = new Sehir("Kütahya", 253);
        Sehir s13 = new Sehir("Manisa", 490);
        Sehir s14 = new Sehir("Tekirdağ", 468);
        Sehir s15 = new Sehir("Uşak", 328);
        // Afyon komşuları
        s1.komsular.add(s2); s1.komsular.add(s12); s1.komsular.add(s15);
        //Ankara komşuları
        s2.komsular.add(s1); s2.komsular.add(s4); s2.komsular.add(s8);
        //Balıkesir komşuları
        s3.komsular.add(s5); s3.komsular.add(s6); s3.komsular.add(s13);
        //Bolu komşuları
        s4.komsular.add(s2); s4.komsular.add(s11);
        //Bursa komşuları
        s5.komsular.add(s3); s5.komsular.add(s6); s5.komsular.add(s8); s5.komsular.add(s9); s5.komsular.add(s11);
        //Çanakkale komşuları
        s6.komsular.add(s3); s6.komsular.add(s5); s6.komsular.add(s7); s6.komsular.add(s10);s6.komsular.add(s14);
        //Edirne komşuları
        s7.komsular.add(s6); s7.komsular.add(s9); s7.komsular.add(s14);
        //Eskişehir komşuları
        s8.komsular.add(s2); s8.komsular.add(s5); s8.komsular.add(s11); s8.komsular.add(s12);
        //İstanbul komşuları
        s9.komsular.add(s5); s9.komsular.add(s7); s9.komsular.add(s11); s9.komsular.add(s14);
        //İzmir komşuları
        s10.komsular.add(s6); s10.komsular.add(s13); s10.komsular.add(s15);
        //Kocaeli komşuları
        s11.komsular.add(s4); s11.komsular.add(s5); s11.komsular.add(s8); s11.komsular.add(s9);
        //Kütahya komşuları
        s12.komsular.add(s1); s12.komsular.add(s8);
        //Manisa komşuları
        s13.komsular.add(s3); s13.komsular.add(s10);
        //Tekirdağ komşuları
        s14.komsular.add(s6); s14.komsular.add(s7); s14.komsular.add(s9);
        //Uşak komşuları
        s15.komsular.add(s1); s15.komsular.add(s10);
        
        araBeni(s7);
        
        for (int i = 0; i < yol.size(); i++) {
            System.out.print(yol.get(i).sehirAdi + "(" + yol.get(i).kusUcusuMesafe +")");
            if (i < yol.size() - 1) {
                System.out.print(" -> ");
            }else{
                System.out.println("");
            }
        }
        
    }
    
    public static void araBeni(Sehir sehir){
        yol.add(sehir);
        int min, indis = 0;
        if (sehir.kusUcusuMesafe != 0) {
            min = sehir.komsular.get(0).kusUcusuMesafe;
            for (int i = 1; i < sehir.komsular.size(); i++) {
                if (sehir.komsular.get(i).kusUcusuMesafe < min) {
                    min = sehir.komsular.get(i).kusUcusuMesafe;
                    indis = i;
                }
            }
            araBeni(sehir.komsular.get(indis));
        }
    }
    
    public static class Sehir {
	public String sehirAdi;
        public int kusUcusuMesafe;
	public ArrayList<Sehir> komsular = new ArrayList<>();
	
	public Sehir(String sehirAdi, int kusUcusuMesafe) {
            this.sehirAdi = sehirAdi;
            this.kusUcusuMesafe = kusUcusuMesafe;
	}        
    }
    
}
