package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();



        for (int i = 0; i <n ; i++) {
            String[] song = scanner.nextLine().split("_");
            String typeList = song[0];
            String name = song[1];
            String time = song[2];

            Song song1 = new Song(typeList,name,time);
            songs.add(song1);
        }
        String typeList = scanner.nextLine();

            if (typeList.equals("all")){
                for (Song song : songs) {
                    System.out.println(song.getName());
                }
            }else {
                for (Song song : songs) {
                    if (song.getTypeList().equals(typeList)){
                        System.out.println(song.getName());
                    }

            }

        }

    }
}
