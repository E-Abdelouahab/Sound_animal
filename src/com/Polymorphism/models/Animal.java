package com.Polymorphism.models;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
	private String name;
	private String color;


	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", ]";
	}

	public void eat() {
	};

	public void sleep() {
	};

	public void run() {
	};

	public void ReadSound(String paht, String effectSource)
			throws UnsupportedAudioFileException, IOException, LineUnavailableException {

		Path AbsolutePath = FileSystems.getDefault().getPath("").toAbsolutePath();
		String fullPath = AbsolutePath + paht;
		File file = new File(fullPath);

		AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();
		System.out.println(effectSource + " START SOND ! ");
		System.out.println("s : " + clip.isActive());
		while (clip.isActive()) {
//System.out.println("start "+effectSource);
		}
		clip.close();
		System.out.println(effectSource + " STOP SOUND! ");
	}

}
