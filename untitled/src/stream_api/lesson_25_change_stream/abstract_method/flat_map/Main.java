package stream_api.lesson_25_change_stream.abstract_method.flat_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Singer singer1= new Singer("Scorpions", new String[] {"Wind of Change","Rock You Like A Hurricane" });
        Singer singer2 = new Singer("AC -DC", new String[] {"Highway to Hell","Thunderstruck"});
        Singer singer3 = new Singer("Beatles", new String[] {"Help", "Something"});
        Singer[] rockStars = new Singer[] {singer1, singer2,singer3 };
        List<String> song = Arrays.stream(rockStars)
                .flatMap(n-> Arrays.stream(n.getSongs()))
                .collect(Collectors.toList());
        System.out.println(song);
    }
}

class Singer {
    private String name;
    private String[] songs;

    public Singer(String name, String[] songs){
        super();
        this.name = name;
        this.songs = songs;
    }

    public String[] getSongs() {
        return songs;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Singer" + name +" "+songs+":" + Arrays.toString(songs);
    }
}
