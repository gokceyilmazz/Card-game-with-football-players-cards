/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SporcuKartOyunu;

/**
 *
 * @author Gökçe Yılmaz
 */
public class Sporcu {
    private String sporcuIsim;
    private String sporcuTakim;
    
    public Sporcu(){
    }
    
    public Sporcu(String sporcuIsim,String sporcuTakim){
    this.sporcuIsim= sporcuIsim;
    this.sporcuTakim= sporcuTakim;
    }
    
    public int sporcuPuaniGoster(int puan){
       return puan; 
    }
    
}
