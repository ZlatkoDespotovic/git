package domaci_08132019;

public class zadatak_1_08132019 {

	public static void main(String[] args) {
		//Prvi primer za preinkrement:
		int a=10, b=4, c=7;
		a=++b + ++c;
		/*
		 * Vrednost b se uvecava za 1 i sabira se sa vrednoscu c, koja je takodje, uvecana za 1,
		 * tako da vrednost b iznosi 5, dok je vrednost c 8, u kom slucaju ce a imati vrednost 13.
		 */
		
		//Drugi primer za preinkrement:
				int a=10, b=4, c=7;
				c=++a / ++b;
				/*
				 * Vrednost a se uvecava za 1 i deli se sa vrednoscu b, koja je takodje, uvecana za 1,
				 * tako da vrednost a iznosi 11, dok je vrednost b 5, u kom slucaju ce c imati vrednost 2.
				 */
		
				
		//Prvi primer za postinkrement:
				int a=10, b=4, c=7;
				a=b++ + c++;
				/*
				 * Vrednost b ima trenutnu dodeljenu vrednost i sabira se sa vrednoscu c, koja takodje zadrzava trenutno dodeljenu vrednost,
				 * tako da vrednost b iznosi 4, dok je vrednost c 7, u kom slucaju ce a imati vrednost 11. Medjutim, u daljem toku vrednost b ce imati inkrementiranu vrednost 
				 * za 1 i iznosice 5, dok ce c imati inkrementiranu vrednost za 1 i iznosice 8.
				 */
		
		//Drugi primer za postinkrement:
				int a=10, b=4, c=7;
				b=c++ * a++;
				/*
				 * Vrednost c ima trenutnu dodeljenu vrednost i mnozi se sa vrednoscu a, koja takodje zadrzava trenutno dodeljenu vrednost,
				 * tako da vrednost c iznosi 7, dok je vrednost a 10, u kom slucaju ce b imati vrednost 70. Medjutim, u daljem toku vrednost c ce imati inkrementiranu vrednost 
				 * za 1 i iznosice 8, dok ce a imati inkrementiranu vrednost za 1 i iznosice 11.
				 */
				
		//Prvi primer za predekrement:
				int a=10, b=4, c=7;
				a=--b + --c;
				/*
				 * Vrednost b sa predekrementom ima umanjenu trenutnu dodeljenu vrednost za 1 i sabira se sa vrednoscu c koja nosi oznaku predekrementa i koja trenutna dodeljena vrednost se takodje umanjuje za 1,
				 * tako da vrednost b iznosi 3, dok je vrednost c 6, u kom slucaju ce a imati vrednost 9.
				*/
				
		//Drugi primer za predekrement:
				int a=10, b=4, c=7;
				c=--a / --b;
				/*
				 * Vrednost a sa predekrementom ima umanjenu trenutnu dodeljenu vrednost za 1 i deli se sa vrednoscu b koja nosi oznaku predekrementa i koja trenutna dodeljena vrednost se takodje umanjuje za 1,
				 * tako da vrednost a iznosi 9, dok je vrednost b 3, u kom slucaju ce c imati vrednost 3.
				 */
				
		//Prvi primer za postdekrement:
				int a=10, b=4, c=7;
				a=b-- - c--;
				/*
				 * Vrednost b sa postdekrementom ima trenutnu dodeljenu vrednost i od te vrednosti b oduzima se vrednost c koja nosi oznaku postdekrementa i koja vrednost je trenutna dodeljena vrednost,
				 * tako da vrednost b iznosi 4, dok je vrednost c 7, u kom slucaju ce a imati vrednost -3. Medjutim, u daljem toku vrednost b ce imati dekrementiranu vrednost 
				 * za 1 i iznosice 3, dok ce c imati dekrementiranu vrednost za 1 i iznosice 6.
				*/
				
		//Drugi primer za postdekrement:
				int a=10, b=4, c=7;
				c=a-- * b--;
				/*
				 * Vrednost a sa postdekrementom ima trenutnu dodeljenu vrednost i ta vrednost se mnozi sa b, koja vrednost nosi oznaku postdekrementa i koja vrednost je trenutna dodeljena vrednost,
				 * tako da vrednost a iznosi 10, dok je vrednost b 4, u kom slucaju ce c imati vrednost 40. Medjutim, u daljem toku vrednost a ce imati dekrementiranu vrednost 
				 * za 1 i iznosice 9, dok ce b imati dekrementiranu vrednost za 1 i iznosice 3.
				*/
}
	
