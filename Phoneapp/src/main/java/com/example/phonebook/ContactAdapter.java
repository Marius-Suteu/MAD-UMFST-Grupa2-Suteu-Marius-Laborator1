package com.example.phonebook;

import android.content.Context;
import android.widget.LinearLayout;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.phonebook.Contact;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

// ContactAdapter.java
public class ContactAdapter extends ArrayAdapter<Contact> {

    private Context context;
    private List<Contact> contacts;

    public ContactAdapter(Context context, List<Contact> contacts) {
        super(context, 0, contacts);
        this.context = context;
        this.contacts = contacts;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.contact_item, parent, false);
        }

        final Contact contact = contacts.get(position);

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView nameTextView = convertView.findViewById(R.id.nameTextView);
        Button expandButton = convertView.findViewById(R.id.expandButton);
        LinearLayout detailsLayout = convertView.findViewById(R.id.detailsLayout);

        imageView.setImageResource(contact.getImageResource());
        nameTextView.setText(contact.getFirstName() + " " + contact.getLastName());


        if (detailsLayout.getVisibility() == View.VISIBLE) {
            expandButton.setText("-");
        } else {
            expandButton.setText("+");
        }

        // Setăm acțiunea de clic pentru butonul de expandare
        expandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Schimbăm vizibilitatea detaliilor
                if (detailsLayout.getVisibility() == View.VISIBLE) {
                    detailsLayout.setVisibility(View.GONE);
                    expandButton.setText("+");
                } else {
                    detailsLayout.setVisibility(View.VISIBLE);
                    expandButton.setText("-");
                }
            }
        });

        return convertView;
    }
}

