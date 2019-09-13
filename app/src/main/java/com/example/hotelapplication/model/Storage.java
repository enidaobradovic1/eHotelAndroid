package com.example.hotelapplication.model;
import com.example.hotelapplication.R;
import com.example.hotelapplication.helper.MyObjects;

import java.util.ArrayList;
import java.util.List;

public class Storage {
  private static List<Soba> sobe;

  public static List<Soba> getSobe(){

      int []imgs=getImages();
      int []imgsUsluge=getImagesUsluge();
      if(sobe==null){
          sobe=new ArrayList<>();
          sobe.add(new Soba(imgs[1],imgsUsluge[0],"Bracna soba","TV,AC, Wi-Fi, Minibar","Sobe modernog dizajna zadovoljiti će potrebe svakog gosta.  Soba je opremljena televizorom sa lokalnim DVB-T i internacionalnim SAT kanalima, klima uređajem, telefonskom linijom,bežičnim pristupom Internetu besplatno. Želimo da se svaki naš gost osjeća kao kod kuće."));
          sobe.add(new Soba(imgs[2],imgsUsluge[1],"Dvokrevetna","TV,AC, Wi-Fi, Minibar","Sobe modernog dizajna zadovoljiti će potrebe svakog gosta.  Soba je opremljena televizorom sa lokalnim DVB-T i internacionalnim SAT kanalima, klima uređajem, telefonskom linijom,bežičnim pristupom Internetu besplatno. Želimo da se svaki naš gost osjeća kao kod kuće."));
          sobe.add(new Soba(imgs[3],imgsUsluge[2],"Trokrevetna","TV,AC, Wi-Fi, Minibar","Sobe modernog dizajna zadovoljiti će potrebe svakog gosta.  Soba je opremljena televizorom sa lokalnim DVB-T i internacionalnim SAT kanalima, klima uređajem, telefonskom linijom,bežičnim pristupom Internetu besplatno. Želimo da se svaki naš gost osjeća kao kod kuće."));
          sobe.add(new Soba(imgs[4],imgsUsluge[3],"Cetverokrevetna","TV,AC, Wi-Fi, Minibar","Sobe modernog dizajna zadovoljiti će potrebe svakog gosta. Soba je opremljena televizorom sa lokalnim DVB-T i internacionalnim SAT kanalima, klima uređajem, telefonskom linijom,bežičnim pristupom Internetu besplatno. Želimo da se svaki naš gost osjeća kao kod kuće."));
          sobe.add(new Soba(imgs[5],imgsUsluge[0],"Delux apartman","TV,AC, Wi-Fi, Minibar","Sobe modernog dizajna zadovoljiti će potrebe svakog gosta. Soba je opremljena televizorom sa lokalnim DVB-T i internacionalnim SAT kanalima, klima uređajem, telefonskom linijom,bežičnim pristupom Internetu besplatno. Želimo da se svaki naš gost osjeća kao kod kuće."));
          sobe.add(new Soba(imgs[6],imgsUsluge[0],"Predjsednicki apratman","TV,AC, Wi-Fi, Minibar","Sobe modernog dizajna zadovoljiti će potrebe svakog gosta. Sobe su opremljene televizorom sa lokalnim DVB-T i internacionalnim SAT kanalima, klima uređajem, telefonskom linijom,bežičnim pristupom Internetu besplatno. Želimo da se svaki naš gost osjeća kao kod kuće."));
      }


      return sobe;
  }

    public static int[] getImages() {


        int[] images = {R.drawable.jednokrevetna,R.drawable.bracnasoba,R.drawable.dvokrevetna,R.drawable.trokrevetna
                ,R.drawable.cetverokrveetna,R.drawable.delux,R.drawable.predjeednicki
        };

        return images;
    }
    public static int[] getImagesUsluge() {


        int[] images = {R.drawable.usluge,R.drawable.uslugedvokrevetna,R.drawable.uslugetrokrevetna,R.drawable.uslugecetvero};


        return images;
    }


    private  static List<Korisnik> korisnici;
  public  static List<Korisnik> getKorisnici(){
      if (korisnici==null){
          korisnici=new ArrayList<>();
          korisnici.add(new Korisnik(1,"Lejla","Spago","Lejla","test","lejla.spago@edu.fit.ba"));
          korisnici.add(new Korisnik(2,"Melisa","test","Melisa","Dzeko","melisa.dzeko@edu.fit.ba"));
          korisnici.add(new Korisnik(3,"Šejla","test","Šejla","Špago","sejla.spago@edu.fit.ba"));
          korisnici.add(new Korisnik(4,"Jasmina","test","Jasmina","Špago","jejla.spago@edu.fit.ba"));
          korisnici.add(new Korisnik(5,"Dino","test","Dino","Fišić","dino.fisic@edu.fit.ba"));

      }

      return korisnici;
  }

   private static List<Rezervacija> rezervacije;
   public static List<Rezervacija> getRezervacije() {
      if (rezervacije==null){
         rezervacije=new ArrayList<>();
          rezervacije.add(new Rezervacija(getKorisnici().get(0),1,"13/09/2019","12/09/2019",1,0));



      }

      return rezervacije;
   }
public static void addRezervacija(Rezervacija rez)
{
    getRezervacije().add(rez);

}
    public static void RemoveRezervacija(Rezervacija rez)
    {
        getRezervacije().remove(rez);

    }
    public static List<Korisnik> getKorisniciByIme(String query) {

        List<Korisnik> rezultat = new ArrayList<>();

        for (Korisnik x: getKorisnici())
        {
            if ((x.getIme() + " " + x.getPrezime()).startsWith(query))
                rezultat.add(x);
        }

        return rezultat;
    }
    public static Korisnik LoginCheck(String username, String password)
    {
        for (Korisnik x : getKorisnici()) {
            if (MyObjects.equals(x.getUsername(), username) && MyObjects.equals(x.getPassword(), password))
                return x;
        }
        return null;
    }




}
