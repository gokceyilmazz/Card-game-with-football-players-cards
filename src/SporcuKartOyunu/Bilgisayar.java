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
public class Bilgisayar extends Oyuncu{

   
    
    public Bilgisayar() {
    }

    public Bilgisayar(String OyuncuAdi,int OyuncuID, int Skor) {
        super(OyuncuAdi, OyuncuID, Skor);
    }



    @Override
    public void  KartSecF(int index) {
          Test.secilen.setFutbolcuAdi(Test.rakip_futbol_cards.get(index).getFutbolcuAdi());
          Test.secilen.setFutbolcuTakim(Test.rakip_futbol_cards.get(index).getFutbolcuTakim());
          Test.secilen.setKaleciKarsiKarsiya(Test.rakip_futbol_cards.get(index).getKaleciKarsiKarsiya());
          Test.secilen.setPenalti(Test.rakip_futbol_cards.get(index).getPenalti());
          Test.secilen.setSerbestVurus(Test.rakip_futbol_cards.get(index).getSerbestVurus());
          Test.secilen.setKart_on(Test.rakip_futbol_cards.get(index).getKart_on());
          Test.bot_secilen_kart.setIcon(new ImageIcon(Test.rakip_futbol_cards.get(index).getKart_on().toString()));
          System.out.println("------------------------------------------------");
          System.out.println("secilen kartın ismi:" +Test.secilen.getFutbolcuAdi());
          System.out.println("secilen kartin takimi:" +Test.secilen.getFutbolcuTakim());
          System.out.println("secilen kartin kaleci kk:" + Test.secilen.getKaleciKarsiKarsiya());
          System.out.println("secilen kartin penaltisi:" + Test.secilen.getPenalti());
          System.out.println("secilen kartin serbest vurusu:" + Test.secilen.getSerbestVurus());
        
    }

    @Override
    public void KartSecB(int index) {
        Test.secilen2.setBasketbolcuAdi(Test.rakip_basketbol_cards.get(index).getBasketbolcuAdi());
        Test.secilen2.setBasketbolcuTakim(Test.rakip_basketbol_cards.get(index).getBasketbolcuTakim());
        Test.secilen2.setIkilik(Test.rakip_basketbol_cards.get(index).getIkilik());
        Test.secilen2.setUcluk(Test.rakip_basketbol_cards.get(index).getUcluk());
        Test.secilen2.setSerbestAtis(Test.rakip_basketbol_cards.get(index).getSerbestAtis());
        Test.secilen2.setKart_on(Test.rakip_basketbol_cards.get(index).getKart_on());
        Test.bot_secilen_kart.setIcon(new ImageIcon(Test.rakip_basketbol_cards.get(index).getKart_on().toString()));
        System.out.println("--------------------------------------------------");
        System.out.println("secilen kartın ismi:" +Test.secilen2.getBasketbolcuAdi());
        System.out.println("secilen kartin takimi:" +Test.secilen2.getBasketbolcuTakim());
        System.out.println("secilen kartin ikilik değeri" + Test.secilen2.getIkilik());
        System.out.println("secilen kartin üçlük değeri:" + Test.secilen2.getUcluk());
        System.out.println("secilen kartin serbest atışı:" + Test.secilen2.getSerbestAtis());
        
        
    }

    @Override
    public int getSkor() {
        return super.getSkor(); 
    }

    @Override
    public void setSkor(int skor) {
        super.setSkor(skor); 
    }

    @Override
    public void SkorGoster() {
        super.SkorGoster(); 
    }
    

  
    
}
