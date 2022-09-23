public class ShadyRestRoom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("(1) Queen bed");
		System.out.println("(2) King bed");
		System.out.println("(3) Suite with king bed + pull-out couch");
		System.out.print("What room do you want? (1, 2 , or 3)  ");
		int ch = sc.nextInt();
		int price = 0;
		if (Choice == 1) {
			System.out.print("You selected Queen bed room, is this correct? ");
			price = 125;
		} else if (Choice == 2) {
			System.out.print("You selected King bed room, is this correct? ");
			price = 139;
		} else if (Choice == 3) {
			System.out.print("You selected King bed + pull-out couch, is this correct?");
			price = 165;
		} else {
			System.out.println("This room does not exist!");
			return;
		}
		System.out.println("$" + price);
	}
}

    }
}
