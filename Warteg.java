/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package warteg;

/**
 *
 * @author user
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Warteg {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
//input scanner
Scanner input=new Scanner(System.in);
BufferedReader input2=new BufferedReader (new InputStreamReader (System.in));

//inisialisasi variabel
int i =0;
String [] nasi = new String [100];
String [] lauk = new String [100];
String [] minuman = new String [100];
int [] harga = new int[100];
int [] harga2 = new int[100];
int [] harga3 = new int[100];
String keputusan = "Y";
int jumlah =0;
int hargatotal=0;

//buat tampilan awal
System.out.println("*******************************************");
System.out.println("Kamu Nanya Makan Enak Dan Murah Dimana?");
System.out.println("Warteg Dilan Solusinya");
System.out.println("Welcome dan Selamat Menikmati");
System.out.println("Terima pesanan catering");
System.out.println("*******************************************");
System.out.println("Pilihan Jenis Nasi :");
System.out.println("1. Nasi Putih = Rp. 5000,-");
System.out.println("2. Nasi Merah = Rp. 7000,-");
System.out.println("Pilihan Lauk :");
System.out.println("1. Cah Kangkung = Rp. 5000,-");
System.out.println("2. Pergedel = Rp. 4000,-");
System.out.println("3. Kentang Balado = Rp. 6000,-");
System.out.println("4. Bakwan Jagung = Rp. 3000,-");
System.out.println("Pilihan Minuman :");
System.out.println("1. Es Teh = Rp. 3000,-");
System.out.println("2. Jus Jeruk = Rp. 5000,-");
System.out.println("3. Air Mineral = Rp. 2000,-");
System.out.println("4. Kopi = Rp. 4000,-");
System.out.println("");
System.out.println("*******************************************");
System.out.println("");

//pengkondisian
while (keputusan.equals("Y")||keputusan.equals("y"))
{
System.out.println("");
System.out.print("Silahkan pilih jenis nasi yang anda inginkan : ");
int pil = input.nextInt();
switch (pil) {
case 1:
nasi [i] = "Nasi Putih";
harga [i] = 5000;
break;
case 2:
nasi [i] = "Nasi Merah";
harga [i] = 7000;
break;
case 3:
default:
System.out.println("Jenis nasi yang anda pesan sudah habis.");
break;
}
for (int k=pil;k<3;k++){
System.out.println("Jenis nasi yang anda pilih adalah : "+nasi[i]);
System.out.print("Jumlah pesanan : ");
int jmlnasi = input.nextInt();
harga[i]=harga[i]*jmlnasi;
System.out.println("Harga nasi sebesar : Rp. "+harga[i]+ " ;");
System.out.println("");
break;
}
{
System.out.print("Silahkan pilih menu yang anda inginkan : ");
int pil2 = input.nextInt();
switch (pil2) {
case 1:
lauk [i] = "Cah Kangkung";
harga2 [i] = 5000;
break;
case 2:
lauk [i] = "Pergedel";
harga2 [i] = 4000;
break;
case 3:
lauk [i] = "Kentang Balado";
harga2 [i] = 6000;
case 4:
lauk [i] = "Bakwan Jagung";
harga2 [i] = 3000;
break;
case 5:
default:
System.out.println("Lauk yang anda pesan sudah habis.");
break;
}
for (int k=pil2;k<5;k++){
System.out.println("Menu yang anda pilih adalah : "+lauk[i]);
System.out.print("Jumlah pesanan : ");
int jmllauk = input.nextInt();
harga2[i]=harga2[i]*jmllauk;
System.out.println("Harga lauk sebesar : Rp. "+harga2[i]+ " ;");
break;
}
System.out.println("");
System.out.print("Silahkan pilih minuman yang anda inginkan : ");
int pil3=input.nextInt();
switch (pil3){
case 1:
minuman [i] = "Es Teh";
harga3 [i] = 3000;
break;
case 2:
minuman [i] = "Jus Jeruk";
harga3 [i] = 5000;
break;
case 3:
minuman [i] = "Air Mineral";
harga3 [i] = 2000;
break;
case 4:
minuman [i] = "Kopi";
harga3 [i] = 4000;
break;
case 5:
default:
System.out.println("Minuman yang anda pesan sudah habis.");
break;
}
for (int j=pil3;j<5;j++){
System.out.println("Minuman yang anda pilih adalah : "+minuman[i]);
System.out.print("Jumlah pesanan : ");
int jmlminuman = input.nextInt();
harga3[i]=harga3[i]*jmlminuman;
System.out.println("Harga minuman sebesar : Rp. "+harga3[i]+ " ;");
break;
}
System.out.println("");
int totalnasi = 0;
int totallauk = 0;
int totalminuman = 0;
int total=harga[i]+harga2[i]+harga3[i];
System.out.println("Total belanja anda sebesar : Rp. "+total+ " ;");

System.out.println("Apakah anda ingin order lagi ? Y/N : ");
try{
keputusan = input2.readLine();
}catch(IOException e){
System.out.println("Failed to Read Keyboard");
}
i++;
System.out.println("List Pesanan anda adalah : ");

for (int a = 0; a<i;a++){
System.out.println(nasi[a]);

for (int b = 0; b<i;b++){
System.out.println(lauk[b]);
}
for (int c = 0; c<i;c++){
System.out.println(minuman[c]);
}

System.out.println("");
System.out.println("Total tambahan belanja");
int totalbayar=hargatotal;
System.out.println("Total belanja tambahan anda sebesar : Rp. "+totalbayar);
}
}
}
}
}