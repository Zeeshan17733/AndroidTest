package com.example.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.contacts.R;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact>
{
    private Context mContext;
    int mResource;

    public ContactAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contact> objects)
    {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource=resource;

    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String contactName=getItem(position).getName();
        String num=getItem(position).getPhone();

        Contact contacts=new Contact(contactName,num);

        LayoutInflater inflater=LayoutInflater.from(mContext);
        convertView= inflater.inflate(mResource,parent,false);

        TextView tx1=convertView.findViewById(R.id.textView1);
        TextView tx2=convertView.findViewById(R.id.textView2);

        char firstLetter=contactName.charAt(0);

        ImageView imageView=convertView.findViewById(R.id.alphtImgView);

        if(firstLetter=='a' || firstLetter=='A')
        {
            imageView.setImageResource(R.drawable.a);
        }

        else  if(firstLetter=='b' || firstLetter=='B')
        {
            imageView.setImageResource(R.drawable.b);
        }

        else  if(firstLetter=='c' || firstLetter=='C')
        {
            imageView.setImageResource(R.drawable.c);
        }

        else  if(firstLetter=='d' || firstLetter=='D')
        {
            imageView.setImageResource(R.drawable.d);
        }

        else  if(firstLetter=='e' || firstLetter=='E')
        {
            imageView.setImageResource(R.drawable.e);
        }

        else  if(firstLetter=='f' || firstLetter=='F')
        {
            imageView.setImageResource(R.drawable.f);
        }

        else  if(firstLetter=='g' || firstLetter=='G')
        {
            imageView.setImageResource(R.drawable.g);
        }

        else  if(firstLetter=='h' || firstLetter=='H')
        {
            imageView.setImageResource(R.drawable.h);
        }

        else  if(firstLetter=='i' || firstLetter=='I')
        {
            imageView.setImageResource(R.drawable.i);
        }

        else  if(firstLetter=='j' || firstLetter=='J')
        {
            imageView.setImageResource(R.drawable.j);
        }

        else  if(firstLetter=='k' || firstLetter=='K')
        {
            imageView.setImageResource(R.drawable.k);
        }

        else  if(firstLetter=='l' || firstLetter=='L')
        {
            imageView.setImageResource(R.drawable.l);
        }

        else  if(firstLetter=='m' || firstLetter=='M')
        {
            imageView.setImageResource(R.drawable.m);
        }

        else  if(firstLetter=='n' || firstLetter=='N')
        {
            imageView.setImageResource(R.drawable.n);
        }

        else  if(firstLetter=='o' || firstLetter=='O')
        {
            imageView.setImageResource(R.drawable.o);
        }

        else  if(firstLetter=='p' || firstLetter=='P')
        {
            imageView.setImageResource(R.drawable.p);
        }

        else  if(firstLetter=='q' || firstLetter=='Q')
        {
            imageView.setImageResource(R.drawable.q);
        }

        else  if(firstLetter=='r' || firstLetter=='R')
        {
            imageView.setImageResource(R.drawable.r);
        }

        else  if(firstLetter=='s' || firstLetter=='S')
        {
            imageView.setImageResource(R.drawable.s);
        }

        else  if(firstLetter=='t' || firstLetter=='T')
        {
            imageView.setImageResource(R.drawable.t);
        }

        else  if(firstLetter=='u' || firstLetter=='U')
        {
            imageView.setImageResource(R.drawable.u);
        }

        else  if(firstLetter=='v' || firstLetter=='V')
        {
            imageView.setImageResource(R.drawable.v);
        }

        else  if(firstLetter=='w' || firstLetter=='W')
        {
            imageView.setImageResource(R.drawable.w);
        }

        else  if(firstLetter=='x' || firstLetter=='X')
        {
            imageView.setImageResource(R.drawable.x);
        }

        else  if(firstLetter=='y' || firstLetter=='Y')
        {
            imageView.setImageResource(R.drawable.y);
        }

        else  if(firstLetter=='z' || firstLetter=='Z')
        {
            imageView.setImageResource(R.drawable.z);
        }

        tx1.setText(contactName);
        tx2.setText(num);


        return convertView;
    }
}
