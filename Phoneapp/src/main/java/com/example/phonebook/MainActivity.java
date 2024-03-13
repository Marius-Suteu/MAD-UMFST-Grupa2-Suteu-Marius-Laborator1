package com.example.phonebook;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Contact> contacts;
    private ContactAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        contacts = new ArrayList<>();
        contacts.add(new Contact("Marius", "Ilarie", "0743876678", "marius.ilarie@gmail.com", R.drawable.avatar1, "Strada Armatei nr2."));
        contacts.add(new Contact("Fanica", "Degan", "0727456123", "fanica.degan@yahoo.com", R.drawable.avatar2, "Strada Libertatii nr12."));
        contacts.add(new Contact("Ionela", "Maftei", "0727456098", "ionela.maftei@gmail.com", R.drawable.avatar3, "Strada Carpati nr28."));
        contacts.add(new Contact("Man", "Sebastian", "0727456000", "man_sebastian@gmail.com", R.drawable.avatar4, "Strada Recoltei nr21."));
        contacts.add(new Contact("Dana", "Banciu", "0727456111", "daba_degan@yahoo.com", R.drawable.avatar5, "Strada Lunga nr22."));
        contacts.add(new Contact("Mitica", "Logan", "0743456123", "mitica_logan@gmail.com", R.drawable.avatar6, "Strada Victoriei nr13."));
        contacts.add(new Contact("Loredana", "Banica", "0743111123", "loredana.banica@gmail.com", R.drawable.avatar7, "Strada Garofitei nr100."));

        adapter = new ContactAdapter(this, contacts);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Contact contact = contacts.get(position);
            Intent intent = new Intent(MainActivity.this, ContactDetailsActivity.class);
            intent.putExtra("contact", contact);
            startActivity(intent);
        });

    }
}
