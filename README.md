React Native Android Module for Aeris Weather Maps SDK
======================================================

Work in progress to setup the RN Android Native Module, currently only shows an Android Toast.
However Aeris SDK is linked in, in prep. for next steps.

### Install:

```
npm i -S git+https://github.com/wkw/aeris-android-rn.git
  # OR yarn add git+https://github.com/wkw/aeris-android-rn.git
react-native link aeris-android-rn
```

In React Native module, import the native module:

```
import AerisMapsRn from 'aeris-android-rn';
...

  render() {
    return (
      <View style={styles.container}>
        <View style={styles.buttonWrap}>
          <Button
            title="Test It!"
            onPress={e => AerisMapsRn.show('Toast is Ready', AerisMapsRn.SHORT);}
          />
        </View>
      </View>
    );
  }
```

--------------------------------------------------------------

- Demo app relies on module java sources being part of the app.
- Demo2 uses installed/linked package in node_modules.
