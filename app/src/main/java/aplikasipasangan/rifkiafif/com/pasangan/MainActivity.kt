package aplikasipasangan.rifkiafif.com.pasangan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener { carijodoh() }

    }

    fun carijodoh() {
        val randomDora = Random().nextInt(4)+1
        val randomemon = Random().nextInt(4)+1
        val drawableResDora = when (randomDora){
            1 ->R.drawable.kiki
            2 ->R.drawable.niam
            3 ->R.drawable.haris
            4 ->R.drawable.rizal
            else -> R.drawable.eggy
        }

        val drawableResemon = when (randomemon){
            1 ->R.drawable.ayu
            2 ->R.drawable.umi
            3 ->R.drawable.mela
            4 ->R.drawable.umi
            else -> R.drawable.hanum

        }

        emon1.setImageResource(drawableResDora)
        dora1.setImageResource(drawableResemon)



    }
}
