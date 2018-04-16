import React, { Component } from 'react';
import { StackNavigator } from 'react-navigation';

import LoadingView from './src/react-native/components/loading-view';
import CameraView from './src/react-native/components/camera-view';
import VideoView from './src/react-native/components/video-view';
import GLRenderView from './src/react-native/components/gl-render-view';
import CustomWebView from './src/react-native/components/custom-web-view';

const MainApp = StackNavigator({
  CustomWebView: { screen: CustomWebView },
  WebGL: { screen: GLRenderView },
  Camera: { screen: CameraView },
  Video: { screen: VideoView },
  Loading: { screen: LoadingView }
});

export default class App extends Component {
  render() {
    return (
      <MainApp />
    );
  }
}

