package ObjectsAndClassesExercise.Articles2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Articles2> articles = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(", ");
            String title = input[0];
            String content = input[1];
            String author = input[2];

            Articles2 article = new Articles2(title, content, author);
            articles.add(article);
        }

        String command = scanner.nextLine();

        switch (command) {
            case "title":
                articles.sort(Comparator.comparing(Articles2::getTitle));
                break;
            case "content":
                articles.sort(Comparator.comparing(Articles2::getContent));                break;
            case "author":
                articles.sort(Comparator.comparing(Articles2::getAuthor));
                break;
        }
        System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
    }
}
