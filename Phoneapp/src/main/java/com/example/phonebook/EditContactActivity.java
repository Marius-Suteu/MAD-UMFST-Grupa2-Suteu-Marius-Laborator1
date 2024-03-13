package com.example.phonebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class EditContactActivity extends AppCompatActivity {

    private EditText firstNameEditText;
    private EditText lastNameEditText;
    private EditText phoneNumberEditText;
    private EditText addressEditText;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact);

        firstNameEditText = findViewById(R.id.editTextFirstName);
        lastNameEditText = findViewById(R.id.editTextLastName);
        phoneNumberEditText = findViewById(R.id.editTextPhoneNumber);
        addressEditText = findViewById(R.id.editTextAddress);
        saveButton = findViewById(R.id.buttonSave);

        // Obtine detaliile contactului primit prin intent
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("contact")) {
            Contact contact = intent.getParcelableExtra("contact");
            if (contact != null) {
                // Populeaza campurile cu detaliile contactului existent
                firstNameEditText.setText(contact.getFirstName());
                lastNameEditText.setText(contact.getLastName());
                phoneNumberEditText.setText(contact.getPhoneNumber());
                addressEditText.setText(contact.getAddress());
            }
        }

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveContact();
            }
        });
    }

    private void saveContact() {

        finish();
    }
}
