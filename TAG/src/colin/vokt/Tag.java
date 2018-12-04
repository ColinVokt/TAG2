package colin.vokt;

import java.util.Scanner;

public class Tag {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		template(input);

	}
	public static void template (Scanner input) {
		//Assci art
		System.out.println("         _____                    _____                    _____                    _____          \r\n" + 
				"         /\\    \\                  /\\    \\                  /\\    \\                  /\\    \\         \r\n" + 
				"        /::\\    \\                /::\\    \\                /::\\____\\                /::\\____\\        \r\n" + 
				"       /::::\\    \\              /::::\\    \\              /:::/    /               /::::|   |        \r\n" + 
				"      /::::::\\    \\            /::::::\\    \\            /:::/   _/___            /:::::|   |        \r\n" + 
				"     /:::/\\:::\\    \\          /:::/\\:::\\    \\          /:::/   /\\    \\          /::::::|   |        \r\n" + 
				"    /:::/__\\:::\\    \\        /:::/__\\:::\\    \\        /:::/   /::\\____\\        /:::/|::|   |        \r\n" + 
				"   /::::\\   \\:::\\    \\      /::::\\   \\:::\\    \\      /:::/   /:::/    /       /:::/ |::|   |        \r\n" + 
				"  /::::::\\   \\:::\\    \\    /::::::\\   \\:::\\    \\    /:::/   /:::/   _/___    /:::/  |::|   | _____  \r\n" + 
				" /:::/\\:::\\   \\:::\\    \\  /:::/\\:::\\   \\:::\\    \\  /:::/___/:::/   /\\    \\  /:::/   |::|   |/\\    \\ \r\n" + 
				"/:::/  \\:::\\   \\:::\\____\\/:::/  \\:::\\   \\:::\\____\\|:::|   /:::/   /::\\____\\/:: /    |::|   /::\\____\\\r\n" + 
				"\\::/    \\:::\\   \\::/    /\\::/    \\:::\\  /:::/    /|:::|__/:::/   /:::/    /\\::/    /|::|  /:::/    /\r\n" + 
				" \\/____/ \\:::\\   \\/____/  \\/____/ \\:::\\/:::/    /  \\:::\\/:::/   /:::/    /  \\/____/ |::| /:::/    / \r\n" + 
				"          \\:::\\    \\               \\::::::/    /    \\::::::/   /:::/    /           |::|/:::/    /  \r\n" + 
				"           \\:::\\____\\               \\::::/    /      \\::::/___/:::/    /            |::::::/    /   \r\n" + 
				"            \\::/    /               /:::/    /        \\:::\\__/:::/    /             |:::::/    /    \r\n" + 
				"             \\/____/               /:::/    /          \\::::::::/    /              |::::/    /     \r\n" + 
				"                                  /:::/    /            \\::::::/    /               /:::/    /      \r\n" + 
				"                                 /:::/    /              \\::::/    /               /:::/    /       \r\n" + 
				"                                 \\::/    /                \\::/____/                \\::/    /        \r\n" + 
				"                                  \\/____/                  ~~                       \\/____/         \r\n" + 
				"                                                                                                    ");
		
		//Tell Story
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("A Boy named Io and his fox friend, Fawn go into the woods. They plan to have tons of fun."
				+ " \nWhile playing fetch, Io tossed the ball with all his might and Fawn chased it intensly."
				+ "\nFawn chased the ball so far that Io lost vision of him. Io waited for Fawns return"
				+ "\nbut he never came back. Io was becoming worried so he decied to follow the tracks that Fawn made.");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		//promt question
		System.out.println("While trying to find Fawn, Io came to the choice of traveling to the River, or to follow"
				+ " his tracks to the open Field...");
		
		//get user input
		String answer = input.nextLine();
		
		//Check Answer
		switch (answer) {
		case "River":
			template1(input);	
			break;
		case "Field":
			template2(input);
			break;
		
		}
		
	}
	public static void template1 (Scanner input) {
		//Assci art
		System.out.println();
		
		//Tell Story
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("When Io travels to the river and dosen't find Fawn, he screams at the top of his lungs."
				+ "\n Io sees a ball in the river, but it didn't look like Fawn's ball"
				+ "\nIf Io tried to reach for the ball he would've been swept away by the rushing waters.");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//promt question
		System.out.println("While examining where he should go next, he discovers a Rock Path to"
				+ " the other side of the river. Should Io traverse the Rock Path, or return to the Field ");
		
		
		//get user input
		String answer = input.nextLine();
		
		//Check Answer
		switch (answer) {
		case "Field":
			template2(input);	
			break;
		case "Rock Path":
			template3(input);
			break;
		
		}
	}


	public static void template2 (Scanner input) {
		//Assci art
		System.out.println();
	
		//Tell Story
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Io runs into the big open field about a 1/4 of a mile wide."
				+ "\nHe sees nothing but open space with woods surrouding him. He is completely lost. He looks up."
				+ "\nHe sees nothing but the blue sky as he ponders where to go next. He looks back down and travels the perimeter of the field");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//promt question
		System.out.println("Io sees three options. He could go back to the River, climb the Rocky Hills,"
				+ "or travel to the Swamp.");
	
		//get user input
		String answer = input.nextLine();
	
		//Check Answer
		switch (answer) {
		case "River":
			template1(input);	
			break;
		case "Swamp":
			template6(input);
			break;
		case "Rocky Hills":
			template7(input);
			break;
		
		}
	}

	public static void template3 (Scanner input) {
		//Assci art
		System.out.println();

		//Tell Story
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Io steps on the rocks to cross over the raging river, one misstep and Io was a goner. He"
			+"\n finally makes his way to the other side. While searching for Fawn he sees a barbwire fence. Io is confused as never seen this"
			+ "\n fence before. He looks through the fence and sees military personel. Io treks the preimeter of the fence, but it"
			+ "\ndoesn't go anywhere as the river cuts him off on both sides. Io thinks about where he could go next...");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//promt question
		System.out.println("When Io was following the fence, he found a large hole into to the Military Base. He could also"
			+ "\ngo back to the River...");

		//get user input
		String answer = input.nextLine();

		//Check Answer
		switch (answer) {
		case "River":
			template1(input);	
			break;
		case "Military Base":
			template4(input);
			break;
	
	}

}

	public static void template4 (Scanner input) {
		//Assci art
		System.out.println();

		//Tell Story
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Io finds his way back to the hole. He crawls his way in. He doens't know what"
			+ "\nthe military would be doing here as this is the first time he has seen them before. He heard a loud"
			+ "\nnoise months ago while playing with Fawn. Io knows if he gets caught then he might "
			+ "\nfind himself under fire. Io checks his surroudings to ensure his safety. While searching the base, Io finds "
			+ "\na large tarp covering something. He is curious as to what's under the tarp. It could be the reason why the military made a base here... ");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//promt question
		System.out.println("Io is eager to find what's under the tarp."
			+ " \n He needs to find Fawn. He might get caught looking under the tarp."
			+ "\nShould he look under the Tarp or go back to the River?");

		//get user input
		String answer = input.nextLine();

		//Check Answer
		switch (answer) {
		case "River":
			template1(input);	
			break;
		case "Tarp":
			template5(input);
			break;
	}
}
	public static void template5 (Scanner input) {
		//Assci art
		System.out.println();

		//Tell Story
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Io goes under the tarp and sees a UFO! Io goes crazy. He looks around and finds the bodies"
			+ "\n of three motionless aliens. They layed on the ground acting dead. When Io decides he has seen to much, he tries to"
			+ "\nreturn to the river, but he hears strange voices. He turns around and THE ALIENS ARE ALIVE! IO TRIES TO RUN"
			+ "\n OUTSIDE OF THE TARP, IN A PANIC, WHEN MILITARY PERSONEL BLOCK HIS PATH TO THE EXIT. They try to stop Io and ask him"
			+ "\nquestions, but the aliens surround him and the military personel. They condenm him and the soliders, "
			+ "\nyour body starts vibrating. Io's body becomes hot and your skin bubblies the heat keeps rising "
			+ "\nyou can't handle it and you finally combust.");
		//Aliens
		System.out.println(
			"                                                                                     .';cllllllloooooollllcllcclcccc:::cloool;.                                                                         \r\n" + 
			"                                                                                  .,coddddoodoodddodddoodooooooolllllccccclodkko:.                                                                      \r\n" + 
			"                                                                               .'cdxkxxdxdddddddddddxxxxxdddddddooooollllllllodOOkl'                                                                    \r\n" + 
			"                                                                             .'lkOkkkkxxxxxxxdxxxxxkkxxxkxxxxddxxdoooooolollllodxkK0o'                                                                  \r\n" + 
			"                                                                            .lO0OOOOOkxxkkkxxxkkkkkkkxxkkkkkkxxxxxxddddoddoooooodxk0K0c.                                                                \r\n" + 
			"                                                                           ,kKKK0OOkkkkkkkOkkkOOkkkkkkkkkOOOkkkxxxxxxxxxxdddoooooodOKXXk,                                                               \r\n" + 
			"                                                                         .:0XXKK0OOkkkkkOOOOOOOOOOOOOOOOOOOOOkkkkkkxxxxxxxdddooolodxk0XN0:                                                              \r\n" + 
			"                                                                        .:0NXXKK0OOOOOOOOOOOOOOOO0000000OOOOOOOOOOkkkkxxxxxxddddooooxO0XNK:                                                             \r\n" + 
			"                                                                        ;0NNXKK00OkOOOOOOOOOO0000000000000OOOOOOOOOOOkkxxxxxddddoooooxk0XNO'                                                            \r\n" + 
			"                                                                       'kNNNXKK0OOOOOOOOOO0000KKKKKKK0000000000OOOOOOOkkkxxxddoooolllodkKXNd.                                                           \r\n" + 
			"                                                                       lXNNXK00OOOOOOOOO000KK000000KKKKK000000OOOOOkOOkkkkxdddddoooollldOKXK;                                                           \r\n" + 
			"                                                                      .kNNXK0OOOOOOOOOOOOO00000000KKK00K0000OOOOOOkkkkkkxddddddddooooc:cdOXNd.                                                          \r\n" + 
			"                                                                      :KNNXK0OOOOkkkkkxxkkOOOO0000KK000K0000OOOkkkxxxxdddoolllllllooolc:cdOXO'     ...........                                          \r\n" + 
			"                                                                      lNNXK0OkkkkxddooooddxxxkkOOO000000K000OOkkxxdoolllccc::::ccllcllcc:cdKKc..'',,;;;;:::::cc::;..                                    \r\n" + 
			"                                                                      lNNKOkkkxxdoolllccccclodxkkkOO0000000OOkxddollc:;;;;;;;;:::cccclc::;lOXk:,,,,,,,,,,,,,,;;codxdo;.                                 \r\n" + 
			"                                                                      oNNKkkkxdlc:;,,,,,;::::cldxxkkOO00000Okxdoolc:;;;;:;;,''''',,;;ccc:;:xKk;,;,,,,;;;;;;;;;;,;:cok0Oo;.                              \r\n" + 
			"                                                                      lXXOxxxo:'....    ..',,;:cloxkkkO0000Oxdol:;,,;;;'............',;::;;o0x;,;;,,;;;;;;;;;;;;;;;:cdOKKx,                             \r\n" + 
			"                                                                      ;0KOxdl,..        ..cdoc;;clodxxkO00Oxdoc:;,,;;.. ...,oOx;..   .',;,;oOl,,,,;;;;;::::::::::;;;;:lx0XKl.                           \r\n" + 
			"                                                                      .xKOxd:.           .'ldo;,;:coddkO00kxol:,',;'.     ..,;,.      .';,;od:,,;;;;;;::::cccc::::::;;;cdOXXo.                          \r\n" + 
			"                                            ...........                c00kxo:..            ....';clodxkOOkdlc;',,'.                 .';;,:oc,,,,;;;;;::::cccccc::::;;;;:lOXXo.                         \r\n" + 
			"                                     ..........''''''',,,'..           .l00kxoc;'...            .;:cloxkOOkdl:,,;,.                ..',;,,::'''',,,;;;;:::::::::::::;:::;;lkXK;                         \r\n" + 
			"                                  ....'''.........''''',;:llc;.         .lOOkxxoc;,'''.........';:clloxkOOxdo:,;:;'...............',;;,'',,....''',,;;;;;;;;,,,,,,,,,;;;;,;lOXo                         \r\n" + 
			"                               ..',,''''''''''''''''''',,;:ldxdl'.       .:dxkkkxdolcccccclllllllodxkkkO0Okdolllcccc:c::;;,,,,,,;;::;'...........'',,;;;;,,,,'''''.''',,;,,;oKx.                        \r\n" + 
			"                              .;:;,'''''''''''''''''''''',;:ldkOko'       .'cdxxxxkkkkkkkkxxxxxkkOOO0OOOOOkxdddxddooolloolllllcc:;,'......   .....'',,,,,''''......'....',,,cOd.                        \r\n" + 
			"                            .;lc:;,,,,,,,,,,,,,,,,,,''''',,;:ldk0KO:.       .':looddxkkkOOOOOOOOO00000Okxxdoodxxxxxxddddddoolc:;,'.......   .;o:..''',,,''.... ...cx:.  ..'':ko.                        \r\n" + 
			"                           .:doc;,,,,,,,,,;;;;;,,,,,,,,,',,,,:lxO0K0:.        ..,::ccoddxkkkOOOOOOOOOkdc:c;;coxxxxxxdddollc:;,'.......       .:c'..''''''...      ...  ..''':d;                         \r\n" + 
			"                          .;ddl:;,,,,,;;;;;;;;;;;;;,,,,,,'''',;cdk0KO;          ..',;::cloodxxkkkkOOOkxdooooddxxdddollc:;;,'...........       .....'','''''............''''';,.                         \r\n" + 
			"                          'dxo:;;,;;;;;::::::::;;;;;,,,,,''''',,:ok0Xx.           ..',;;::ccodddxkkkOOOOOOOOkkddolc::;,,'....... ................'',,'',,,,,,,,,,,,,,,''......                          \r\n" + 
			"                          :kd:;,,,,;;;;;;:::::::;;;,,','''..'''',;lk00;             ..',,;;:cooddxxxkkkkkkkkxdolc::;,,'........    ..............''''''',;;;;;;;;;,,''......                            \r\n" + 
			"                         .lxc,,,,,,''''',,;;:::::;,,'''........''',ck0:               ..,,;;:looddooooooooollc:::;;,''......         .............''',,,;;;;;,,,,''......                               \r\n" + 
			"                         .cd;,,'..........',,;::;,,''.............';dk;                 .';;:clodooollllllc:;;:::;,'.......           ...........'',,;;;;,,,,''''......                                 \r\n" + 
			"                          ;l;,'.. .. .;c:'.',,;:;,'.......:oc.   ..,oo.                  ..,:lodxxxkkkOOOOOxdolc:;,'.....                ........''',,,,,,,,''.......                                   \r\n" + 
			"                          .:;'..     .,lc'..',,;;'....   ....   ..';c,                     .':ldxkkkkkOO00Okdoc:,,'....                   ......',,,;;;;,,,,'.......                                    \r\n" + 
			"                           .;,'....     ....',,;,'.......    ....'','.                       ..;llodddxkOOkdl:;'.....                       ....',,,,;;,,'''......                                      \r\n" + 
			"                            .',''''''''''''',;;;;,'''''''.........'.                           ;xdc:::;:cc:;,.......                          ..................                                        \r\n" + 
			"                             ...''',,,;;;;;:::;,,',,,,,,'''........                            :0KOkkxl,.........;'                            .............'.                                          \r\n" + 
			"                                ....'',,;;;;::;,,,,,,,'''.....                                'xXXK0O00x:,''....;c.                             ';,''.....'::.                                          \r\n" + 
			"                                  ....''',,;;;;;;;;,''.......                               .:xKXXK0O0K0dc;,,'''ol.                            .':::;,',,':x:                                           \r\n" + 
			"                                    .....',,,,,,,,'''.......                             ..,cdk0KXK0O0KKOdl:;,':kk:.                          .':cllc;,,,;d0d'                                          \r\n" + 
			"                                      ...'',,,;;;,'''......                           ..,:lllodkO00OOO00Okdoc;;o0K0o'.                     ...';cllll:,,,:kXXOc.                                        \r\n" + 
			"                                        ..',,,;:;,'......                        ...',:ccclllldxkOOOOOOOkxdoc;:d0KXKOo'.                 .....',:cccc;,,,:xKXK0kl,.                                     \r\n" + 
			"                                          .','.......,,.                    ..,;;:::::cccccclldxkkkkkkOOkdol:;;o0KXK00Oo;.          ...........',;;;;,,,,;lkKKOkkkdc;'.                                 \r\n" + 
			"                                          .cdc,....,oxc.                 .,loooooolcccc:::::cloxxxxxkkOOkxoc;;:oOKXXK0OOOxc,..    .............''',,;,,,,;cokkkxxxxxkkxl;.                              \r\n" + 
			"                                          'oOkl,,';okO:.                .oOOxxxddddoollllccccloddddxxkOOkdl:;:cdOKKXK0kxkkkkxoc,..............'''',,,,;;;;:cclllllcccloxkd,                             \r\n" + 
			"                                       ..,okOko:,,lk00x;.              'xK0kkkkkxxxddooooloodddodddddxkOkdlclooxO0KKK0OkkxxkkO00ko;..........''',,,,,;;;;;;;;:::::::clcclxo.                            \r\n" + 
			"                                    ...',cdxxdl;,,lk0KKOl'.           .lK0Okk00OOOOkkxxdooddddddxxxxxkOkkxdddxddkO0OOOOOkxddxdxO0K0l.....'....',,;;;;;:::::::::::;::loc:;:l'                            \r\n" + 
			"                                 ...'''',:col:;,,,:ok00Oxdc,.         .d0kxxkOOOO000OkkxdddddddddxxxxxxxkxxdxxdoddxddxxddoooodxxxOKKl....'...'',,;;;:::cccccccc:;;;:ll:;;;;.                            \r\n" + 
			"                              ....'''''',;;:::;,,,;ldxkxlclol:;'.     .okxdxkkkxxkO00OOkxxxdddxxxkkkxxxxxxxxxdooooooodooolloodxxddxOd'.....''''',,;;;;::::::cc::;;,;:;;;;c;.                            \r\n" + 
			"                           ..''''''''''',,,,;:;;;;;:ccllc::cclodo:.   .cxxxxxkxc;lxOO00OkkxxxxxkkkOOkkkkkxxxxxdddddddxdoollooxkxoclxo'....''''',,,,;;;;:::::::;;;;,,,';::l:.                            \r\n" + 
			"                          ';;,,,,,,,,,,,,,,,;;;;;;,;;;;;;;;;::ccoko'  .lkkkxkkd:.'cxkOOOOkxxxxkkOOOOOOOOkkkkkkxxxxxxkkxdollldxkdccoxl.....''''',,,;;;;::cc:::::;;,,'.':c:c:.                            \r\n" + 
			"                         .::,;;,,;;,,,,,,,,,;;;;;,,,,,,,,,,;:c:;;cdc. .lOOkkkOd:..;oxkkOOOkxxxkkkOOO00OOOOOOOkkkkxxxkkxdolcloxklcodxc..  .,,,,',,,;;;;::cc:::::;;;;;'';::c:.                            \r\n" + 
			"                        .,;,,,,,,,;,,,,,;;;;;;;;;;,;;;;;,,,;cc;'',::. .oK0kkOOx:..,:ldxkOOkkkkkkkkkOOOOOOOOOOOkkkxxxxxdolcc:ldl:oddk:..  .,;,'',,,;;;;::::::;;;:::lc..;::c:.                            \r\n" + 
			"                         .,,,,...',,,,,;;::::::::;;;;;;,,',;c:'''.''. .dKOkkOOd;..';:ldxkkkkOkkxxxkkkkOkkkkkkkkxxxxxxdolcc::cc,:dddkc.   .',,''',,,;;,;;;;;;;;,,;;:;..,::::.                            \r\n" + 
			"                         .,,,,.. .',,,,;;;::::::;;;;;,,'''',;''''''.  'xKOkOOkd;..';:codxkOOOOkxxxxkkkkkxxxkkkxxxddddolc:::::,'lkxoxl.    ',,'''',,,,,,,;;,,,,,,'''...,:;::.                            \r\n" + 
			"                         .;;,,..  .',,,,;;;;;;;;;;,,,,,'''','.''',;'. ,k0kkOOxl,..';:coodxkkkOOkkkkkkkkkxxxkkkkxxddddolc::;;'.;dOkoxo.    .,,''',,,,,,,,;;,,,,,,''.  .';;:c'                            \r\n" + 
			"                         .;;,,.   .'',,,;;;;;;;;;;;;,,,''''''.''';c;. :00kkOkdc'..':cloddxxkkOOOkkkkkkkkkkxxkkkxxddxdoolc;;'.'cxOxodl.    .',''',,,,,,,,;;,,,,;;;,.  ..;;:c,                            \r\n" + 
			"");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//promt death and gameover
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNX0kol:;,....               ....,;cldk0XWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOo:,..                                   ..,cdOXWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN0d:.                                               .:d0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKd;.                                                     .;dXWMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0l.                                                           .oKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWKo.                                                               .oXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk,                                                                   ,OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNo.                                                                     .dNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNo.                                                                       .oNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMNo.                                                                         .dWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk.                                                                           'OMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX:                                                                             cNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO.                                                                             '0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMMMWd.                                                                             .xWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNl                                                                               oWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMNc                                                                               lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMX:                                                                               cNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMMMMX:                                                                               lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMNl                                                                               oWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMWo                                                                              .dWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMMMMWd.               ..;codkOOOkxo:.                 .:oxOOOkkdoc,.                .xWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMWMMMMMWMMMMMMMMMMMWMMM0'             'oOXWWMMMMMMMMMW0:              .cKWMMMMWMMMMWNXOo'             ,0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMWk'          .lXMWMMMMMMMMMMMWMMK;             :XMMMMMMMMMMMMMMMWXc.          'kWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMWMMMMMMMMMMMMMMMMMWMMMMMWMMW0c.        cXMMMMMMMMMMMMMMMMMNc             lNMMWMMMMMMMMMMMWMMX:        .lKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMWMMMMMWMMMMMMMMMMMMMMMMMMNx.      .xWMMMMWMMMMMMMMMMMMK,             ;XMWMMMMMMMMMMMMMMMWd.      .kWWWMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMWMMMMNl      .dWMMMMMMMMWMMMMMMMXc              .lNMMMMMMMMMMMMMMMMWo       oWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWd.      ;0WMMMMMMMMMMMWMW0:     ,dkOOd'    .c0WMMMMMMMMMMMMMM0,      .xMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMXc        ;ONMMMMMMMMMWNOl.     ;KMMMMW0;     .l0NWMMMMMMMMMNk,        lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMWx.         .,cdk000Okdc,.      ;0MMMMWMW0,      .,ldO000Okdc,.         .kWMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNc               ....          ,0MMMWMMMMWO'          ...                lWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN:                            ,0WMMMMMMMWMWO'                            cNMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMWMMMNc                           .kWMMMMMMWMMMMWx.                           lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNl                           :XMMMMMWMMMMMMMK;                           oWMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO'                          :XMMWMMMMMMMMMMX;                          ,0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMMWKxlc::::;,..               .xNMMMMMMMMMMMNd.               .',;::::cokXWMMMMMMMMMMMWMMMMMMMMMMMWMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMWWMWWWX0o.              .:kXNWWMMWNKx;.              'dKNWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMWMMMMMMMMMNl                 .,;:c::,.                 oWMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMMMMMMMMMMWMMMMMMMMMMMWo                                          .dWMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMWKOOOKNWWMMMMMMMMMMMMMNl                                           oWMMMMMMMMMMMWNKOOOKWMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO:.   .':xXWMMMMMMMMMMMX:                                           cNMMWMMMMMWXx:'.   .:OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMWO'         'dNMMMMMMMMMMX:                                           cNMMMMMMMNd'         'OMMMMMMMMMMMMMMMMMMMMWMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMWMMMMMMMMMMMMK;           .cKWMMMMMMMMWo                                          .dWMMMMMWKc.           :KMMMMMMMMMMMMMMMMMWMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMWMMMMMWWNNWWWN0:              ,kWMMMMMMMMXd;....                               ....;xNMMMWMWk,              :0WWWWNNWMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMWMMMMMWNk:,',;:;.                .lKWMMMMMMMMWX000kc.     ..           .      .ck000XWMMMMMWKl.                .;:;,',:kNMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMWMKc.                          .dXWWMMMMMMMMMMMWKkdooxO0kl;'...';lk0OxoodOXWMMMMMMMMMMXd'                          .cKWMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMd.                             'dXMMMMMMMMMMMMMMMMMMMMMWWNNXXNWMMMMMMMMMMMMMMMMMMWXd'                             .dWMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMWMMMMMWMMMMWx.                               'o0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0o'                               .kMMMMMMMMWMMMMMWMM\r\n" + 
			"MMMWMMMMMMMMMMMMMXc                                 .:xKWMMMMMMMMMMWWMMMMMMMMMMMWMMMMMMMMMMMMWKx:.                                 :XMMMMMMWMMMMMMMMMM\r\n" + 
			"MMMMMMMWMMMMMMMMMWK;                                   .:d0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMWN0d:.                                   ;0WMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMWMMMMMMMXo.                                    .,oONWMMMMMMWMMMMMMMMMMMMMMMWNOo;.                                    .oXMMMMWMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMWMMMMWKxc,...  .....',,,''..                  .'lkXWMMMMMMMMMMMMMMMMWXkc'                   ..'',,,'..... ....,cxKWMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMNXK0OOO0KXNNNNNNNX0Oxl;..                .:dKWMMMMMMMMMMNKx:.                .':lxO0XNNNNNNNXK0OO00KXNWMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0d:'.               .;oONWMWWXOo;.               .':d0XWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWN0d:.               .'cooc'.               .:dOXWMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOo;.                              .;oOXWMMMMMMWMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWXkl,.                      .,lkXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMWKd.                    .oXWMMMWMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKxl,.                      .,lkKWMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN0d;.                              .:dONWMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKxc'.              .;oxxo;.              .'cx0NMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkl,.               .cxKWMMMMWKxc'               .,lkKWMMMMWMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOo;.               .,lkXWMMMMMWMMMMWXkl'.               .:dOXWMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXOd:'                .;oONWMMMMMMMMMMMMMMMMMNOo,.               .':dOKNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMWMMMNXKXXNNNNNXX0Oxoc,.                 .;d0NMMWMMMMMMMMMMMMMMMMMMMMMN0d;.                 .,coxOKXXNNNNNXKKXNWMMMMMMMMMMMMMWMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMWKdc,....'''''...                    .;d0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0d;.                    ...'''''....,:dKWMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMXo.                                .;d0NMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0d;.                                .oXMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMWMMMMMMMMMWx.                              .,o0NMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMWMMMMMMN0o,.                              .xMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMWO'                           .,oONWMMMMMWMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMWN0o,                            'OWMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMW0:.                       .cONWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMWMMMMNOc.                       .:0WMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMNd.                   .:xXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMWXx:.                   .dNMMMMMWMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMNo.                'o0WMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMMMMMW0o'                .dNMMMMWMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMXc              .oXMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMWWXo.              cXMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMK:            ;OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMWO,            :KMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMWXo'.       .oXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXo.       .'oXMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMWKd;.   .:0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO:.   .;dKWMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("          _____                    _____                    _____                    _____                           _______                   _____                    _____                    _____          \r\n" + 
			"         /\\    \\                  /\\    \\                  /\\    \\                  /\\    \\                         /::\\    \\                 /\\    \\                  /\\    \\                  /\\    \\         \r\n" + 
			"        /::\\    \\                /::\\    \\                /::\\____\\                /::\\    \\                       /::::\\    \\               /::\\____\\                /::\\    \\                /::\\    \\        \r\n" + 
			"       /::::\\    \\              /::::\\    \\              /::::|   |               /::::\\    \\                     /::::::\\    \\             /:::/    /               /::::\\    \\              /::::\\    \\       \r\n" + 
			"      /::::::\\    \\            /::::::\\    \\            /:::::|   |              /::::::\\    \\                   /::::::::\\    \\           /:::/    /               /::::::\\    \\            /::::::\\    \\      \r\n" + 
			"     /:::/\\:::\\    \\          /:::/\\:::\\    \\          /::::::|   |             /:::/\\:::\\    \\                 /:::/~~\\:::\\    \\         /:::/    /               /:::/\\:::\\    \\          /:::/\\:::\\    \\     \r\n" + 
			"    /:::/  \\:::\\    \\        /:::/__\\:::\\    \\        /:::/|::|   |            /:::/__\\:::\\    \\               /:::/    \\:::\\    \\       /:::/____/               /:::/__\\:::\\    \\        /:::/__\\:::\\    \\    \r\n" + 
			"   /:::/    \\:::\\    \\      /::::\\   \\:::\\    \\      /:::/ |::|   |           /::::\\   \\:::\\    \\             /:::/    / \\:::\\    \\      |::|    |               /::::\\   \\:::\\    \\      /::::\\   \\:::\\    \\   \r\n" + 
			"  /:::/    / \\:::\\    \\    /::::::\\   \\:::\\    \\    /:::/  |::|___|______    /::::::\\   \\:::\\    \\           /:::/____/   \\:::\\____\\     |::|    |     _____    /::::::\\   \\:::\\    \\    /::::::\\   \\:::\\    \\  \r\n" + 
			" /:::/    /   \\:::\\ ___\\  /:::/\\:::\\   \\:::\\    \\  /:::/   |::::::::\\    \\  /:::/\\:::\\   \\:::\\    \\         |:::|    |     |:::|    |    |::|    |    /\\    \\  /:::/\\:::\\   \\:::\\    \\  /:::/\\:::\\   \\:::\\____\\ \r\n" + 
			"/:::/____/  ___\\:::|    |/:::/  \\:::\\   \\:::\\____\\/:::/    |:::::::::\\____\\/:::/__\\:::\\   \\:::\\____\\        |:::|____|     |:::|    |    |::|    |   /::\\____\\/:::/__\\:::\\   \\:::\\____\\/:::/  \\:::\\   \\:::|    |\r\n" + 
			"\\:::\\    \\ /\\  /:::|____|\\::/    \\:::\\  /:::/    /\\::/    / ~~~~~/:::/    /\\:::\\   \\:::\\   \\::/    /         \\:::\\    \\   /:::/    /     |::|    |  /:::/    /\\:::\\   \\:::\\   \\::/    /\\::/   |::::\\  /:::|____|\r\n" + 
			" \\:::\\    /::\\ \\::/    /  \\/____/ \\:::\\/:::/    /  \\/____/      /:::/    /  \\:::\\   \\:::\\   \\/____/           \\:::\\    \\ /:::/    /      |::|    | /:::/    /  \\:::\\   \\:::\\   \\/____/  \\/____|:::::\\/:::/    / \r\n" + 
			"  \\:::\\   \\:::\\ \\/____/            \\::::::/    /               /:::/    /    \\:::\\   \\:::\\    \\                \\:::\\    /:::/    /       |::|____|/:::/    /    \\:::\\   \\:::\\    \\            |:::::::::/    /  \r\n" + 
			"   \\:::\\   \\:::\\____\\               \\::::/    /               /:::/    /      \\:::\\   \\:::\\____\\                \\:::\\__/:::/    /        |:::::::::::/    /      \\:::\\   \\:::\\____\\           |::|\\::::/    /   \r\n" + 
			"    \\:::\\  /:::/    /               /:::/    /               /:::/    /        \\:::\\   \\::/    /                 \\::::::::/    /         \\::::::::::/____/        \\:::\\   \\::/    /           |::| \\::/____/    \r\n" + 
			"     \\:::\\/:::/    /               /:::/    /               /:::/    /          \\:::\\   \\/____/                   \\::::::/    /           ~~~~~~~~~~               \\:::\\   \\/____/            |::|  ~|          \r\n" + 
			"      \\::::::/    /               /:::/    /               /:::/    /            \\:::\\    \\                        \\::::/    /                                      \\:::\\    \\                |::|   |          \r\n" + 
			"       \\::::/    /               /:::/    /               /:::/    /              \\:::\\____\\                        \\::/____/                                        \\:::\\____\\               \\::|   |          \r\n" + 
			"        \\::/____/                \\::/    /                \\::/    /                \\::/    /                         ~~                                               \\::/    /                \\:|   |          \r\n" + 
			"                                  \\/____/                  \\/____/                  \\/____/                                                                            \\/____/                  \\|___|          \r\n" + 
			"                                                                                                                                                                                                                ");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
	
}
	public static void template6 (Scanner input) {
		//Assci art
		System.out.println();

		//Tell Story
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("While Io walks through the Swamp. He starts to become paranoid hearing all the cracking and snapping"
				+ "\n of what lies of of sight. After walking for what felt like weeks, Io finds a farm at the edge of swamp but also finds a house.");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//promt question
		System.out.println("Should Io go to the Farm or to the House?");

		//get user input
		String answer = input.nextLine();

		//Check Answer
		switch (answer) {
		case "House":
			template8(input);	
			break;
		case "Farm":
			template9(input);
			break;
		
		}

}
	public static void template7 (Scanner input) {
		//Assci art
		System.out.println();

		//Tell Story
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Io walks to the cliff to learn that its towering, maybe matched to a 7 floor building."
			+ "\n He has no choice but to scale the hill. If Io misteps he could be a goner. While climbing"
			+ "Io finds himself having a choice of either going left or right. The left he would have to take a leap of faith"
			+ "\n and grab on to ledge but the right seems safer and he just has to move to the right and climb"
			+ "up but their seems to be a tree branch in the way.");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//promt question
		System.out.println("Should Io go Left or Right?");

		//get user input
		String answer = input.nextLine();

		//Check Answer
		switch (answer) {
		case "Left":
			template11(input);	
			break;
		case "Right":
			template12(input);
			break;
		
		}

}
	public static void template8 (Scanner input) {
		//Assci art
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWWWWWWWWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNKkoox0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOoccc:;;lOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWN0xlc::cc:;;,;cdKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMWWWWMWMWWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWWXOoc:cccccc:;,,,,,:oOXWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNOcccccccccc:dKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKxl:cc:::::cc:;,;,;,,,,cx0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWK:............oNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOoc::::::c::ccc:;,,,,,,;,,,;oONWWWWMMMMMMMMMMMMMMMMMMMMMMMWNNO;............cKNNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWNKxlc::::::::::::cc:;,,;;,,,,,,,,;cxKNWWMMMMMMMMMMMMMMMMMMMMMWXXXOocclclccccclcdKXXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWXOdc:::::::::::::::cc:;,,;;;,,,,,,,,,,:oOXWWMWWWWMMMMMMMMMMMMMMMWWWWWWWWWWWWWWWWWWWWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWWNKkl::::::::::::::::::cc:;,,;;;,,,,,,,,,,,,;cxKNWWWMMMMMMMMMMMMMMMWWWWWWWWWWWWWWWWWWWWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWXOdc::::::::::::::::::::cc:;,;;;;,,,,,,,,,,,,,,,:oONWMMMMMMMMMMMMMMMWWWWWWWWWWWWWWWWWWWWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKxlc::::::::::::::::::::::cc:;,;;;;,,,,,,,,,,,,,,,,,;cxKWMMMMMMMMMMMMMWWWWWWWWWWWWWWWWWWWWWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWN0o::::::::::::::::::::::::::cc:;;;;;;,;;;,,,,,,,,,,,,,,,,:o0NWWMWWMMMMMWWNNNNNNNNNNNNNNNNNNNNNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWKxl::::::::::::::::::::::::::::c::;;;;;;;;;;,,,,,,,,,,,,,,,,,,;lxKWWWMMMMMWWNNNNNNNNNNNNNNNNNNNNNNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWXOdc;;::::::::::::::::::::::::::::c:;;;;;;;;;;;;;;,,,,,,,,,,,,,,,,,,:oONMMMMMWNNNNX0O00000000000KNNNNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMWKxl:::::::::::::::::::::::::::::::::,'.',;;;;;;;;,;;;;,,,,,;;,,,,,,,,,,,,lkXWWMMWWWWKc,;,,,,,,,,,,oNWMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWN0d:;;:::::::::::::::::::::::::;::::;'......',,;;;;;;;;;;;;;;,,,,,,,,,,,,,,,,,:o0NWWWWMK:',''''''''''lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKkl:;:::::;;;;::::::;;::::::;;;;::::,............',;;;;;;;;;;;;,,,,,,,,,,,,,,,,,,,;lkKWMMK:',''''''',''lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWWN0dc;;;;;:;;;;;;;;;;::::::::;;;;;;::;'................',;;;;;;;;;;;;,,,,,,,,,,,,,,,,,,,,:d0NK:',',,,,,,,,'lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWXxl:;;;;;;;;;;;;;;;;;;:;;;::;;;;;::;,'.....................',;;;;;;;;;;,,;,,,,,,,,,,,,,,,,,,;lo;',,,',,,,,,'oNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN0dc;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:::;'..........................',;;;;;;;;;;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,'oNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMMWWKkl:;;;;;;;;;;;;;;;;;;;;;;;;;;;;;::;,'............;oxxdc'............',;;;;;;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,'oNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWWN0dc;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:::;,............,cdO00000ko;............',;;;;;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,'oNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWKkl;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,'............;oO000K000000Oxc'............',;;,;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,'oNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWN0dc;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,............'cx00KKKKKKKKKK00K0kl,............',;;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,'oNWWWMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWXkl:;,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,'............;ok0KKKKKXXXXXXXXKKKKKKOd:'...........',;;;;,;;;,,,,,,,,,,,,,,,,,,,,,,,,,:kXWWMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMN0dc;,,,;;,,;;;;;;;;;;;;;;;;;;;;;;;;;'............'cxO0KKKXXXXNNNNNNNXXXXXKK0K0kl,............',;;;,,;;,,,,,,,,,,,,,,,,,,,,,,,,,cd0NWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkl;,;;,,;;;,,;;;;;;;;;;;,,;;,;,,;;;,'............;ok0KKKXXXXNNNNWWWWWWNNNNXXXXKKKKOd:'...........',,;;;;,,,,,,,,,,,,,,,,,,,,,,,,,',;lkXWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMWWWWWN0d:,,;,,;;,,,,,,,,,,,,,,,,,;;,,,;;;;,............,cx0KKKKXXXNNNNNWWWWWWWWWWWNNNNXXXKKK00kl;............,,;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,',cxKNWWWWWMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMWWWNXOl;,,,,,;;;,,,,,,,,,,,,,,,,,,,,;;;;,'............:ok00KKKKXXNNNNNWWWWWWWWWWWWWWWNNNXXXXKKKK0Oxc'...........',,;;,,,,,,,,,,,,,,,,,,,,,,,,,',,,;lOXWMWWMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMWWN0dc,,,,,;,,,,,;,,,,,,,,,,,,,,,,,,;;;,............,cx0KKKKXXXNNNNNWWWWWWWWWWWWWWWWWWWWNNNNNXXXKK0K0kl,............',;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cxKNWMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMWWXkl;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;,'............:ok00KKKXXXNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNXXXKKKK0Od:'...........',;;,,,,,,,,,,,,,,,,,,,,,,,,,,',,';oOXWMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMWNkc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,............,cx0KK0KKXXXNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNXXXXKKK00kl,............,,;;,,,,,,,,,,,,,,,,,,,,,,,,,,,'',ckNMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMWO;',,,,,,,,,,,,,,,,,,,,,,,,,,,,;;,'............;oO0KKKKKXXXNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNNNXXXKKK00Od:'...........',;;;,,,,,,,,,,,,,,,,,,,,,,,,,,,':0MMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMWMMWKl,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;,............,cx0K0KKKXXXNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNNXXXKKKK00xl,............',;;,,,,,,,,,,,,,,,,,,,,,,,,,',oXWWMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMNx;,,,,,,,,,,,,,,,,,,,,,,,,,;;,''...........:ok0KKKKXXXXXNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNNXXXKK000kd:'...........',;;,,,,,,,,,,,,,,,,,,,,,,,,';kWWMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMKc',,,,,,,,,,,,,,,,,,,,,,,,,'............,cdOK0KKKKKXNNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNNNXXXKKKK00kl,...........',,;,,,,,,,,,,,,,,,,,,,,,,,'lXWMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMWWNx,',,,,,,,,,,,,,,'',,,,,,,'............;oO000KKKKKXXXXNNNNNNNNNNNNNNNNNNNNNNNNNNNWWWNNNNNNNNNNNNNNNWNWNNNNNNNNNXXXKXXKKK00Od:'...........',,,,,,,,,,,,,,,,,,,,,,,',kWMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMW0:'',,',,,,,,,,,,,'',,,,''...........,cxO0KKKKXXX0xxkkkkkkkkkkkkkkl;,,,,,,,,,,,,;xKKx;,,,,,,,,,,,,;lxkkkkkkkkkkkkkxx0XXKKK00K0xl,...........',,,,,,,,,,,,,,,,,,,,,,'cKWMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMNd',,',',,,,,,,''''',,,'............:dO0KKKKXXXXNX0xxkOOOOOOOOOOOkx,              l00l              ,xkkOOOOOOOOOOkxx0NXXXXKKKKK0Oo;'...........',,,,,,,,,,,,,,,,,,,,;xNMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMW0;.,,'',,''''',''',,,'...........,lxO0KKKKKXXNNNWN0xkkOOOOOOOOOOkkx,              l00l              ,xkkOOOOOOOOOOkkk0NNNNXXXXKKK000xc,...........',,,,,,,,,,,,,,,,,,'cKWMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMNo'''''''''',''',,,'...........';oO000KKXXXXNNNNNWN0xxxkkkkkkkkkkxxx,              l00l              ,xkxkkkkkkkkkkxxkKWWWNNNNXXXKKK000kd:'...........',,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMWO;',''''''''''',,'...........,cx000KKKXXXXNNNNWWWWW0kxxxxkkkkkkkxxxx;              l00l              ,dkxxkkkkkkkxxxxxKWWWWNNNNNXXXXKK0000xl,...........',,,;,,,,,,,,,,';OMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMXc''''''''''',,'...........';ok00KKKKKXXNNNNNWWWWWWWKxxxdxxxxxxxxxdxd,             .lKKl.             ,xxdxxxxxxxxxddxxKWWWWWWWNNNNXXXXKK00K0Oo:'..........',,,,,,,,,,,,,'lXWMMMWMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMWx,''''''''''''...........,cxO0KKKKXXXXXNNNNWWWWWWWWWKxxddooodooooooxd,             .l00l.             ,dxoooooooooooddx0WWWWWWWNNNNNNXXXXKKKK000xc'...........',;,,,,,,,,,;kWWMMMWMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMWKc''''''',,'............:ok000KKKKXXNNNNNNWWWWWWWWWWW0xxxdodddddddddxdolllllllllllllok00kollllllllllllllxxddoodddddddddx0WWWWWWWWWWWWNNNNNXXXXK0000Oo:'..........'',,,,,,,,'lKWMMMWMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMWMMWx,''''''''...........,cxO00KKKKXXXXNNNNNWWWWWWWWWWWWW0xxkkkkkkkOOkkkkdooolllllllllllok00kolllllllllllolldxkOkOOOkkkOOkxx0WWWWWWWWWWWWWWNNNNNXXXKKK000Oxc,...........',,,,,,,,xWWWWMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMWWW0:''',,''..........':ok0000KKKXXXXNNNNNWWWWWWWWWWWWWWW0ddxkOOOOOOOOOkxo,             .l00l.             ,oxkOOOOOOOOkkkxd0WWWWWWWWWWWWWWWWNNNNXXXXXK0KK00ko:'..........'',;,,'c0WWWWMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMWWNo''','...........,cx0000KKKXXXNNNNNNWWWWWWWWWWWWWWWWWW0ddxkkkkkkkkkkxxo,             .l00l.             ,dxxkkkkkkkkkkkxd0WWWWWWWWWWWWWWWWWWNNNNNNXXXKK0000Oxc'...........',,,,dNMWWMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMWWWO:''...........':ok0000KKXKXNNNNNNWWWWWWWWWWWWWWWWWWWWW0ddxxkkkkkkkxxxdo,              l00l              ,oddxkkkkkkkxxxdd0WWWWWWWWWWWWWWWWWWWWWWNNNNXXXKKKK000ko;...........',,:OWMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMWWNo'...........:dkO000KKKKXXXXNNNNWWWWWWWWWWWWWWWWWWWWWWW0ddddxxxxxxxxdddo'             .l00l.             'odddxxxxxxxxxddd0WWWWWWWWWWWWWWWWWWWWWWWNNNNXXXXXKK0000Odl;...........'oXMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMNx'........'ckXWK00KKKXXXXNNNNNNWWWWWWWWWWWWWWWWWWWWWWWN0dddoododdddooodo'             .l00l.             'odooooddddddoood0NWWWWWWWWWWWWWWWWWWWWWWWNNNNNNXXXKKKK000XXkc'.........lXMWMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMWWWXl......;d0NMMWXKKKXXXXNNNNNNNNWWWWWWWWWWWWWWWWWWWWWWWN0dodooooooooooddo'             .lKKl.             'odoooooooooooood0NWWWWWWWWWWWWWWWWWWWWWWWWWWNNNNNXXXXKKKKNWWNOo,......;0WWWMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMWMWWK:..,ckXWMMMMWXKXXXXNNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWN0dodddddddddddddo,..............lOOl..............,oddoddddddddddod0NWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNNXXXXKKNMMWWWXxc'..,kWWWMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMWOldKNWWMMMWMMNXXXNNNNNNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWNKKKKKKKKKKKKKKKOxddddddddddddddxxxxddddddddddddddxOKKKKKKKKKKKKKKKNWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNNNNNNNXXXXNMMMMWWWNOl;xNMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMWMWWWWWMWWWMMMMMMNXNNNNNNNNWWNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXOdddddddddddddddddddddddddddddddddokXWWWWWWWWWWWNWWWNWWWWWWWWWWWWWWWWWWWWWWWWWWNNWNNNNNNNNXXWMMMWWMMWWWNWMWWMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNNNNNNNNNNNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNNWWWWWWWWWXklcccccccccccccccccccccccccccccccccxXWWWWWNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNNNNNNNNNNXNWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNNNNNNNNNNNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNXOkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkOKNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNNNNNNNNNNNNWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNNNNNNNNNNNNNNNNNNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNWWNXXNNNNNNNNNXXXXNNXXXXNNNNNNNXXXNNNNNNNNWWWWNNWWWWNNWWWWWWWWWWWWWWWWWWWWWWWWWNNNNNNNNNNNNNNWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNNNNNNNNNWNNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWNNWNNWNNNWWNNWNNWWWWWWWWWNNNNNNNNNNNNNNNNWNNWWNNWNNNNWWWNNNWWNNNNWNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNNNNNNWNWWNNNNNWWWNNNNNNNWWWWWWWWWWWWWWWWNNWNNWNNNWWNNWNNWNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNNNNNWNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNWWWWNNNNNWNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNNNNNNNNXkooooooooooooooooooooooooooooooooooooooxKNNNWWNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNNNNNNNOo:,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,lOXNNWNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNNNNNXx:;::;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:dKNWWNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNNNNNXl............................................:0NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNNNNNNNNNXOc::;,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;::cxXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNNNNNNNNNNXKKKOdoddddxxxxxxxxxxxxxxxxxxxxxxxxddddddk0KKXNNNWNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNNNNNNNNNNNNNNXkxkkkkOOOOOOOOOOOOOOOOOOOOOOOOkkkkkx0NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNNNNNNNNNNNNNNXOxkkkkkOOOOOOOOOOOOOOOOOOOOOOkkkkkkx0NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNNNXNNNNNNNNNNXkxkkkkkkOOOOOOOOOOOOOOOOOOOOkkkkkkkx0NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNXXXNNNNNNNNNNXkxkkkkkkkkkkkkkkkkkkkkkkkkkkkkxkkkkx0NNNNNNNNNK000000000kxxxxxxxxkK0xxxxxxxkO000000000XNNNK000000000kxxxxxxxkK0xxxxxxxxk000000000KXXXNMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNXXNNNNNNNNNNNXkxkkkkxkkkkkkkkkkkkkkkkkkkkkkxxkkkkxONNNNNNNWKxdxkkkxxdl.        'dc       .;dxxkkxxxd0NNXkdxxxxxxxl'       .dl        ,dxkkxxkxdkXXXNMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNXXNNNNNNNNNNNXkxkkkxxxkkxkkkkkkkkkkkkkkxxkxxxkkkkxONNNNNNNNKkxkOOOOOkl.        'xc       .:xkkOOOOkx0NWXkdkOkOOkko'       .dl        ,xkOOOOOkxOXXXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNXXXNNNNNNNNNNXkxkkkxxxxxxxxxxxxxxxxxxxxxxxxxxkkkkxONNNNNNNNKkddxkkxxxl.        'xc       .:dxxxxxxdd0NNXkdxxxxxdxo'       .xl        ,dxxxkkkxdOXXXNMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNXXXXNNNNNNNNNXkdxkxxxxxxxxxxxxxxxxxxxxxxxxxdxxkkxxONNNNNNNNKxooooooodl,........;xl.......'cooooooood0NNXkoooodoooo;.......,xo........:ddooodoookXXXNMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNXXXXXNNNNNNNNXkxkkxxddxxxxxxxxxxxxxxxxxxxxdddxkkxdONNNNNNNNKxdxxxxxxxoooooooooodOxooooooooodxxxxxxddONNXkdxxxxxxdooooooooodkkooodoooooddxxxxxxdkXXXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNXXXXXNNNNNNNNXkdkkxxdddddddddddddddddddddddddxkxxxONNNNNNNNKxdkOOOkkxl'........;xl........:dkkOOOOxdONNXxdOOOOOkxo,.......'xl........,dkOOOOOkdkXXXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNXXXXXNNNNNNNNXkdxxxxdooooooooooooooooooooooodxxdxxOXNNNNNNNKxdxxkkxxdc.        'xc        ;oxxkkkxddONNXxoxkkxxxdl.       .dl        'odxxkkxxokXXXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNXXXXXNNNNNNNNXkdxxxxxxxxxxxxxxxxxxxxxxxxxxxxxd:':dOXNNNNNNNKxodddddddc.        'xc        ;oddddddooONNXxldddddool.       .xl        'odddddddokXXXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNXXXXXXNNNNNNNXxdxxxxOOOOOOOOOOOOOOOOOOOOOOOOkxl:ldOXNNNNNXNKdllllllolc.        'dc.      .;lllolllloONNXxllllollol'       .dl.       'lllllllllkXXXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNXXXXXXXNNNNNNXxdxxxxOOOOOOOOOOOOOOOOOOOOOOOOkxxxxdONNNNNNNNX0O00OOOOOxolllllllllddlllllllldkOOOOO0OOKNNN0OOOOOOOOkollllllllddllllllllokOOOOOOOO0XXXNMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNXXXXXXXXNNNNNKxdxxdxkkOOOOOOOOOOOOOOOOOOOOkkkxxxddONNNNNNNNXNNNNNNNNXOoooooloooolooooloollx0XNNNNNNXNNNNNNNNNNNNXOdlooooooooooooooooodOXNNNNXXXXXXXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNXXXXXXXXNNNXNKxdxddxkkkkOOkkkkkkkkkkkkkkkkkkxxddddOXNNNNNNXNNNNNNNNNN0OkkkkkkkkkkkkkkkkkkOOKXNNNNNNNNNNNNNNNNNNNXKOkkkkkkkkkkkkkkkkkkOKXXNXXXXXXXXXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWNXXXXXXXXNNXXNKxodddxkkkkkkkkkkkkkkkkkkkkkkkkxxddddkXNNNNXNNNNNNNNNNNXXXXKKKXXXXXXXXXXXXXXXXXXNNNNNNNNNNNNNNNNXXNNXXXXXXXXXXXXXXXXXXXXXXXNNXXXXXXXXXWMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWXKXXXXXXXXXXXNKxodddxxxkkkkkkkkkkkkkkkkkkkkkxxxdddokXNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXNNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKNMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWK0000000000000Ododdddxxxxxxxxxxxxxxxxxkkxxxxxxddddox000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000XMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWKOOOOOOOOOOOOOkdoddddxxxxxxxxxxxxxxxxxxxxxxxdxddddoxOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO000000OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXWMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWKOOOOOOOOOOOOOkooddddddxxxddxxxxxxxxxxxxxxxdddddddodkOOOOOOOOOOOOOOOOOkOkkkkOOO000KKKKKKK0OOO000000OOOOOOOOOOOOkOOOOOOOOOO000OOOOOOOOOOOOOOOOOkkOOOOXWMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMW0kkkkkkkkkkkkOkooddddddddddddddddddddddddddddddddoodkkkkkkkkkkkkkkkkkkkkkkkkOOO000000000000000000000OOO00KKK00OOO000000000KKKK000OOO00000OOkkkkkkOkOXWMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMW0kkkkkkkkkkkkkxoodoooooooooooooooooooooooooooodoooodkkkkkkkkkkkkkkkkkkkkkkkkkkOOOOOOOOOOOOOOOOOOOOOkkkOOOO00OOOOOOOOOOOOOOOO00OOO00O0000OOkkkkkkkkkkKWMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMW0kkkkkkkkkkkkkxooooooolooollooooooooooooollloodoooodkkkkkkkkkkkkkkkkkkkkxxxxxxkkkkkkkkkkkkkkkkkkkkkkxxkkkkkkkkkkkkkkkkkkkkkkkkkkOOkkkkkkkkkkkkkkkkkkKWMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMWWWWWNOxxxxxxxxxxxxxdoloooooooooooooooooooooooooooooooooodxkxxxxxxxxxxxxxxxxxxxddddddddddddddddddddddddddddddddddddxdddddddxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxk0NWWWWWWWMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMWWWWWNNNNX0OOOOOOOOOOOOOkoooooooooooooooooooooooooooooooooooodkOOOOOOOOOOOOOOOOOOxoloooooooooooooooooooooooooooooolllooooooooooooooooooooooooooooooooooodkOOOOKXNNNWWWWWMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMWWWWWWNNNNNNNNXXXXXXXX0kxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxk0XXNNNNXXXXNNNXXNXOlcccccllllcccccccllllllllcccccccccccccccccllllllllllllllllllllllllcllclkXNNNNNNNWWWWWMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMWMMWWMWWWWWWNkddddddddddddddddddddddddddddddddddddddodd0NWWWWWWWWWWWWWWWXxc:::::::::::::::::::::::::::::::::::::;::::::::::::::::::::::::::::::o0WWWWMWMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNxcccccccccccccccccccccccccccccccccccccc::lOWWMMMMMMMMMMMMMMWN0kxollcccccccccccccccccccccccloxkkkkkkkkkxdlcccccccccccccccccccccclokKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNX0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOKNWWMMMMMMMMMMMMMMMWWWNXXKKKKKKKKKKKKKKKKKKKKKKKXNNWWWWWWWWWWNXXKKKKKKKKKKKKKKKKKKKKXXNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMWWWWWMMWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWMWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\r\\n\" + \r\n" + 
				"			\"\"");

		//Tell Story
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Io walk up onto the porch when he sees the doors open."
				+ "\n The house is rundown and doesn't seem to have anyone home for years."
				+ "\n He still asks if anyones home. Then some rustling upstairs occurs."
				+ "\n He calls for Fawn thinking its him rusting around upstairs. Then he hears walking but its"
				+ "\n to loud to be Fawn's footsteps, Io asks again whos there. They don't answer."
				+ "\n The creaking is getting louder, when Io sees a man appear. The man is "
				+ "\n old and skinny with a long beard. Io asks for his name. The man doesn't"
				+ "\n respond, Io decides he should leave when the man starts to walk closer"
				+ "\n to him, to the point of the man starts to breath on Io. Io says hes gonna"
				+ "\n leave, but then the man screams and pulls a knife out of his back pocket!"
				+ "\n Io falls over well trying to flee and the man stabs him in the chest...");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//promt death and gameover
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNX0kol:;,....               ....,;cldk0XWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOo:,..                                   ..,cdOXWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN0d:.                                               .:d0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKd;.                                                     .;dXWMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0l.                                                           .oKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWKo.                                                               .oXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk,                                                                   ,OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNo.                                                                     .dNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNo.                                                                       .oNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMNo.                                                                         .dWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk.                                                                           'OMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX:                                                                             cNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO.                                                                             '0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMMMWd.                                                                             .xWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNl                                                                               oWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMNc                                                                               lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMX:                                                                               cNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMMMMX:                                                                               lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMNl                                                                               oWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMWo                                                                              .dWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMMMMWd.               ..;codkOOOkxo:.                 .:oxOOOkkdoc,.                .xWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMWMMMMMWMMMMMMMMMMMWMMM0'             'oOXWWMMMMMMMMMW0:              .cKWMMMMWMMMMWNXOo'             ,0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMWk'          .lXMWMMMMMMMMMMMWMMK;             :XMMMMMMMMMMMMMMMWXc.          'kWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMWMMMMMMMMMMMMMMMMMWMMMMMWMMW0c.        cXMMMMMMMMMMMMMMMMMNc             lNMMWMMMMMMMMMMMWMMX:        .lKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMWMMMMMWMMMMMMMMMMMMMMMMMMNx.      .xWMMMMWMMMMMMMMMMMMK,             ;XMWMMMMMMMMMMMMMMMWd.      .kWWWMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMWMMMMNl      .dWMMMMMMMMWMMMMMMMXc              .lNMMMMMMMMMMMMMMMMWo       oWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWd.      ;0WMMMMMMMMMMMWMW0:     ,dkOOd'    .c0WMMMMMMMMMMMMMM0,      .xMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMXc        ;ONMMMMMMMMMWNOl.     ;KMMMMW0;     .l0NWMMMMMMMMMNk,        lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMWx.         .,cdk000Okdc,.      ;0MMMMWMW0,      .,ldO000Okdc,.         .kWMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNc               ....          ,0MMMWMMMMWO'          ...                lWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN:                            ,0WMMMMMMMWMWO'                            cNMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMWMMMNc                           .kWMMMMMMWMMMMWx.                           lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNl                           :XMMMMMWMMMMMMMK;                           oWMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO'                          :XMMWMMMMMMMMMMX;                          ,0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMMWKxlc::::;,..               .xNMMMMMMMMMMMNd.               .',;::::cokXWMMMMMMMMMMMWMMMMMMMMMMMWMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMWWMWWWX0o.              .:kXNWWMMWNKx;.              'dKNWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMWMMMMMMMMMNl                 .,;:c::,.                 oWMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMMMMMMMMMMWMMMMMMMMMMMWo                                          .dWMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMWKOOOKNWWMMMMMMMMMMMMMNl                                           oWMMMMMMMMMMMWNKOOOKWMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO:.   .':xXWMMMMMMMMMMMX:                                           cNMMWMMMMMWXx:'.   .:OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMWO'         'dNMMMMMMMMMMX:                                           cNMMMMMMMNd'         'OMMMMMMMMMMMMMMMMMMMMWMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMWMMMMMMMMMMMMK;           .cKWMMMMMMMMWo                                          .dWMMMMMWKc.           :KMMMMMMMMMMMMMMMMMWMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMWMMMMMWWNNWWWN0:              ,kWMMMMMMMMXd;....                               ....;xNMMMWMWk,              :0WWWWNNWMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMWMMMMMWNk:,',;:;.                .lKWMMMMMMMMWX000kc.     ..           .      .ck000XWMMMMMWKl.                .;:;,',:kNMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMWMKc.                          .dXWWMMMMMMMMMMMWKkdooxO0kl;'...';lk0OxoodOXWMMMMMMMMMMXd'                          .cKWMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMd.                             'dXMMMMMMMMMMMMMMMMMMMMMWWNNXXNWMMMMMMMMMMMMMMMMMMWXd'                             .dWMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMWMMMMMWMMMMWx.                               'o0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0o'                               .kMMMMMMMMWMMMMMWMM\r\n" + 
						"MMMWMMMMMMMMMMMMMXc                                 .:xKWMMMMMMMMMMWWMMMMMMMMMMMWMMMMMMMMMMMMWKx:.                                 :XMMMMMMWMMMMMMMMMM\r\n" + 
						"MMMMMMMWMMMMMMMMMWK;                                   .:d0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMWN0d:.                                   ;0WMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMWMMMMMMMXo.                                    .,oONWMMMMMMWMMMMMMMMMMMMMMMWNOo;.                                    .oXMMMMWMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMWMMMMWKxc,...  .....',,,''..                  .'lkXWMMMMMMMMMMMMMMMMWXkc'                   ..'',,,'..... ....,cxKWMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMNXK0OOO0KXNNNNNNNX0Oxl;..                .:dKWMMMMMMMMMMNKx:.                .':lxO0XNNNNNNNXK0OO00KXNWMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0d:'.               .;oONWMWWXOo;.               .':d0XWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWN0d:.               .'cooc'.               .:dOXWMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOo;.                              .;oOXWMMMMMMWMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWXkl,.                      .,lkXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMWKd.                    .oXWMMMWMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKxl,.                      .,lkKWMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN0d;.                              .:dONWMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKxc'.              .;oxxo;.              .'cx0NMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkl,.               .cxKWMMMMWKxc'               .,lkKWMMMMWMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOo;.               .,lkXWMMMMMWMMMMWXkl'.               .:dOXWMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXOd:'                .;oONWMMMMMMMMMMMMMMMMMNOo,.               .':dOKNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMWMMMNXKXXNNNNNXX0Oxoc,.                 .;d0NMMWMMMMMMMMMMMMMMMMMMMMMN0d;.                 .,coxOKXXNNNNNXKKXNWMMMMMMMMMMMMMWMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMWKdc,....'''''...                    .;d0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0d;.                    ...'''''....,:dKWMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMXo.                                .;d0NMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0d;.                                .oXMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMWMMMMMMMMMWx.                              .,o0NMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMWMMMMMMN0o,.                              .xMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMWO'                           .,oONWMMMMMWMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMWN0o,                            'OWMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMW0:.                       .cONWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMWMMMMNOc.                       .:0WMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMNd.                   .:xXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMWXx:.                   .dNMMMMMWMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMNo.                'o0WMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMMMMMW0o'                .dNMMMMWMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMXc              .oXMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMWWXo.              cXMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMK:            ;OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMWO,            :KMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMWXo'.       .oXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXo.       .'oXMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"MMMMMMMMMMMMMMMMMMMMMMMMWKd;.   .:0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO:.   .;dKWMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
						"");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("          _____                    _____                    _____                    _____                           _______                   _____                    _____                    _____          \r\n" + 
						"         /\\    \\                  /\\    \\                  /\\    \\                  /\\    \\                         /::\\    \\                 /\\    \\                  /\\    \\                  /\\    \\         \r\n" + 
						"        /::\\    \\                /::\\    \\                /::\\____\\                /::\\    \\                       /::::\\    \\               /::\\____\\                /::\\    \\                /::\\    \\        \r\n" + 
						"       /::::\\    \\              /::::\\    \\              /::::|   |               /::::\\    \\                     /::::::\\    \\             /:::/    /               /::::\\    \\              /::::\\    \\       \r\n" + 
						"      /::::::\\    \\            /::::::\\    \\            /:::::|   |              /::::::\\    \\                   /::::::::\\    \\           /:::/    /               /::::::\\    \\            /::::::\\    \\      \r\n" + 
						"     /:::/\\:::\\    \\          /:::/\\:::\\    \\          /::::::|   |             /:::/\\:::\\    \\                 /:::/~~\\:::\\    \\         /:::/    /               /:::/\\:::\\    \\          /:::/\\:::\\    \\     \r\n" + 
						"    /:::/  \\:::\\    \\        /:::/__\\:::\\    \\        /:::/|::|   |            /:::/__\\:::\\    \\               /:::/    \\:::\\    \\       /:::/____/               /:::/__\\:::\\    \\        /:::/__\\:::\\    \\    \r\n" + 
						"   /:::/    \\:::\\    \\      /::::\\   \\:::\\    \\      /:::/ |::|   |           /::::\\   \\:::\\    \\             /:::/    / \\:::\\    \\      |::|    |               /::::\\   \\:::\\    \\      /::::\\   \\:::\\    \\   \r\n" + 
						"  /:::/    / \\:::\\    \\    /::::::\\   \\:::\\    \\    /:::/  |::|___|______    /::::::\\   \\:::\\    \\           /:::/____/   \\:::\\____\\     |::|    |     _____    /::::::\\   \\:::\\    \\    /::::::\\   \\:::\\    \\  \r\n" + 
						" /:::/    /   \\:::\\ ___\\  /:::/\\:::\\   \\:::\\    \\  /:::/   |::::::::\\    \\  /:::/\\:::\\   \\:::\\    \\         |:::|    |     |:::|    |    |::|    |    /\\    \\  /:::/\\:::\\   \\:::\\    \\  /:::/\\:::\\   \\:::\\____\\ \r\n" + 
						"/:::/____/  ___\\:::|    |/:::/  \\:::\\   \\:::\\____\\/:::/    |:::::::::\\____\\/:::/__\\:::\\   \\:::\\____\\        |:::|____|     |:::|    |    |::|    |   /::\\____\\/:::/__\\:::\\   \\:::\\____\\/:::/  \\:::\\   \\:::|    |\r\n" + 
						"\\:::\\    \\ /\\  /:::|____|\\::/    \\:::\\  /:::/    /\\::/    / ~~~~~/:::/    /\\:::\\   \\:::\\   \\::/    /         \\:::\\    \\   /:::/    /     |::|    |  /:::/    /\\:::\\   \\:::\\   \\::/    /\\::/   |::::\\  /:::|____|\r\n" + 
						" \\:::\\    /::\\ \\::/    /  \\/____/ \\:::\\/:::/    /  \\/____/      /:::/    /  \\:::\\   \\:::\\   \\/____/           \\:::\\    \\ /:::/    /      |::|    | /:::/    /  \\:::\\   \\:::\\   \\/____/  \\/____|:::::\\/:::/    / \r\n" + 
						"  \\:::\\   \\:::\\ \\/____/            \\::::::/    /               /:::/    /    \\:::\\   \\:::\\    \\                \\:::\\    /:::/    /       |::|____|/:::/    /    \\:::\\   \\:::\\    \\            |:::::::::/    /  \r\n" + 
						"   \\:::\\   \\:::\\____\\               \\::::/    /               /:::/    /      \\:::\\   \\:::\\____\\                \\:::\\__/:::/    /        |:::::::::::/    /      \\:::\\   \\:::\\____\\           |::|\\::::/    /   \r\n" + 
						"    \\:::\\  /:::/    /               /:::/    /               /:::/    /        \\:::\\   \\::/    /                 \\::::::::/    /         \\::::::::::/____/        \\:::\\   \\::/    /           |::| \\::/____/    \r\n" + 
						"     \\:::\\/:::/    /               /:::/    /               /:::/    /          \\:::\\   \\/____/                   \\::::::/    /           ~~~~~~~~~~               \\:::\\   \\/____/            |::|  ~|          \r\n" + 
						"      \\::::::/    /               /:::/    /               /:::/    /            \\:::\\    \\                        \\::::/    /                                      \\:::\\    \\                |::|   |          \r\n" + 
						"       \\::::/    /               /:::/    /               /:::/    /              \\:::\\____\\                        \\::/____/                                        \\:::\\____\\               \\::|   |          \r\n" + 
						"        \\::/____/                \\::/    /                \\::/    /                \\::/    /                         ~~                                               \\::/    /                \\:|   |          \r\n" + 
						"                                  \\/____/                  \\/____/                  \\/____/                                                                            \\/____/                  \\|___|          \r\n" + 
						"                                                                                                                                                                                                                ");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
		

}
	public static void template9 (Scanner input) {
		//Assci art
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX00XNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkl,..';okXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKxc'.........'cd0NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN0d:'................;lkKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOd:.......................':d0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOo;..............................;lkKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkl,..............',,,,,''..............':d0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKxc'.............'',,,,,,,,,,,,'...............,lkKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN0d:'.............'',,,,,,,,,,,,,,,,,,''..............':dONWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN0d:..............',,,,,,,,,,,,,,,,,,,,,,,,,,'...............,lxKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOo;..............',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,''..............':dOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkl,..............',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,''..............,cxKNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKxc,..............',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,''...............:oOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWOc'.............',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,''..............,lKMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk'............',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,''.............:KMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk'..........',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,'...........lXMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMWk'........',,,,,,,,,,,,,,,,cxOOOOOkOOOOOOOOOOOOOOOOOOOOOOOOkkOkxc,,,,,,,,,,,,,,,,,,,.........dNMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMWk'........,,,,,,,,,,,,,,,,,,oXWKkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkKWNd,,,,,,,,,,,,,,,,,,,,'.......'kWMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMWk,........,,,,,,,,,,,,,,,,,,,oXNd..............................lNNd,,,,,,,,,,,,,,,,,,,,,........,OMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMWk'........,,,,,,,,,,,,,,,,,,,,oXNo..............................lNNd,,,,,,,,,,,,,,,,,,,,,,........:KMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMWk'........',,,,,,,,,,,,,,,,,,,,oXWo..............................lXNd,,,,,,,,,,,,,,,,,,,,,,'........lXMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMWk,........,,,,,,,,,,,,,,,,,,,,,,oXWo..............................lXNd,,,,,,,,,,,,,,,,,,,,,,,'........dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMWk,........',,,,,,,,,,,,,,,,,,,,,,oXWo..............................lXNd,,,,,,,,,,,,,,,,,,,,,,,,........'kWMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMWk,........,,,,,,,,,,,,,,,,,,,,,,,,oXWo........lo'........,,.........lXNd,,,,,,,,,,,,,,,,,,,,,,,,,........,OMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMWk,........',,,,,,,,,,,,,,,,,,,,,,,,oXWx;,.....,k0k:.....:dOl.........lNNd,,,,,,,,,,,,,,,,,,,,,,,,,'........:KMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMWk,........,,,,,,,,,,,,,,,,,,,,,,,,,,oXWd,oxdc,'l0KKOl:ldk0K0d:::cc,...lNNd,,,,,,,,,,,,,,,,,,,,,,,,,,'........lXMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMWk,........',,,,,,,,,,,,,,,,,,,,,,,,,,oXWd';d0K0kOKKKK00KKKKKK00KK0kc,''oNNd,,,,,,,,,,,,,,,,,,,,,,,,,,,'........dNMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMWk,........,,,,,,,,,,,,,,,,,,,,,,,,,,,,oXWX00KKXXXXXXXXXXXXXXXXXXXXXKKK00XWNd,,,,,,,,,,,,,,,,,,,,,,,,,,,,'.......'xWMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMWk,........',,,,,,,,,,,,,,,,,,,,,,,,,,,,lKNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXo,,,,,,,,,,,,,,,,,,,,,,,,,,,,,........,OMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMWk,........',,,,,,,,,,,,,,,,,,,,,,,,,,,,,;clllllllllllllllllllllllllllllllllll:,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,........:KMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMWO,........',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,'........lXMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMWOl,......',,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,'.......'xWMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMWN0xc;c:,,,,,,,,,,,,,,,,,,,;clllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll;,,,,,,,,,,,,,,,,,,,,'.':lxOXWMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMWNXo,,,,,,,,,,,,,,,,,,,c0NWWNXKKKKXXXXXXXXXXXXXXXXXXKXNNXXKKXXXXXXXXXXXXXXXXXKKXXNWWWKl,,,,,,,,,,,,,,,,,,,oOOXWMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0WMMWKxl:::::::::::::::::::::okOo:::::::::::::::::::::lxKWMMMXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0WKOXWN0d:,'''''''''''''''''':dxc'''''''''''''''''',:d0NWXkONXl,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx;:d0NWXkl;'''''''''''''''':dxc'''''''''''''''';lkXWNOd:,dNXo,,,,,,,,,,,,,,,,,,,dWMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,'',lkKWN0d:,''''''''''''':dxc''''''''''''',cd0NWKxc,'',dNXo,,,,,,,,,,,,,,,,,,,dWMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,''''':oONWXko;''''''''''':dxc''''''''''';oOXWNOo:''''',dNXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,''''''',cxKWNKxc,'''''''':dxc'''''''',cxKNWKxc,''''''',dNXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,'''''''''';oOXWXOo;'''''':dxc'''''';oOXWXOo;'''''''''',dNXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,'''''''''''',cxKNWKxc,''':dxc''',cxKNNKxc,'''''''''''',dNXl,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,''''''''''''''';oOXWNOo:':dkc';oONWXOo;''''''''''''''',dNXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,''''''''''''''''',:d0NWKxdkOxxKWN0d:,''''''''''''''''',dNXo,,,,,,,,,,,,,,,,,,,dWMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,'''''''''''''''''''';lkXWWWWWWXkl;'''''''''''''''''''',dNXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,''''''''''''''''''''',l0WMMMMW0o;''''''''''''''''''''',dNXl,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,'''''''''''''''''',:d0NWX0KKKXWN0d:,'''''''''''''''''',dNXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,'''''''''''''''';lkXWN0d:cdxl:d0NWXkl;'''''''''''''''',dNXl,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,''''''''''''',:d0NWXkl,'':dxc'',cxKWN0dc,''''''''''''''dNXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,''''''''''';lkXWNOo:,'''':dkc''''':oONWXOo;''''''''''',dNXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,'''''''',cd0NWKxc,''''''':dxc''''''',cxKNNKxc,'''''''',dNXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,'''''';oOXWNOo:'''''''''':dxc'''''''''';oOXWNOo;'''''',dNXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,''',cxKNNKxc,'''''''''''':dxc'''''''''''',cxKNWKxc,''',dNXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0Nx,';oOXWNOo;''''''''''''''':dxc''''''''''''''';lkXWNOo:',dNXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0NklxKNNKxc,''''''''''''''''':dxc''''''''''''''''',:d0NWKklxNXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,cKWNNWXOo;,''''''''''''''''''':dkc''''''''''''''''''',;lkXWNNWXl,,,,,,,,,,,,,,,,,,,dWMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNo,,,,,,,,,,,,,,,,,,,c0WMMWX0OOOOOOOOOOOOOOOOOOOOOO0KX0OOOOOOOOOOOOOOOOOOOOOOOXWMMWXo,,,,,,,,,,,,,,,,,,,dNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMNkllllllllllllllllllld0XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKxlllllllllllllllllllOWMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");

			//Tell Story
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Io enters the barn when sees all the animals still living in the barn he was expecting this be abandon."
			+ "\n he calls for Fawn but no one answers. He notices that all the animals are being fed fed well."
			+ "\n He walks back outside and finds the crops are in tacked, and most of the them are ready"
			+ "\n to be picked. Io walks around some more and doesn't find Fawn, well walking around he sees the path back to "
			+ "\n his camping spot. But he also sees the house again.");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			//promt question
			System.out.println("Should Io go back to the Camp or go to the House?");

			//get user input
			String answer = input.nextLine();

			//Check Answer
			switch (answer) {
			case "House":
				template8(input);	
				break;
			case "Camp":
				template10(input);
				break;
	}

}
	public static void template10 (Scanner input) {
		//Assci art
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNNNNXXKKKOxkOO0XNXKXNNNNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWWWNXXXXXXXK0OOKXOdOXXXNNKOkOKKXXNNNXXXNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNNXXXXNNWWWWWMMMWXXNWWWWKx0NWMMMMWXOOKWMMWWNXXXXXXKXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNXKXXXXNWWMMMMMMMMMWXO0XXKK0OOkkO0KK0000ddO0KWMMMMMMMWNKKKXXXXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXXXK0OKWMMMMMWWWNNXXK00kxkkkkkkkkkkkkkkxdol::c::oxO0KXXNNK0NMMWNXXXXXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXKXXXNWMWOd0NNXKKK00OkkkkkkkkkkkkkkkkkkkkkkkOkkko;....'',;clodkKNMMMMMWNXXXXXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNXKKXNWMMMMMWKkkOOOkOkkkkkkkkkkkkkkkkkkkOOOOOOOOOOOOOxl,.........';coOXNWMMMMMWNXXXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNXKKXNMMMMMMMWNKOOOOOOOOOOOOOOOOOkkkOOOOOOOOOOOOOOOOOOOOOOdc:::lc;::cccldk0KXNWMMMMMWWNNNNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXKXWMMMMMMMMWNK0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO000000000OOOOOkxkOOOOOOOOOO00KXNWMMMMMWXKKNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNNWWWMMMMMMMMWNXK0000000000000000000000000000000000000000000000000OOOkddkOOOOOOOOOOOO00KXNWWMMMWNKKXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKKKNWMMMMMMMWNXKK0000000000000000000000000000000000000000000000000000000OdokOOOOOOOOOOOOOOO00KXNWWMMN00XWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNK0XWMMMMMMMWNXKKKK000000000000000000000000000000000000000000000000000000000OdokOOOOOOOOOOOOOOOOO000KXKKNWNXXNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXK0XWMMMMMMWNXKK0K0000OOOOOOOOOOOOOO0000000000000000000000000000000000000000000Oolx0OOOOOOOOOOOOOOOO00000KWMMWNXXNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0O0XWMMMWWNXKKKK0K0koc:,,,,,,,,,;;;;;::::::::cccllodxxkO000000000000000000000000kocok000OOOOOO0000000000000KNMMMWNKXNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0KNWXkkKNXXKKKKKKKK0d:,,,,'''''''''''''''''.............',:ldO00000000000000000000kkkddO00000000000000000000000XWMMMWXKXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0KNMMMWX00K0KKKKKKK0Oo;;;;;;;;;;;;;;;;;;;;;,,,,,,'''''.........,cxO00000K0KKKKKKKKKK000OddO00000000000000000000000KNWMMMWXKXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWN00NWMMMWNKKK000K00K00Ol,;;;;;;;;;;;;;;;;;;,,,,,,,,,''''''',,,,''....ck0KKKKKKKKKKKKKKKKKK0Odx0000000000000000000000000KNWMMMNXXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNK0XWMMMMWXKKKKKK00K00KOl,,;;;;;;;;;;;;;;;;;;;;;;;,,,,,,,,,,,,,,,,,,,'..,d0KKKKKKKKKKKKKKKKK00Odx0000000000000000000O000000XWMMMMNXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWK0KWMMMMWNKKKK0K00000000o;,;;;;;;;;;;;;;;;;;;;;;;;,,,,,,,,,,,,,;;;;;;;;'..'d0KKKKKKKKKKKKKKKK000kox0000000000000000000OO00OO00XWMMMWKKWMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX0KNMMMMMWXKKKK0000000000d;,;;;;;;;;;;;;;;;;;;;;,,,,,,,,,,;;;;;;;;;;;;;;;;,..,d0KKKKKKKKKKKKKKK0000xok00000000000000000OOOOOOOOOO0XWMMWXKXMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKXMMMMMWNKKK000000000000x;,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,'..;x00KK0KKKKKKKKKKK0000ddO000000000000OOkkxddddddddxkO0XNNNKOKWMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNXNWMMMMMNXK00000000000000x:'',;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,,,,,'..cOKKKKKKKKKKKKKKKK000Odx00000000Okdoc:;,,''''''',;;:cokOKNNKKWMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKKNMMMMMWNK000000000000000x:'',,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,,,,,,,,,;,..'d00KKKKKKKKKKKKKKK0000KK0000Okdc,'................'',:xKWMWKKNMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN00NMMMMWNX0000000000000000kc,,;,,;;;,,,,,;;,,,,,,,,,;;;;;;;;,,,;;,,,,,,,,,,,,,,,,,'..cO000000KKKKKKK0000000KK000ko;.....................''';dKWMWXKNMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOKWMMMMNXK0000000000000000kc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;,..,x000000KKK0KKK000K0000kxOk:........................''';dKWMMXKNMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMWOxKWMMWNX0000000000000000O0Ol,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;;;;;,,,;;;;;;,'..o000000000000000000000kol:..........................''',oKWMMXKNMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMN0OK0O0KK0000000OOOO0OO0OO0OOd;',,,,,,,,,,,,,,,,,,,,,,,,,;;;,,,;;;;;,,;;;;;;;;;;;;,,,,,,'..cO000000000000000000000x;..............................',l0WMMXKNMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMXOKWMWKkO0OOOOOOOOOOOOOOOOOOOx;',,,,,,,,,,,,,,,,,,,,,,,;;;;;;;,,,;;;;;;;;;,;;;;;;,,,,,,,,'..;k000000000000000000000kc'...............................'l0WMMX0NMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMXOKWMMWX0OOOOOOOOOOOOOOOOOOOOkc',,,,,,,,,,,,,,',,,,,,,,,,,;;;;;;;;;;;;;;;;;;;,,;;;,,,,,,'''..'x000000000000000000000k:'................................'cOWMMXXWMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMWKOXMMMWK0OOOOOOOOOOOOOOOOOOOOOo,,,,,,,,,,,,,,,'',,,,,,;,,;;;;;;;;;;;;;;;;;;,'',,,,,,,,,,'',,'.'d000000000000000000000k:..................................':kNMMNKNMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMWKOXMMMWX0OOOOOOOOOOOOOOOOOOOOOx:,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,,'..',,,,,,,,,,,,,..'d000000000000000OOOOOOx:'..................................':kNMWX0NMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMWKONMMMWX0OOOOOOOOOOOOOOOOOOOOOko:::::::::::::::::;::;;;;;;;;;;;;;;:::::::::;;;;;;;;;;;,,,,,,,'..'dO000OOOOOOOOOOOOOOOOOOd:....................................;dXWWKKNMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMW0ONMMMWXOOOOkkOOOOOOkkOOOOOOOOOkdollcc:::::::::::::::::::;;;;;;;;;;;;;;::::::::::;;;;;;;;;;;;,,'.,dOOOOOOOOOOOOOOOOOOOOOOOo,....................................,o0WWKKWMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMW0ONMMMWX0OOkkkkOOOOkkkOOOOOOOOOOOOOOkkxddolcc:::::::::::::::;;;;;;;:::::::::::;;;;;;;:;:::::;;;;;,;dOOOOOOOOOOOOOOOOOOOOOOOkc.....................................':okOkKWMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMWKONMMMWX0OkkkkkkOOkkkkkOOOkOOOOOOOOOOOOOOOOkkxddoollccc::::::::::::::::::::::::;;;:::::::::;;;::::;:xOOOOOOOOOOOOOOOOkOOkOOOOo,.......................................lKX0XMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMNKNMMMWXOkkkkkkkkkkkkkkOOkkkOOOOOOOOOOOOOOOOOOOOOOkkkxxdddooooollllccccccc::::::::cccccccccllooodddllkOOOOOOOOOOOOOOOOkkkkkkOOx:........................................lXX0NMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMWXKWMMMWKOkkkkkkkkkkkkkkOkkkkOOOOOOOOOOOOOOOOOOOOOOOOkkkkkkkkkkkkkkxxxxxxxddddddddddxxxxxkkkkkOOOOOOklcxOOOOOOOOOOOOOOOOkkkkkkkOOd'.........  ................  ...........lKKKWMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMXOXMMMWKOkkkkkkkkkkkkkkkkkkkOOkOOkOOOOOOOOOOOOOOOOOOOOkkkOkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkOOOOOOOOOOOd;;dkOOOOOOOOOkkkkkkkkkkkkkkkkc....                        .............:O0KWMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMXOXMMMWKkkkkxkkkkkkkkkkkkkkkkkkkkxxkOOOOOOOOOOOOOOOOkkOOOkOOOOkkkkkkkkkkkkkkkkkkkkkkkkkkOkkOOOOOOOOOko''okkkkkkkkkkkkkkkkkkkkkkkkkkd,...                     .................;k0XMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMNOKWMMN0kkkxxxkkkkxxkkkkkkkkkkkkkxodkOOOOOOOOOOOOOOOOkkOOOOOOOOOOkkkkkkkkkOkkkkkkkkkkkkOOOkkkOOOOOOkkxc.,okkkkkkkkkkkkkkkkkkkkkkkkkkkc.                      ...................;dONMMMMMMM\r\n" + 
			"MMMMMMMMMMMMN0KWMMN0kxxxxxxkkxxxkkkkkkkkkkkkkkkkkkkkOkkkkkkOOOOOOOkkkkOOOOOOOOOOOOOOOkkkkkkOOkkkkkkOOOOkkOOOOOkkkkd;'cxkkkkkkkkkkkkkkkkkkkkkkkkkkkd,                    ....................'lo:ckXMMMMM\r\n" + 
			"MMMMMMMMMMMNOONMMN0xxxxxxxkxxxxkkkxkkkkkkkkkkkkkkkkkkOkkkkkOOOOOOOOOkkOOOOOOOOOOkOOOOOOOOOOOOOOOOOOOOOOOOOOOkkkkkxc,;oxkkkkkkkkkkkkkkkkkkkkkkkkkkkkl.                  ....................;ONKdoONMMMMM\r\n" + 
			"MMMMMMMMMMW0kKXOkkxxxxxxxxxxxxkkxxkkkkkkkkkkkkkkkkkkkkkkkkkkOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOkkkkkkkko,,ldxkkkkkkkkkkkkkkkkkkkkkkkkkkkkx;.''.            ....................'lKWMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMKOXMWk:cdddxxxxxxxxxxxxkkkkkkkkkkkkkkkkkkkkkkkkkkkOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOkkkkkkkd:,cdxkkkkkkkkkkkkkkkkkkkkkxxxxxxxxkl',c.           ....................,dNMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMXOKWW0;..,ldxxxxxxxxxxxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOkkkkkkkkkl',lxxkkkkkkkkkkkkkkkkxxxxxxxxxxxkkkx:.:,.        .....................:OWMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMNO0WW0;.....;ldxxxxxxxxxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOkkkkkkkkkko;.;dxxkkkkkkkkkkkkkkkxxxxxxxxxxxxxxxxo'..       ......................c0WMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMW00WWO;........,cdxxxxxxxxxxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxc,.,lxkkkkkkkkkkkkkkxxxxxxxxxxxxxxxxxxxx:.       .....................'oXMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMKONWk,...........':lodxxxxxxxxkxddxxxxxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxl;.';lxkkkkkkxkkkkkxxkkxxxxxxxxxxxxxxxxxxxo'     ......................,dNMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMXOXNx'...............';codxxxxxxc,',;;::cclloodddxxxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxxxl;..,coxxxkkkkkkxxkkkkkxxxxxxxxxxxxxxxxxxxxxxl.   ......................,xNMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMWWKXXo. ...................',:clol:,''''........'',,;;::ccllooddxxxxxxxxxxxxxxxxxxxxkkkkkkkkkkkkkkxdl:'.':odxxxkkxxkkkkkkxkkkkxxxxxxxxxxxxxxxxxxxxxd;. ......................;kWMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"WKOdlx00c............................''''''''',,,,,,,,''........''',;;:::cllooodddxxxxxxxxxxxxxxxdolc:;'..,:ldxxxxxkxkkxkkkkkkxxxxxxxxxxxxxxxxxxxxxxxxxxc.......................:OWMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"WKkocllodxxdol:;,'...................................'''''''',,,''''..........'',,;;;:::cccc:::;;,......,codxxxxxxxxxkkxkxxxxxxxxxxxxxxxxxxxxxxxxxdxxxdxd;.....................:0WMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMWXKNMMMMMMWNXK0Oxdol:,'........................................'''''''''''''..................'',;:ldxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxddxddddo;....................c0WMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMWWNX0Okdoc:,'..........................................''''',,,;;;;:::ccclloddxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxdxxdddl,...................'lKMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNK0kxolc:;,'..........................................',,;::clooddxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxdddddoc,....................'oXMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNNXK0kxdolc;,,'.........................................',,;:cloddxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxddlc;'......................,dXMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNXXK0Okdol:;,'........................................',;:clloddddxxxxxxxxxxxxxxxxddolc:;,'.........................,xNMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNXK0Oxdol:;,'......................................'',;;;;;:cllllccc::;,'...............................;kNMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNXK0Oxdlc:;,'................................................................................:OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNXKOkxdlc:;,'.....................................................................:0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNXK0kxxdoc:;,'........................................................'cKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXK0Oxdolc;,'.............................................'lKMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXKOkxol:;;,'...................................cKMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNNXK0Okxdolc:;,.................... ..;OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNXKOkxdol:;'............;xNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNXKOkdoc;,....;OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXKOx;'dXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0::xkONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0xOOOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
			"");

		//Tell Story
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("Io walks back to his camp. Hes frustrated that he never found Fawn."
			+ "\n Io decides to get something to eat. But then he hears rusting in his tent."
			+ "\n Io starts to pull out his knife, and he opens the tent"
			+ "\n quickly and sees Fawn! Io is so excited he jumps onto Fawn and they rejoust after all this"
			+ "\n trouble. Io looks and sees Fawn even brought back his ball. They decide to have an amazing"
			+ "\n dinner of canned chili...");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		//the end
		System.out.println("      _____                    _____                    _____                            _____                    _____                    _____          \r\n" + 
				"     /\\    \\                  /\\    \\                  /\\    \\                          /\\    \\                  /\\    \\                  /\\    \\         \r\n" + 
				"    /::\\    \\                /::\\____\\                /::\\    \\                        /::\\    \\                /::\\____\\                /::\\    \\        \r\n" + 
				"    \\:::\\    \\              /:::/    /               /::::\\    \\                      /::::\\    \\              /::::|   |               /::::\\    \\       \r\n" + 
				"     \\:::\\    \\            /:::/    /               /::::::\\    \\                    /::::::\\    \\            /:::::|   |              /::::::\\    \\      \r\n" + 
				"      \\:::\\    \\          /:::/    /               /:::/\\:::\\    \\                  /:::/\\:::\\    \\          /::::::|   |             /:::/\\:::\\    \\     \r\n" + 
				"       \\:::\\    \\        /:::/____/               /:::/__\\:::\\    \\                /:::/__\\:::\\    \\        /:::/|::|   |            /:::/  \\:::\\    \\    \r\n" + 
				"       /::::\\    \\      /::::\\    \\              /::::\\   \\:::\\    \\              /::::\\   \\:::\\    \\      /:::/ |::|   |           /:::/    \\:::\\    \\   \r\n" + 
				"      /::::::\\    \\    /::::::\\    \\   _____    /::::::\\   \\:::\\    \\            /::::::\\   \\:::\\    \\    /:::/  |::|   | _____    /:::/    / \\:::\\    \\  \r\n" + 
				"     /:::/\\:::\\    \\  /:::/\\:::\\    \\ /\\    \\  /:::/\\:::\\   \\:::\\    \\          /:::/\\:::\\   \\:::\\    \\  /:::/   |::|   |/\\    \\  /:::/    /   \\:::\\ ___\\ \r\n" + 
				"    /:::/  \\:::\\____\\/:::/  \\:::\\    /::\\____\\/:::/__\\:::\\   \\:::\\____\\        /:::/__\\:::\\   \\:::\\____\\/:: /    |::|   /::\\____\\/:::/____/     \\:::|    |\r\n" + 
				"   /:::/    \\::/    /\\::/    \\:::\\  /:::/    /\\:::\\   \\:::\\   \\::/    /        \\:::\\   \\:::\\   \\::/    /\\::/    /|::|  /:::/    /\\:::\\    \\     /:::|____|\r\n" + 
				"  /:::/    / \\/____/  \\/____/ \\:::\\/:::/    /  \\:::\\   \\:::\\   \\/____/          \\:::\\   \\:::\\   \\/____/  \\/____/ |::| /:::/    /  \\:::\\    \\   /:::/    / \r\n" + 
				" /:::/    /                    \\::::::/    /    \\:::\\   \\:::\\    \\               \\:::\\   \\:::\\    \\              |::|/:::/    /    \\:::\\    \\ /:::/    /  \r\n" + 
				"/:::/    /                      \\::::/    /      \\:::\\   \\:::\\____\\               \\:::\\   \\:::\\____\\             |::::::/    /      \\:::\\    /:::/    /   \r\n" + 
				"\\::/    /                       /:::/    /        \\:::\\   \\::/    /                \\:::\\   \\::/    /             |:::::/    /        \\:::\\  /:::/    /    \r\n" + 
				" \\/____/                       /:::/    /          \\:::\\   \\/____/                  \\:::\\   \\/____/              |::::/    /          \\:::\\/:::/    /     \r\n" + 
				"                              /:::/    /            \\:::\\    \\                       \\:::\\    \\                  /:::/    /            \\::::::/    /      \r\n" + 
				"                             /:::/    /              \\:::\\____\\                       \\:::\\____\\                /:::/    /              \\::::/    /       \r\n" + 
				"                             \\::/    /                \\::/    /                        \\::/    /                \\::/    /                \\::/____/        \r\n" + 
				"                              \\/____/                  \\/____/                          \\/____/                  \\/____/                  ~~              \r\n" + 
				"                                                                                                                                                          ");

}
	public static void template11 (Scanner input) {
		//Assci art
		System.out.println();

		//Tell Story
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("Io takes the leap of faith and barly grabs onto the edge and climbs his way up,"
			+ "\n but he finds no sign of Fawn. He looks back and forth but finds nothing. He has no choice but to "
			+ "\n return to the bottom of the Cliff.");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		//promt question
		System.out.println("Where should Io go? The Swamp or back to the Feild?");

		//get user input
		String answer = input.nextLine();

		//Check Answer
		switch (answer) {
		case "Swamp":
			template6(input);
			break;
		case "Feild":
			template2(input);
			break;
	}
}
	public static void template12 (Scanner input) {
		//Assci art
		System.out.println();

		//Tell Story
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("Io slides over and tries to get around the branch but trips and falls back down"
				+ "\n to the bottom of the cliff, he luckly lives but he can't move and starts to stuggle."
				+ "\n Nothing past his neck will move and he has no choice to scream for help."
				+ "\n No one answers...He screams for days on end tell he can't anymore and "
				+ "\n he slowly starves to death.");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		//promt death and gameover
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNX0kol:;,....               ....,;cldk0XWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOo:,..                                   ..,cdOXWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN0d:.                                               .:d0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKd;.                                                     .;dXWMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0l.                                                           .oKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWKo.                                                               .oXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk,                                                                   ,OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNo.                                                                     .dNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNo.                                                                       .oNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMNo.                                                                         .dWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk.                                                                           'OMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX:                                                                             cNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO.                                                                             '0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMMMWd.                                                                             .xWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNl                                                                               oWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMNc                                                                               lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMX:                                                                               cNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMMMMX:                                                                               lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMNl                                                                               oWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMWo                                                                              .dWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMMMMWd.               ..;codkOOOkxo:.                 .:oxOOOkkdoc,.                .xWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMWMMMMMWMMMMMMMMMMMWMMM0'             'oOXWWMMMMMMMMMW0:              .cKWMMMMWMMMMWNXOo'             ,0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMWk'          .lXMWMMMMMMMMMMMWMMK;             :XMMMMMMMMMMMMMMMWXc.          'kWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMWMMMMMMMMMMMMMMMMMWMMMMMWMMW0c.        cXMMMMMMMMMMMMMMMMMNc             lNMMWMMMMMMMMMMMWMMX:        .lKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMWMMMMMWMMMMMMMMMMMMMMMMMMNx.      .xWMMMMWMMMMMMMMMMMMK,             ;XMWMMMMMMMMMMMMMMMWd.      .kWWWMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMWMMMMNl      .dWMMMMMMMMWMMMMMMMXc              .lNMMMMMMMMMMMMMMMMWo       oWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWd.      ;0WMMMMMMMMMMMWMW0:     ,dkOOd'    .c0WMMMMMMMMMMMMMM0,      .xMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMXc        ;ONMMMMMMMMMWNOl.     ;KMMMMW0;     .l0NWMMMMMMMMMNk,        lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMWx.         .,cdk000Okdc,.      ;0MMMMWMW0,      .,ldO000Okdc,.         .kWMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNc               ....          ,0MMMWMMMMWO'          ...                lWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN:                            ,0WMMMMMMMWMWO'                            cNMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMWMMMNc                           .kWMMMMMMWMMMMWx.                           lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNl                           :XMMMMMWMMMMMMMK;                           oWMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO'                          :XMMWMMMMMMMMMMX;                          ,0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMMWKxlc::::;,..               .xNMMMMMMMMMMMNd.               .',;::::cokXWMMMMMMMMMMMWMMMMMMMMMMMWMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMWWMWWWX0o.              .:kXNWWMMWNKx;.              'dKNWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMWMMMMMMMMMNl                 .,;:c::,.                 oWMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMMMMMMMMMMWMMMMMMMMMMMWo                                          .dWMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMWKOOOKNWWMMMMMMMMMMMMMNl                                           oWMMMMMMMMMMMWNKOOOKWMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO:.   .':xXWMMMMMMMMMMMX:                                           cNMMWMMMMMWXx:'.   .:OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMWO'         'dNMMMMMMMMMMX:                                           cNMMMMMMMNd'         'OMMMMMMMMMMMMMMMMMMMMWMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMWMMMMMMMMMMMMK;           .cKWMMMMMMMMWo                                          .dWMMMMMWKc.           :KMMMMMMMMMMMMMMMMMWMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMWMMMMMWWNNWWWN0:              ,kWMMMMMMMMXd;....                               ....;xNMMMWMWk,              :0WWWWNNWMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMWMMMMMWNk:,',;:;.                .lKWMMMMMMMMWX000kc.     ..           .      .ck000XWMMMMMWKl.                .;:;,',:kNMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMWMKc.                          .dXWWMMMMMMMMMMMWKkdooxO0kl;'...';lk0OxoodOXWMMMMMMMMMMXd'                          .cKWMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMd.                             'dXMMMMMMMMMMMMMMMMMMMMMWWNNXXNWMMMMMMMMMMMMMMMMMMWXd'                             .dWMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMWMMMMMWMMMMWx.                               'o0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0o'                               .kMMMMMMMMWMMMMMWMM\r\n" + 
				"MMMWMMMMMMMMMMMMMXc                                 .:xKWMMMMMMMMMMWWMMMMMMMMMMMWMMMMMMMMMMMMWKx:.                                 :XMMMMMMWMMMMMMMMMM\r\n" + 
				"MMMMMMMWMMMMMMMMMWK;                                   .:d0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMWN0d:.                                   ;0WMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMWMMMMMMMXo.                                    .,oONWMMMMMMWMMMMMMMMMMMMMMMWNOo;.                                    .oXMMMMWMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMWMMMMWKxc,...  .....',,,''..                  .'lkXWMMMMMMMMMMMMMMMMWXkc'                   ..'',,,'..... ....,cxKWMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMNXK0OOO0KXNNNNNNNX0Oxl;..                .:dKWMMMMMMMMMMNKx:.                .':lxO0XNNNNNNNXK0OO00KXNWMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0d:'.               .;oONWMWWXOo;.               .':d0XWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWN0d:.               .'cooc'.               .:dOXWMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOo;.                              .;oOXWMMMMMMWMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWXkl,.                      .,lkXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMWKd.                    .oXWMMMWMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKxl,.                      .,lkKWMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN0d;.                              .:dONWMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKxc'.              .;oxxo;.              .'cx0NMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkl,.               .cxKWMMMMWKxc'               .,lkKWMMMMWMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOo;.               .,lkXWMMMMMWMMMMWXkl'.               .:dOXWMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXOd:'                .;oONWMMMMMMMMMMMMMMMMMNOo,.               .':dOKNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMWMMMNXKXXNNNNNXX0Oxoc,.                 .;d0NMMWMMMMMMMMMMMMMMMMMMMMMN0d;.                 .,coxOKXXNNNNNXKKXNWMMMMMMMMMMMMMWMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMWKdc,....'''''...                    .;d0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0d;.                    ...'''''....,:dKWMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMXo.                                .;d0NMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0d;.                                .oXMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMWMMMMMMMMMWx.                              .,o0NMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMWMMMMMMN0o,.                              .xMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMWO'                           .,oONWMMMMMWMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMWN0o,                            'OWMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMW0:.                       .cONWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMWMMMMNOc.                       .:0WMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMNd.                   .:xXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMWXx:.                   .dNMMMMMWMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMNo.                'o0WMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMWMMMMMMMW0o'                .dNMMMMWMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMXc              .oXMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMWWXo.              cXMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMK:            ;OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMWO,            :KMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMWXo'.       .oXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXo.       .'oXMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMWKd;.   .:0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO:.   .;dKWMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("          _____                    _____                    _____                    _____                           _______                   _____                    _____                    _____          \r\n" + 
				"         /\\    \\                  /\\    \\                  /\\    \\                  /\\    \\                         /::\\    \\                 /\\    \\                  /\\    \\                  /\\    \\         \r\n" + 
				"        /::\\    \\                /::\\    \\                /::\\____\\                /::\\    \\                       /::::\\    \\               /::\\____\\                /::\\    \\                /::\\    \\        \r\n" + 
				"       /::::\\    \\              /::::\\    \\              /::::|   |               /::::\\    \\                     /::::::\\    \\             /:::/    /               /::::\\    \\              /::::\\    \\       \r\n" + 
				"      /::::::\\    \\            /::::::\\    \\            /:::::|   |              /::::::\\    \\                   /::::::::\\    \\           /:::/    /               /::::::\\    \\            /::::::\\    \\      \r\n" + 
				"     /:::/\\:::\\    \\          /:::/\\:::\\    \\          /::::::|   |             /:::/\\:::\\    \\                 /:::/~~\\:::\\    \\         /:::/    /               /:::/\\:::\\    \\          /:::/\\:::\\    \\     \r\n" + 
				"    /:::/  \\:::\\    \\        /:::/__\\:::\\    \\        /:::/|::|   |            /:::/__\\:::\\    \\               /:::/    \\:::\\    \\       /:::/____/               /:::/__\\:::\\    \\        /:::/__\\:::\\    \\    \r\n" + 
				"   /:::/    \\:::\\    \\      /::::\\   \\:::\\    \\      /:::/ |::|   |           /::::\\   \\:::\\    \\             /:::/    / \\:::\\    \\      |::|    |               /::::\\   \\:::\\    \\      /::::\\   \\:::\\    \\   \r\n" + 
				"  /:::/    / \\:::\\    \\    /::::::\\   \\:::\\    \\    /:::/  |::|___|______    /::::::\\   \\:::\\    \\           /:::/____/   \\:::\\____\\     |::|    |     _____    /::::::\\   \\:::\\    \\    /::::::\\   \\:::\\    \\  \r\n" + 
				" /:::/    /   \\:::\\ ___\\  /:::/\\:::\\   \\:::\\    \\  /:::/   |::::::::\\    \\  /:::/\\:::\\   \\:::\\    \\         |:::|    |     |:::|    |    |::|    |    /\\    \\  /:::/\\:::\\   \\:::\\    \\  /:::/\\:::\\   \\:::\\____\\ \r\n" + 
				"/:::/____/  ___\\:::|    |/:::/  \\:::\\   \\:::\\____\\/:::/    |:::::::::\\____\\/:::/__\\:::\\   \\:::\\____\\        |:::|____|     |:::|    |    |::|    |   /::\\____\\/:::/__\\:::\\   \\:::\\____\\/:::/  \\:::\\   \\:::|    |\r\n" + 
				"\\:::\\    \\ /\\  /:::|____|\\::/    \\:::\\  /:::/    /\\::/    / ~~~~~/:::/    /\\:::\\   \\:::\\   \\::/    /         \\:::\\    \\   /:::/    /     |::|    |  /:::/    /\\:::\\   \\:::\\   \\::/    /\\::/   |::::\\  /:::|____|\r\n" + 
				" \\:::\\    /::\\ \\::/    /  \\/____/ \\:::\\/:::/    /  \\/____/      /:::/    /  \\:::\\   \\:::\\   \\/____/           \\:::\\    \\ /:::/    /      |::|    | /:::/    /  \\:::\\   \\:::\\   \\/____/  \\/____|:::::\\/:::/    / \r\n" + 
				"  \\:::\\   \\:::\\ \\/____/            \\::::::/    /               /:::/    /    \\:::\\   \\:::\\    \\                \\:::\\    /:::/    /       |::|____|/:::/    /    \\:::\\   \\:::\\    \\            |:::::::::/    /  \r\n" + 
				"   \\:::\\   \\:::\\____\\               \\::::/    /               /:::/    /      \\:::\\   \\:::\\____\\                \\:::\\__/:::/    /        |:::::::::::/    /      \\:::\\   \\:::\\____\\           |::|\\::::/    /   \r\n" + 
				"    \\:::\\  /:::/    /               /:::/    /               /:::/    /        \\:::\\   \\::/    /                 \\::::::::/    /         \\::::::::::/____/        \\:::\\   \\::/    /           |::| \\::/____/    \r\n" + 
				"     \\:::\\/:::/    /               /:::/    /               /:::/    /          \\:::\\   \\/____/                   \\::::::/    /           ~~~~~~~~~~               \\:::\\   \\/____/            |::|  ~|          \r\n" + 
				"      \\::::::/    /               /:::/    /               /:::/    /            \\:::\\    \\                        \\::::/    /                                      \\:::\\    \\                |::|   |          \r\n" + 
				"       \\::::/    /               /:::/    /               /:::/    /              \\:::\\____\\                        \\::/____/                                        \\:::\\____\\               \\::|   |          \r\n" + 
				"        \\::/____/                \\::/    /                \\::/    /                \\::/    /                         ~~                                               \\::/    /                \\:|   |          \r\n" + 
				"                                  \\/____/                  \\/____/                  \\/____/                                                                            \\/____/                  \\|___|          \r\n" + 
				"                                                                                                                                                                                                                ");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		

	}
	
}


