package com.example.faruk.pig;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.google.android.glass.widget.CardBuilder;
import com.google.android.glass.widget.CardScrollAdapter;
import com.google.android.glass.widget.CardScrollView;

import java.util.ArrayList;
import java.util.List;

/**
 * This Class is a Second Activity for the Info button
 * An {@link Activity} showing a tuggable "Hello World!" card.
 * <p/>
 * The main content view is composed of a one-card {@link CardScrollView} that provides tugging
 * feedback to the user when swipe gestures are detected.
 * If your Glassware intends to intercept swipe gestures, you should set the content view directly
 * and use a {@link com.google.android.glass.touchpad.GestureDetector}.
 *
 * @see <a href="https://developers.google.com/glass/develop/gdk/touch">GDK Developer Guide</a>
 */
public class InfoStepTwo extends Activity {

    private List<CardBuilder> iCards;
    private CardScrollView iCardScrollView;
    private ExampleCardScrollAdapter iAdapter;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createCards();

        iCardScrollView = new CardScrollView(this);
        iAdapter = new ExampleCardScrollAdapter();
        iCardScrollView.setAdapter(iAdapter);
        iCardScrollView.activate();
        setContentView(iCardScrollView);
    }

    private void createCards() {
        iCards = new ArrayList<CardBuilder>();



        iCards.add(new CardBuilder(this, CardBuilder.Layout.CAPTION)
                .setText("Radome and latches")
                .addImage(R.drawable.radomeandlatches));


        iCards.add(new CardBuilder(this, CardBuilder.Layout.CAPTION)
                .setText("TAT probes")
                .addImage(R.drawable.tatprobes));

        iCards.add(new CardBuilder(this, CardBuilder.Layout.CAPTION)
                .setText("AOA 1 probe")
                .addImage(R.drawable.groundelectricalpowerpanel));

    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }

    private class ExampleCardScrollAdapter extends CardScrollAdapter {

        @Override
        public int getPosition(Object item) {
            return iCards.indexOf(item);
        }

        @Override
        public int getCount() {
            return iCards.size();
        }

        @Override
        public Object getItem(int position) {
            return iCards.get(position);
        }

        @Override
        public int getViewTypeCount() {
            return CardBuilder.getViewTypeCount();
        }

        @Override
        public int getItemViewType(int position){
            return iCards.get(position).getItemViewType();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return iCards.get(position).getView(convertView, parent);
        }
    }
}
