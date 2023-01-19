package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What kind of pet would you like to buy? The options in the pet store are a dog, cat, or bunny.");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		for(int i = 0; i<6; i++) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What activity would you like to do with your pet to get their happiness up?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Play", "Bathe", "Groom", "Sleep", "Cuddle"}, null);

			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(pet.equalsIgnoreCase("bunny")) { if(task == 5) {
				JOptionPane.showMessageDialog(null, "Your bunny feels very loved. +10 happiness points.");
				happinessLevel +=10;
			} if(task == 4) {
				JOptionPane.showMessageDialog(null, "Your bunny is all energized! +10 happiness points");
				happinessLevel +=10;
			} if(task == 3) {
				JOptionPane.showMessageDialog(null, "Your bunny loves the fresh cut! +5 happiness points");
				happinessLevel +=5;
			} if(task == 2) {
				JOptionPane.showMessageDialog(null, "Your bunny is all clean and happy! +10 happiness points");
				happinessLevel +=5;
			} if(task == 1) {
				JOptionPane.showMessageDialog(null, "Your bunny plays around in their pen and is very happy. But your bunny is tired.. -5 happiness points");
				happinessLevel -=5;
			} if(task == 0) {
				JOptionPane.showMessageDialog(null, "Your bunny eats all the food and is no longer hungry. +10 happiness points");
				happinessLevel +=10;
			} }
			if(pet.equalsIgnoreCase("cat")) { if(task == 5) {
				JOptionPane.showMessageDialog(null, "Your cat feels very loved. +10 happiness points.");
				happinessLevel +=10;
			} if(task == 4) {
				JOptionPane.showMessageDialog(null, "Your cat is all energized! +10 happiness points");
				happinessLevel +=10;
			} if(task == 3) {
				JOptionPane.showMessageDialog(null, "Your cat loves the fresh cut! +5 happiness points");
				happinessLevel +=5;
			} if(task == 2) {
				JOptionPane.showMessageDialog(null, "Your cat is all clean and happy! +10 happiness points");
				happinessLevel +=5;
			} if(task == 1) {
				JOptionPane.showMessageDialog(null, "Your cat plays around on their cat tower and is very happy. But your cat is tired.. -5 happiness points");
				happinessLevel -=5;
			} if(task == 0) {
				JOptionPane.showMessageDialog(null, "Your cat eats all the food and is no longer hungry. +10 happiness points");
				happinessLevel +=10;
			} }
			if(pet.equalsIgnoreCase("dog")) { if(task == 5) {
				JOptionPane.showMessageDialog(null, "Your dog feels very loved. +10 happiness points.");
				happinessLevel +=10;
			} if(task == 4) {
				JOptionPane.showMessageDialog(null, "Your dog is all energized! +10 happiness points");
				happinessLevel +=10;
			} if(task == 3) {
				JOptionPane.showMessageDialog(null, "Your dog loves the fresh cut! +5 happiness points");
				happinessLevel +=5;
			} if(task == 2) {
				JOptionPane.showMessageDialog(null, "Your dog is all clean and happy! +10 happiness points");
				happinessLevel +=5;
			} if(task == 1) {
				JOptionPane.showMessageDialog(null, "Your dog plays around outside and is very happy. But your dog is tired.. -5 happiness points");
				happinessLevel -=5;
			} if(task == 0) {
				JOptionPane.showMessageDialog(null, "Your dog eats all the food and is no longer hungry. +10 happiness points");
				happinessLevel +=10; }
			} 
				if(happinessLevel >= 45) {
				JOptionPane.showMessageDialog(null, "Your pets happiness is " + happinessLevel + "! You are a great pet owner");
				break;
			}
		}
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.		
}