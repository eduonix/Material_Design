package com.example.materialdesign;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import br.liveo.interfaces.NavigationLiveoListener;
import br.liveo.navigationliveo.NavigationLiveo;

public class MainActivity extends NavigationLiveo implements NavigationLiveoListener {

	
	public List<String> mListNameItem;

	
	@Override
	public void onItemClickNavigation(int position, int layoutContainerId) {
		
	
	}

	@Override
	public void onPrepareOptionsMenuNavigation(Menu menu, int position,
			boolean visible) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClickFooterItemNavigation(View v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClickUserPhotoNavigation(View v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUserInformation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onInt(Bundle savedInstanceState) {
		hideTitle();


		getSupportActionBar().setElevation(20);
		// set listener {required}
		this.setNavigationListener(this);

		//First item of the position selected from the list
//		this.setDefaultStartPositionNavigation(0);

		// name of the list items
		mListNameItem = new ArrayList<>();
		//        mListNameItem.add(0, getString(R.string.call));
		mListNameItem.add(0, "Browse All Deals");
		mListNameItem.add(1, "Getaways");
		mListNameItem.add(2, "Goa");
		mListNameItem.add(3, "International Holidays"); //This item will be a subHeader
		mListNameItem.add(4, "Domestic Holidays");
		mListNameItem.add(5, "Hills");
		mListNameItem.add(6, "Tour Packages");


		// icons list items
		List<Integer> mListIconItem = new ArrayList<>();
		mListIconItem.add(0, R.drawable.ic_launcher);
		mListIconItem.add(1, R.drawable.ic_launcher); //Item no icon set 0
		mListIconItem.add(2, R.drawable.ic_launcher); //Item no icon set 0
		mListIconItem.add(3, R.drawable.ic_launcher);
		mListIconItem.add(4, R.drawable.ic_launcher); //When the item is a subHeader the value of the icon 0
		mListIconItem.add(5, R.drawable.ic_launcher);
		mListIconItem.add(6, R.drawable.ic_launcher);
		

		//{optional} - Among the names there is some subheader, you must indicate it here
		List<Integer> mListHeaderItem = new ArrayList<>();
		//   mListHeaderItem.add(4);

		//{optional} - Among the names there is any item counter, you must indicate it (position) and the value here
		SparseIntArray mSparseCounterItem = new SparseIntArray(); //indicate all items that have a counter
		/*mSparseCounterItem.put(0, 7);
        mSparseCounterItem.put(1, 123);
        mSparseCounterItem.put(6, 250);
		SparseIntArray mSparseCounterItem = new SparseIntArray();*/ 
		//If not please use the FooterDrawer use the setFooterVisible(boolean visible) method with value false
		//		this.setFooterInformationDrawer(R.string.settings, R.drawable.ic_settings_black_24dp);

		
		
		this.setNavigationAdapter(mListNameItem, mListIconItem, mListHeaderItem, mSparseCounterItem);
		
	}
	
	
	public void hideTitle() {
		try {
			((View) findViewById(android.R.id.title).getParent())
			.setVisibility(View.GONE);
		} catch (Exception e) {
		}
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		getWindow().clearFlags(
				WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
	}

	public void showTitle() {
		try {
			((View) findViewById(android.R.id.title).getParent())
			.setVisibility(View.VISIBLE);
		} catch (Exception e) {
		}
		getWindow().addFlags(
				WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
		getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}
	
}
