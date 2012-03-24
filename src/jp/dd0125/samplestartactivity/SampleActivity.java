package jp.dd0125.samplestartactivity;

import java.util.Set;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SampleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    }
    // 03-24 11:49:34.511: INFO/ActivityManager(109): Starting: Intent { act=android.intent.action.VIEW cmp=com.android.vending/com.google.android.finsky.activities.ScreenshotsActivity (has extras) } from pid 12445

    public void onMyApplyClick(View view) {
    	final Intent intent = new Intent();
    	final String action = "com.google.android.finsky.VIEW_MY_DOWNLOADS";
    	intent.setAction(action);
    	final String pkg = "com.android.vending";
    	final String cls = "com.android.vending.AssetBrowserActivity";
    	intent.setComponent(new ComponentName(pkg, cls));
    	startActivity(intent);
    }
    // 03-24 16:11:30.421: INFO/ActivityManager(109): Starting: Intent { act=android.intent.action.MAIN cmp=com.android.settings/.DateTimeSettings } from pid 17160
    public void onDateTimeClick(View view){
    	final Intent intent = new Intent();
    	final String action = Intent.ACTION_MAIN;
    	intent.setAction(action);
    	final String pkg = "com.android.settings";
    	final String cls = "com.android.settings.DateTimeSettings";
    	intent.setComponent(new ComponentName(pkg, cls));
    	startActivity(intent);
    	
    }
    //03-24 16:17:07.238: INFO/ActivityManager(109): Starting: Intent { act=android.intent.action.MAIN cmp=com.android.settings/.fuelgauge.PowerUsageSummary } from pid 17647
    public void onPowerUsageClick(View view) {
    	final Intent intent = new Intent();
    	final String action = Intent.ACTION_MAIN;
    	intent.setAction(action);
    	final String pkg = "com.android.settings";
    	final String cls = "com.android.settings.fuelgauge.PowerUsageSummary";
    	intent.setComponent(new ComponentName(pkg, cls));
    	startActivity(intent);
    	
    }
    //03-24 16:25:28.925: INFO/ActivityManager(109): Starting: Intent { act=android.intent.action.MAIN cmp=com.android.settings/.deviceinfo.Status } from pid 17856
    public void onDeviceInfoClick(View view){
    	final Intent intent = new Intent();
    	final String action = Intent.ACTION_MAIN;
    	intent.setAction(action);
    	final String pkg = "com.android.settings";
    	final String cls = "com.android.settings.deviceinfo.Status";
    	intent.setComponent(new ComponentName(pkg, cls));
    	startActivity(intent);
    	
    }
    
    // 03-24 16:31:55.343: INFO/ActivityManager(109): Starting: Intent { act=android.intent.action.MAIN cmp=com.android.settings/.ManageApplications } from pid 18034
    public void onManageApplicationsClick(View view) {
    	final Intent intent = new Intent();
    	final String action = Intent.ACTION_MAIN;
    	intent.setAction(action);
    	final String pkg = "com.android.settings";
    	final String cls = "com.android.settings.ManageApplications";
    	intent.setComponent(new ComponentName(pkg, cls));
    	startActivity(intent);
    }
    
    //03-24 16:40:53.210: INFO/ActivityManager(109): Starting: Intent { act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] flg=0x10200000 cmp=com.google.android.googlequicksearchbox/.SearchActivity bnds=[0,381][120,531] } from pid 17017
    public void onGoogleSearchClick(View view) {
    	final Intent intent = new Intent();
    	final String action = Intent.ACTION_MAIN;
    	intent.setAction(action);
    	final String pkg = "com.google.android.googlequicksearchbox";
    	final String cls = "com.google.android.googlequicksearchbox.SearchActivity";
    	intent.setComponent(new ComponentName(pkg, cls));
    	startActivity(intent);
    	
    }
    // 03-24 17:07:17.078: INFO/ActivityManager(109): Starting: Intent { act=android.intent.action.MAIN cat=[android.intent.category.HOME] flg=0x10200000 cmp=android/com.android.internal.app.ResolverActivity } from pid 109
    public void onHomeSelectClick(View view) {
    	final Intent intent = new Intent();
    	final String action = Intent.ACTION_MAIN;
    	intent.setAction(action);
    	final String category = "android.intent.category.HOME";
    	intent.addCategory(category);
    	final String pkg = "android";
    	final String cls = "com.android.internal.app.ResolverActivity";
    	intent.setComponent(new ComponentName(pkg, cls));
    	startActivity(intent);
    }
    // 03-24 17:16:08.589: INFO/ActivityManager(109): Starting: Intent { cmp=com.android.browser/.CombinedBookmarkHistoryActivity (has extras) } from pid 19500
    public void onBookMarkClick(View view) {
    	final Intent intent = new Intent();
    	final String action = Intent.ACTION_MAIN;
    	intent.setAction(action);
    	final String pkg = "com.android.browser";
    	final String cls = "com.android.browser.CombinedBookmarkHistoryActivity";
    	intent.setComponent(new ComponentName(pkg, cls));
    	startActivityForResult(intent, 1);	// 
    	
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	super.onActivityResult(requestCode, resultCode, data);
    	
//    	if(requestCode == 1){
//    		System.out.println("resultCode = " + resultCode);
//    		System.out.println("");
//    		
//    		System.out.println("dataString = " + data.getDataString());
//    		System.out.println("data = " + data.getData().toString());
//    		
//    		System.out.println("Scheme = " + data.getScheme());
//    		data.getScheme();
//    		Bundle extras = data.getExtras();
//    		if(extras != null){
//        		final Set<String> keySet = extras.keySet();
//        		System.out.println("keySet = " + keySet.size());
//        		for (String string : keySet) {
//    				Object object = extras.get(string);
//    				if(object instanceof String){
//    					System.out.println(string + " = " +(String)object);
//    				}
//    			}
//    		}
//    	}
    }
}