package hack.group.pickme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void launchUserActivity(View view){
    	Intent intent = new Intent(this, UserView.class);
        startActivity(intent);
    }
    
    public void launchMemberActivity(View view){
    	Intent intent = new Intent(this, TweetView.class);
    	startActivity(intent);
    }
    
}
