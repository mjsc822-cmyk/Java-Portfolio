package shcs;

abstract class Devices {
	
	boolean sSwitch = false;
	
	
	void on() {
		sSwitch=true;
	}
	void off() {
		sSwitch=false;
	}
	
	public abstract void show();
	
	public static void toggleSwitch (Devices [] listd, boolean sSwitch) {
		for(int i= 0; i<=4; i++) {
			if(sSwitch) {
				listd[i].on();
				
			}
			else {listd[i].off();}
			
		}
		
	}
	
	boolean ison() { return sSwitch;}
	
	public static int showAll(Devices [] listd) {
			int counter = 0;
			for(int i= 0; i<=4; i++) {
				if(listd[i].ison()) {
					counter++;
				}		
			}
			if(counter==5) {
			System.out.println("All devices are turned on. Devices On: "+counter);
			}
			else if(counter==4 || counter>=1) {
				System.out.println("Number of devices that turned on: "+counter);
			}
			else if(counter==0) {
				System.out.println("All devices are turned off. Devices On: "+counter);
			}
			return counter;
			}
	
}


class AirConditioner extends Devices {
	
	private String speed;
	private String temp;
	
	AirConditioner(){
		speed="3";
		temp="24";
	}
	
	
	
	void setspeed(String speed) {
		this.speed=speed;
		System.out.println("Fan speed has been changed to: "+speed);
		
		
	}
	
	void settemp(String temp) {
		this.temp=temp;
		System.out.println("Temperature has been changed to: "+temp);
	}
	
	
	public void show() {
		
		if(sSwitch) {
			System.out.println("\nThe Air Conditioner (Turned On).");
			System.out.println("Fan speed: "+speed+" Temperature: "+temp+"\n");
			}
		else { System.out.println("The Air Conditioner is turned off.");
		}
	}
	
}

class LampShade extends Devices {
	private String brightness;
	private String lightcolor;
	
	LampShade(String b, String l){
		brightness = b;
		lightcolor=l;
		
	}
	
	LampShade(LampShade copy){
		brightness = copy.brightness;
		lightcolor=copy.lightcolor;
		
	}
	
	void setbrightness(String brightness) {
		this.brightness=brightness;
		System.out.println("Brightness set to: "+this.brightness);
	}
	void setlightcolor(String lightcolor) {
		this.lightcolor=lightcolor;
		System.out.println("Light set to: "+this.lightcolor);
	}
	public void show() {
		if(sSwitch) {
			System.out.println("\nThe Lamp Shade (Turned on).");
			System.out.println("Current Brightness: "+brightness+" Current Ligh Color: "+lightcolor+"\n");
		}
		else { System.out.println("The Lamp Shade is turn off.\n"); }
	}
}

class Television extends Devices{
	private String channel;
	private String volume;
	
	Television(){
		this.channel="1";
		this.volume="10%";
	}
	
	void setChannel(String channel) {
		this.channel=channel;
		System.out.println("Current Channel: "+this.channel);
	}
	
	void setVolume(String volume) {
		this.volume=volume;
		System.out.println("Volume set to: "+this.volume);
	}
	
	public void show() {
		
		if(sSwitch) {
			System.out.println("\nThe Telivision (Turned On).");
			System.out.println("Channel: "+channel+" Volume: "+volume+"\n");
		}
		else { System.out.println("The Television is turn off."); }
	}
}

class Microwave extends Devices{
	private int timer;
	private int temp;
	
	Microwave(){
		timer=1;
		temp=10;
	}
	
	void settimer(int timer) {
		this.timer=timer;
		System.out.println("Timer was set to: "+timer+" minutes.");
	}
	
	void settemp(int temp) {
		this.temp=temp;
		System.out.println("Temperature was set to: "+temp+" %.");
	}
	
	public void show() {
		if(sSwitch) {
			System.out.println("\nThe Microwave (Turned On).");
			System.out.println("Timer: "+timer+" minutes. Temp: "+temp+".\n");
		}
		else { System.out.println("The Microwave is turn off\n"); }
	}
		
}



public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AirConditioner aircon = new AirConditioner();
		LampShade lamp = new LampShade("100%","Yellow Light");
		LampShade lamp2 = new LampShade(lamp);
		Television tv = new Television();
		Microwave oven = new Microwave();
		
		Devices [] listd = {aircon,lamp,lamp2,tv,oven};
		
		aircon.on();
		aircon.show();
		aircon.setspeed("1");
		aircon.settemp("16");
		aircon.show();
		aircon.off();
		aircon.show();
		
		lamp.on();
		lamp.show();
		lamp2.on();
		lamp2.show();
		
		lamp.setbrightness("50");
		lamp.setlightcolor("White light");
		lamp2.setbrightness("80");
		lamp2.setlightcolor("Green light");
		
		lamp.show();
		lamp2.show();
		lamp.off();
		lamp2.off();
		lamp.show();
		lamp2.show();
		
		tv.on();
		tv.show();
		tv.setChannel("7");
		tv.setVolume("100");
		tv.show();
		tv.off();
		tv.show();
		
		oven.on();
		oven.show();
		oven.settimer(60);
		oven.settemp(100);
		oven.show();
		oven.off();
		oven.show();
		
		Devices.toggleSwitch(listd, true);
		System.out.println("*Click");
		Devices.showAll(listd);
		System.out.println("*Click");
		Devices.toggleSwitch(listd, false);
		Devices.showAll(listd);
		
		
		
		
		
	}

}
