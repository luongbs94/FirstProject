package android.support.v7.appcompat.app;


import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;

public class ActionBar extends ActionBarActivity{

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater= getMenuInflater();
		inflater.inflate(R.menu.action_bar, menu);
		
		return super.onCreateOptionsMenu(menu);
	}

}
