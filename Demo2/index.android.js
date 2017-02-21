/* eslint-disable no-use-before-define */
/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  Button,
  View,
} from 'react-native';
import AerisMapsRn from 'aeris-android-rn';
// import AerisMapsRn from './AerisMapsRn';

export default class Demo2 extends Component { // eslint-disable-line react/prefer-stateless-function

  static onButtonPress() {
    AerisMapsRn.show('AerisMapsRn ** Rock-n-Roll !', AerisMapsRn.SHORT);
  }

  render() {
    return (
      <View style={styles.container}>
        <Text style={styles.welcome}>
          Welcome to React Native!
        </Text>
        <Text style={styles.instructions}>
          To get started, edit index.android.js
        </Text>
        <Text style={styles.instructions}>
          Double tap R on your keyboard to reload,{'\n'}
          Shake or press menu button for dev menu
        </Text>
        <View style={styles.buttonWrap}>
          <Button
            title="Test It!"
            onPress={e => Demo2.onButtonPress(e)}
          />
        </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
  buttonWrap: {
    width: 200,
    marginTop: 30,
  },
});

AppRegistry.registerComponent('Demo2', () => Demo2);
