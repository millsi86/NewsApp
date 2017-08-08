package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tom.mills-mock on 03/08/2017.
 * <p>
 * An {@link ArticleAdapter} knows how to create a list item layout for each earthquake
 * in the data source (a list of {@link Article} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */

public class ArticleAdapter extends ArrayAdapter<Article> {

    /**
     * @param context  of the app
     * @param articles is a list of articles, which is the data source of the adapter
     */

    public ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the Article at the given position in the list of Articles
        Article currentArticle = getItem(position);

        // Find the TextView with the ID Title and set the Title text
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(currentArticle.getTitle());

        // Find the TextView with the ID Section and set the Section text
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        sectionView.setText(currentArticle.getSection());

        // Find the TextView with the ID Author and set the Author text
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        authorView.setText(currentArticle.getAuthor());

        // Find the TextView with the ID Date and set the Date text
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        String formattedDate = formatDate(currentArticle.getDate());
        dateView.setText(formattedDate);

        return listItemView;
    }

    @NonNull
    private String formatDate(String date) {
        return date.substring(0, Math.min(date.length(), 10));
    }
}
