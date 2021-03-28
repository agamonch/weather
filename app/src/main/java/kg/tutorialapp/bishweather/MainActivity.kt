package kg.tutorialapp.bishweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mText = findViewById<TextView>(R.id.mText)
        mText.text = "Privet Vsem"
        mText.setTextSize(TypedValue.COMPLEX_UNIT_PX, 30F)
        val but1 = findViewById<Button>(R.id.button1)
        val but2 = findViewById<Button>(R.id.button2)

    }
}
