package com.rngetusermediatest.customwebview;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class CustomWebviewViewManager extends SimpleViewManager<CustomWebviewView> {

    public static final String REACT_CLASS = "CustomWebviewViewManager";
    private String source;

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public CustomWebviewView createViewInstance(ThemedReactContext context) {
        return new CustomWebviewView(context); //If your customview has more constructor parameters pass it from here.
    }
    
    @ReactProp(name = "sourceUri")
    public void setSource(CustomWebviewView view, String source) {
        view.loadUrl(source);
    }
}