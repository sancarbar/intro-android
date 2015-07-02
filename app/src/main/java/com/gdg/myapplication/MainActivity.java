package com.gdg.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity
    extends AppCompatActivity
    implements View.OnClickListener
{

    TextView textView;

    Button button;

    EditText editText;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        textView = (TextView) findViewById( R.id.textView );
        button = (Button) findViewById( R.id.button );
        editText = (EditText) findViewById( R.id.editText );
        button.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {

            }
        } );
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu )
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.menu_main, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item )
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if ( id == R.id.action_settings )
        {
            return true;
        }

        return super.onOptionsItemSelected( item );
    }

    @Override
    public void onClick( View v )
    {
        switch ( v.getId() )
        {

            case R.id.button:

                textView.setTextColor( getResources().getColor( R.color.organge ) );
                Editable text = editText.getText();
                textView.setText( text );
                break;
        }
    }

    public void changeText( View view )
    {
    }
}
