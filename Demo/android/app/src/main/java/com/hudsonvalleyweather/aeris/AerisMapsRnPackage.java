package com.hudsonvalleyweather.aeris;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AerisMapsRnPackage implements ReactPackage {

    private String mClientId = null;
    private String mApiKey = null;

    public AerisMapsRnPackage() {
        super();
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new AerisMapsRn(reactContext));

        return modules;
    }
}
