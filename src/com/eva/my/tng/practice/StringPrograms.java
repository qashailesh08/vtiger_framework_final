package com.eva.my.tng.practice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringPrograms {

	public static void main(String args[]) {
//		ReversStr();
//		removeUpps();
//		removeLows();
//		revStsm();
	}

	public static void ReversStr() {
		String name = "Shailesh Kumar";
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			System.out.print(ch);
		}
	}

	public static void removeUpps() {
		String name = "ShaiLesh";
		for (int i = 0; i < name.length(); i++) {
			char cha = name.charAt(i);
			if (!Character.isUpperCase(cha)) {
				System.out.print(cha);
			}
		}
	}

	public static void removeLows() {
		String name = "Shailesh";
		for (int i = 0; i < name.length(); i++) {
			char cha = name.charAt(i);
			if (!Character.isLowerCase(cha)) {
				System.out.print(cha);
			}
		}

	}

	public static void revStsm() {
		String sms = "I love my India";
		String[] str = sms.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i]);
		}
	}

}
