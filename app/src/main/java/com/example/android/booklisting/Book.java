package com.example.android.booklisting;

/**
 * Created by toddskinner on 11/15/16.
 */

public class Book {
    private String mTitle;
    private String mBookCover;
    private String mAuthor;
    private String mDescription;
    private String mInfoLink;

    public Book (String title, String bookCover, String author, String description, String infoLink){
        mTitle = title;
        mBookCover = bookCover;
        mAuthor = author;
        mDescription = description;
        mInfoLink = infoLink;
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

    public String getInfoLink() { return mInfoLink; }
}
