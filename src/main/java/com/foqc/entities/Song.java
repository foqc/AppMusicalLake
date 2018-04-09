package com.foqc.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author foqc
 */
public class Song {

    private final Frog f = new Frog();
    private final Criket c = new Criket();
    private final DragonFly d = new DragonFly();
    private final List<List<String>> songs = new ArrayList<>();

    public Song() {
        makeSong();
    }

    private void makeSong() {
        List<String> song1 = new ArrayList<>();
        song1.add(f.makeSound(0));
        song1.add(d.makeSound(0));
        song1.add(c.makeSound(0));
        song1.add(f.makeSound(2));
        songs.add(song1);

        List<String> song2 = new ArrayList<>();
        song2.add(d.makeSound(2));
        song2.add(f.makeSound(1));
        song2.add(c.makeSound(1));
        song2.add(f.makeSound(3));
        songs.add(song2);

        List<String> song3 = new ArrayList<>();
        song3.add(c.makeSound(2));
        song3.add(d.makeSound(1));
        song3.add(c.makeSound(0));
        song3.add(f.makeSound(2));
        songs.add(song3);
    }

    public String listenSong(String sound) {
        String r = "";
        for (int i = 0; i < this.songs.size(); i++) {
            int a = soundPosition(this.songs.get(i), sound) + 1;
            if (a > 0) {
                r = sing(this.songs.get(i), a);
            }
        }
        return r;
    }

    private int soundPosition(List<String> song, String sound) {
        int pos = -1, i = 0;
        while (pos != i && i < song.size()) {
            if (song.get(i).equals(sound)) {
                pos = i;
            }
            i++;
        }
        return pos;
    }

    private String sing(List<String> song, int start) {
        StringBuilder r = new StringBuilder();
        for (int i = start; i < song.size(); i++) {
            if (i != song.size() - 1) {
                r.append(song.get(i)).append(", ");
            } else {
                r.append(song.get(i));
            }
        }
        return r.toString();
    }

}
