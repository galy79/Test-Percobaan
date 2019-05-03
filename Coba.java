/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;
class Mahasiswa{
    int nrp;
    String nama;
   
    public void setNrp(int i){
        nrp=i;
    }
    public void setNama (String i) {
        nama=i;
    }
    
    int setNRP;
    private void setSetNRP (int i){
     setNRP=i;
    }
    String setNama;
    private void setSetNama (String i){
        setNama=i;
    }
    int getNRP;
    private void setGetNRP (int i) {
        getNRP=i;
    }
    String getNama;
    private void setGetNama (String i) {
        getNama=i;
    
    
    }
}
/**
 *
 * @author User
 */
public class Coba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Mahasiswa mhs=new Mahasiswa();
 mhs.setNrp(7201);
 mhs.setNama("Muhammad Ali");
 System.out.println("Nama mahasiswa "+mhs.getNama()+"NRP "+mhs.getNRP() );
    }
    
}
