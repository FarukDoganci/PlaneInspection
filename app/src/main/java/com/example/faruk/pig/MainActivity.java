package com.example.faruk.pig;

// Basic Android libraries

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.google.android.glass.widget.CardBuilder;
import com.google.android.glass.widget.CardScrollAdapter;
import com.google.android.glass.widget.CardScrollView;

import java.util.ArrayList;
import java.util.List;

// Specific Glass libraries for gesture detection


public class MainActivity extends Activity implements OnItemClickListener {

    // Define tag for debugging
    private static final String TAG = "MyActivity";

    //infocards
    private List<CardBuilder> iCards;

    // List of cards
    private List<CardBuilder> mCards;

    // ScrollView for holding cards
    private CardScrollView mCardScrollView;

    // Current card selected
    private int currentCard = -1;

    private List<StepsToCheck> mTaskList;
    private ExampleCardScrollAdapter mAdapter;

    private ExampleCardScrollAdapter adapter;
    private CardScrollView iCardScrollView;
    private ExampleCardScrollAdapter iAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Create the cards
        createCards();

        // Instantiate and set
        mCardScrollView = new CardScrollView(this);
        adapter = new ExampleCardScrollAdapter();

        mCardScrollView.setAdapter(adapter);
        mCardScrollView.setOnItemClickListener(this);

        mCardScrollView.activate();


        // Set CardScrollView as content view
        setContentView(mCardScrollView);

    }

    // Instantiate ToDoListManager and get list
    private void createCards() {


        mCards = new ArrayList<CardBuilder>();
        CheckingStepManager listManager = new CheckingStepManager();

        mTaskList = listManager.getToDoList();

        CardBuilder card = null;

        int sizeList = mTaskList.size();

        // For all the cards
        for (int i = 0; i < sizeList; i++) {



            if (i == 0) {
                card = new CardBuilder(this, CardBuilder.Layout.TITLE)
                        .addImage(R.drawable.title);

            } else if (i == 3) {
                card = new CardBuilder(this, CardBuilder.Layout.COLUMNS)
                        .addImage(R.drawable.image1);

            } else if (i == 5) {
                card = new CardBuilder(this, CardBuilder.Layout.COLUMNS)
                        .addImage(R.drawable.image2);

            } else if (i == 7) {
                card = new CardBuilder(this, CardBuilder.Layout.COLUMNS)
                        .addImage(R.drawable.image3);

            } else if (i == 9) {
                card = new CardBuilder(this, CardBuilder.Layout.COLUMNS)
                        .addImage(R.drawable.image1);

            } else if (i == 11) {
                card = new CardBuilder(this, CardBuilder.Layout.COLUMNS)
                        .addImage(R.drawable.image1);

            } else if (i == 13) {
                card = new CardBuilder(this, CardBuilder.Layout.COLUMNS)
                        .addImage(R.drawable.image1);

            } else if (i == 14) {
                card = new CardBuilder(this, CardBuilder.Layout.COLUMNS)
                        .addImage(R.drawable.image1);

            } else if (i == 16) {
                card = new CardBuilder(this, CardBuilder.Layout.COLUMNS)
                        .addImage(R.drawable.image1);

            } else if (i == 18) {
                card = new CardBuilder(this, CardBuilder.Layout.COLUMNS)
                        .addImage(R.drawable.image1);

            } else if (i == 20) {
                card = new CardBuilder(this, CardBuilder.Layout.COLUMNS)
                        .addImage(R.drawable.image1);

            } else if (i == 21) {
                card = new CardBuilder(this, CardBuilder.Layout.COLUMNS)
                        .addImage(R.drawable.image1);

            } else if (i == 23) {
                card = new CardBuilder(this, CardBuilder.Layout.COLUMNS)
                        .addImage(R.drawable.image1);

            } else if (i == 25) {
                card = new CardBuilder(this, CardBuilder.Layout.COLUMNS)
                        .addImage(R.drawable.image1);

            } else if (i == 27) {
                card = new CardBuilder(this, CardBuilder.Layout.COLUMNS)
                        .addImage(R.drawable.image1);

            } else {
                card = new CardBuilder(this, CardBuilder.Layout.TEXT_FIXED);
            }


            if (i == 2) {
                card = new CardBuilder(this, CardBuilder.Layout.EMBED_INSIDE)

                        .setEmbeddedLayout(R.layout.imageview);
                mCards.add(card);
            } else {
                card.setText(mTaskList.get(i).getTask());
                // Set in the arrayList
                mCards.add(card);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        // Create options from "/res/menu/main.xml"
        getMenuInflater().inflate(R.menu.main, menu);


        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        // Get id for detect what item was selected
        int id = item.getItemId();

        switch (id) {

            case R.id.settings_1: // Do something for setting 1
                // Remove currentCard
                mTaskList.remove(currentCard);
                mCards.remove(currentCard);    // Remove the current card selected from the list of Cards
                adapter.notifyDataSetChanged(); // Notify the adapter that needs to update the data
                break;

            case R.id.settings_2:
//                show content (but as xml and not card)
                // starts the class SecondActivity --> immersion cards
                startActivity(new Intent(MainActivity.this, SecondActivity.class));

//                mCards.add(new CardBuilder(this,CardBuilder.Layout.TEXT)
//                .addImage(R.drawable.image1)
//                .setText(R.string.app_name)); hängt Karte an die Checksteps ran!
//
//                createInfoCards();
//
//                iCardScrollView = new CardScrollView(this);
//                iAdapter = new ExampleCardScrollAdapter();
//                iCardScrollView.setAdapter(iAdapter);
//                iCardScrollView.activate();
//                setContentView(iCardScrollView);


                break;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Faruks Tests
     * private void createInfoCards() {
     * iCards = new ArrayList<CardBuilder>();
     * <p/>
     * iCards.add(new CardBuilder(this, CardBuilder.Layout.TITLE)
     * .addImage(R.drawable.image1)
     * .setText("Fuselage Map"));
     * <p/>
     * iCards.add(new CardBuilder(this, CardBuilder.Layout.TEXT)
     * .setText(String.format(this.getResources().getString(R.string.app_name))));
     * <p/>
     * }*
     */
    @Override
    public void onResume() {
        super.onResume();

        adapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {
        // TODO Auto-generated method stub

        // Set current Card for menu option handle
        currentCard = position;

        if (currentCard > 2) {
            openOptionsMenu();

        }
    }

    // Class to manage CardScrollView
    private class ExampleCardScrollAdapter extends CardScrollAdapter {

        @Override
        public int getPosition(Object item) {

            return mCards.indexOf(item);
        }

        @Override
        public int getCount() {

            return mCards.size();
        }

        @Override
        public Object getItem(int position) {

            return mCards.get(position);
        }

        @Override
        public int getViewTypeCount() {

            return CardBuilder.getViewTypeCount();
        }

        @Override
        public int getItemViewType(int position) {

            return mCards.get(position).getItemViewType();
        }

        public View getView(int position, View convertView,
                            ViewGroup parent) {

            return mCards.get(position).getView(convertView, parent);
        }
    }

}