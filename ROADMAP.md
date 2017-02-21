Development Roadmap
===================

__AerisMapsRnPackage.java__

use `createViewManagers` to return custom View which extends from `com.facebook.react.views.view.ReactViewGroup` [ref](https://github.com/facebook/react-native/blob/master/ReactAndroid/src/main/java/com/facebook/react/uimanager/ViewGroupManager.java)

Though it may also be OK to use `SimpleViewManager` [\[example\]](https://github.com/facebook/react-native/issues/3609)

That view will implement `createViewInstance(ThemedReactContext context)`

```
@Override
public GoogleMapView createViewInstance(ThemedReactContext context) {
    return new GoogleMapView(context);
}
```

and possibly:

```
@Override
public void updateView(final GoogleMapView view, final CatalystStylesDiffMap props) {
    super.updateView(view, props);
}
```

May need to implement interface in [JavaScript module](https://facebook.github.io/react-native/docs/native-components-android.html#5-implement-the-javascript-module). See below that link **MyCustomView** for alternate interface declaration which passes nativeOnly properties. Airmaps does it [here](https://github.com/airbnb/react-native-maps/blob/master/components/MapView.js).



## @TODO

- Figure out how to use Activity Fragments which Aeris SDK uses.


--------------------

## Refs / Hints

Mentions `fragments` [Implementing map view question/issue](https://github.com/facebook/react-native/issues/3609)