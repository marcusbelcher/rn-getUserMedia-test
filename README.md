# README
This repo is a simple test case for anyone to use - as is - to check JavaScript WebRTC / Camera access via getUserMedia inside a WebView in a React Native Android application. The Application - as default - views another test application I have hosted on GitHub pages (https://github.com/marcusbelcher/wasm-asm-camera-webgl-test). The application also have native tests for WebGL and Video. 

Why? Because I couldnt find an example out there ready to play with, especially one with an updated graddle file. Also this application is a potential foundation for a native app which views web based AR experiences.

- Currently Android only (Until Apple allows getUserMedia access inside a WKWebView) 
- Tested on a Samsung S7 Edge
- Pure android version here (https://github.com/marcusbelcher/android-getUserMedia-test)
- This projected originated from an ejected create-react-native-app (https://github.com/react-community/create-react-native-app)
- For each 3rd party there is a test view you can swap in App.js

## Build
- Install Node.JS, NPM, and Yarn
- Install React Native and follow the 'Building Projects with Native Code' for Android instructions (https://facebook.github.io/react-native/docs/getting-started.html)
- In a terminal go to the directory where you checked this repo out, `Yarn install`
- Plugin an android phone
- In the terminal enter `react-native start --reset-cache`
- In another terminal enter `react-native run-android`

### 3rd Parties
- react
- react-native
- react-native-camera
- react-native-video
- react-native-webgl
- 'org.webrtc:google-webrtc:1.0.+'

### Problems encountered
I encountered all the issues here: https://github.com/marcusbelcher/android-getUserMedia-test and... a TONNE more graddle, dex Java version, react, etc, issues. 
Primarily upgrading a create-react-native-app from graddle 2 to 3 was a tad tricky. Otherwise it was just making sure Videos & WebGL could be native friendly, and WebRTC functionality was accessible inside a WebView (and the necessary permissions were handled correctly).
