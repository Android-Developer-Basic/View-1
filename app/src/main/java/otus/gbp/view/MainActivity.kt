package otus.gbp.view

import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import otus.gbp.view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceText()
    }

    private fun replaceText() = with(binding) {
        change.setOnClickListener {
            val textIndex = main.indexOfChild(findViewById(R.id.text))
            main.removeViewAt(textIndex)

            val newText: TextView = TextView(this@MainActivity).apply {
                text = "Changed text"
                id = R.id.text
                layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                )
            }

            main.addView(newText, textIndex)

            Log.i(TAG, "Top: ${text.top}")
            Log.i(TAG, "Left: ${text.left}")
            Log.i(TAG, "Width: ${text.width}")
            Log.i(TAG, "Height: ${text.height}")
        }
    }

    companion object {
        const val TAG = "MainActivity"
    }
}