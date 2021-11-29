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
	private void desktoptype() {
		System.out.println("keyboard type");

	}
	
public static void main(String[] args) {
	Desktop a = new Desktop();
	a.desktopModel();
	a.softwareResources();
	a.hardwareResources();
	a.desktoptype();		

}
	
	}


