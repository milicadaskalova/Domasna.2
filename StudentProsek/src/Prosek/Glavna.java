package Prosek;
import java.util.Scanner;
public class Glavna {

	       public static void main(String[] args) {
				String ime,prezime,predmet,data;
				int index,n,ocenka,i;
				double prosek;
				Scanner sc=new Scanner(System.in);
				
				Covek c[]=new Covek[100];
				 
				Covek c1=new Covek();
				    System.out.println("Vnesete ime");
					ime=sc.next();
					
					System.out.println("Vnesete prezime");
					prezime=sc.next();
					
					System.out.println("Vnesete index");
					index=sc.nextInt();
					
		           Ocenka o=new Ocenka(predmet,data,ocenka);
				    System.out.println("Vnesete predmet");
				    predmet=sc.next();
				    o.setPredmet(predmet);
				    System.out.println("Vnesete data");
				    data=sc.next();
				    o.setData(data);
				    System.out.println("Vnesete ocenka");
				    ocenka=sc.nextInt();
				    o.setOcenka(ocenka);
				    
				    
					Student s=new Student(ime,prezime,index,n,prosek);
				    s.setIme(ime);
				    s.setPrezime(prezime);
				    s.setIndex(index);
				    s.setProsek(prosek);
				    
				    System.out.println(o);
				    System.out.println(s);
				    for(i=0;i<n;i++) {
				    	System.out.println(c[i]);
						  
					  }
				    System.out.println("Prosekot na studentot e"+s.getProsek());
					
				}
				

	}

}
