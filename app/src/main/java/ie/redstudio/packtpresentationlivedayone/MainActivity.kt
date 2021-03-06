package ie.redstudio.packtpresentationlivedayone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (savedInstanceState == null) {

           goToNewItemFragment()
        }

    }


    public fun goToListFragment() {

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.flContent, ListFragment())
        transaction.commit()

    }

    public fun goToNewItemFragment() {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.flContent, NewItemFragment())
        transaction.commit()

    }




}
