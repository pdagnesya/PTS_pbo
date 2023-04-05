
package pts_brt;

public class main {

    public static void main(String[] args) {
        bus harapan_jaya = new bus();
        
        halte halte_kantor = new halte("kantor");
        halte halte_porong = new halte("porong");
        halte halte_surabaya = new halte("surabaya");
        halte halte_gresik = new halte("gresik");
        
        harapan_jaya.setHalte("kantor");
        harapan_jaya.setTujuan("porong");
        for(int i = 0; i< 3; i++){
            penumpang penumpang_kantor = new penumpang("porong");
            harapan_jaya.tambahPenumpang(penumpang_kantor);
        }
        for(int i = 0; i< 2; i++){
            penumpang penumpang_kantor = new penumpang("gresik");
            harapan_jaya.tambahPenumpang(penumpang_kantor);
        }
        System.out.println("Putri Dwi Agnesya (21081010142)");
        System.out.println("");
        System.out.println("Bus berangkat dari "+harapan_jaya.halteSekarang());
        System.out.println("- Jumlah penumpang : " + harapan_jaya.jumlahPenumpang());
        harapan_jaya.printTujuanPenumpang();
        
        System.out.println("----------------------------------------------------");
        //sampai porong
        halte_porong.penumpangDatang(2);
        System.out.println("Halte "+halte_porong.getNama()+" : "+halte_porong.getTunggu()+" orang menunggu");
        harapan_jaya.setHalte("porong");
        harapan_jaya.setTujuan("surabaya");
        System.out.println("Bus sampai di halte "+harapan_jaya.halteSekarang());
        harapan_jaya.turunkanPenumpang(halte_porong);
        System.out.println(halte_porong.getTurun() + " penumpang turun");
        
            penumpang penumpang_por_surabaya = new penumpang("surabaya");
            harapan_jaya.tambahPenumpang(penumpang_por_surabaya);
            halte_porong.penumpangNaik();
            
            penumpang penumpang_por_gresik = new penumpang("gresik");
            harapan_jaya.tambahPenumpang(penumpang_por_gresik);
            halte_porong.penumpangNaik();
        
        System.out.println("-"+halte_porong.getNaik()+" penumpang naik");
        harapan_jaya.printTujuanPenumpang();
        System.out.println("- Jumlah penumpang : " + harapan_jaya.jumlahPenumpang());
        System.out.println("Halte "+halte_porong.getNama()+" : "+halte_porong.getTunggu()+" orang menunggu");
        System.out.println("-------------------------------------------------------------");
        // sampai surabaya
        halte_surabaya.penumpangDatang(5);
        System.out.println("Halte "+halte_surabaya.getNama()+" : "+halte_surabaya.getTunggu()+" orang menunggu");
        harapan_jaya.setHalte("surabaya");
        harapan_jaya.setTujuan("gresik");
        System.out.println("Bus sampai di halte "+harapan_jaya.halteSekarang());
        harapan_jaya.turunkanPenumpang(halte_surabaya);
        System.out.println(halte_surabaya.getTurun() + " penumpang turun");
        
        for(int i = 0; i< 5; i++){
            penumpang penumpang_surabaya = new penumpang("gresik");
            harapan_jaya.tambahPenumpang(penumpang_surabaya);
            halte_surabaya.penumpangNaik();
        }
        System.out.println("-"+halte_surabaya.getNaik()+" penumpang naik");
        harapan_jaya.printTujuanPenumpang();
        System.out.println("- Jumlah penumpang : " + harapan_jaya.jumlahPenumpang());
        System.out.println("Halte "+halte_surabaya.getNama()+" : "+halte_surabaya.getTunggu()+" orang menunggu");
        System.out.println("------------------------------------------------------");
        // sampai gresik
        halte_gresik.penumpangDatang(3);
        System.out.println("Halte "+halte_gresik.getNama()+" : "+halte_gresik.getTunggu()+" orang menunggu");
        harapan_jaya.setHalte("gresik");
        harapan_jaya.setTujuan("gresik");
        System.out.println("Bus sampai di halte "+harapan_jaya.halteSekarang());
        harapan_jaya.turunkanPenumpang(halte_gresik);
        System.out.println(halte_gresik.getTurun() + " penumpang turun");
        
        for(int i = 0; i< 3; i++){
            penumpang penumpang_gresik = new penumpang("gresik");
            harapan_jaya.tambahPenumpang(penumpang_gresik);
            halte_gresik.penumpangNaik();
        }
        System.out.println("-"+halte_gresik.getNaik()+" penumpang naik");
        harapan_jaya.printTujuanPenumpang();
        System.out.println("- Jumlah penumpang : " + harapan_jaya.jumlahPenumpang());
        System.out.println("Halte "+halte_gresik.getNama()+" : "+halte_gresik.getTunggu()+" orang menunggu");
    }
    
}
