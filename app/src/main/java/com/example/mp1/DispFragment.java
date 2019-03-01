package com.example.mp1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 */

public class DispFragment extends Fragment {

    private static final String[] WORDS ={"Trumpet", "French Horn", "Snare Drum", "Trombone", "Tuba", "Clarinet", "Flute", "Oboe", "Saxophone", "Bassoon", "Slide Whistle", "Timpani"};
    private static final int[] gridViewAudioId = {
            R.raw.trumpet,
            R.raw.frenchhorn,
            R.raw.snaredrum,
            R.raw.trombone,
            R.raw.tuba1,
            R.raw.clarinet,
            R.raw.flute,
            R.raw.oboe,
            R.raw.saxophone,
            R.raw.bassoon,
            R.raw.slidewhistle,
            R.raw.timpani
    };

    public static MediaPlayer mediaPlayer1;
    View myView;
    ImageView imv;

    public DispFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_disp, container, false);
        imv= (ImageView) myView.findViewById(R.id.myimg);

        return myView;
    }

    void setImage(String word){

        if (word.equals(WORDS[0])) {
            imv.setImageResource(R.drawable.trumpet);
            if (mediaPlayer1 != null) {
                mediaPlayer1.stop();
                mediaPlayer1.release();
                mediaPlayer1 = null;
            }

            mediaPlayer1 = MediaPlayer.create(getContext(), R.raw.trumpet);
            mediaPlayer1.start();
        }

        else if (word.equals(WORDS[1])) {
            imv.setImageResource(R.drawable.frenchhorn);
            if (mediaPlayer1 != null) {
                mediaPlayer1.stop();
                mediaPlayer1.release();
                mediaPlayer1 = null;
            }

            mediaPlayer1 = MediaPlayer.create(getContext(), R.raw.frenchhorn);
            mediaPlayer1.start();
        }

        else if (word.equals(WORDS[2])) {
            imv.setImageResource(R.drawable.snaredurm);
            if (mediaPlayer1 != null) {
                mediaPlayer1.stop();
                mediaPlayer1.release();
                mediaPlayer1 = null;
            }

            mediaPlayer1 = MediaPlayer.create(getContext(), R.raw.snaredrum);
            mediaPlayer1.start();
        }

        else if (word.equals(WORDS[3])) {
            imv.setImageResource(R.drawable.trombone);
            if (mediaPlayer1 != null) {
                mediaPlayer1.stop();
                mediaPlayer1.release();
                mediaPlayer1 = null;
            }

            mediaPlayer1 = MediaPlayer.create(getContext(), R.raw.trombone);
            mediaPlayer1.start();
        }

        else if (word.equals(WORDS[4])) {
            imv.setImageResource(R.drawable.tuba);
            if (mediaPlayer1 != null) {
                mediaPlayer1.stop();
                mediaPlayer1.release();
                mediaPlayer1 = null;
            }
            mediaPlayer1 = MediaPlayer.create(getContext(), R.raw.tuba1);
            mediaPlayer1.start();
        }

        else if (word.equals(WORDS[5])) {
            imv.setImageResource(R.drawable.clarinet);
            if (mediaPlayer1 != null) {
                mediaPlayer1.stop();
                mediaPlayer1.release();
                mediaPlayer1 = null;
            }
            mediaPlayer1 = MediaPlayer.create(getContext(), R.raw.clarinet);
            mediaPlayer1.start();
        }

        else if (word.equals(WORDS[6])) {
            imv.setImageResource(R.drawable.flute);
            if (mediaPlayer1 != null) {
                mediaPlayer1.stop();
                mediaPlayer1.release();
                mediaPlayer1 = null;
            }
            mediaPlayer1 = MediaPlayer.create(getContext(), R.raw.flute);
            mediaPlayer1.start();
        }

        else if (word.equals(WORDS[7])) {
            imv.setImageResource(R.drawable.oboe);
            if (mediaPlayer1 != null) {
                mediaPlayer1.stop();
                mediaPlayer1.release();
                mediaPlayer1 = null;
            }
            mediaPlayer1 = MediaPlayer.create(getContext(), R.raw.oboe);
            mediaPlayer1.start();
        }

        else if (word.equals(WORDS[8])) {
            imv.setImageResource(R.drawable.saxophone);
            if (mediaPlayer1 != null) {
                mediaPlayer1.stop();
                mediaPlayer1.release();
                mediaPlayer1 = null;
            }
            mediaPlayer1 = MediaPlayer.create(getContext(), R.raw.saxophone);
            mediaPlayer1.start();
        }

        else if (word.equals(WORDS[9])) {
            imv.setImageResource(R.drawable.bassoon);
            if (mediaPlayer1 != null) {
                mediaPlayer1.stop();
                mediaPlayer1.release();
                mediaPlayer1 = null;
            }
            mediaPlayer1 = MediaPlayer.create(getContext(), R.raw.bassoon);
            mediaPlayer1.start();
        }

        else if (word.equals(WORDS[10])) {
            imv.setImageResource(R.drawable.slidewhistle);
            if (mediaPlayer1 != null) {
                mediaPlayer1.stop();
                mediaPlayer1.release();
                mediaPlayer1 = null;
            }
            mediaPlayer1 = MediaPlayer.create(getContext(), R.raw.slidewhistle);
            mediaPlayer1.start();
        }

        else if (word.equals(WORDS[11])) {
            imv.setImageResource(R.drawable.timpani);
            if (mediaPlayer1 != null) {
                mediaPlayer1.stop();
                mediaPlayer1.release();
                mediaPlayer1 = null;
            }
            mediaPlayer1 = MediaPlayer.create(getContext(), R.raw.timpani);
            mediaPlayer1.start();
        }
    }
}
