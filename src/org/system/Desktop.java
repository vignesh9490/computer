package org.system;
//multiple interface
public class Desktop implements Software,Hardware {
	
	public void desktopModel() {
		System.out.println("desktop model is :HP 15s-du3xxx");
	}

	@Override
	public void hardwareResources() {
		System.out.println("hardware memory of desktop is:500gb");
		
	}

	@Override
	public void softwareResources() {
		System.out.println("software of desktop is:windows10,version-10.0.19042 built 19042");
		
	}
<<<<<<< HEAD
	private void desktopcolour() {
		System.out.println("blue colour");

	}
=======
	private void desktoptype() {
		System.out.println("keyboard type");

	}
	
>>>>>>> f2090eba90835824e5822c1c2b161c8ed955a0e0
public static void main(String[] args) {
	Desktop a = new Desktop();
	a.desktopModel();
	a.softwareResources();
	a.hardwareResources();
<<<<<<< HEAD
	a.desktopcolour();
			
=======
	a.desktoptype();		
>>>>>>> f2090eba90835824e5822c1c2b161c8ed955a0e0

}
	
	}


