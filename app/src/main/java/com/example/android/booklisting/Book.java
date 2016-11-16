package com.example.android.booklisting;

/**
 * Created by toddskinner on 11/15/16.
 */

public class Book {
    private String mTitle;
    private String mBookCover;
    private String mAuthor;
    private String mDescription;

    public Book (String title, String bookCover, String author, String description){
        mTitle = title;
        mBookCover = bookCover;
        mAuthor = author;
        mDescription = description;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getAuthor(){
        return mAuthor;
    }

    public String getBookCover(){
        return mBookCover;
    }

    public String getDescription() { return mDescription; }
}
