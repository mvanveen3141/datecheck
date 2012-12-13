package com.example.datecheck;

import org.json.JSONObject;
import org.json.JSONException;

//import android.R.string;
//import android.R.layout;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	//String checkin = R.string.format;
	//Date current = new Date();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	/*	SimpleDateFormat checkinTime = new SimpleDateFormat(checkin, Locale.US);
		SimpleDateFormat currentTime = new SimpleDateFormat(current, Locale.US);
		
		if */
		
		JSONObject json1 = new JSONObject();
		try {
			json1.put("checkin_id", 492750);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			json1.put("timestamp", 1352525183);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			json1.put("page_id", 337937);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JSONObject json2 = new JSONObject();
		try {
			json2.put("checkin_id", 35321751);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			json2.put("timestamp", 1325470396);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			json2.put("page_id", 337937);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			double cmp1 = json1.getDouble("timestamp");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			double cmp2 = json2.getDouble("timestamp");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*"{
  \"data\": [
    /{
      \"checkin_id\": 4927506714151, 
      "timestamp": 1352525183, 
      "page_id": 33793777018
    /}, 
    /{
      \"checkin_id\": 353217518028004, 
      \"timestamp\": 1325470396, 
      \"page_id\": 33793777018
    }, 
    {
      \"checkin_id\": 2627875212883, 
      \"timestamp\": 1322717490, 
      \"page_id\": 33793777018
    }, 
    {
      \"checkin_id\": \"10150482063544535\", 
      \"timestamp\": 1318193806, 
      \"page_id\": 33793777018
    }, 
    {
      \"checkin_id\": 2173598098145, 
      "timestamp": 1318058934, 
      "page_id": 33793777018
    }, 
    {
      "checkin_id": 1900049108254, 
      "timestamp": 1313895827, 
      "page_id": 33793777018
    }, 
    {
      "checkin_id": "10150283393023856", 
      "timestamp": 1312611618, 
      "page_id": 33793777018
    }, 
    {
      "checkin_id": 212320778785733, 
      "timestamp": 1304465516, 
      "page_id": 33793777018
    }
  ]
}");*/
		
		
		
		if (cmp1 <= cmp2) 
			setContentView(R.layout.activity_main);
		else
			setContentView(R.layout.activity_fail);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
