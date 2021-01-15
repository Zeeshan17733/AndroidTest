package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ListView;

import com.example.contacts.Contact;
import com.example.contacts.ContactAdapter;
import com.example.contacts.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetchContact();
    }

    public void fetchContact()
    {
        ArrayList<Contact> contacts=new ArrayList<>();

        Uri uri= ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        String[] projection={ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,ContactsContract.CommonDataKinds.Phone.NUMBER};
        String selection=null;
        String[] selectionArgs=null;
        String sortOrder=null;

        ContentResolver resolver=getContentResolver();
        Cursor cursor= resolver.query(uri,projection,selection,selectionArgs,sortOrder);

        while (cursor.moveToNext())
        {
            String nam=cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            String num=cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));

            Contact info=new Contact(nam,num);
            contacts.add(info);
        }

        ListView listView=findViewById(R.id.list);

        ContactAdapter adapter=new ContactAdapter(this, R.layout.single_item, contacts);
        listView.setAdapter(adapter);
    }

}
