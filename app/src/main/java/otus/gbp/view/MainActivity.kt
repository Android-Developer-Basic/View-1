package otus.gbp.view

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupChange()
    }

    private fun setupChange() {
        val change: Button = findViewById(R.id.change)
        change.setOnClickListener {
            val text: TextView = findViewById(R.id.text)
            text.text = "Changed text"
        }
    }
}