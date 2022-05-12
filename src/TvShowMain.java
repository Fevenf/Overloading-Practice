import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList <TvShow> tvShows = new ArrayList <TvShow> ();
        tvShows.add(new TvShow("Harry Poter"));
        tvShows.add(new TvShow());
        tvShows.add(new TvShow(10, "Vampire"));
        tvShows.add(new TvShow("Vampire",10, "Drama"));

        while (true) {
            System.out.println("Entering nothing will stop the loop: ");
            System.out.println("Name of the show: ");
            String nameShow = scanner.nextLine();
            if (nameShow.isBlank()) {
                break;
            }
            System.out.println("How many episodes?");
            int numberEpisodes = Integer.parseInt(scanner.nextLine());

            System.out.println("What is the genre?");
            String genre = scanner.nextLine();

            TvShow input = new TvShow(nameShow, numberEpisodes, genre);
            tvShows.add(input);
        }
        for (int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i).toString());
        }
        
    }
}


