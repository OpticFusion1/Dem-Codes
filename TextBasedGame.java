import java.util.Scanner;

public class TextBasedGame {
	public static void main(String[] args) 
	{

		System.out.println("*Dragon noises* Is it behind the rabbit?\n It IS the rabbit!!\n");
		Scanner in = new Scanner(System.in);
		String userInput = "";
		System.out.print("Type your reaction here...");
		userInput = in.next();
		
		String [] Weapons = new String [] {"bow & arrow","King Arthur's sword","Holy Hand Grenade"};
		System.out.println("Arm yourself! Choose wisely...");
		System.out.println("1. " + Weapons[0]);
		System.out.println("2. " + Weapons[1]);
		System.out.println("3. " + Weapons[2]);
		userInput = in.next();
		String selection = Weapons[Integer.parseInt(userInput)-1];
		if (Integer.parseInt(userInput) - 1 == 0) {
		System.out.println("You draw your " + selection + " and elegantly string an arrow.");
		} else if (Integer.parseInt(userInput) - 1 == 1) {
		System.out.println("You majestically unsheath " + selection + "."); 
		} else if (Integer.parseInt(userInput) - 1 == 2) {
		System.out.println("You whip out your Bible, and encased inside is a " + selection + "."); 
		}
		
		String [] Actions = new String [] {"Attempt to dodge the rabbit","ATTACK!!"};
		System.out.println("The rabbit is flying through the air towards you!!!...A rabbit is seriously flying..!?");
		System.out.println("Act Quickly!...");
		System.out.println("1. " + Actions[0]);
		System.out.println("2. " + Actions[1]);
		String userInput2 = in.next();
		String selection2 = Actions[Integer.parseInt(userInput2)-1];
		if (Integer.parseInt(userInput2) - 1 == 0) {
		System.out.println("You make a valiant effort to dodge the flying leap of the fierce rabbit, but it is just too quick. You die miserably from rabbit teeth wounds");
		} else if (Integer.parseInt(userInput2) - 1 == 1) {
		if (selection == "bow & arrow") {
		System.out.println("Shoot! Your perfectly aimed arrow lodges directly into the forehead of the vicious rabbit, but it is too resilient and kills you off with a rabbit bite to the neck. Better luck next time!(British Accent)");
		} else if (selection == "King Arthur's sword") {
		System.out.println("You wind up and swing King Arthur's sword with all of your might, slicing the the head of the rabbit clean off of its body. Congratulations KING OF CAMELOT");
		} else if (selection == "Holy Hand Grenade") {
		System.out.println("You carefully follow the procedures of activating the Holy Hand Grenade, but due to your inability to count to 3, the rabbit reaches you before you are able and tears off your limbs one by one. Eww...");
		}}	
	}
}
