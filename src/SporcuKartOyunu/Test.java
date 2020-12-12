
package SporcuKartOyunu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Gökçe Yılmaz
 */
public class Test extends javax.swing.JFrame {
    
    public static ArrayList<Futbolcu> futbolcu_players=new ArrayList<Futbolcu>();
    public static ArrayList<Basketbolcu> basketbolcu_players=new ArrayList<Basketbolcu>();
    public static Kullanıcı oyuncu = new Kullanıcı("",1,0);
    public static Bilgisayar bot= new Bilgisayar("Bilgisayar",2,0);
    public static Futbolcu secilen = new Futbolcu();
    public static Basketbolcu secilen2 = new Basketbolcu();
    public static ArrayList <Futbolcu> kullanici_futbol_cards =new ArrayList<>(4);
    public static ArrayList <Futbolcu> rakip_futbol_cards =new ArrayList<>(4);
    public static ArrayList <Basketbolcu> kullanici_basketbol_cards =new ArrayList<>(4);
    public static ArrayList <Basketbolcu> rakip_basketbol_cards =new ArrayList<>(4);
    
     public static ArrayList <Integer> sayi= new ArrayList<Integer>(4);
     public static ArrayList <Integer> botkart= new ArrayList<Integer>(4);
     
    
    Futbolcu fernandinho= new Futbolcu("Fernandinho","Manchester City FC",70,76,66,new ImageIcon ("src\\FutbolcuImg\\Fernandinho.jpg"));
    Futbolcu neymar= new Futbolcu("Neymar JR","Paris Saint-Germain FC",70,95,91,new ImageIcon ("src\\FutbolcuImg\\Neymar.jpg"));
    Futbolcu ibrahimovic= new Futbolcu("Zlatan Ibrahimovic","AC Milan",70,78,56,new ImageIcon ("src\\FutbolcuImg\\ibrahimovic.jpg"));
    Futbolcu suarez= new Futbolcu("Luis Suarez","Atletico Madrid",70,85,73,new ImageIcon ("src\\FutbolcuImg\\luisSuarez.jpg"));
    Futbolcu messi= new Futbolcu("Lionel Messi","FC Barcelona",70,96,87,new ImageIcon ("src\\FutbolcuImg\\messi.jpg"));
    Futbolcu salah= new Futbolcu("Mohamed Salah","Liverpool FC",70,89,93,new ImageIcon ("src\\FutbolcuImg\\mohamedSalah.jpg"));
    Futbolcu rodriguez= new Futbolcu("James Rodriguez","Torino FC",70,85,55,new ImageIcon ("src\\FutbolcuImg\\rodriguez.jpg"));
    Futbolcu ronaldo= new Futbolcu("Cristiano Ronaldo","Juventus FC",70,89,90,new ImageIcon ("src\\FutbolcuImg\\ronaldo.jpg"));
    
    Basketbolcu dwyane= new Basketbolcu("Dwyane Wade","Miami Heat",85,80,87,new ImageIcon ("src\\BasketbolcuImg\\DwyaneWade.jpg"));
    Basketbolcu durant= new Basketbolcu("Kevin Durant","Brooklyn Nets",75,82,78,new ImageIcon ("src\\BasketbolcuImg\\KevinDurant.jpg"));
    Basketbolcu kobe= new Basketbolcu("Kobe Bryant","Los Angeles Lakers",90,80,85,new ImageIcon ("src\\BasketbolcuImg\\KobeBryant.jpg"));
    Basketbolcu johnson= new Basketbolcu("Magic Johnson","Magic Great Danes",85,90,85,new ImageIcon ("src\\BasketbolcuImg\\MagicJohnson.jpg"));
    Basketbolcu shaquille= new Basketbolcu("Shaquille O'Neal","Boston Celtics",80,82,80,new ImageIcon ("src\\BasketbolcuImg\\Shaquille.jpg"));
    Basketbolcu curry= new Basketbolcu("Stephen Curry","Golden State Warriors",85,95,90,new ImageIcon ("src\\BasketbolcuImg\\StephenCurry.jpg"));
    Basketbolcu jordan= new Basketbolcu("Michael Jordan","Washington Wizards",95,90,95,new ImageIcon ("src\\BasketbolcuImg\\jordan.jpg"));
    Basketbolcu lebron= new Basketbolcu("LeBron James","Los Angeles Lakers",90,90,92,new ImageIcon ("src\\BasketbolcuImg\\lebron.jpg"));
    Basketbolcu abd =new Basketbolcu();
    
    
    
    int puan=0;
    
  
    public Test() {
        initComponents();
        geri_cek1.setVisible(false);
        geri_cek2.setVisible(false);
        geri_cek3.setVisible(false);
        geri_cek4.setVisible(false);
        geri_cek5.setVisible(false);
        geri_cek6.setVisible(false);
        geri_cek7.setVisible(false);
        geri_cek8.setVisible(false);
        
        
         sayi.add(0);
         sayi.add(1);
         sayi.add(2);
         sayi.add(3);
         degerKaristir();
         
         botkart.add(0);
         botkart.add(1);
         botkart.add(2);
         botkart.add(3);
         Collections.shuffle(botkart);
         
        
        futbolcu_players.add(fernandinho);
        futbolcu_players.add(neymar);
        futbolcu_players.add(ibrahimovic);
        futbolcu_players.add(messi);
        futbolcu_players.add(suarez);
        futbolcu_players.add(salah);
        futbolcu_players.add(rodriguez);
        futbolcu_players.add(ronaldo);
        
        basketbolcu_players.add(dwyane);
        basketbolcu_players.add(durant);
        basketbolcu_players.add(kobe);
        basketbolcu_players.add(johnson);
        basketbolcu_players.add(shaquille);
        basketbolcu_players.add(curry);
        basketbolcu_players.add(jordan);
        basketbolcu_players.add(lebron);
      
       
          
        for(int i =0; i< futbolcu_players.size();i++){
            
         }
           System.out.println("--------------");

                karistir(futbolcu_players);

              for(int i =0; i< futbolcu_players.size();i++){
          System.out.println(futbolcu_players.get(i).getFutbolcuAdi());
             }
            
              
              for(int i =0; i< basketbolcu_players.size();i++){
             System.out.println(basketbolcu_players.get(i).getBasketbolcuAdi());
         }
           System.out.println("--------------");

                karistir2(basketbolcu_players);

              for(int i =0; i< basketbolcu_players.size();i++){
          System.out.println(basketbolcu_players.get(i).getBasketbolcuAdi());
             }
              
              
              listeler();
              
           
         kullanici1.setIcon(Test.kullanici_futbol_cards.get(0).getKart_on());
         kullanici2.setIcon(Test.kullanici_futbol_cards.get(1).getKart_on());
         kullanici3.setIcon(Test.kullanici_futbol_cards.get(2).getKart_on());
         kullanici4.setIcon(Test.kullanici_futbol_cards.get(3).getKart_on());
         kullanici5.setIcon(Test.kullanici_basketbol_cards.get(0).getKart_on());
         kullanici6.setIcon(Test.kullanici_basketbol_cards.get(1).getKart_on());
         kullanici7.setIcon(Test.kullanici_basketbol_cards.get(2).getKart_on());
         kullanici8.setIcon(Test.kullanici_basketbol_cards.get(3).getKart_on());  
         
        
    }
    
 
     public static void karistir(ArrayList<Futbolcu> futbolcu){
            Collections.shuffle(futbolcu);
     }
     
     public static void karistir2(ArrayList<Basketbolcu> basketbolcu){
            Collections.shuffle(basketbolcu);
     }
     
     public static void listeler(){
        
         for(int i = 0 ; i<futbolcu_players.size()-4;i++){
              kullanici_futbol_cards.add(futbolcu_players.get(i));
              System.out.println("isimler:" + kullanici_futbol_cards.get(i).getFutbolcuAdi());
         }
         System.out.println("-------------------------");
         for(int i=4;i<futbolcu_players.size();i++){
             rakip_futbol_cards.add(futbolcu_players.get(i));
             System.out.println("rakip isimler:" + rakip_futbol_cards.get(i-4).getFutbolcuAdi());
         }
          for(int i = 0 ; i<basketbolcu_players.size()-4;i++){
              kullanici_basketbol_cards.add(basketbolcu_players.get(i));
              System.out.println("isimler:" + kullanici_basketbol_cards.get(i).getBasketbolcuAdi());
         }
         System.out.println("-------------------------");
         for(int i=4;i<basketbolcu_players.size();i++){
             rakip_basketbol_cards.add(basketbolcu_players.get(i));
             System.out.println("rakip isimler:" + rakip_basketbol_cards.get(i-4).getBasketbolcuAdi());
         }
         
     }
     
     public static int degerDondur(){
       Random random=new Random();
        int puan=random.nextInt(3);
       
        return puan;
     }
     
     
     public static void karsilastir(int kullanici,int bilgisayar){
         int esitlik=0;
     if(kullanici>bilgisayar){
         oyuncu.setSkor(oyuncu.skor);
         oyuncu.getSkor();
         System.out.println("kullanici kazandı");
         skorAciklama.setText("Kullanıcı kazandı +10 puan");
     }
     else if(bilgisayar>kullanici){
         bot.setSkor(bot.skor);
         bot.getSkor();
         System.out.println("bilgisayar kazandı");
         skorAciklama.setText("Bilgisayar kazandı +10 puan");
     }
     else if(bilgisayar==kullanici){
         esitlik=1;
         System.out.println("Berabere kartlar geri çekildi");
         skorAciklama.setText("Eşitlik var KARTI GERİ ÇEK butonuna bas");
     }
     }
     
     public static void ekrandaGoster(){
        int a=bot.getSkor();
         String b=Integer.toString(a);
         bilgisayarSkor.setText(b);
         
         int c=oyuncu.getSkor();
         String d=Integer.toString(c);
         kullaniciSkor.setText(d);
       
     }
     
     public static void pozisyonGosterF(int a){
     if(a==0)
         secilenPozisyon.setText("Seçilen değer: Penaltı");
     else if(a==1)
         secilenPozisyon.setText("Seçilen değer: Serbest Vuruş");
     else if(a==2)
         secilenPozisyon.setText("Seçilen değer: Kaleciyle Karşı K.");
     }
     
     public static void pozisyonGosterB(int y){
     if(y==0)
         secilenPozisyon.setText("Seçilen değer: İkilik");
     else if(y==1)
         secilenPozisyon.setText("Seçilen değer: Üçlük");
     else if(y==2)
         secilenPozisyon.setText("Seçilen değer: Serbest Atış");
     }
     
     
     public static void degerKaristir(){
      Collections.shuffle(sayi);
     }
     
     public static void sonucEkrani(){
         if(bot.getSkor()+oyuncu.getSkor()==80){
              if(bot.getSkor()>oyuncu.getSkor()){
        JLabel message=new JLabel("Bilgisayar Kazandı!!!");   
        message.setFont(new Font("Arial",Font.BOLD,48));
        JOptionPane.showMessageDialog(null, message);
              }
              else if(bot.getSkor()<oyuncu.getSkor()){
              JLabel message=new JLabel("Kullanıcı Kazandı!!!");   
        message.setFont(new Font("Arial",Font.BOLD,48));
        JOptionPane.showMessageDialog(null, message);
              }
              else{
              JLabel message=new JLabel("Berabere bitti!!!");   
        message.setFont(new Font("Arial",Font.BOLD,48));
        JOptionPane.showMessageDialog(null, message);
              }
                 
          }
     }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bilgisayarAdi = new javax.swing.JLabel();
        oyuncuAdi = new javax.swing.JLabel();
        kullanici_secilen_kart = new javax.swing.JLabel();
        bot_secilen_kart = new javax.swing.JLabel();
        skorAciklama = new javax.swing.JLabel();
        secilenPozisyon = new javax.swing.JLabel();
        geri_cek1 = new javax.swing.JButton();
        geri_cek2 = new javax.swing.JButton();
        geri_cek3 = new javax.swing.JButton();
        geri_cek4 = new javax.swing.JButton();
        geri_cek5 = new javax.swing.JButton();
        geri_cek6 = new javax.swing.JButton();
        geri_cek7 = new javax.swing.JButton();
        geri_cek8 = new javax.swing.JButton();
        bilgisayar8 = new javax.swing.JButton();
        bilgisayar7 = new javax.swing.JButton();
        bilgisayar6 = new javax.swing.JButton();
        bilgisayar5 = new javax.swing.JButton();
        bilgisayar4 = new javax.swing.JButton();
        bilgisayar3 = new javax.swing.JButton();
        bilgisayar2 = new javax.swing.JButton();
        bilgisayar1 = new javax.swing.JButton();
        kullanici8 = new javax.swing.JButton();
        kullanici7 = new javax.swing.JButton();
        kullanici5 = new javax.swing.JButton();
        kullanici6 = new javax.swing.JButton();
        kullanici4 = new javax.swing.JButton();
        kullanici3 = new javax.swing.JButton();
        kullanici2 = new javax.swing.JButton();
        kullanici1 = new javax.swing.JButton();
        kullaniciSkor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bilgisayarSkor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1450, 800));
        getContentPane().setLayout(null);

        bilgisayarAdi.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        bilgisayarAdi.setForeground(new java.awt.Color(255, 255, 0));
        bilgisayarAdi.setText("Bilgisayar");
        getContentPane().add(bilgisayarAdi);
        bilgisayarAdi.setBounds(40, 240, 200, 50);

        oyuncuAdi.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        oyuncuAdi.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(oyuncuAdi);
        oyuncuAdi.setBounds(40, 450, 170, 50);
        getContentPane().add(kullanici_secilen_kart);
        kullanici_secilen_kart.setBounds(270, 260, 160, 220);
        getContentPane().add(bot_secilen_kart);
        bot_secilen_kart.setBounds(490, 260, 160, 220);

        skorAciklama.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        skorAciklama.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(skorAciklama);
        skorAciklama.setBounds(770, 390, 270, 30);

        secilenPozisyon.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        secilenPozisyon.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(secilenPozisyon);
        secilenPozisyon.setBounds(770, 330, 230, 30);

        geri_cek1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        geri_cek1.setText("KARTI GERİ ÇEK");
        getContentPane().add(geri_cek1);
        geri_cek1.setBounds(30, 520, 130, 23);

        geri_cek2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        geri_cek2.setText("KARTI GERİ ÇEK");
        getContentPane().add(geri_cek2);
        geri_cek2.setBounds(210, 520, 130, 23);

        geri_cek3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        geri_cek3.setText("KARTI GERİ ÇEK");
        getContentPane().add(geri_cek3);
        geri_cek3.setBounds(380, 520, 130, 23);

        geri_cek4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        geri_cek4.setText("KARTI GERİ ÇEK");
        getContentPane().add(geri_cek4);
        geri_cek4.setBounds(550, 520, 130, 23);

        geri_cek5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        geri_cek5.setText("KARTI GERİ ÇEK");
        getContentPane().add(geri_cek5);
        geri_cek5.setBounds(720, 520, 130, 23);

        geri_cek6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        geri_cek6.setText("KARTI GERİ ÇEK");
        getContentPane().add(geri_cek6);
        geri_cek6.setBounds(880, 520, 130, 23);

        geri_cek7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        geri_cek7.setText("KARTI GERİ ÇEK");
        getContentPane().add(geri_cek7);
        geri_cek7.setBounds(1050, 520, 130, 23);

        geri_cek8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        geri_cek8.setText("KARTI GERİ ÇEK");
        getContentPane().add(geri_cek8);
        geri_cek8.setBounds(1220, 520, 130, 23);

        bilgisayar8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gökçe Yılmaz\\Desktop\\card back orange (1).png")); // NOI18N
        getContentPane().add(bilgisayar8);
        bilgisayar8.setBounds(1210, 10, 160, 220);

        bilgisayar7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gökçe Yılmaz\\Desktop\\card back orange (1).png")); // NOI18N
        getContentPane().add(bilgisayar7);
        bilgisayar7.setBounds(1040, 10, 160, 220);

        bilgisayar6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gökçe Yılmaz\\Desktop\\card back orange (1).png")); // NOI18N
        getContentPane().add(bilgisayar6);
        bilgisayar6.setBounds(870, 10, 160, 220);

        bilgisayar5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gökçe Yılmaz\\Desktop\\card back orange (1).png")); // NOI18N
        getContentPane().add(bilgisayar5);
        bilgisayar5.setBounds(700, 10, 160, 220);

        bilgisayar4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gökçe Yılmaz\\Desktop\\card back orange (1).png")); // NOI18N
        getContentPane().add(bilgisayar4);
        bilgisayar4.setBounds(530, 10, 160, 220);

        bilgisayar3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gökçe Yılmaz\\Desktop\\card back orange (1).png")); // NOI18N
        getContentPane().add(bilgisayar3);
        bilgisayar3.setBounds(360, 10, 160, 220);

        bilgisayar2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gökçe Yılmaz\\Desktop\\card back orange (1).png")); // NOI18N
        getContentPane().add(bilgisayar2);
        bilgisayar2.setBounds(190, 10, 160, 220);

        bilgisayar1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gökçe Yılmaz\\Desktop\\card back orange (1).png")); // NOI18N
        getContentPane().add(bilgisayar1);
        bilgisayar1.setBounds(20, 10, 160, 220);

        kullanici8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici8ActionPerformed(evt);
            }
        });
        getContentPane().add(kullanici8);
        kullanici8.setBounds(1210, 550, 160, 220);

        kullanici7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici7ActionPerformed(evt);
            }
        });
        getContentPane().add(kullanici7);
        kullanici7.setBounds(1040, 550, 160, 220);

        kullanici5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici5ActionPerformed(evt);
            }
        });
        getContentPane().add(kullanici5);
        kullanici5.setBounds(700, 550, 160, 220);

        kullanici6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici6ActionPerformed(evt);
            }
        });
        getContentPane().add(kullanici6);
        kullanici6.setBounds(870, 550, 160, 220);

        kullanici4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici4ActionPerformed(evt);
            }
        });
        getContentPane().add(kullanici4);
        kullanici4.setBounds(530, 550, 160, 220);

        kullanici3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici3ActionPerformed(evt);
            }
        });
        getContentPane().add(kullanici3);
        kullanici3.setBounds(360, 550, 160, 220);

        kullanici2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici2ActionPerformed(evt);
            }
        });
        getContentPane().add(kullanici2);
        kullanici2.setBounds(190, 550, 160, 220);

        kullanici1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici1ActionPerformed(evt);
            }
        });
        getContentPane().add(kullanici1);
        kullanici1.setBounds(20, 550, 160, 220);

        kullaniciSkor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        kullaniciSkor.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(kullaniciSkor);
        kullaniciSkor.setBounds(1310, 490, 50, 20);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bilgisayar Skor:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1194, 270, 110, 20);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kullanıcı Skor:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1200, 490, 100, 20);

        bilgisayarSkor.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        bilgisayarSkor.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(bilgisayarSkor);
        bilgisayarSkor.setBounds(1300, 270, 60, 20);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-90, 10, 1530, 830);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 800));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1570, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1570, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents


  
    private void kullanici2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici2ActionPerformed
        geri_cek1.setVisible(false);
       
        geri_cek3.setVisible(false);
        geri_cek4.setVisible(false);
        geri_cek5.setVisible(false);
        geri_cek6.setVisible(false);
        geri_cek7.setVisible(false);
        geri_cek8.setVisible(false);
         
        oyuncu.KartSecF(1);
        kullanici2.setVisible(false);
        
          
         
         kullanici1.setEnabled(false);
         kullanici3.setEnabled(false);
         kullanici4.setEnabled(false);
         kullanici5.setEnabled(true);
         kullanici6.setEnabled(true);
         kullanici7.setEnabled(true);
         kullanici8.setEnabled(true);
         
         
         
         puan=degerDondur();
         int hasar=secilen.sporcuPuaniGoster(puan);
         pozisyonGosterF(puan);
         int x=1;
         Futbolcu.kartKullanildiMi(x);
         bot.KartSecF(botkart.get(1));
         
        
         
         int hasar2=secilen.sporcuPuaniGoster(puan);
         System.out.println("dönen deger: "+puan);
         System.out.println("kullanıcı hasar: "+hasar);
         System.out.println("bilgisayar hasar: "+hasar2);
         
         karsilastir(hasar,hasar2);
         
        
         
         System.out.print("bilgisayar skor: ");
         bot.SkorGoster();
         System.out.print("kullanıcı skor: ");
         oyuncu.SkorGoster();
        
         ekrandaGoster();
         
          
         
         int a=sayi.get(1);
         if(a==0)
             bilgisayar1.setVisible(false);
         else if(a==1)
             bilgisayar2.setVisible(false);
         else if(a==2)
             bilgisayar3.setVisible(false);
         else if(a==3)
             bilgisayar4.setVisible(false);
         
         
         if(hasar==hasar2){
             geri_cek2.setVisible(true);
             geri_cek2.addActionListener(new ActionListener() {

  
    @Override
    public void actionPerformed(ActionEvent e) {
         kullanici2.setVisible(true);
         kullanici2.setEnabled(false);
         
           
         if(kullanici5.isVisible()==false && kullanici6.isVisible()==false && kullanici7.isVisible()==false && kullanici8.isVisible()==false && kullanici1.isVisible()==false && kullanici3.isVisible()==false && kullanici4.isVisible()==false){
         kullanici2.setEnabled(true);
         }
            
        
         
         kullanici_secilen_kart.setIcon(null);
         bot_secilen_kart.setIcon(null);
         if(a==0)
             bilgisayar1.setVisible(true);
         else if(a==1)
             bilgisayar2.setVisible(true);
         else if(a==2)
             bilgisayar3.setVisible(true);
         else if(a==3)
             bilgisayar4.setVisible(true);
    }
    
});
        
         }
         
         
         if(kullanici5.isVisible()==false && kullanici6.isVisible()==false && kullanici7.isVisible()==false && kullanici8.isVisible()==false ){
             kullanici1.setEnabled(true);
             kullanici3.setEnabled(true);
             kullanici4.setEnabled(true);
             
         }
         
         
         sonucEkrani();
         
    }//GEN-LAST:event_kullanici2ActionPerformed

    private void kullanici3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici3ActionPerformed
        geri_cek1.setVisible(false);
        geri_cek2.setVisible(false);
        
        geri_cek4.setVisible(false);
        geri_cek5.setVisible(false);
        geri_cek6.setVisible(false);
        geri_cek7.setVisible(false);
        geri_cek8.setVisible(false);
        oyuncu.KartSecF(2);
        kullanici3.setVisible(false);
        
        
       kullanici2.setEnabled(false);
       kullanici1.setEnabled(false);
       kullanici4.setEnabled(false);
       kullanici5.setEnabled(true);
       kullanici6.setEnabled(true);
       kullanici7.setEnabled(true);
       kullanici8.setEnabled(true);
       
       
       
         puan=degerDondur();
         int hasar=secilen.sporcuPuaniGoster(puan);
         pozisyonGosterF(puan);
         int x=1;
         Futbolcu.kartKullanildiMi(x);
        bot.KartSecF(botkart.get(2));
        int hasar2=secilen.sporcuPuaniGoster(puan);
         
         System.out.println("dönen deger: "+puan);
         System.out.println("kullanıcı hasar: "+hasar);
         System.out.println("bilgisayar hasar: "+hasar2);
         
         karsilastir(hasar,hasar2);
         
         System.out.print("bilgisayar skor: ");
         bot.SkorGoster();
         System.out.print("kullanıcı skor: ");
         oyuncu.SkorGoster();
         
         ekrandaGoster();
         
         int a=sayi.get(2);
         if(a==0)
             bilgisayar1.setVisible(false);
         else if(a==1)
             bilgisayar2.setVisible(false);
         else if(a==2)
             bilgisayar3.setVisible(false);
         else if(a==3)
             bilgisayar4.setVisible(false);
         
         if(hasar==hasar2){
             geri_cek3.setVisible(true);
             geri_cek3.addActionListener(new ActionListener() {

  
    @Override
    public void actionPerformed(ActionEvent e) {
         kullanici3.setVisible(true);
         kullanici3.setEnabled(false);
         
        
          if(kullanici5.isVisible()==false && kullanici6.isVisible()==false && kullanici7.isVisible()==false && kullanici8.isVisible()==false && kullanici1.isVisible()==false && kullanici2.isVisible()==false && kullanici4.isVisible()==false){
         kullanici3.setEnabled(true);
         }
         
        
         kullanici_secilen_kart.setIcon(null);
         bot_secilen_kart.setIcon(null);
         if(a==0)
             bilgisayar1.setVisible(true);
         else if(a==1)
             bilgisayar2.setVisible(true);
         else if(a==2)
             bilgisayar3.setVisible(true);
         else if(a==3)
             bilgisayar4.setVisible(true);
    }
    
});
             
        
         
         }
         
       if(kullanici5.isVisible()==false && kullanici6.isVisible()==false && kullanici7.isVisible()==false && kullanici8.isVisible()==false ){
             kullanici1.setEnabled(true);
             kullanici2.setEnabled(true);
             kullanici4.setEnabled(true);
             
         } 
     
       
       
       sonucEkrani();
    }//GEN-LAST:event_kullanici3ActionPerformed

    private void kullanici4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici4ActionPerformed
        geri_cek1.setVisible(false);
        geri_cek2.setVisible(false);
        geri_cek3.setVisible(false);
        
        geri_cek5.setVisible(false);
        geri_cek6.setVisible(false);
        geri_cek7.setVisible(false);
        geri_cek8.setVisible(false);
        oyuncu.KartSecF(3);
        kullanici4.setVisible(false);
        
        
        kullanici2.setEnabled(false);
        kullanici3.setEnabled(false);
        kullanici1.setEnabled(false);
        kullanici5.setEnabled(true);
        kullanici6.setEnabled(true);
        kullanici7.setEnabled(true);
        kullanici8.setEnabled(true);
        
        
        
        puan=degerDondur();
        int hasar=secilen.sporcuPuaniGoster(puan);
        pozisyonGosterF(puan); 
        int x=1;
        Futbolcu.kartKullanildiMi(x);
        bot.KartSecF(botkart.get(3));
        
        int hasar2=secilen.sporcuPuaniGoster(puan);
        System.out.println("dönen deger: "+puan);
        System.out.println("kullanıcı hasar: "+hasar);
        System.out.println("bilgisayar hasar: "+hasar2);
         
        karsilastir(hasar,hasar2);
         
        System.out.print("bilgisayar skor: ");
        bot.SkorGoster();
        System.out.print("kullanıcı skor: ");
        oyuncu.SkorGoster();
        
        ekrandaGoster();
        
        int a=sayi.get(3);
         if(a==0)
             bilgisayar1.setVisible(false);
         else if(a==1)
             bilgisayar2.setVisible(false);
         else if(a==2)
             bilgisayar3.setVisible(false);
         else if(a==3)
             bilgisayar4.setVisible(false);
         
         if(hasar==hasar2){
             geri_cek4.setVisible(true);
             geri_cek4.addActionListener(new ActionListener() {

  
    @Override
    public void actionPerformed(ActionEvent e) {
        kullanici4.setVisible(true);
        kullanici4.setEnabled(false);
        
         
         if(kullanici5.isVisible()==false && kullanici6.isVisible()==false && kullanici7.isVisible()==false && kullanici8.isVisible()==false && kullanici1.isVisible()==false && kullanici3.isVisible()==false && kullanici2.isVisible()==false){
         kullanici4.setEnabled(true);
         }
         
         kullanici_secilen_kart.setIcon(null);
         bot_secilen_kart.setIcon(null);
         if(a==0)
             bilgisayar1.setVisible(true);
         else if(a==1)
             bilgisayar2.setVisible(true);
         else if(a==2)
             bilgisayar3.setVisible(true);
         else if(a==3)
             bilgisayar4.setVisible(true);
    }
    
});
       
         }
         
        if(kullanici5.isVisible()==false && kullanici6.isVisible()==false && kullanici7.isVisible()==false && kullanici8.isVisible()==false ){
             kullanici1.setEnabled(true);
             kullanici3.setEnabled(true);
             kullanici2.setEnabled(true);
             
         }
        
        
         
        sonucEkrani();
    }//GEN-LAST:event_kullanici4ActionPerformed

    private void kullanici5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici5ActionPerformed
        geri_cek1.setVisible(false);
        geri_cek2.setVisible(false);
        geri_cek3.setVisible(false);
        geri_cek4.setVisible(false);
        
        geri_cek6.setVisible(false);
        geri_cek7.setVisible(false);
        geri_cek8.setVisible(false);
        oyuncu.KartSecB(0);
        kullanici5.setVisible(false);
      
        
       
        kullanici2.setEnabled(true);
        kullanici3.setEnabled(true);
        kullanici4.setEnabled(true);
        kullanici1.setEnabled(true);
        kullanici6.setEnabled(false);
        kullanici7.setEnabled(false);
        kullanici8.setEnabled(false);
        
        
       
        pozisyonGosterB(puan);
        puan=degerDondur();
        int hasar=secilen2.sporcuPuaniGoster(puan);
        
        int x=1;
        Basketbolcu.kartKullanildiMi(x);
        bot.KartSecB(botkart.get(0));
        
        int hasar2=secilen2.sporcuPuaniGoster(puan);
         System.out.println("dönen deger: "+puan);
         System.out.println("kullanıcı hasar: "+hasar);
         System.out.println("bilgisayar hasar: "+hasar2);
         
         karsilastir(hasar,hasar2);
         
         System.out.print("bilgisayar skor: ");
         bot.SkorGoster();
         System.out.print("kullanıcı skor: ");
         oyuncu.SkorGoster();
         
         ekrandaGoster();int a=sayi.get(0);
         if(a==0)
             bilgisayar5.setVisible(false);
         else if(a==1)
             bilgisayar6.setVisible(false);
         else if(a==2)
             bilgisayar7.setVisible(false);
         else if(a==3)
             bilgisayar8.setVisible(false);
         
         if(hasar==hasar2){
             geri_cek5.setVisible(true);
             geri_cek5.addActionListener(new ActionListener() {

  
    @Override
    public void actionPerformed(ActionEvent e) {
         kullanici5.setVisible(true);
         kullanici5.setEnabled(false);
        
         if(kullanici2.isVisible()==false && kullanici6.isVisible()==false && kullanici7.isVisible()==false && kullanici8.isVisible()==false && kullanici1.isVisible()==false && kullanici3.isVisible()==false && kullanici4.isVisible()==false){
         kullanici5.setEnabled(true);
         }
         kullanici_secilen_kart.setIcon(null);
         bot_secilen_kart.setIcon(null);
         if(a==0)
             bilgisayar5.setVisible(true);
         else if(a==1)
             bilgisayar6.setVisible(true);
         else if(a==2)
             bilgisayar7.setVisible(true);
         else if(a==3)
             bilgisayar8.setVisible(true);
    }
    
});
             
        
         
         }
         
        if(kullanici1.isVisible()==false && kullanici2.isVisible()==false && kullanici3.isVisible()==false && kullanici4.isVisible()==false ){
             kullanici6.setEnabled(true);
             kullanici7.setEnabled(true);
             kullanici8.setEnabled(true);
             
         }
        sonucEkrani();
    }//GEN-LAST:event_kullanici5ActionPerformed

    private void kullanici6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici6ActionPerformed
        geri_cek1.setVisible(false);
        geri_cek2.setVisible(false);
        geri_cek3.setVisible(false);
        geri_cek4.setVisible(false);
        geri_cek5.setVisible(false);
       
        geri_cek7.setVisible(false);
        geri_cek8.setVisible(false);
        oyuncu.KartSecB(1);
        kullanici6.setVisible(false);
        
        
        kullanici2.setEnabled(true);
        kullanici3.setEnabled(true);
        kullanici4.setEnabled(true);
        kullanici1.setEnabled(true);
        kullanici5.setEnabled(false);
        kullanici7.setEnabled(false);
        kullanici8.setEnabled(false);
        
        
        
        puan=degerDondur();
        int hasar=secilen2.sporcuPuaniGoster(puan);
        pozisyonGosterB(puan);
        int x=1;
        Basketbolcu.kartKullanildiMi(x);
        bot.KartSecB(botkart.get(1));
        
        int hasar2=secilen2.sporcuPuaniGoster(puan);
         System.out.println("dönen deger: "+puan);
         System.out.println("kullanıcı hasar: "+hasar);
         System.out.println("bilgisayar hasar: "+hasar2);
         
         karsilastir(hasar,hasar2);
         
         System.out.print("bilgisayar skor: ");
         bot.SkorGoster();
         System.out.print("kullanıcı skor: ");
         oyuncu.SkorGoster();
         
         ekrandaGoster();
         
         int a=sayi.get(1);
         if(a==0)
             bilgisayar5.setVisible(false);
         else if(a==1)
             bilgisayar6.setVisible(false);
         else if(a==2)
             bilgisayar7.setVisible(false);
         else if(a==3)
             bilgisayar8.setVisible(false);
         
         if(hasar==hasar2){
             geri_cek6.setVisible(true);
             geri_cek6.addActionListener(new ActionListener() {

  
    @Override
    public void actionPerformed(ActionEvent e) {
        kullanici6.setVisible(true);
         kullanici6.setEnabled(false);
        
         if(kullanici5.isVisible()==false && kullanici2.isVisible()==false && kullanici7.isVisible()==false && kullanici8.isVisible()==false && kullanici1.isVisible()==false && kullanici3.isVisible()==false && kullanici4.isVisible()==false){
         kullanici6.setEnabled(true);
         }
         kullanici_secilen_kart.setIcon(null);
         bot_secilen_kart.setIcon(null);
         if(a==0)
             bilgisayar5.setVisible(true);
         else if(a==1)
             bilgisayar6.setVisible(true);
         else if(a==2)
             bilgisayar7.setVisible(true);
         else if(a==3)
             bilgisayar8.setVisible(true);
    }
    
});
             
        
         
         }
         if(kullanici1.isVisible()==false && kullanici2.isVisible()==false && kullanici3.isVisible()==false && kullanici4.isVisible()==false ){
             kullanici5.setEnabled(true);
             kullanici7.setEnabled(true);
             kullanici8.setEnabled(true);
             
         }
         sonucEkrani();
    }//GEN-LAST:event_kullanici6ActionPerformed

    private void kullanici7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici7ActionPerformed
        geri_cek1.setVisible(false);
        geri_cek2.setVisible(false);
        geri_cek3.setVisible(false);
        geri_cek4.setVisible(false);
        geri_cek5.setVisible(false);
        geri_cek6.setVisible(false);
        
        geri_cek8.setVisible(false);
       oyuncu.KartSecB(2);
       kullanici7.setVisible(false);
       
       
       kullanici1.setEnabled(true);
       kullanici2.setEnabled(true);
       kullanici3.setEnabled(true);
       kullanici4.setEnabled(true);
       kullanici5.setEnabled(false);
       kullanici6.setEnabled(false);
       kullanici8.setEnabled(false);
       
       
       
       puan=degerDondur();
       int hasar=secilen2.sporcuPuaniGoster(puan);
       pozisyonGosterB(puan);
       int x=1;
       Basketbolcu.kartKullanildiMi(x);
       bot.KartSecB(botkart.get(2));
       
       int hasar2=secilen2.sporcuPuaniGoster(puan);
         System.out.println("dönen deger: "+puan);
         System.out.println("kullanıcı hasar: "+hasar);
         System.out.println("bilgisayar hasar: "+hasar2);
         
         karsilastir(hasar,hasar2);
         
         System.out.print("bilgisayar skor: ");
         bot.SkorGoster();
         System.out.print("kullanıcı skor: ");
         oyuncu.SkorGoster();
         
         ekrandaGoster();
         
         int a=sayi.get(2);
         if(a==0)
             bilgisayar5.setVisible(false);
         else if(a==1)
             bilgisayar6.setVisible(false);
         else if(a==2)
             bilgisayar7.setVisible(false);
         else if(a==3)
             bilgisayar8.setVisible(false);
         
         if(hasar==hasar2){
             geri_cek7.setVisible(true);
             geri_cek7.addActionListener(new ActionListener() {

  
    @Override
    public void actionPerformed(ActionEvent e) {
         kullanici7.setVisible(true);
         kullanici7.setEnabled(false);
         
         if(kullanici5.isVisible()==false && kullanici6.isVisible()==false && kullanici2.isVisible()==false && kullanici8.isVisible()==false && kullanici1.isVisible()==false && kullanici3.isVisible()==false && kullanici4.isVisible()==false){
         kullanici7.setEnabled(true);
         }
         kullanici_secilen_kart.setIcon(null);
         bot_secilen_kart.setIcon(null);
         if(a==0)
             bilgisayar5.setVisible(true);
         else if(a==1)
             bilgisayar6.setVisible(true);
         else if(a==2)
             bilgisayar7.setVisible(true);
         else if(a==3)
             bilgisayar8.setVisible(true);
    }
    
});
             
        
         
         }
         
       if(kullanici1.isVisible()==false && kullanici2.isVisible()==false && kullanici3.isVisible()==false && kullanici4.isVisible()==false ){
             kullanici6.setEnabled(true);
             kullanici5.setEnabled(true);
             kullanici8.setEnabled(true);
             
         }
       sonucEkrani();
    }//GEN-LAST:event_kullanici7ActionPerformed

    private void kullanici8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici8ActionPerformed
        geri_cek1.setVisible(false);
        geri_cek2.setVisible(false);
        geri_cek3.setVisible(false);
        geri_cek4.setVisible(false);
        geri_cek5.setVisible(false);
        geri_cek6.setVisible(false);
        geri_cek7.setVisible(false);
        
        
        oyuncu.KartSecB(3);
        kullanici8.setVisible(false);
        
        
        
        kullanici2.setEnabled(true);
        kullanici3.setEnabled(true);
        kullanici4.setEnabled(true);
        kullanici1.setEnabled(true);
        kullanici6.setEnabled(false);
        kullanici7.setEnabled(false);
        kullanici5.setEnabled(false);
        
        
        
        puan=degerDondur();
        int hasar=secilen2.sporcuPuaniGoster(puan);
        pozisyonGosterB(puan);
        int x=1;
        Basketbolcu.kartKullanildiMi(x);
        bot.KartSecB(botkart.get(0));
        
        int hasar2=secilen2.sporcuPuaniGoster(puan);
         System.out.println("dönen deger: "+puan);
         System.out.println("kullanıcı hasar: "+hasar);
         System.out.println("bilgisayar hasar: "+hasar2);
         
         karsilastir(hasar,hasar2);
         
         System.out.print("bilgisayar skor: ");
         bot.SkorGoster();
         System.out.print("kullanıcı skor: ");
         oyuncu.SkorGoster();
         
         ekrandaGoster();
         
         int a=sayi.get(3);
         if(a==0)
             bilgisayar5.setVisible(false);
         else if(a==1)
             bilgisayar6.setVisible(false);
         else if(a==2)
             bilgisayar7.setVisible(false);
         else if(a==3)
             bilgisayar8.setVisible(false);
         
         if(hasar==hasar2){
             geri_cek8.setVisible(true);
             geri_cek8.addActionListener(new ActionListener() {

  
    @Override
    public void actionPerformed(ActionEvent e) {
       
        kullanici8.setVisible(true);
         kullanici8.setEnabled(false);
         
         if(kullanici5.isVisible()==false && kullanici6.isVisible()==false && kullanici7.isVisible()==false && kullanici2.isVisible()==false && kullanici1.isVisible()==false && kullanici3.isVisible()==false && kullanici4.isVisible()==false){
         kullanici8.setEnabled(true);
         }
         kullanici_secilen_kart.setIcon(null);
         bot_secilen_kart.setIcon(null);
         if(a==0)
             bilgisayar5.setVisible(true);
         else if(a==1)
             bilgisayar6.setVisible(true);
         else if(a==2)
             bilgisayar7.setVisible(true);
         else if(a==3)
             bilgisayar8.setVisible(true);
    }
    
});
             
        
         
         }
         if(kullanici1.isVisible()==false && kullanici2.isVisible()==false && kullanici3.isVisible()==false && kullanici4.isVisible()==false ){
             kullanici6.setEnabled(true);
             kullanici7.setEnabled(true);
             kullanici5.setEnabled(true);
             
         }
        sonucEkrani();
    }//GEN-LAST:event_kullanici8ActionPerformed

    private void kullanici1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici1ActionPerformed
       
        geri_cek2.setVisible(false);
        geri_cek3.setVisible(false);
        geri_cek4.setVisible(false);
        geri_cek5.setVisible(false);
        geri_cek6.setVisible(false);
        geri_cek7.setVisible(false);
        geri_cek8.setVisible(false);
       
       oyuncu.KartSecF(0);
       kullanici1.setVisible(false);
     
       kullanici2.setEnabled(false);
       kullanici3.setEnabled(false);
       kullanici4.setEnabled(false);
       kullanici5.setEnabled(true);
       kullanici6.setEnabled(true);
       kullanici7.setEnabled(true);
       kullanici8.setEnabled(true);
       
      
       puan=degerDondur();
       int hasar=secilen.sporcuPuaniGoster(puan);
       pozisyonGosterF(puan);
       int x=1;
       Futbolcu.kartKullanildiMi(x);
       bot.KartSecF(botkart.get(0));
       
       int hasar2=secilen.sporcuPuaniGoster(puan);
         System.out.println("dönen deger: "+puan);
         System.out.println("kullanıcı hasar: "+hasar);
         System.out.println("bilgisayar hasar: "+hasar2);
         
         karsilastir(hasar,hasar2);
         
         System.out.print("bilgisayar skor: ");
         bot.SkorGoster();
         System.out.print("kullanıcı skor: ");
         oyuncu.SkorGoster();
         
         ekrandaGoster();
         
         int a=sayi.get(0);
         if(a==0)
             bilgisayar1.setVisible(false);
         else if(a==1)
             bilgisayar2.setVisible(false);
         else if(a==2)
             bilgisayar3.setVisible(false);
         else if(a==3)
             bilgisayar4.setVisible(false);
         
         if(hasar==hasar2){
             geri_cek1.setVisible(true);
             geri_cek1.addActionListener(new ActionListener() {

  
    @Override
    public void actionPerformed(ActionEvent e) {
         kullanici1.setVisible(true);
         kullanici1.setEnabled(false);
         
         
         if(kullanici5.isVisible()==false && kullanici6.isVisible()==false && kullanici7.isVisible()==false && kullanici8.isVisible()==false && kullanici2.isVisible()==false && kullanici3.isVisible()==false && kullanici4.isVisible()==false){
         kullanici1.setEnabled(true);
         }
         kullanici_secilen_kart.setIcon(null);
         bot_secilen_kart.setIcon(null);
         if(a==0)
             bilgisayar1.setVisible(true);
         else if(a==1)
             bilgisayar2.setVisible(true);
         else if(a==2)
             bilgisayar3.setVisible(true);
         else if(a==3)
             bilgisayar4.setVisible(true);
    }
    
});
        
         }
         
          if(kullanici5.isVisible()==false && kullanici6.isVisible()==false && kullanici7.isVisible()==false && kullanici8.isVisible()==false ){
             kullanici2.setEnabled(true);
             kullanici3.setEnabled(true);
             kullanici4.setEnabled(true);
             
         }
          
          
         sonucEkrani();
    }//GEN-LAST:event_kullanici1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton bilgisayar1;
    private static javax.swing.JButton bilgisayar2;
    private static javax.swing.JButton bilgisayar3;
    private static javax.swing.JButton bilgisayar4;
    private static javax.swing.JButton bilgisayar5;
    private static javax.swing.JButton bilgisayar6;
    private static javax.swing.JButton bilgisayar7;
    private static javax.swing.JButton bilgisayar8;
    private javax.swing.JLabel bilgisayarAdi;
    private static javax.swing.JLabel bilgisayarSkor;
    public static javax.swing.JLabel bot_secilen_kart;
    private javax.swing.JButton geri_cek1;
    private javax.swing.JButton geri_cek2;
    private javax.swing.JButton geri_cek3;
    private javax.swing.JButton geri_cek4;
    private javax.swing.JButton geri_cek5;
    private javax.swing.JButton geri_cek6;
    private javax.swing.JButton geri_cek7;
    private javax.swing.JButton geri_cek8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JButton kullanici1;
    private static javax.swing.JButton kullanici2;
    private static javax.swing.JButton kullanici3;
    private static javax.swing.JButton kullanici4;
    private static javax.swing.JButton kullanici5;
    private static javax.swing.JButton kullanici6;
    private static javax.swing.JButton kullanici7;
    private static javax.swing.JButton kullanici8;
    private static javax.swing.JLabel kullaniciSkor;
    public static javax.swing.JLabel kullanici_secilen_kart;
    public static javax.swing.JLabel oyuncuAdi;
    private static javax.swing.JLabel secilenPozisyon;
    private static javax.swing.JLabel skorAciklama;
    // End of variables declaration//GEN-END:variables
}

