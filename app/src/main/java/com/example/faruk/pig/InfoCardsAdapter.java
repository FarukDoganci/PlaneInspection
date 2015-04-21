//package com.example.faruk.pig;
//
//import java.util.List;
//
//import android.content.Context;
//import android.view.View;
//import android.view.ViewGroup;
//import com.example.faruk.pig.*;
//
//import com.google.android.glass.app.Card;
//import com.google.android.glass.widget.CardScrollAdapter;
//
//public class InfoCardsAdapter extends CardScrollAdapter {
//    private List<InfoCard> mCards;
//    private Context context;
//
//    public InfoCardsAdapter(Context context, List<InfoCard> mCards) {
//        this.context = context;
//        this.mCards = mCards;
//    }
//
//    @Override
//    public int getPosition(Object item) {
//        return mCards.indexOf(item);
//    }
//
//    @Override
//    public int getCount() {
//        return mCards.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return mCards.get(position);
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        Card card = new Card(context);
//
//        InfoCard mc = mCards.get(position);
//
//        // Card text
//        if (mc.getText() != null)
//            card.setText(mc.getText());
//
//        // Card footer note
//        if (mc.getFooterText() != null)
//            card.setFootnote(mc.getFooterText());
//
//        // Set image layout
//        if (mc.getImgLayout() != null)
//            card.setImageLayout(mc.getImgLayout());
//
//        // loop and set card images
//        for(int img : mc.getImages()){
//            card.addImage(img);
//        }
//
//        return card.getView();
//    }
//
//
//
//}
