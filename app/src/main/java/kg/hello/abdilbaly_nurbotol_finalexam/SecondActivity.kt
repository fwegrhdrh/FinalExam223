package kg.hello.abdilbaly_nurbotol_finalexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val back = findViewById<Button>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

        val motion = findViewById<Button>(R.id.motion)

        motion.setOnClickListener{
            startActivity(Intent(this,MotionActivity::class.java))
        }

    }
}