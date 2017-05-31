package chatting.mojo.mojo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by pungi on 13-May-17.
 */

public class MessageActivity extends AppCompatActivity{

    private FirebaseAuth auth;
    private FirebaseListAdapter<MessageChatting> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_messagelist);
        auth = FirebaseAuth.getInstance();

        if (auth.getCurrentUser() != null) {
            Toast.makeText(this, "Welcome" + auth.getCurrentUser()
                    .getDisplayName(),Toast.LENGTH_LONG).show();
            //load message
            displayChatMessages();
        }

        else {
            startActivity(new Intent(MessageActivity.this, LoginActivity.class));
            finish();
        }



        //post message
        Button fab =(Button)findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = (EditText)findViewById(R.id.input);

                // Read the input field and push a new instance
                // of ChatMessage to the Firebase database
                FirebaseDatabase.getInstance()
                        .getReference()
                        .push()
                        .setValue(new MessageChatting(input.getText().toString(),
                                auth.getCurrentUser().getDisplayName())
                        );

                // Clear the input
                input.setText("");
            }
        });


    }

    private void displayChatMessages(){
        ListView listOfMessages = (ListView)findViewById(R.id.chatList);

        adapter = new FirebaseListAdapter<MessageChatting>(this, MessageChatting.class,
                R.layout.activity_message, FirebaseDatabase.getInstance().getReference()) {

            @Override
            protected void populateView(View v, MessageChatting model, int position) {
                // Get references to the views of message.xml
                TextView messageText = (TextView)v.findViewById(R.id.message_text);
                TextView messageUser = (TextView)v.findViewById(R.id.fullName);
                TextView messageTime = (TextView)v.findViewById(R.id.message_time);

                // Set their text
                messageText.setText(model.getMessageText());
                messageUser.setText(model.getMessageUser());

                // Format the date before showing it
                messageTime.setText(DateFormat.format("dd-MM-yyyy (HH:mm:ss)",
                        model.getMessageTime()));
            }
        };

        listOfMessages.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.parametre) {


            /*public void onClickL*/
            Intent intent = new Intent(MessageActivity.this, SettingActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
