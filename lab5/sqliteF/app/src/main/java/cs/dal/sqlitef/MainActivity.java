package cs.dal.sqlitef;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialise Database handler
        final DatabaseHandler db = new DatabaseHandler(this);

        //Use the instantiated db handler to insert contacts.
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contact("JB", "9100000000"));
        db.addContact(new Contact("Aron", "9199999999"));
        db.addContact(new Contact("Jim", "9522222222"));
        db.addContact(new Contact("Phillip", "9533333333"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");


        List<Contact> contacts = db.getAllContacts();

        for (Contact cn : contacts) {
            String log = "Id: "+cn.getID()+" ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
            // Writing Contacts to log
            Log.d("Name: ", log);

        }
    }


}
