package com.example.phonebook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ContactDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("contact")) {
            Contact contact = intent.getParcelableExtra("contact");
            if (contact != null) {
                TextView nameTextView = findViewById(R.id.nameTextView);
                TextView phoneTextView = findViewById(R.id.phoneTextView);
                TextView emailTextView = findViewById(R.id.emailTextView);
                TextView addressTextView = findViewById(R.id.addressTextView);

                nameTextView.setText(contact.getFirstName() + " " + contact.getLastName());
                phoneTextView.setText(contact.getPhoneNumber());
                emailTextView.setText(contact.getEmail());
                addressTextView.setText(contact.getAddress());
            }
        }
    }
}
