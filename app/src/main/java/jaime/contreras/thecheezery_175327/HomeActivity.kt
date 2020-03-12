package jaime.contreras.thecheezery_175327

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //var intent= Intent(this,Products::class.java)

        btn_ColdDrinks.setOnClickListener{
            //intent.putExtra("drinkType","coldDrinks")
            //startActivity(intent)
            abrirMenu(0)
        }

        btn_HotDrinks.setOnClickListener{
            //intent.putExtra("drinkType","hotDrinks")
            //startActivity(intent)
            abrirMenu(1)
        }

        btn_Sweets.setOnClickListener{
            //intent.putExtra("type","sweets")
            //startActivity(intent)
            abrirMenu(2)
        }

        btn_Salties.setOnClickListener{
            //intent.putExtra("type","salties")
            //startActivity(intent)
            abrirMenu(3)
        }
    }

    private fun abrirMenu(id: Int){
        var intent = Intent(this, Products::class.java)
        intent.putExtra("id",id)

        startActivity(intent)
    }
}
