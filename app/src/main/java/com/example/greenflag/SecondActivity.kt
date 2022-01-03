package com.example.greenflag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageButton

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    @Override
            fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("SecondActivity", "email beforeTextChange invoked")
            }

            fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                if (EditEmail2.getText().toString().length < 7) {
                    findViewById<View>(R.id.GreenEmail).visibility = View.INVISIBLE
                    findViewById<View>(R.id.RedEmail).visibility = View.INVISIBLE
                } else if (isValidEmail(EditEmail2.getText().toString())) {
                    Log.d("SecondActivity", "Valid email, setting GreenEmail to visible")
                    findViewById<View>(R.id.GreenEmail).visibility = View.VISIBLE
                } else if (allKeys.contains(EditEmail2.getText().toString())) {
                    Log.d("SecondActivity", "Email already exists, RedEmail to visible")
                    findViewById<View>(R.id.RedEmail).visibility = View.VISIBLE
                } else {
                    Log.d("SecondActivity", "Invalid email, setting RedEmail to visible")
                    findViewById<View>(R.id.GreenEmail).visibility = View.INVISIBLE
                    findViewById<View>(R.id.RedEmail).visibility = View.VISIBLE
                }
            }




}
