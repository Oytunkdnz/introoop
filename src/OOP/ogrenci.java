package OOP;


public class ogrenci {
	private boolean ogrenciYemekhanedeMi;
	
	ogrenci() {
		this.ogrenciYemekhanedeMi = false;
	}
	
	public boolean getOgrenciYemekhanedeMi() {
		return this.ogrenciYemekhanedeMi;
	}
	
	public void setOgrenciYemekhanedeMi(boolean ogrenciYemekhanedeMi) {
		this.ogrenciYemekhanedeMi = ogrenciYemekhanedeMi;
	}
	
	void yemekhanedenAyril(ogrenciYemekhanesi z) {
		z.setIceridekiOgrenciSayisi(z.getIceridekiOgrenciSayisi() - 1);
		this.ogrenciYemekhanedeMi = false;
	}
}