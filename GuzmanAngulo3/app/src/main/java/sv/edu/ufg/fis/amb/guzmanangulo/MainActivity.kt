package sv.edu.ufg.fis.amb.guzmanangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import sv.edu.ufg.fis.amb.guzmanangulo.fragments.CuartoFragmento
import sv.edu.ufg.fis.amb.guzmanangulo.fragments.PrimerFragmento
import sv.edu.ufg.fis.amb.guzmanangulo.fragments.SegundoFragmento
import sv.edu.ufg.fis.amb.guzmanangulo.fragments.TercerFragmento

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        navView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_primer_fragmento -> {
                    val fragment = PrimerFragmento()
                    openFragment(fragment)
                    true
                }
                R.id.navigation_segundo_fragmento -> {
                    val fragment = SegundoFragmento()
                    openFragment(fragment)
                    true
                }
                R.id.navigation_tercer_fragmento -> {
                    val fragment = TercerFragmento()
                    openFragment(fragment)
                    true
                }
                R.id.navigation_cuarto_fragmento -> {
                    val fragment = CuartoFragmento()
                    openFragment(fragment)
                    true
                }
                else -> false
            }
        }

        if (savedInstanceState == null) {
            navView.selectedItemId = R.id.navigation_primer_fragmento
        }
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragment)
            commit()
        }
    }
}
