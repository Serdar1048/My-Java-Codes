package com.c;

import java.security.PublicKey;
import java.util.Random;

public class Numara {
	private String kimlikNumarası;

	private Long id;

	private String dogumYeri;

	public Numara() {

	}

	public String getKimlikNumarası() {
		return kimlikNumarası;
	}

	boolean kontrol = true;

	public void setKimlikNumarası(String kimlikNumarası) {
		if (kimlikNumarası.length() == 11) {
			for (int i = 0; i < kimlikNumarası.length(); i++) {
				char karakter = kimlikNumarası.charAt(i);
				if (Character.isDigit(karakter)) {
					kontrol = true;
				} else {
					kontrol = false;
					break;
				}
			}
			if (kontrol) {
				this.kimlikNumarası = kimlikNumarası;
				Random random = new Random();
				int giseNo = random.nextInt(100);
				sonucuYazdir("GİŞE NO: " + giseNo);
			} else {
				sonucuYazdir("rakam giriniz");
			}
		} else {
			sonucuYazdir("TC 11 karakter olmalıdır! ");
		}
	}

	public void sonucuYazdir(String sonuc) {
		System.out.println(sonuc);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDogumYeri() {
		return dogumYeri;
	}

	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}
}
