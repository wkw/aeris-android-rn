'use strict'
/**
 * JS interface to Native Aeris Maps module.
 * Handles argument checking mostly.
 */
import { NativeModules } from 'react-native';
// name as defined via ReactContextBaseJavaModule's getName
const RCAerisMaps = NativeModules.AerisMapsRn;
const AerisModule = {
  SHORT: RCAerisMaps.SHORT,
  LONG: RCAerisMaps.LONG,
};

AerisModule.show = function Show(msg, duration) {
  let _msg = '';
  let _duration = RCAerisMaps.SHORT;


  if (duration === RCAerisMaps.LONG) {
    _duration = RCAerisMaps.LONG;
  }

  if (typeof msg !== 'undefined') {
    _msg = msg;
  }

  RCAerisMaps.show(_msg, _duration);
};

// module.exports = NativeModules.AerisMapsRn;
module.exports = AerisModule;
