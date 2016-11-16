package com.example.android.booklisting;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by toddskinner on 11/15/16.
 */

public class BookLoader extends AsyncTaskLoader <List<Book>> {
    private String mUrl;

    /**
     * Constructs a new {@link BookLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public BookLoader(Context context, String url){
        super(context);
        mUrl = url;
    }

    //call forceLoad() which is a required step to actually trigger the loadInBackground() method to execute.
    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<Book> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        return QueryUtils.fetchBookData(mUrl);
    }
}
