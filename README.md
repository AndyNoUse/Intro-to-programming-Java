Del 1
Redogör för en likhet och en skillnad mellan programmeringsspråken Java och Python - 

En likhet är att de båda är objektorienterade och har då stöd för klasser, objekt, arv, inkapsling.
En stor skillnad är att Python är dynamiskt typat medan Java är statiskt typat.
Det betyder att en variabel i python bestäms vid körning, medan i Java är variabeln bestämd innan körning och kan inte ändras senare


Redogöra för följande termer:

-Objekt - Det är en specifik instans av en klass som innehåller attribut och metoder från våran klass.

-Konstruktor - Det är metoden som skapar upp objektet. Konstruktorn har alltid samma namn som klassen och dess uppgift är att initiera attribut och läsa av inparametrar.

-Attribut - Saker som objektet är, har och kan ändra. Beteende kan påverka våra attribut, till exempel äter vi mycket så påverkas vikten eller om vi ökar farten så ändras våran hastighet.


Redogöra för de grundläggande principerna för versionshantering -

Vi jobbar med olika grenar av vår kod. Den centrala grenen är Main eller Master-branchen, där hämtar vi koden för våra sidogrenar, och när vi ska skicka koden utgår vi också ifrån den här. När vi skapar en ny version för våra kunder, baserar vi den alltid på koden i Master-branchen.
Master branschen ska vara tip-topp, vältestad, Fungerar väl. Vi jobbar inte direkt mot den då vi vill bibehålla dess kvalitet. Utan vi jobbar mot Feature-branch. Om vi kanske vill rätta till en bug, så gör vi en Bug-branch.
När Featuren-branchen eller bug-branchen är klar gör vi en merge med Master branch och hoppas att det inte är merge konflikt. Om det blir det, så rättar vi till det och ser till att koden passar ihop bra


Beskriv kort utvecklingsprocessen TDD- 

Arbetscykeln går till genom att vi skriver ett enhetstest som vi vet inte kommer fungera först (TEST FAILS). För att koden vi testar finns inte än.
Sedan skriver vi bara precis så mycket kod som behövs för att testet ska lyckas. Målet är att hålla det enkelt och direkt på sak.
När vi har fått första testet att fungera, då skriver vi ett nytt test som täcker vår nästa metod, detta test kommer också att misslyckas först. Vi uppdaterar koden för att få 2:a testet att fungera.


Upprepa denna cykel. Skriv test, fixa kod, få det att funka – i små, hanterbara cykler

Efter många cyklar så går vi vidare till Refactor. Vi ska uppdatera koden utan att ändra funktionen, skriver om koden så den är lite snyggare, kör om koden se till att den fortfarande lyckas med existerande tester.
Fördelarna är att vi skriver en massa enhetstester som vi bygger upp vår utveckling med och vi skriver inte mer kod än det vi behöver för tillfället. Små små steg framåt
