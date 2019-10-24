package tj.belajar.intentpart7

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DataActivity:AppCompatActivity() {

    private lateinit var Data1 : TextView
    private lateinit var Data2 : TextView
    private lateinit var Data3 : TextView
    private lateinit var Data4 : TextView

    private lateinit var btnLanjut : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_data)

        Data1 = findViewById(R.id.TViewLayout3_Nama)
        Data2 = findViewById(R.id.TVViewLayout3_Nim)
        Data3 = findViewById(R.id.TViewLayout3_Jurusan)
        Data4 = findViewById(R.id.TViewLayout3_univ)

        Data1.setText(intent.getStringExtra("data1"))
        Data2.setText(intent.getStringExtra("data2"))
        Data3.setText(intent.getStringExtra("jurusan"))
        Data4.setText(intent.getStringExtra("univ"))

        btnLanjut = findViewById(R.id.btn_layout3_masuk)

        btnLanjut.setOnClickListener(){
            val intent = Intent(this,Musik::class.java)
            startActivity(intent)
        }

    }
}