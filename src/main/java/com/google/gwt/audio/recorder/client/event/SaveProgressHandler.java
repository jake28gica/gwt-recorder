package com.google.gwt.audio.recorder.client.event;

import com.google.gwt.event.shared.EventHandler;

public interface SaveProgressHandler extends EventHandler {

	void onSaveProgress(SaveProgressEvent event);
}