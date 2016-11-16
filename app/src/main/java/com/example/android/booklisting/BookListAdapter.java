package com.example.android.booklisting;

import android.app.Activity;
import android.content.Context;
import android.media.ImageReader;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.bitmap;

/**
 * Created by toddskinner on 11/15/16.
 */

public class BookListAdapter extends ArrayAdapter<Book> {
    private Context mCon;

    public BookListAdapter(Activity context, ArrayList<Book> books){
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book, parent, false);
        }

        final Book currentBook = getItem(position);

        ImageView bookCoverImageView = (ImageView) convertView.findViewById(R.id.book_cover);
        Uri bookCoverUri = Uri.parse(currentBook.getBookCover());
        bookCoverImageView.setImageURI(bookCoverUri);

        TextView titleTextView = (TextView) convertView.findViewById(R.id.title);
        String title = currentBook.getTitle();
        titleTextView.setText(title);

        TextView authorTextView = (TextView) convertView.findViewById(R.id.author);
        String author = currentBook.getAuthor();
        authorTextView.setText(author);

        TextView descriptionTextView = (TextView) convertView.findViewById(R.id.description);
        String description = currentBook.getDescription();
        descriptionTextView.setText(description);

        return convertView;
    }
}
