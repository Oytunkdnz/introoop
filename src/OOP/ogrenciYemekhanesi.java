package OOP;

public class ogrenciYemekhanesi extends yemekhane {
	ogrenciYemekhanesi(int yemekhaneKapasitesi) {
		super(yemekhaneKapasitesi); // üst sınıftaki ctor'la nesne oluşturdum
	}
	
	private int iceridekiOgrenciSayisi;
	
	public int getIceridekiOgrenciSayisi() {
		return this.iceridekiOgrenciSayisi;
	}
	
	public void setIceridekiOgrenciSayisi(int iceridekiOgrenciSayisi) {
		this.iceridekiOgrenciSayisi = iceridekiOgrenciSayisi;
	}
	
	private boolean yemekhaneDoluMu() {
		return this.getIceridekiOgrenciSayisi() >= this.getYemekhaneKapasitesi();
	}
	
	void hizmetVer(ogrenci o) {
		if(this.yemekhaneDoluMu())
			System.out.println("Yemekhane doludur!");
		else {
			this.setIceridekiOgrenciSayisi(this.getIceridekiOgrenciSayisi() + 1);
			o.setOgrenciYemekhanedeMi(true);
		}
	}
}