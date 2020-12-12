/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SporcuKartOyunu;

import javax.swing.ImageIcon;

/**
 *
 * @author Gökçe Yılmaz
 */
public class Futbolcu extends Sporcu{
   
   
    private String futbolcuAdi;
    private String futbolcuTakim;
    private int penalti;
    private int serbestVurus;
    private int kaleciKarsiKarsiya;
    private ImageIcon kart_on;
   
   public Futbolcu(){
       this.futbolcuAdi="Bilinmiyor";
       this.futbolcuTakim="Bilinmiyor";
       this.kaleciKarsiKarsiya=0;
       this.penalti=0;
       this.serbestVurus=0;
      
    }
    
    
            
    public Futbolcu(String futbolcuAdi,String futbolcuTakim,int penalti,int serbestVurus,int kalecKarsiKarsiya,ImageIcon kart){
        super(futbolcuAdi,futbolcuTakim);
        this.futbolcuAdi=futbolcuAdi;
        this.futbolcuTakim=futbolcuTakim;
        this.penalti=penalti;
        this.serbestVurus=serbestVurus;
        this.kaleciKarsiKarsiya=kalecKarsiKarsiya;
        this.kart_on = kart;
    }

   
    
      

    /**
     * @return the penalti
     */
    public int getPenalti() {
        return penalti;
    }

    /**
     * @return the serbestVurus
     */
    public int getSerbestVurus() {
        return serbestVurus;
    }

    /**
     * @return the kaleciKarsiKarsiya
     */
    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }


    /**
     * @param futbolcuAdi the futbolcuAdi to set
     */
    public void setFutbolcuAdi(String futbolcuAdi) {
        this.futbolcuAdi = futbolcuAdi;
    }

    /**
     * @return the futbolcuAdi
     */
    public String getFutbolcuAdi() {
        return futbolcuAdi;
    }

    /**
     * @param futbolcuTakim the futbolcuTakim to set
     */
    public void setFutbolcuTakim(String futbolcuTakim) {
        this.futbolcuTakim = futbolcuTakim;
    }
    /**
     * @return the futbolcuTakim
     */
    public String getFutbolcuTakim() {
        return futbolcuTakim;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public void setSerbestVurus(int serbestVurus) {
        this.serbestVurus = serbestVurus;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    public ImageIcon getKart_on() {
        return kart_on;
    }

    public void setKart_on(ImageIcon kart_on) {
        this.kart_on = kart_on;
    }
    
    
     public void showInfos(){
         System.out.println(""+this.getFutbolcuAdi());
         System.out.println(""+this.getFutbolcuTakim());
        
    }
     
     public static boolean kartKullanildiMi(int x){
         if (x==1) {
             System.out.println("kullanildi");
          return true;
        }else{
            return false;
        }
     
     }

    @Override
    public int sporcuPuaniGoster(int puan) {
        switch(puan){
            case 0:
                puan=this.penalti;
                break;
            case 1:
                puan=this.serbestVurus;
                break;
            case 2:
                puan=this.kaleciKarsiKarsiya;
                break;
        }
        return puan;
    }
     
     
   
   
         
     
}
