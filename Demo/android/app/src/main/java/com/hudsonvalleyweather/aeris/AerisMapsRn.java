package com.hudsonvalleyweather.aeris;

import android.widget.Toast;
import android.view.Gravity;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;
import android.util.Log;

/**
 * getCurrentActivity()
 */
public class AerisMapsRn extends ReactContextBaseJavaModule {

  private static final String TAG = AerisMapsRn.class.getSimpleName();
  private static final String DURATION_SHORT_KEY = "SHORT";
  private static final String DURATION_LONG_KEY = "LONG";

  public AerisMapsRn(ReactApplicationContext reactContext) {
    super(reactContext);
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
}
