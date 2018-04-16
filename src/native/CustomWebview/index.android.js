import PropTypes from 'prop-types';
import { requireNativeComponent, ViewPropTypes } from 'react-native';

const customWebView = {
  name: 'CustomWebview',
  propTypes: {
    sourceUri: PropTypes.string,
    ...ViewPropTypes
  }
};

module.exports = requireNativeComponent('CustomWebviewViewManager', customWebView);