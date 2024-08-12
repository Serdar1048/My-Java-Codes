import com.abc.Ogrenci;

public class test {

	public static void main(String[] args) {
		//bir sınfın içindeki değişkenlere erişebilmek için o classtan nesne türetmemiz gerekiyor. --> new
		
		//ERİŞİM BELİRLEYİCİLER (Access Modifiers)
		//public --> her yerden erişilebilir kısıtlama yok.
        //private --> sadece bulunduğu class içersinden erişilebilir.
		//protected --> bulunduğu class içinden ve o classı miras alan alt classlardan erişilebilir.
		
		
		//constructor (yapıcı metod) normal bir metottan farkı geriye dödürme tipi yoktur.

		
		Ogrenci ogrenci1 = new Ogrenci("kız"); // ogrenci1 --> bir nesnedir.
		ogrenci1.id = 5;
		ogrenci1.isim = "abc";
		ogrenci1.soyisim = "kdmo";
	  //ogrenci1.cinsiyet = "kız"; ---> cinsiyeti private olarak yazdığımız için burada erişemeyiz.
		
		System.out.println("ID: " + ogrenci1.id);
		System.out.println("isim: " + ogrenci1.isim);
		System.out.println("soyisim: " + ogrenci1.soyisim);
		ogrenci1.cinsiyetYazdir();
	}

}
