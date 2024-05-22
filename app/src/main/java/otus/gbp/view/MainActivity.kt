package otus.gbp.view

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceText()
    }

    private fun replaceText() {
        val change: Button = findViewById(R.id.change)
        change.setOnClickListener {
            val main: ViewGroup = findViewById(R.id.main)
            val textIndex = main.indexOfChild(findViewById(R.id.text))
            main.removeViewAt(textIndex)

            val newText: TextView = TextView(this).apply {
                text = "Changed text"
                id = R.id.text
                layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                )
            }

            main.addView(newText, textIndex)
        }
    }
}