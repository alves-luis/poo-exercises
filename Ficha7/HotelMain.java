
/**
 * Write a description of class HotelMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.HashSet;
import java.util.Set;

public class HotelMain{
  public static final boolean ALTA = true;
  public static final boolean BAIXA = false;
    public static void main(String[] args) {

      Hotel h1 = new Hotel("AAA","Hotel AAA","Amarante",3,100,100,20);
      Hotel h2 = new Hotel("AAB","Hotel AAB","Amarante",4,85,100,30);
      Hotel h3 = new Hotel("AAC","Hotel AAC","Viana do Castelo",2,90,100,10);
      Hotel h4 = new Hotel("AAD","Hotel AAD","Braga",5,30,100,70);
      Hotel h5 = new Hotel("AAE","Hotel AAE","Faro",4,76,100,50);
      System.out.println(h1.toString());
      System.out.println(h2.toString());
      System.out.println(h3.toString());
      System.out.println(h4.toString());
      System.out.println(h5.toString());

      HotelStandard s1 = new HotelStandard(ALTA,"SAA","Hotel SAA","Bragança",3,10,100,30);
      HotelStandard s2 = new HotelStandard(BAIXA,"SAB","Hotel SAB","Chaves",4,20,100,40);
      HotelStandard s3 = new HotelStandard(BAIXA,"SAC","Hotel SAC","Braga",4,50,100,50);
      System.out.println(s1.toString());
      System.out.println(s2.toString());
      System.out.println(s3.toString());

      HotelPremium p1 = new HotelPremium(0.2,"PAA","Hotel PAA","Amarante",3,10,100,30);
      HotelPremium p2 = new HotelPremium(0.3,"PAB","Hotel PAB","Viana do Castelo",4,80,100,80);
      HotelPremium p3 = new HotelPremium(1,"PAC","Hotel PAC","Braga",4,50,100,100);
      System.out.println(p1.toString());
      System.out.println(p2.toString());
      System.out.println(p3.toString());

      HotelDiscount d1 = new HotelDiscount("DAA","Hotel DAA","Chaves",3,100,100,30);
      HotelDiscount d2 = new HotelDiscount("DAB","Hotel DAB","Braga",4,80,100,80);
      HotelDiscount d3 = new HotelDiscount("DAC","Hotel DAC","Braga",4,0,100,100);
      System.out.println(d1.toString());
      System.out.println(d2.toString());
      System.out.println(d3.toString());

      HotelInc inc = new HotelInc();
      inc.adiciona(h1);
      inc.adiciona(h2);
      inc.adiciona(h3);
      inc.adiciona(d1);
      inc.adiciona(d2);
      inc.adiciona(d3);
      inc.adiciona(p1);
      inc.adiciona(p2);
      inc.adiciona(p3);
      inc.adiciona(s1);
      inc.adiciona(s2);
      inc.adiciona(s3);
      System.out.println("Há " + inc.quantos() + " hoteis");
      System.out.println("Existe DAA (true)? " + inc.existeHotel("DAA"));
      System.out.println("Existe DAD (false)? " + inc.existeHotel("DAD"));
      System.out.println("Há " + inc.quantos("Braga") + " hoteis em Braga");
      System.out.println("Há " + inc.quantos("Chaves") + " hoteis em Chaves");
      System.out.println("Há " + inc.quantosT("Standard") + " hoteis Standard");
      System.out.println("Há " + inc.quantosT("Discount") + " hoteis Discount");
      System.out.println("Há " + inc.quantosT("Hotel") + " hoteis Hotel");
      System.out.println("Há " + inc.quantosT("Premium") + " hoteis Premium");
      System.out.println(inc.getHotel("AAA").toString());
      System.out.println(inc.getHoteis().toString());
      HashSet<Hotel> tmp = new HashSet<>();
      tmp.add(h4);
      tmp.add(h5);
      inc.adiciona((Set<Hotel>)tmp);
      System.out.println("Há " + inc.quantos() + " hoteis");
      inc.mudaPara(BAIXA);
      System.out.println(inc.getHotel("SAA").toString());
      System.out.println(inc.getHotel("SAB").toString());
      System.out.println(inc.getHotel("SAC").toString());
      System.out.println("Máxima receita total: " + inc.getMaxReceitaDiaria());
    }
}