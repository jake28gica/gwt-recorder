package com.google.gwt.audio.recorder.client.event;

import com.google.gwt.event.shared.EventHandler;

public interface PlaybackStoppedHandler extends EventHandler {

	void onPlaybackStopped(PlaybackStoppedEvent event);
}