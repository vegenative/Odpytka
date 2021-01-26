package com.oxylane.odpytka;

import java.util.ArrayList;
import java.util.Random;

public class QuestionsManager {
    ArrayList<String> questionsManager = new ArrayList<>();
    ArrayList<String> answersManager = new ArrayList<>();
    public QuestionsManager(){

        //create questions list

        questionsManager.add("Jakie czynności/zadania należy wykonać przed przywróceniem sklepu do normalnej działalności po ewakuacji?");
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

    }


    public ArrayList<String> getList(int x){

        ArrayList<String> newLst = questionsManager;
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
