package com.example.tp5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {
    public  final List<Contact> mcontacts;

    public ContactsAdapter(List<Contact> mcontacts) {
        this.mcontacts = mcontacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View contactView=inflater.inflate(R.layout.item_contact,parent,false);

        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact=mcontacts.get(position);
        TextView firstNameText=holder.firstNameTextView;
        firstNameText.setText(contact.getPrenom());
        TextView lastNTextView=holder.lastNameTextView;
        lastNTextView.setText(contact.getNom());
        ImageView imageView=holder.imageView;
        Glide.with(holder.itemView).load("http://goo.gl/gEgYUd").into(imageView);

    }

    @Override
    public int getItemCount() {
        return mcontacts.size();
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder{
        public  TextView firstNameTextView;
        public  TextView lastNameTextView;
        public ImageView imageView;
        //public   Image
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            firstNameTextView=(TextView)itemView.findViewById(R.id.contact_firstname);
            lastNameTextView=(TextView)itemView.findViewById(R.id.contact_lasttname);
            imageView=(ImageView)itemView.findViewById(R.id.imageView);

        }
    }
}
