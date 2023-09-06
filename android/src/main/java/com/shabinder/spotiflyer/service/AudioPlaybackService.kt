package com.shabinder.spotiflyer.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

class AudioPlaybackService : Service() {

    companion object {
        const val ACTION_PLAY = "com.example.app.ACTION_PLAY"
        const val EXTRA_AUDIO_URL = "com.example.app.EXTRA_AUDIO_URL"
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            ACTION_PLAY -> {
                val audioUrl = intent.getStringExtra(EXTRA_AUDIO_URL)
                // Start audio playback using MediaPlayer
                // Create and show a notification for the foreground service
                // ...
            }
            // Handle other actions if needed
        }
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}
