import React, { Component } from 'react';
import {
    Platform,
    PermissionsAndroid
} from 'react-native';

import CustomWebview from '../../native/CustomWebview';

export default class MirroredCameraScreen extends Component {
    website = 'https://marcusbelcher.github.io/wasm-asm-camera-webgl-test/index.html';

    render() {
        return (
            <CustomWebview
                style={{ flex: 1 }}
                mediaPlaybackRequiresUserAction={false}
                allowsInlineMediaPlayback={true}
                source={{ uri: this.website }}
                sourceUri={this.website}
            />
        );
    }
}