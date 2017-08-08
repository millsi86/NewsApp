package com.example.android.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by tom.mills-mock on 07/08/2017.
 */

public class ArticleLoader extends AsyncTaskLoader<List<Article>> {

    // Tag for log messages
    private static final String LOG_TAG = ArticleLoader.class.getName();

    // Query URL
    private String mUrl;

    public ArticleLoader(Context context, String Url) {
        super(context);
        mUrl = Url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Article> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<Article> articles = QueryUtils.fetchArticleData(mUrl);
        return articles;

    }
}
