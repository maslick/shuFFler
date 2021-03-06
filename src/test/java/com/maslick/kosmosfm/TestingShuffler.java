package com.maslick.kosmosfm;

import com.maslick.kosmosfm.shuffler.Shuffler;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by maslick on 11/06/16.
 */
public class TestingShuffler {

    @Test
    @Ignore
    public void loopOverDir() throws Exception {
        Shuffler sh = new Shuffler();
        sh.setResourceDir("/Users/maslick/pmaslov/HOME/sandbox/shuffler/resources/");
        sh.saveToDb();
    }

    @Test
    @Ignore
    public void createPlaylistWithEverything() throws Exception {
        Shuffler sh = new Shuffler();
        sh.setResourceDir("/Users/maslick/pmaslov/HOME/sandbox/shuffler/resources/");
        sh.setOutputDir("/Users/maslick/pmaslov/HOME/sandbox/shuffler/resources/hello");
        sh.createPlaylist();
    }

    @Test
    @Ignore
    public void createPlaylistWithRhythm() throws Exception {
        Shuffler sh = new Shuffler();
        sh.setResourceDir("/Users/maslick/pmaslov/HOME/sandbox/shuffler/resources/");
        for(int i=1;i<=5;i++) {
            sh.setOutputDir("/Users/maslick/pmaslov/HOME/sandbox/shuffler/resources/" + i);
            sh.createPlaylistWithRhythm(Integer.toString(i));
        }
    }
}
