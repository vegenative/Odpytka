package com.oxylane.odpytka;

import java.util.ArrayList;
import java.util.Random;

public class QuestionsManager {
    ArrayList<String> questionsManager = new ArrayList<>();
    ArrayList<String> answersManager = new ArrayList<>();
    public QuestionsManager(){

        //create questions list

        questionsManager.add("Jakie czynności/zadania należy wykonać przed przywróceniem sklepu do normalnej działalności po ewakuacji?");
        questionsManager.add("Jakie osoby uczestniczą w procesie/procedurze zarządzania kryzysowego? Opisz ich zadania.");
        questionsManager.add("Opisz Schemat Zarządzania Kryzysowego ");
        questionsManager.add("Co zrobisz w przypadku kontaktu z mediami (dziennikarz prosi Ciebie o udzielenie informacji drogą mailową, telefoniczną lub bezpośrednio)?");
        questionsManager.add("Co to jest identyfikowalność, dlaczego jest ważna i jaki mamy cel?");
        questionsManager.add("Co zrobić w przypadku wykrycia wadliwych kartuszy z gazem?");
        questionsManager.add("Opisz procedurę REACH, gdy klient zadaje pytanie na temat obecności substancji chemicznych i biobójczych w naszych produktach.");
        questionsManager.add("Co zrobię kiedy mam do czynienia z niebezpiecznym / agresywnym klientem?");
        questionsManager.add("Jak zachować się podczas napadu?");
        questionsManager.add("Jak zachować się podczas ataku terrorystycznego?");
        questionsManager.add("Jak postępować w przypadku paczki międzysklepowej (intermag) wysłanej z rozbieżnościami?");
        questionsManager.add("Co musisz zrobić niezwłocznie po napadzie?");
        questionsManager.add("Ile stopni alarmu pożarowego mamy w Naszym sklepie? Opisz je. ");
        questionsManager.add("W jaki sposób aktywuje się alarm I stopnia?");
        questionsManager.add("W jaki sposób aktywuje się alarm II stopnia?");
        questionsManager.add("Kiedy otworzą się klapy dymowe?");
        questionsManager.add("Jaka jest rola pracownika POK podczas EWAKUACJI?");
        questionsManager.add("Jaka jest rola EPP podczas EWAKUACJI?");
        questionsManager.add("Jaka jest rola EPI podczas ewakuacji?");
        questionsManager.add("Jaka jest rola przewodników stref (I, II, III, IV,)?");
        questionsManager.add("Którędy ewakuujemy się ze sklepu oraz w jakie miejsce?");
        questionsManager.add("Gdzie znajduje się Instrukcja Bezpieczeństwa Pożarowego?");
        questionsManager.add("Gdzie znajdują się awaryjne wyłączniki: prądu, zasilania awaryjnego, wentylacji, zaworu wody, gazu i kto jest odpowiedzialny za ich wyłączenie?");
        questionsManager.add("W jakie systemy przeciwpożarowe jest wyposażony Nasz sklep?");
        questionsManager.add("Gdzie znajduje się ROP?");
        questionsManager.add("Gdzie w Twojej strefie (tam gdzie najczęściej pracujesz) znajdują się gaśnice?");
        questionsManager.add("Gdzie znajdują się hydranty zewnętrzne i ile ich posiadamy?");
        questionsManager.add("Gdzie w Twojej strefie (tam gdzie najczęściej pracujesz) znajdują się hydranty?");
        questionsManager.add("Jakiego rodzaju gaśnice posiadamy na sklepie i do czego służą?");
        questionsManager.add("Jakie osoby uczestniczą w procesie/procedurze zarządzania kryzysowego? Opisz ich zadania.");
        questionsManager.add("Czym jest hermetyczność sklepu?");
        questionsManager.add("Jakie obowiązują zasady podczas przyjmowania dostawy? O czym należy pamiętać? Jakie czynności powinny być wykonane? ");
        questionsManager.add("Gdzie znajdziesz schemat Zarządzania Kryzysowego oraz Notatkę z Dziennikarzem?");
        questionsManager.add("Ile osób jednocześnie, może przebywać w naszym sklepie (górna granica)?");
        questionsManager.add("Gdzie wyrzucamy pojemniki po środkach chemicznych?");
        questionsManager.add("Co robisz w przypadku braku prądu? ");


        //create answers list
        answersManager.add("DORADCY SPORTOWI:\n" +
                "- wykonanie Obchodu Bezpieczeństwa Sektora (OBS)\n" +
                "\n" +
                "PRACOWNICY POK:\n" +
                "- uruchomienie zablokowanych kas\n" +
                "\n" +
                "KIEROWNICY DYŻURNI:\n" +
                "- Jeśli sklep był zamknięty dluzej niz 2h stosujemy procedurę zarządzania kryzysowego.\n" +
                "- wraz z ochroniarzem (ewentualnie ze strażą pożarną) sprawdzają sklep. Jezeli wystąpił pożar konieczne jest posiadanie zezwolenia pisemnego od Straży pożarnej na wejście do obiektu\n" +
                "- zamknięcie drzwi ewakuacyjnych\n" +
                "- uruchomienie wszystkich instalacji\n" +
                "- informacja dla klientów kiedy mogą wejść do sklepu\n" +
                "- włączenie oświetlenia\n" +
                "- wpuszczenie pracowników do sklepu\n" +
                "- zaproszenie klientów do sklepu (przeproszenie ich za zaistniała sytuacje)\n" +
                "- sprawozdanie z ewakuacji w explotool\n" +
                "- jeśli jest taka potrzeba wezwanie firm do przeglądu albo naprawy");

        answersManager.add("KOORDYNATOR (Piotr Jarzyński)\n" +
                "- kontakt - czerwony kafelek KRYZYS w explotool.\n" +
                "- tylko on dostaje i przekazuje dalej informacje, by uniknąć zamieszania\n" +
                "\n" +
                "DYŻURNY / DYREKTOR SKLEPU\n" +
                "- Organizuje działania operacyjne\n" +
                "- Informuje koordynatora o zdarzeniu\n" +
                "- W przypadku kontaktów mediów podaje kontakt rzecznika prasowego\n" +
                "\n" +
                "RZECZNIK PRASOWY\n" +
                "- jest osobą kontaktową dla mediów");
        answersManager.add("1. DYŻURNY lub DYREKTOR dzwoni do koordynatora (Piotr Jarzyński).\n" +
                "2. Koordynator (Piotr Jarzyński) organizuje pomoc z Działów Wsparcia (HR, DAF, prawny, handlowy, rozwoju), dyrektora regionalnego, rzecznika prasowego.\n" +
                "3. DYŻURNY lub DYREKTOR otrzymuje wsparcie oraz informacje zwrotną od podmiotów.");
        answersManager.add("- informujesz dziennikarza, że nie jesteś uprawniony do udzielenia jakichkolwiek informacji\n" +
                "- jeżeli dziennikarz upiera się aby przeprowadzić z Tobą wywiad spisujesz wraz z Nim notatkę z kontaktu z dziennikarzem\n" +
                "- prześlij dane kontaktowe, temat lub notatkę do Rzecznika Prasowego (Wojciech Kozłowski)");
        answersManager.add("Jest to możliwość kontaktu z klientami, robiącymi u nas zakupy, szczególnie ważna przy produktach, których\n" +
                "ewentualna wada może wpłynąć na bezpieczeństwo użytkowników (np. rowery, bieżnie).\n" +
                "\n" +
                "Możemy ją uzyskać wyrabiając Kartę Decathlon lub wpisując kontakt do klienta bezpośrednio na kasie.\n" +
                "\n" +
                "Cel to 100%");
        answersManager.add("- niezwłocznie wynieść kartusz w wyznaczone, zacienione, niedostępne dla postronnych miejsce na zewnatrz budynku (najlepiej pomieszczenie z pojemnikami na śmieci) gdzie pojemnik bedzie odłożony do całkowitego jego opróżnienia. Miejsce to musi byc wentylowane aby była cyrkulacja powietrza- do 48h (dni robocze) firma odbiera wadliwy produkt\" - wysłać e-mail: reklamacje@sat.poznan.pl; grzegorz.krawczyk@sat.poznan.pl");
        answersManager.add("Piszemy wiadomość pod adres reach@decathlon.com z zapytaniem o skład produktu.");
        answersManager.add("-przekazuję informację do DYŻURNEGO\n" +
                "-staram się uspokoić rozmowę\n" +
                "-nigdy nie zostaję w pojedynkę z niebezpiecznym / agresywnym klientem\n" +
                "-staram się wycofać z rozmowy");
        answersManager.add("Jedno co musi być zapamiętane to, że napad zawsze jest przemyślanym działaniem, co oznacza, że sprawcy najpierw odwiedzają sklep. Następnie sprawcy zrobią analizę, ocenią ryzyko i opierając się na wnioskach podejmą decyzję czy dokonać napadu.\n" +
                "\n" +
                "Są dwa typu napadów\n" +
                "a. Napad poza godzinami otwarcia sklepu\n" +
                "b. Napad w godzinach otwarcia\n" +
                "\n" +
                "STOSUJ NISKI PROFIL!\n" +
                "-TRZYMAJ GŁOWĘ NISKO, RóB WSZYSTKO CZEGO ZARZĄDA ZŁODZIEJ, ZERO HEROIZMU, NIE OPIERAJ SIĘ ŻĄDANIOM ZŁODZIEJA\n" +
                "-Wszyscy powinni położyć się na ziemię\n" +
                "-Nie wzywaj policji podczas napadu (klienci i pracownicy)\n" +
                "-Zabierz wszystkich z daleka od strefy gdzie ma miejsce napad i zapobiegaj opuszczaniu sklepu przez klientów wyjściami ewakuacyjnymi (alarm drzwi ewakuacyjnych może doprowadzić do paniki przestępców i negatywnych tego konsekwencji).\n" +
                "-NIE WCISKAJ ROPa!\n" +
                "-Złodzieje będą chcieli by zabrać ich do sejfu i będą chcieć go otworzyć, co jest niemożliwe. Więc będzie im trzeba wytłumaczyć, spokojnie, że nie ma możliwości otworzenia sejfu. Nie stawaj im na drodze ale wskaż sygnalizację (brak klucza w sklepie do sejfu) i jasno wytłumacz, że nie masz możliwości otworzenia sejfu.\n" +
                "-Jeżeli złodzieje zapytają o zawartość szafy z pieniędzmi (sejf dyżurny) lub o pieniądze z kas, daj im je bez zwłoki\n" +
                "-Jak tylko przestępcy opuszczą sklep zadzwoń na policję i po karetkę. W tym samym czasie rozpocznij Procedurę ZARZĄDZANIA KRYZYSOWEGO");
        answersManager.add("Atak terrorystyczny jest zaplanowanym działaniem mającym na celu tylko i wyłącznie niesienie ŚMIERCI\n" +
                "ludzi dotkniętych ATAKIEM. Terroryści nie będą żądali żadnych dóbr. Pragną tylko zabijać.\n" +
                "\n" +
                "Co zrobić aby zwiększyć swoje szanse na przeżycie?\n" +
                "Zlokalizuj źródło niebezpieczeństwa i oddal się od niego (UCIEKAJ!)\n" +
                "- Jeśli to możliwe pomóż ukryć się innym\n" +
                "- Staraj się zostać poza polem widzenia terrorystów\n" +
                "- ostrzeż napotkane osoby i poinformuj aby nie zbliżały się do miejsca zagrożenia\n" +
                "\n" +
                "JEŚLI TO MOŻLIWE: UKRYJ SIĘ.\n" +
                "- Zamknij i zabarykaduj drzwi\n" +
                "- Zgaś światło i wyłącz urządzenia wydające dźwięk\n" +
                "- Odsuń się od drzwi i okien a następnie połóż się na podłodze\n" +
                "- Ukryj się za murem, filarem bądź inną osłoną\n" +
                "- Pamiętaj aby wyciszyć dźwięk w telefonie oraz wyłączyć wibracje\n" +
                "\n" +
                "ZAWIADOM ODPOWIEDNIE SŁUŻBY\n" +
                "- Jeżeli nie zagraża Ci bezpośrednie niebezpieczeństwo zadzwoń na 997 lub 112\n" +
                "- Nie biegnij w stronę służb ratunkowych i nie wykonuj gwałtownych ruchów (mogą założy, że jesteś terrorystą)\n" +
                "- Trzymaj otwarte dłonie w górze\n" +
                "\n" +
                "BĄDŹ CZUJNY\n" +
                "- Jeśli jesteś świadkiem podejrzanego zachowania – zawiadom 997 lub 112\n" +
                "- W pomieszczeniach zamkniętych zwracaj uwag, gdzie są wyjścia ewakuacyjne\n" +
                "- Nie rozpowszechniaj informacji o interwencji służ porządkowych\n" +
                "- Nie rozpowszechniaj żadnych niepotwierdzonych informacji w Internecie i na portalach\n" +
                "społecznościowych.");
        answersManager.add("-kontakt ze sklepem wysyłającym\n" +
                "-inwentaryzujemy towar i sprawdzamy czy nie było sprzedaży z ujemnym stanem zapasu\n" +
                "-weryfikacja przesyłki\n" +
                "-ewentualna korekta ilości na minus\n" +
                "\n" +
                "STARAMY SIĘ WYJAŚNIĆ ROZBIEŻNOŚĆ ZE SKLEPEM WYSYŁAJĄCYM");
        answersManager.add("-uspokajam klientów i pracowników na tyle na ile jest to możliwe. Jeżeli jakiś pracownik lub klient wymaga pomocy zabierz go do ustronnego miejsca. Policja powinna przybyć ze specjalną jednostką, która pomaga ofiarom będącym w szoku\n" +
                "-proszę klientów, aby pozostali w sklepie do czasu przybycia policji, jeżeli nie jest to możliwe proszę o pozostawienie ich danych adresowych i numeru telefonu\n" +
                "\n" +
                "W przypadku, gdy kontaktuje się z Tobą prasa, zastosuj PROCEDURĘ ZARZĄDZANIA KRYZYSOWEGO „Kontakt z Mediami”.\n" +
                "Nie udzielaj żadnych informacji.");
        answersManager.add("Mamy 2 stopnie alarmu pożarowego:\n" +
                "\n" +
                "- I stopień (syrena alarmowa) – pozostajemy w gotowości, przewodnicy stref kierują się do swojej strefy, EPI zabiera gaśnice i udaje się do POK, DYŻURNY weryfikuje miejsce wykrycia zagrożenia na centralce PPOŻ.\n" +
                "- II stopień (komunikat głosowy) – rozpoczynamy ewakuację.");
        answersManager.add("Przez zadymienie 1 czujki dymowej.");
        answersManager.add("1. Przez zadymienie 2 czujek dymowych na hali sprzedaży. \n" +
                "2. Przez wciśnięcie ROPa. 3. Przez zadymienie jednej czujki w rozdzielni NN.");
        answersManager.add("1. Kiedy min. 2 czujki dymowe na hali sprzedaży zostaną zadymione\n" +
                "2. Uruchomienie ręczne przez DYŻURNEGO (centrala znajduje się w pomieszczeniu ppoż). 3. Po upływnie 180s od włączenia się II stopnia");
        answersManager.add("PRACOWNIK POK: Pracownik Decathlon, pełniący zmianę na obsłudze kas.\n" +
                "\n" +
                "ALARM I STOPNIA (syrena)\n" +
                "a) Pozostaje w gotowości do ewakuacji.\n" +
                "b) Nie przerywa swojej pracy.\n" +
                "\n" +
                "ALARM II STOPNIA (komunikat głosowy)\n" +
                "- Blokuje informatycznie kasy.\n" +
                "- zabiera listę noproblem, - ewakuuje salę zebrań, pomieszczenia rozliczeń i pomieszczenie przesłuchań;");
        answersManager.add("EPP: Pracownik Decathlon.\n" +
                "\n" +
                "ALARM I STOPNIA (syrena) biegnie do POK z apteczką\n" +
                "ALARM II STOPNIA (komunikat głosowy)\n" +
                "czeka na decyzję kieronika dyżurnego, udziela pomocy poszkodowanym, jeżeli zaistnieje taka konieczność\n" +
                "\n" +
                "UWAGA!!! Jeśli EPP jest Przewodnikiem Strefy to w pierwszej kolejności ewakuuje swoją strefę.");
        answersManager.add("EPI: Pracownik Decathlon po ukończeniu szkolenia i otrzymaniu zaświadczenia.\n" +
                "a) Jeżeli dostrzegł pożar możliwy do ugaszenia przystępuje do akcji gaśniczej.\n" +
                "b) Kontynuje bądź przerywa akcję gaśniczą.\n" +
                "c) Udaje się do Punktu Zbiórki.\n" +
                "d) Potwierdza swoją obecność kier. dyż.\n" +
                "UWAGA!!! Jeśli EPI jest Przewodnikiem Strefy to w pierwszej kolejności\n" +
                "ewakuuje swoją strefę.");
        answersManager.add("PRZEWODNIK STREFY: Pracownik Decathlon oznaczony na tablicy obecności przez KIEROWNIKA DYŻURNEO jako PRZEWODNIK STREFY: I,II,III,IV.\n" +
                "\n" +
                "ALARM I STOPNIA (syrena)\n" +
                "a) Przemieszczają się na swoją strefę.\n" +
                "b) Pozostają w gotowości do ewakuacji.\n" +
                "ALARM II STOPNIA (komunikat głosowy)\n" +
                "a) Dba, aby w wyznaczonej strefie nie pozostał nikt z Klientów ani Pracowników (UWAGA na przymierzalnie oraz antresolę).\n" +
                "b) Wraz z Łącznikiem, jako ostatni opuszcza swoja strefę ewakuacji i przymyka drzwi (ograniczając dostęp tlenu) na zakładkę (aby umożliwić dostęp z zewnątrz dla służb ratowniczych).\n" +
                "c) Udaje się do Punktu Zbiórki.\n" +
                "d) Potwierdza swoją obecność kier. dyz. e) Przekazuje raport Kierownikowi Dyżurnemu na temat ewakuacji swojej strefy.");
        answersManager.add("Najbliższymi drzwiami ewakuacyjnymi do punktu zbiórki ewakuacji, który znajduje się na parkingu (opisz dokładnie). Punkt jest oznaczony zielonym znakiem.");
        answersManager.add("W szafce na ścianie sklepu w SAS (między rozsuwanymi drzwiami wejściowymi).");
        answersManager.add("Osoba odpowiedzialna za wyłączenie: DYŻURNY\n" +
                "Miejsce: rozdzielnia NN\n" +
                "PRZECIWPOŻAROWY WYŁĄCZNIK PRĄDU\n" +
                "Osoba odpowiedzialna za wyłączenie: DYŻURNY\n" +
                "Miejsce: SAS\n" +
                "\n" +
                "PRZECIWPOŻAROWY WYŁĄCZNIK ZASILANIA AWARYJNEGO (UPS)\n" +
                "Osoba odpowiedzialna za wyłączenie: DYŻURNY\n" +
                "Miejsce: SAS\n" +
                "\n" +
                "PRZECIW POŻAROWY WYŁĄCZNIK WENTYLACJI\n" +
                "Osoba odpowiedzialna za wyłączenie: dyżurny\n" +
                "Miejsce: SAS\n" +
                "GŁÓWNY ZAWÓR GAZU\n" +
                "Osoba odpowiedzialna za wyłączenie: dyżurny\n" +
                "Miejsce: Na zewnątrz budynku na ścianie, żółta skrzynka\n" +
                "\n" +
                "GŁÓWNY ZAWÓR WODY\n" +
                "Osoba odpowiedzialna za wyłączenie: dyżurny\n" +
                "Miejsce: obok hydroforni ");
        answersManager.add("-DSO – Dźwiękowy System Ostrzegawczy\n" +
                "-ROP – Ręczny Ostrzegacz Przeciwpożarowy\n" +
                "-PPWP – Przeciwpożarowy Wyłącznik Prądu\n" +
                "-PPWW – Przeciwpożarowy Wyłącznik Wentylacji\n" +
                "-PPWU – Przeciwpożarowy Wyłącznik UPS\n" +
                "-CZUJKI DYMU\n" +
                "-CENTRALA PPOŻ\n" +
                "-ZWOLNIENIE DOSTĘPU DO POMIESZCZEŃ\n" +
                "-AUTOMATYCZNE OTWARCIE DRZWI (SAS)\n" +
                "-RĘCZNE WŁĄCZENIE SYSTEMU ODDYMIANIA\n" +
                "-GŁÓWNY ZAWÓR GAZU\n" +
                "-GŁÓWNY ZAWÓR WODY\n" +
                "-GŁÓWNE WYŁĄCZNIKI PRĄDU\n" +
                "-HYDRANTY WEWNĘTRZNE\n" +
                "-HYDRANTY ZEWNĘTRZNE\n" +
                "-GAŚNICE");
        answersManager.add("przy każdych drzwiach ewakuacyjnych oraz przy POK");
        answersManager.add("??");
        answersManager.add("Posiadamy 4 (obok boiska, wejścia do sklepu, przy wjeździe i obok punktu zbiórki)");
        answersManager.add("rowery, gry, fitness, oxelo, magazyn, social i serwis");
        answersManager.add("PROSZKOWE:\n" +
                "Zaprojektowane dla zabezpieczenia obiektów użyteczności publicznej, pomieszczeń biurowych, produkcyjnych, magazynów, garaży.\n" +
                "\n" +
                "ŚNIEGOWE:\n" +
                "Zaprojektowane z myślą o gaszeniu urządzeń elektronicznych w tym komputerów, rozdzielni i szaf sterowniczych, serwerowni itp.\n" +
                "Gaśnica nie pozostawia śladów użycia środka gaśniczego.");
        answersManager.add("KOORDYNATOR (Piotr Jarzyński)\n" +
                "-Tylko on dostaje i przekazuje dalej informacje, by uniknąć zamieszania\n" +
                "\n" +
                "DYŻURNY/DYREKTOR SKLEPU\n" +
                "-Organizuje działania operacyjne\n" +
                "-Informuje koordynatora o zdarzeniu\n" +
                "-W przypadku kontaktów mediów podaje kontakt rzecznika prasowego\n" +
                "\n" +
                "RZECZNIK PRASOWY\n" +
                "-Jest osobą kontaktową dla mediów");
        answersManager.add("Kiedy klient tylko zadaje pytanie na temat obecności substancji chemicznych i biobójczych w naszych produktach.\n" +
                "Co należy zrobić:\n" +
                "- piszemy wiadomość pod adres reach@decathlon.com z zapytaniem o skład produktu\n" +
                "\n" +
                "Kiedy klient przychodzi z produktem i informacją, że doznał uczulenia po kontakcie z Naszym produktem. Pyta o obecności substancji chemicznych i biobójczych w naszych produktach:\n" +
                "Co należy zrobić:\n" +
                "- BEZWZGLĘDNIE POBIERAMY JEGO DANE KONTAKTOWE (Konto Decathlon - jeżeli posiada, imię i nazwisko, numer telefonu lub email.\n" +
                "-pobieramy pół produktu od klienta drugie pół zostawiamy klientowi (przecinamy koszulkę na pół, zabieramy jednego buta)\n" +
                "-zwracamy należność za produkt klientowi w formie gestu handlowego (preferowana gotówka, NIE STOSUJEMY KART PODARUNKOWYCH)\n" +
                "\n" +
                "-wysyłamy mail na adres reach@decathlon.com z danymi kontaktowymi (numer KSK jeżeli posiada, numer telefonu, adres e-mail, imię, nazwisko, oraz informację jakiego produktu dotyczy alergia i krótki opis sytuacji)\n" +
                "- zapakowaną połowę produktu należy wysłać do centrali z widocznym dopiskiem reakcja alergiczna!\n" +
                "- powiadamiamy dyrektora sklepu\n" +
                "-odpowiedź otrzymujemy w ciągu 45 dni");
        answersManager.add("-przekazuję informację do DYŻURNEGO \n" +
                "-staram się uspokoić rozmowę \n" +
                "-nigdy nie zostaję w pojedynkę z niebezpiecznym / agresywnym klientem \n" +
                "-staram się wycofać z rozmowy");
        answersManager.add("Hermetyczność: produkty sklepowe nie mogą wyjść za strefę poza bramkami antykradzieżowymi bez uregulowania należności na kasie, okazujemy swoją torbę/plecak pracownikowi ochrony/dyżurnemu po zakończeniu pracy, sprawdzanie dostawy, zazbrajanie sklepu w odpowiednich porach;\"");
        answersManager.add("- logistyk własnoręcznie ściąga plombę,\n" +
                "-żaden pracownik Decathlon nie może wchodzić na ciężarówkę,\n" +
                "-kierowca nie może pozostać sam w strefie magazynu,\n" +
                "-kierowca nie może wyjść na halę sprzedaży,\n" +
                "-palety na sklepie rozkładane są pojedynczo,\n" +
                "-palety są przyjmowane w systemie za pomocą aplikacji na smartfonie,\n" +
                "-ilość paczek na palecie jest liczona (stan fizyczny = stan w stores.com).");
        answersManager.add("- na dysku (folder procedury),\n" +
                "-Tablica na w strefie Socjalnej.");
        answersManager.add("650 klientów - wynika to z instrukcji bezpieczeństwa pożarowego. (COVID - 250)");
        answersManager.add("Do przeznaczonych do tego i oznakowanych pojemników na serwisie.");
        answersManager.add("Udaje się do rozdzielni NN na magazynie i sprawdza czy można podnieść główny wyłącznik prądu. Jeżeli nie:\n" +
                "Pozyskuje informację od dostawcy prądu o tym jak długo będzie trwała awaria.\n" +
                "W zależności od czasu przerwy w dostawie prądu:\n" +
                "Przerwa krótka max do 30min- jeżeli widoczność na sklepie jest dobra i na sklepie jest mała liczba klientów można kontynuować eksploatację sklepu (na dworze jest jasno i pogodnie, światło wpadające przez świetliki jest wystarczające do oświetlenia hali sprzedaży) . \n" +
                "Dyżurny informuje dział IT o braku prądu na wypadek przedłużenia się awarii i konieczności wyłączania serwera oraz pozostaje z nimi w kontakcie.\n" +
                "Dyżurny cały czas monitoruje przywrócenie prądu.\n" +
                "Przerwa w dostawie prądu będzie dłuższa niż 30min- dyżurny zarządza cichą ewakuację sklepu:\n" +
                "Kasjerka czyta komunikat o braku prądu na sklepie.\n" +
                "Przewodnicy stref ewakuują klientów\n" +
                "Pracownicy sklepu zbierają się w pokoju wypoczynku i czekają na dalsze instrukcje dyżurnego.\n" +
                "Czynności jakie należy jak najszybciej wykonać:\n" +
                "Kasjerka rozlicza wszystkie kasetki (tylko w przypadku, gdy prądu nie będzie do końca dnia)\n" +
                "Dyżurny informuje helpdesk lub dział IT o konieczności bezpiecznego wyłączenia serwera z powodu braku prądu. (procedura wyłączania serwera)\n");






    }


    public ArrayList<String> getList(int x){

        ArrayList<String> newLstQuestion = questionsManager;
        ArrayList<String> newLstAnswer = answersManager;
        ArrayList<String> output = new ArrayList<>();
        Random rn = new Random();
        int index;
        for (int i = 0; i < x; i++) {
            index = rn.nextInt(newLstQuestion.size());
            output.add(newLstQuestion.get(index));
            output.add(newLstAnswer.get(index));
            newLstQuestion.remove(index);
            newLstAnswer.remove(index);
        }
        return output;
    }
}
