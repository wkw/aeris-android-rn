/**
 * @TODO:
 * - Rename to include 'module' in name for clarity.
 *
 */
package com.hudsonvalleyweather.aeris;

import com.demo.R;

import android.util.Log;
import android.app.Activity;
import android.widget.Toast;
import android.view.Gravity;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

// import com.aerisweather.aeris.communication.AerisEngine;
// import com.aerisweather.aeris.maps.AerisMapsEngine;

import java.util.HashMap;
import java.util.Map;

public class AerisMapsRn extends ReactContextBaseJavaModule {

  private static final String TAG = AerisMapsRn.class.getSimpleName();
  private static final String DURATION_SHORT_KEY = "SHORT";
  private static final String DURATION_LONG_KEY = "LONG";
  /**
   * Aeris client id
   */
  private String mClientId = null;
  /**
   * Aeris secret
   */
  private String mApiSecret = null;

  public AerisMapsRn(ReactApplicationContext reactContext) {
    super(reactContext);

    this.mClientId = reactContext.getString(R.string.aerisapi_client_id);
    this.mApiSecret = reactContext.getString(R.string.aerisapi_client_secret);
    Log.d(TAG, "====== CREDS ======: " + mClientId + " - " + mApiSecret);
    // initAerisEngine(reactContext);
  }

  public Activity getActivity() {
    return getCurrentActivity();
  }

  @Override
  public String getName() {
    return "AerisMapsRn";
  }

  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT);
    constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG);
    return constants;
  }

  @ReactMethod
  public void show(String message, int duration) {
    // Toast.makeText(getReactApplicationContext(), message, duration).show();
    Toast toast = Toast.makeText(getReactApplicationContext(), message, duration);
    // toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL, 0, 0);
    toast.show();
  }

  // private void initAerisEngine(ReactApplicationContext reactContext) {
  //       // setting up secret key and client id for oauth to aeris
  //   // AerisEngine.initWithKeys(
  //   //   this.getString(R.string.aerisapi_client_id),
  //   //   this.getString(R.string.aerisapi_client_secret),
  //   //   reactContext
  //   // );
  // }
}
