package id.dipoengoro.androidtrivia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.dipoengoro.androidtrivia.databinding.FragmentGameWonBinding

class GameWonFragment : Fragment() {
    private lateinit var binding: FragmentGameWonBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGameWonBinding.inflate(inflater, container, false)

        return binding.root
    }
}