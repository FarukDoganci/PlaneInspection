package com.example.faruk.pig;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.google.android.glass.widget.CardBuilder;
import com.google.android.glass.widget.CardScrollAdapter;
import com.google.android.glass.widget.CardScrollView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Faruk Doganci, Marc Fink, Marco Mancuso
 *         This activity stores information for step two.
 *         In this version, step three to step fourteen is not implemented.
 *         If you want to implement the info function for other steps,
 *         you have to create more activities (e.g. class InfoStepTwo).
 */
public class InfoStepTwo extends Activity {

    private List<CardBuilder> iCards;
    private CardScrollView iCardScrollView;
    private ExampleCardScrollAdapter iAdapter;


    protected void onCreate(Bundle savedInstanceState) {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        super.onCreate(savedInstanceState);

        createCards();

        iCardScrollView = new CardScrollView(this);
        iAdapter = new ExampleCardScrollAdapter();
        iCardScrollView.setAdapter(iAdapter);
        iCardScrollView.activate();
        setContentView(iCardScrollView);

    }

    // creates Cards with "images" and "text" for the info function at step two
    // in this version only three components
    private void createCards() {
        iCards = new ArrayList<CardBuilder>();


        iCards.add(new CardBuilder(this, CardBuilder.Layout.CAPTION)
                .setText("Radome and latches")
                .addImage(R.drawable.radomeandlatches));


        iCards.add(new CardBuilder(this, CardBuilder.Layout.CAPTION)
                .setText("TAT probes")
                .addImage(R.drawable.tatprobes));

        iCards.add(new CardBuilder(this, CardBuilder.Layout.CAPTION)
                .setText("Ground Electrical Power Panel")
                .addImage(R.drawable.groundelectricalpowerpanel));

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
        public int getItemViewType(int position) {
            return iCards.get(position).getItemViewType();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return iCards.get(position).getView(convertView, parent);
        }
    }
}
