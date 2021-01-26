package com.oxylane.odpytka;

import java.util.ArrayList;
import java.util.Random;

public class Questions {
    ArrayList<String> questionsAll = new ArrayList<>();
    ArrayList<String> answersAll = new ArrayList<>();
    public Questions(){
        questionsAll.add("Skąd będę wiedział, że rozpoczyna się ewakuacja?");
        questionsAll.add("W jaki sposób dowiemy się o zmianie miejsca Punktu Zbiórki w przypadku pożaru w sąsiedztwie budynku, katastrofy lotniczej w obrębie budynku, katastrofy chemicznej itp.? ");
        questionsAll.add("Rozwiń skrót ROP i opisz jego działanie ");
        questionsAll.add("Jakie czynności/zadania należy wykonać przed przywróceniem sklepu do normalnej działalności po ewakuacji?");
        questionsAll.add("Jak należy reagować w przypadku podejrzenia podłożenia ładunku wybuchowego (może to być podejrzana torba, plecak, paczka) w Naszym sklepie? ");
        questionsAll.add("Co zrobisz w przypadku kontaktu z mediami (dziennikarz prosi Ciebie o udzielenie informacji drogą mailową, telefoniczną lub bezpośrednio)?");
        questionsAll.add("Co zrobić w przypadku wykrycia wadliwych kartuszy z gazem?");
        questionsAll.add("Co to jest identyfikowalność, dlaczego jest ważna i jaki mamy cel?");
        questionsAll.add("Opisz procedurę REACH, gdy klient zadaje pytanie na temat obecności substancji chemicznych i biobójczych w naszych produktach.");
        questionsAll.add("Co zrobię kiedy mam do czynienia z niebezpiecznym / agresywnym klientem?");
        questionsAll.add("Jak zachować się podczas napadu?");
        questionsAll.add("Jak zachować się podczas ataku terrorystycznego?");
        questionsAll.add("Co robię kiedy zauważę, że klient kradnie produkt, bądź ściąga zabezpieczenie?");
        questionsAll.add("Co zrobię gdy widzę mdlejącą osobę, wypadek?");
        questionsAll.add("Co to jest PBS i jak często powinien być robiony oraz za pomocą jakiego narzędzia?");
        questionsAll.add("Kiedy możesz wejść na halę sprzedaży, gdy sklep nie jest jeszcze otwarty dla klientów?");
        questionsAll.add("Co zawiera się w Obchodzie Bezpieczeństwa Sektora (OBS) i w jakim narzędziu należy go wykonać?");
        questionsAll.add("Dlaczego obsługując klientów na kasach zawsze sprawdzamy kompletność i spójność rozmiarów produktów?");
        questionsAll.add("Dlaczego, każdy pracownik pracuje na swoim loginie i wylogowuje się z komputerów?");
        questionsAll.add("Dlaczego etykiety nie mogą być dostępne dla klientów? Co należy zrobić z wydrukowanymi etykietami?");
        questionsAll.add("Jak postępować w przypadku paczki międzysklepowej (intermag) wysłanej z rozbieżnościami?");
        questionsAll.add("Co musisz zrobić niezwłocznie po napadzie?");
        questionsAll.add("Ile stref ewakuacji posiadamy?");
        questionsAll.add("Co muszę zrobić gdy kończę zmianę lub schodzę na przerwę i jestem przewodnikiem strefy?");
        questionsAll.add("Jaka jest rola pracownika POK podczas EWAKUACJI?");
        questionsAll.add("Jaka jest rola EPP podczas EWAKUACJI?");
        questionsAll.add("Jaka jest rola ŁĄCZNIKA podczas EWAKUACJI i kto może nim być?");
        questionsAll.add("Jaka jest rola EPI podczas ewakuacji?");
        questionsAll.add("Jaka jest rola przewodników stref (I, II, III, IV,)?");
        questionsAll.add("Którędy ewakuujemy się ze sklepu oraz w jakie miejsce?");
        questionsAll.add("Gdzie znajduje się ROP?");
        questionsAll.add("Gdzie w Twojej strefie (tam gdzie najczęściej pracujesz) znajdują się gaśnice? ");
        questionsAll.add("Gdzie w Twojej strefie (tam gdzie najczęściej pracujesz) znajdują się hydranty?");
        questionsAll.add("Opisz procedurę REACH, kiedy ją stosujemy?");
        questionsAll.add("Co zrobię kiedy mam do czynienia z niebezpiecznym / agresywnym klientem?");
        questionsAll.add("Jak dostać się awaryjnie do POMIESZCZENIA ROZLICZEŃ?");
        questionsAll.add("Kto wpuszcza pracowników przez drzwi ewakuacyjne nr 3 (drzwi dla personelu) przed otwarciem sklepu?");
        questionsAll.add("Kiedy należy wykonać OBS?");
        questionsAll.add("Czym jest hermetyczność sklepu?");
        questionsAll.add("Jakie obowiązują zasady podczas przyjmowania dostawy? O czym należy pamiętać? Jakie czynności powinny być wykonane?");
        questionsAll.add("Dlaczego każda szafka pracownicza musi być zamykana na klucz?");
        questionsAll.add(" Ile dni ma klient na zwrot sprzętu ochrony indywidualnej (kask, sprzęt wspinaczkowy)?");
        questionsAll.add("W jaki sposób odbywa się transport kasetki z pieniędzmi z linii kas do sejfu?");
        questionsAll.add("Ile pieniędzy powinno się maksymalnie znajdować w kasetce na kasie? Co zrobić z nadmiarem pieniędzy w kasetce?");
        questionsAll.add("Jak się zachowasz, gdy usłyszysz, że w sklepie jest napad? Dzwonisz po pomoc?");
        questionsAll.add("O czym mówi zasada NISKIEGO PROFILU?");
        questionsAll.add("Wymień różnice pomiędzy procedurami NAPAD-ATAK TERRORYSTYCZNY - ATAK BOMBOWY. ");

        answersAll.add("");
    }


    public ArrayList<String> getList(int x){

        ArrayList<String> newLst = questionsAll;
        ArrayList<String> output = new ArrayList<>();
        Random rn = new Random();
        int index;
        for (int i = 0; i < x; i++) {
            index = rn.nextInt(newLst.size());
            output.add(newLst.get(index));
            newLst.remove(index);
        }
        return output;
    }

}
