package br.com.schwans.martin.bottomnavigation


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_blank.view.*

class BlankFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_blank, container, false)

        val tvMensagem = view.findViewById<TextView>(R.id.tvMensagem)
        tvMensagem.text = arguments?.getString("texto")

        return view
    }

    companion object {
        fun newInstance(texto:String): BlankFragment{
            var fragment = BlankFragment()
            val bundle = Bundle()
            bundle.putString("texto", texto)
            fragment.arguments = bundle

            return fragment
        }
    }

}
