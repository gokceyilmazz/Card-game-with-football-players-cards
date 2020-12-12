/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SporcuKartOyunu;

import java.util.ArrayList;

/**
 *
 * @author Gökçe Yılmaz
 */
public abstract class Oyuncu {
    private String oyuncuAdi;
    private int oyuncuID;
    public int skor=0;
    public ArrayList<Futbolcu> futbolcu_players=new ArrayList<Futbolcu>();
    public ArrayList<Basketbolcu> basketbolcu_players=new ArrayList<Basketbolcu>();
   
    
   
    
    public Oyuncu(){
    }
    
    public Oyuncu(String oyuncuAdi,int oyuncuID,int skor){
       this.oyuncuAdi= oyuncuAdi;
       this.oyuncuID= oyuncuID;
       this.skor= skor;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }
    
    public String getoyuncuAdi(){
        return oyuncuAdi;
    }
    
    public void SkorGoster(){
        System.out.println(""+this.getSkor());
    }

     /**
     * @param skor the skor to set
     */
    public void setSkor(int skor) {
        this.skor = skor+10;
    }
    
    /**
     * @return the skor
     */
    public int getSkor() {
        return skor;
    }

    public abstract void KartSecF(int index);
    public abstract void KartSecB(int index);
    
    
    
    
}
