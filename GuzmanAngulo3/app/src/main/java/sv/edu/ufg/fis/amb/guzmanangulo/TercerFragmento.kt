package sv.edu.ufg.fis.amb.guzmanangulo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import sv.edu.ufg.fis.amb.guzmanangulo.R

class TercerFragmento : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tercer_fragmento, container, false)
    }
}
