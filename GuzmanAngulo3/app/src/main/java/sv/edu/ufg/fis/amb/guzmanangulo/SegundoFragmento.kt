package sv.edu.ufg.fis.amb.guzmanangulo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import sv.edu.ufg.fis.amb.guzmanangulo.R

class SegundoFragmento : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_segundo_fragmento, container, false)
    }
}
