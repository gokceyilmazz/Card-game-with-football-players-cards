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
public class Basketbolcu extends Sporcu{
   
   
    private String basketbolcuAdi;
    private String basketbolcuTakim;
    private int ikilik;
    private int ucluk;
    private int serbestAtis;
    private ImageIcon kart_on;
    
    public Basketbolcu(){
       this.basketbolcuAdi="Bilinmiyor";
       this.basketbolcuTakim="Bilinmiyor";
       this.ikilik=0;
       this.serbestAtis=0;
       this.ucluk=0;
       
    }
    
     public  Basketbolcu(String basketbolcuAdi,String basketbolcuTakim,int ikilik,int ucluk,int serbestAtis,ImageIcon kart){
       
        
        this.basketbolcuAdi=basketbolcuAdi;
        this.basketbolcuTakim=basketbolcuTakim;
        this.ikilik=ikilik;
        this.ucluk=ucluk;
        this.serbestAtis=serbestAtis;
        this.kart_on = kart;
    }

   
     
     

    /**
     * @return the ikilik
     */
    public int getIkilik() {
        return ikilik;
    }

    /**
     * @return the ucluk
     */
    public int getUcluk() {
        return ucluk;
    }

    /**
     * @return the serbestAtis
     */
    public int getSerbestAtis() {
        return serbestAtis;
    }
      
    

    /**
     * @param basketbolcuAdi the basketbolcuAdi to set
     */
    public void setBasketbolcuAdi(String basketbolcuAdi) {
        this.basketbolcuAdi = basketbolcuAdi;
    }

    /**
     * @return the basketbolcuAdi
     */
    public String getBasketbolcuAdi() {
        return basketbolcuAdi;
    }

    /**
     * @param basketbolcuTakim the basketbolcuTakim to set
     */
    public void setBasketbolcuTakim(String basketbolcuTakim) {
        this.basketbolcuTakim = basketbolcuTakim;
    }

    /**
     * @return the basketbolcuTakim
     */
    public String getBasketbolcuTakim() {
        return basketbolcuTakim;
    }
    
    
    /**
     * @param ikilik the ikilik to set
     */
    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    /**
     * @param ucluk the ucluk to set
     */
    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    /**
     * @param serbestAtis the serbestAtis to set
     */
    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    /**
     * @param kart_on the kart_on to set
     */
    public void setKart_on(ImageIcon kart_on) {
        this.kart_on = kart_on;
    }
    
    
    /**
     * @return the kart_on
     */
    public ImageIcon getKart_on() {
        return kart_on;
    }
    
    
     public void showInfos(){
         System.out.println(""+this.getBasketbolcuAdi());
         System.out.println(""+this.basketbolcuTakim);
        
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
                puan=this.ikilik;
                break;
            case 1:
                puan=this.ucluk;
                break;
            case 2:
                puan=this.serbestAtis;
                break;
        }
        return puan;
    }
     
    


}
