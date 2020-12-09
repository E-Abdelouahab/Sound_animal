package com.Polymorphism.app;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.Polymorphism.models.Animal;
import com.Polymorphism.models.Chat;

public class main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub

		Chat chatt = new Chat("chat", "color");
		Animal chattt = new Chat("chat" , "color");

//		chatt.ReadSound("\\sound-effects\\chat.wav", "chat");
		
		chattt.ReadSound("\\sound-effects\\chat.wav", "chat");
	}

}
