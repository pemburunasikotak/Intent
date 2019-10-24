package tj.belajar.intentpart7

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.music.*

class Musik:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.music)

        var MediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.laguperpisahan)

        btn_Play.setOnClickListener {
            MediaPlayer?.start()
        }
        button_Paus.setOnClickListener {
            MediaPlayer?.pause()
        }
        button_stop.setOnClickListener {
            MediaPlayer?.stop()
            MediaPlayer?.seekTo(0)
        }

    }
}