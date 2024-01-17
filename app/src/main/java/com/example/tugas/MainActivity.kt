package com.example.tugas

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var edbb: EditText? = null
    var edtinggi: EditText? = null
    var edimt: EditText? = null
    var edket: EditText? = null
    var bthitung: Button? = null
    var vbb: Double? = null
    var vtinggi: Double? = null
    var vimt: Double? = null
    var vket: String? = null
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edbb = findViewById(R.id.edbb) as EditText?
        edtinggi = findViewById(R.id.edtinggi) as EditText?
        edimt = findViewById(R.id.edimt) as EditText?
        edket = findViewById(R.id.edket) as EditText?
        bthitung = findViewById(R.id.bthitung) as Button?
    }

    fun hitung(view: View?) {
        vbb = edbb!!.text.toString().toDouble()
        vtinggi = edtinggi!!.text.toString().toDouble()
        vimt = vbb!! / (vtinggi!! / 100 * (vtinggi!! / 100))
        vket = if (vimt!! < 18.5) {
            "Berat Badan Kurang"
        } else if (vimt!! >= 18.5 && vimt!! < 25) {
            "Berat Badan Ideal"
        } else if (vimt!! >= 25 && vimt!! < 30) {
            "Berat Badan Berlebih"
        } else {
            "Sangat Gemuk, Anda Harus Diet"
        }
        edimt!!.setText("" + vimt)
        edket!!.setText("" + vket)
    }
}