package com.example.android.newsapp;

/**
 * Created by tom.mills-mock on 03/08/2017.
 * An {@link Article} object contains information related to a single article
 */

public class Article {

    /**
     * Title of Article
     */
    private String mTitle;

    /**
     * Section that the Article is part of
     */
    private String mSection;

    /**
     * Author of Article
     */
    private String mAuthor;

    /**
     * Date of Article Publication
     */
    private String mDate;

    /**
     * Website URL of the Article
     */
    private String mUrl;

    /**
     * Constructs a new {@link Article} object
     *
     * @param Title   is the title of the Article
     * @param Section is the section that the Article is in
     * @param Author  is the Author of the Article
     * @param Date    is the publication date of the Article
     * @param url     is the website URL for the full Article
     */

    public Article(String Title, String Section, String Author, String Date, String url) {
        mTitle = Title;
        mSection = Section;
        mAuthor = Author;
        mDate = Date;
        mUrl = url;
    }

    /**
     * * @return of all Article Item queries
     */
    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

}
