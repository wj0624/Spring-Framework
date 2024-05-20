package net.developia.spring01.di302;

public class OrangeSpeaker implements Speaker{
	
	@Override
	public void soundDown() {
		System.out.println("OrangeSpeaker : 소리를 키웁니다.");
		
	}
	
	@Override
	public void soundUp() {
		System.out.println("OrangeSpeaker : 소리를 줄입니다.");
	}
}
