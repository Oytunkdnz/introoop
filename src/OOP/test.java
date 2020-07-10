package OOP;

public class test {
	public static void main(String args[]) {
		ogrenciYemekhanesi y = new ogrenciYemekhanesi(400);
		lisansOgrencisi a1 = new lisansOgrencisi();
		yuksekLisansOgrencisi a2 = new yuksekLisansOgrencisi();
		doktoraOgrencisi a3 = new doktoraOgrencisi();
		y.hizmetVer(a1);
		System.out.println("Öğrenci yemekhanesindeki öğrenci sayısı = "+y.getIceridekiOgrenciSayisi());
		y.hizmetVer(a2);
		System.out.println("Öğrenci yemekhanesindeki öğrenci sayısı = "+y.getIceridekiOgrenciSayisi());
		y.hizmetVer(a3);
		System.out.println("Öğrenci yemekhanesindeki öğrenci sayısı = "+y.getIceridekiOgrenciSayisi());
		if(a2.getOgrenciYemekhanedeMi())
			a2.yemekhanedenAyril(y);
		System.out.println("Öğrenci yemekhanesindeki öğrenci sayısı = "+y.getIceridekiOgrenciSayisi());
	}
}
