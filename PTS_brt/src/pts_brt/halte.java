/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pts_brt;

/**
 *
 * @author agnes
 */
public class halte {

    private int naik, turun, menunggu;
    // nama halte
    private String nama;
    
    //constructor 
    public halte(String nama){
        this.nama = nama;
        this.naik = 0;
        this.turun = 0;
        this.menunggu = 0;
    }
    

    public String getNama(){
        return this.nama;
    }
    public int getTunggu(){
        return this.menunggu;
    }
    public int getTurun(){
        return this.turun;
    }
    public int getNaik(){
        return this.naik;
    }

    public void penumpangNaik(){
        this.naik += 1;
        this.menunggu -= 1;
    }

    public void penumpangTurun(){
        this.turun -= 1;
    }

    public void penumpangDatang(int jumlah_datang){
        this.menunggu = jumlah_datang;
    }
}
