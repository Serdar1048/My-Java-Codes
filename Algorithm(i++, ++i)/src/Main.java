import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

//***************************** beyin yakan kısım ****************************
//		int x = 5;
//		int y = x++;
//		int z = ++y;
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);

//		int a = 5 ; 
//		int b = a++;  
//		int c = ++a;  
//		int d = a++ + b-- + c++;       
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);

//		int x = 5;
//		int y = x++ + ++x + x-- - --x; 
//
//		System.out.println("x: " + x);
//		System.out.println("y: " + y);

//		int a = 5;
//		int b = 3;
//		int c = ++a + b-- - --a * ++b;
//
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
//		System.out.println("c: " + c);
		
//		int a = 8;
//		int b = 4;
//		int c = ++a * (b--) + (--a % ++b);
//
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
//		System.out.println("c: " + c);
		
//		int x = 5;
//		int y = 7;
//		int z = ++x * (y-- + --x) - (x++ % --y) + (--y * ++x);
//
//		System.out.println("x: " + x);
//		System.out.println("y: " + y);
//		System.out.println("z: " + z);



//********************** harmonik seri hesaplama **************************

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("enter number: ");
//		int input = scanner.nextInt();
//		double total = 0;
//		for(double i = 1; i<=input; i++) {
//			total += 1/i; // --> int/int == int
//		}
//		System.out.println(total);

//*********************** faktöriyel *************************
//		int result = 1;
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("sayı gir: ");
//		int sayi = scanner.nextInt();
//
//		for (int i = 1; i <= sayi; i++) {
//			result *= i;
//		}
//		System.out.println(result);

//*************************** üs alma ***************************
//		int result = 1;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("üs alınacak sayı giriniz: ");
//		int usAlinacak = scanner.nextInt();//2
//		
//		System.out.println("üs olan sayıyıy ggiriniz: ");
//		int usOlan = scanner.nextInt();//3
//		//2*2*2
//		
//		for (int i = 1; i<=usOlan ; i++) {
//			result *= usAlinacak ;
//		}
//		System.out.println(result);
//		

//******************** kuvvet bulma *************************
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("N sayısını giriniz: ");
//		int nSayısı = scanner.nextInt();
//		System.out.print("Sınıır değerini giriniz: ");
//		int sinirDegeri = scanner.nextInt();
//
//		for (int i = 1; i < sinirDegeri; i*=nSayısı) {
//			System.out.println(i);
//		}

//************************ Login app ***************************************9
//		Scanner scanner = new Scanner(System.in);
//
//		String userName = "qwe";
//		String password = "123";
//		int i = 0;
//		int hakSayisi = 3;
//		boolean login = true;
//		if (login) {
//			while (i < hakSayisi) {
//				System.out.print("Enter your username: ");
//				String inputUserName = scanner.nextLine();
//				System.out.print("Enter your password: ");
//				String inputPassword = scanner.nextLine();
//				if (userName.equals(inputUserName) && password.equals(inputPassword)) {
//
//					login = true;
//					break;
//				} else {
//					i++;
//					login = false;
//				}
//			}
//		} else {
//			System.out.println("hesabınız aktif değilidir");
//		}
//		if (login) {
//			System.out.println("Giriş Başarılıdır.");
//		} else {
//			System.out.println("hakkınız bitti");
//		}

//************************* kullanıcıdan dizi elmanları alıp asal mı değil mi bulma *******************
//		boolean isPrime = true;
//		int primeSayac = 0, notPrimeSayac = 0;
//		String prime = "", notPrime = "";
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("dizinin uzunluğğunu giiriniz: ");
//		int diziUzunlugu = scanner.nextInt();
//		int[] dizi = new int[diziUzunlugu];
//
//		for (int i = 0; i < diziUzunlugu; i++) {
//			System.out.print(i + ". indexli sayıyı giriniz: ");
//			dizi[i] += scanner.nextInt();
//		}
//
//		for (int eleman : dizi) {
//			for (int i = 2; i < eleman; i++) {
//				if (eleman % i == 0) {
//					// not prime
//					isPrime = false;
//					break;
//				} else {
//					isPrime = true;
//				}
//			}
//			if (isPrime) {
//				primeSayac += 1;
//				prime += eleman + " ";
//
//			} else {
//				notPrimeSayac += 1;
//				notPrime += eleman + " ";
//			}
//		}
//		System.out.println("asal toplam: " + primeSayac + " -- asal sayılar:" + prime);
//		System.out.println("asal olmayan toplam: " + notPrimeSayac + " -- asal olmayan sayılar: " + notPrime);

//****************************************** asal sayı mı değil mi????? **********************
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("sayı griniz: ");
//		int sayi = scanner.nextInt();
//		boolean isPrime = true;
//		if (sayi == 1) {
//			isPrime = false;
//		} else {
//			for (int i = 2; i < sayi / 2; i++) {
//				if (sayi % i == 0) {
//					// not prime
//					isPrime = false;
//					break;
//				} else {
//					isPrime = true;
//				}
//			}
//		}
//		if (isPrime) {
//			System.out.println(sayi + " asaldır");
//		} else {
//			System.out.println(sayi + " asal değildir");
//		}

//*************************************** ATM APP ***********************************
//		Scanner scanner = new Scanner(System.in);
//		double bilaBakiye = 2450;
//		String bilalIban = "TR48";
//		String bilalUsername = "bilal12";
//		String bilalSifre = "123";
//
//		double enesBakiye = 1200;
//		String enesIban = "TR10";
//		String enesUsername = "enes55";
//		String enesSifre = "456";
//
//		System.out.print("Kullanıcı adınızı giriniz: ");
//		String userName = scanner.nextLine();
//		System.out.print("Şifrenizi giriniz: ");
//		String sifre = scanner.nextLine();
//
//		if (userName.equals(bilalUsername) && sifre.equals(bilalSifre)) {
//			System.out.println("Bilal'in hesabına hoşgeldiniz");
//
//			System.out.println(
//					"1-Bakiye görüntülemek \n2-Para çekmek \n3-Farklı hesaba para yatırmak \nq-Uygulamadan çıkış");
//
//			System.out.print("Yapmak istediğiniz işlemi giriniz: ");
//			String input = scanner.nextLine();
//			switch (input) {
//			case "1":
//				System.out.println("Bilal Bakiye: " + bilaBakiye);
//				break;
//
//			case "2":
//				System.out.println("Güncel Bakiyeniz: " + bilaBakiye);
//				System.out.println("Çekmek istediğiniz miktarı giriniz: ");
//				double cekilecekMiktar = scanner.nextDouble();
//				if (cekilecekMiktar <= bilaBakiye) {
//					bilaBakiye = bilaBakiye - cekilecekMiktar;
//					System.out.println("Kalan bakiyeniz: " + bilaBakiye);
//					System.out.println("Çekilen Miktar: " + cekilecekMiktar);
//				} else {
//					System.out.println("Yetersiz Bakiye!!");
//				}
//				break;
//			case "3":
//				System.out.print("Parayı yatıracağınız hesabın IBAN giriniz: ");
//				String iban = scanner.nextLine();
//				if (iban.equals(enesIban)) {
//					System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
//					double yatirilacakMiktar = scanner.nextDouble();
//					if (yatirilacakMiktar <= bilaBakiye) {
//						bilaBakiye = bilaBakiye - yatirilacakMiktar;
//						System.out.println("Para Enes Bayram kişisine aktarılıyor..");
//						System.out.println("Yatırılan Miktar: " + yatirilacakMiktar);
//						System.out.println("Kalan Bakiye: " + bilaBakiye);
//					} else {
//						System.out.println("Yetersiz Bakiye!!");
//					}
//				} else {
//					System.out.println("Yanlış IBAN !!!");
//				}
//				break;
//			case "q":
//				System.out.println("Uygulamadan çıkıldı");
//				break;
//
//			default:
//				System.out.println("Lütfen Geçerli bir seçenek seçiniz!!!! ");
//			}
//
//		} else {
//			System.out.println("kullanıcı adı veya şifre yanlış!!");
//		}

	}
}