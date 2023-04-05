/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pts_brt;
import java.util.ArrayList;
/**
 *
 * @author agnes
 */
public class bus {
    // atribut
    private int jumlah_penumpang;
    private int kapasitas_bus = 20;
    private String tujuan_bus, asal_bus;

    private ArrayList<penumpang> data_penumpang;
    
    //constuctor 
    public bus(){
        this.jumlah_penumpang = 0;
        data_penumpang = new ArrayList<penumpang>();
    }
    
    public void turunkanPenumpang(halte halte_sekarang){
        int i = 0;
        while (i<this.jumlah_penumpang){
            if(data_penumpang.get(i).getTujuan().equals(halte_sekarang.getNama())){
                data_penumpang.remove(i);
                halte_sekarang.penumpangTurun();
                this.jumlah_penumpang -= 1;
                continue;
            }
                
            i++;
            
        }
    }
    

    public void tambahPenumpang(penumpang data){
        this.jumlah_penumpang += 1;
        this.data_penumpang.add(data);
    }
    
    //  jumlah penumpang
    public int jumlahPenumpang(){
        return this.jumlah_penumpang;
    }
    

    public String halteSekarang(){
        return this.asal_bus;
    }
    
    public void setHalte(String awal){
        this.asal_bus = awal;
    }
    
    public void printTujuanPenumpang(){
        int i = 0;
        while(i < this.jumlah_penumpang){
            System.out.println("Penumpang turun di halte "+this.data_penumpang.get(i).getTujuan());
            i++;
        }
    }

    public String tujuanBus(){
        return this.tujuan_bus;
    }
    public void setTujuan(String tujuan){
        this.tujuan_bus = tujuan;
    }
}
