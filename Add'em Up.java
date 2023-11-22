import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);

        // Lire le nombre de cartes
        int N = Integer.parseInt(scanner.nextLine());

        // Lire les valeurs des cartes et les ajouter à une file de priorité
        PriorityQueue<Integer> cards = new PriorityQueue<>();
        for (String s : scanner.nextLine().split(" ")) {
            cards.add(Integer.parseInt(s));
        }

        // Variable pour stocker le coût total
        int totalCost = 0;

        // Tant qu'il y a plus d'une carte dans la file de priorité
        while (cards.size() > 1) {
            // Extraire les deux cartes de la plus faible valeur
            int card1 = cards.poll();
            int card2 = cards.poll();

            // Calculer le coût de la fusion
            int cost = card1 + card2;

            // Ajouter le coût total
            totalCost += cost;

            // Ajouter la nouvelle carte à la file de priorité
            cards.add(cost);
        }

        // Afficher le coût total
        System.out.println(totalCost);
    }
    
}