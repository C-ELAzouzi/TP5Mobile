package com.example.tp5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ContactActivity extends AppCompatActivity {
    List<Contact> contacts=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvContact=(RecyclerView)findViewById(R.id.rvContacts);
        contacts.add(new Contact("chaymae","azouzi"));
        contacts.add(new Contact("chaymae","azouzi"));
        contacts.add(new Contact("chaymae","azouzi"));
        contacts.add(new Contact("chaymae","azouzi"));
        contacts.add(new Contact("chaymae","azouzi"));
        contacts.add(new Contact("chaymae","azouzi"));
        ContactsAdapter adapter=new ContactsAdapter(contacts);
        rvContact.setAdapter(adapter);
        rvContact.setLayoutManager(new LinearLayoutManager(this));


    }
}
