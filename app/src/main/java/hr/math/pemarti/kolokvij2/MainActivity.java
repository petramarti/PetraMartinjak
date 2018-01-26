package hr.math.pemarti.kolokvij2;

import android.Manifest;
        import android.content.CursorLoader;
        import android.content.Intent;
        import android.content.pm.PackageManager;
        import android.database.Cursor;
        import android.net.Uri;
        import android.provider.ContactsContract;
        import android.support.v4.app.ActivityCompat;
        import android.support.v4.content.ContextCompat;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.CursorAdapter;
        import android.widget.EditText;
        import android.widget.SimpleCursorAdapter;
        import android.widget.Toast;

        import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {
    private int MY_PERM=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickYes(View v) {
        EditText editText=(EditText) findViewById(R.id.enter_letter);
        String letter=editText.getText().toString();
        Toast.makeText(getBaseContext(), letter,
                Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, ListViewLoader.class);
        //intent.putExtra(EXTRA_MESSAGE, letter);
        startActivity(intent);

    }



    public void onClickNo(View v) {
        EditText editText=(EditText) findViewById(R.id.enter_letter);
        String letter=editText.getText().toString();
        Toast.makeText(getBaseContext(), letter,
                Toast.LENGTH_LONG).show();
    }


    public void startDB(View v){
        Intent intent = new Intent(this, DB.class);
        //intent.putExtra(EXTRA_MESSAGE, letter);
        startActivity(intent);
    }
}
