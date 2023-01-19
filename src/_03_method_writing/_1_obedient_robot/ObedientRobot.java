package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color.*;

import javax.swing.JOptionPane;

public class ObedientRobot {
	public static void main(String[] args) { 
		
		String shape = JOptionPane.showInputDialog("Square or Triangle?");
		if(shape.equalsIgnoreCase("square")) {
			drawSquare();
		} if(shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
		
	}
	static void drawSquare() {
		Robot bob = new Robot();
		bob.penDown();
		bob.setSpeed(75);
		bob.setPenColor(0,0,0);
		for (int i = 0; i < 4; i++) {
			bob.turn(90);
			bob.move(100);
		}		
	}
	static void drawTriangle() {
		Robot bob = new Robot();
		bob.penDown();
		bob.setSpeed(75);
		bob.setPenColor(0,0,0);
		for (int i = 0; i < 3; i++) {
			bob.turn(120);
			bob.move(100);
		}
	}
}
